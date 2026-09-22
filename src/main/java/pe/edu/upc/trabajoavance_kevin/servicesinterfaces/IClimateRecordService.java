package pe.edu.upc.trabajoavance_kevin.servicesinterfaces;

import pe.edu.upc.trabajoavance_kevin.entities.ClimateRecord;
import java.util.List;
import java.util.Optional;

public interface IClimateRecordService {
    void insert(ClimateRecord climateRecord);
    List<ClimateRecord> list();
    Optional<ClimateRecord> listId(Long id);
    void update(ClimateRecord climateRecord);
    void delete(Long id);
    List<ClimateRecord> findByIdSite(Long idSite);
}
