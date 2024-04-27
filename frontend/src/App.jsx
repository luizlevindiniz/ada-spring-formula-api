import { useEffect, useState } from "react";
import "./App.css";
import PilotCard from "./components/PilotCard";
import axios from "axios";
import Typography from "@mui/material/Typography";

function App() {
  async function getDrivers() {
    const res = await axios.get("http://localhost:8080/api/drivers", {
      auth: {
        username: "admin",
        password: "admin",
      },
      headers: {
        "Content-type": "application/json",
        "Access-Control-Allow-Origin": "http://localhost:8080",
        "Access-Control-Allow-Headers":
          "Origin, X-Requested-With, Content-Type, Accept",
      },
    });
    if (res.status < 200 || res.status >= 400) {
      console.log(res);
      return;
    }
    setDrivers(res.data);
  }

  useEffect(() => {
    getDrivers();
  }, []);

  const [drivers, setDrivers] = useState([]);

  return (
    <div className="outlet">
      <Typography variant="h2" gutterBottom>
        FormulAPI
      </Typography>
      <div className="pilot-wrapper">
        {drivers.map((pilot) => {
          return (
            <PilotCard
              key={pilot.driverId}
              name={pilot.familyName}
              subheader={pilot.givenName}
              nationality={pilot.nationality}
              dateOfBirth={pilot.dateOfBirth}
              url={pilot.url}
            ></PilotCard>
          );
        })}
      </div>
    </div>
  );
}

export default App;
