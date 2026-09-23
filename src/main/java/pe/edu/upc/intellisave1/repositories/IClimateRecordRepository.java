package pe.edu.upc.intellisave1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.intellisave1.entities.ClimateRecord;

import java.util.List;

@Repository
public interface IClimateRecordRepository extends JpaRepository<ClimateRecord, Long> {
    //List<ClimateRecord> findByIdBranch(Long idBranch); //Encontrar sede asociada por id

}
