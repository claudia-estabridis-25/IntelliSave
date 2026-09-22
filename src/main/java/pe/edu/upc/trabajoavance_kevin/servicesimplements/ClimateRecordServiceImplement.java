package pe.edu.upc.trabajoavance_kevin.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajoavance_kevin.entities.ClimateRecord;
import pe.edu.upc.trabajoavance_kevin.repositories.IClimateRecordRepository;
import pe.edu.upc.trabajoavance_kevin.servicesinterfaces.IClimateRecordService;
import java.util.List;
import java.util.Optional;

@Service
public class ClimateRecordServiceImplement implements IClimateRecordService {
    private final IClimateRecordRepository cR;

    public ClimateRecordServiceImplement(IClimateRecordRepository cR) {
        this.cR = cR;
    }

    @Override
    public void insert(ClimateRecord climateRecord) { cR.save(climateRecord); }

    @Override
    public List<ClimateRecord> list() { return cR.findAll(); }

    @Override
    public Optional<ClimateRecord> listId(Long id) { return cR.findById(id); }

    @Override
    public void update(ClimateRecord climateRecord) { cR.save(climateRecord); }

    @Override
    public void delete(Long id) { cR.deleteById(id); }

    @Override
    public List<ClimateRecord> findByIdSite(Long idSite) { return cR.findByIdSite(idSite); }
}
