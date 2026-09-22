package pe.edu.upc.trabajoavance_kevin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajoavance_kevin.entities.ClimateRecord;
import java.util.List;

@Repository
public interface IClimateRecordRepository extends JpaRepository<ClimateRecord, Long> {
    List<ClimateRecord> findByIdSite(Long idSite);
}
