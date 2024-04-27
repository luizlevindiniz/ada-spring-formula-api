package tech.ada.spring.formulapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.spring.formulapi.Models.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {

}
