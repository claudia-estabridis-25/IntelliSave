package pe.edu.upc.intellisave1.servicesinterfaces;

import pe.edu.upc.intellisave1.entities.ClimateRecord;

import java.util.List;
import java.util.Optional;

public interface IClimateRecordService {
    public List<ClimateRecord> list();
    public void insert(ClimateRecord climate);
    public void update(ClimateRecord climate);
    public Optional<ClimateRecord> listById(Long id);
    public void delete(Long id);
    //List<ClimateRecord> findByIdBranch(Long idBranch);
}
