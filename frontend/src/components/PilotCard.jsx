import * as React from "react";
import Card from "@mui/material/Card";
import CardHeader from "@mui/material/CardHeader";
import CardMedia from "@mui/material/CardMedia";
import CardContent from "@mui/material/CardContent";
import CardActions from "@mui/material/CardActions";
import IconButton from "@mui/material/IconButton";
import Typography from "@mui/material/Typography";
import FavoriteIcon from "@mui/icons-material/Favorite";
import ShareIcon from "@mui/icons-material/Share";

export default function PilotCard({
  name,
  subheader,
  nationality,
  dateOfBirth,
  url,
}) {
  return (
    <div className="pilot-single-card">
      <Card sx={{ maxWidth: 345, backgroundColor: "hsl(71, 16%, 83%)" }}>
        <CardHeader title={name} subheader={subheader} />
        <CardMedia
          component="img"
          image="https://images.unsplash.com/photo-1533573271545-c1604421c980?q=80&w=1740&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
          alt="driver"
        />
        <CardContent>
          <Typography variant="button" display="block" gutterBottom>
            {dateOfBirth}
          </Typography>
          <Typography variant="body2" color="text.secondary">
            <a href={url} target="_blank">
              Pilot Biography
            </a>
          </Typography>
        </CardContent>
        <CardActions disableSpacing className="card-actions">
          <div>
            <IconButton aria-label="add to favorites">
              <FavoriteIcon />
            </IconButton>
            <IconButton aria-label="share">
              <ShareIcon />
            </IconButton>
          </div>
          <div className="card-actions-nationality">
            <Typography variant="h6" gutterBottom>
              {nationality}
            </Typography>
          </div>
        </CardActions>
      </Card>
    </div>
  );
}
