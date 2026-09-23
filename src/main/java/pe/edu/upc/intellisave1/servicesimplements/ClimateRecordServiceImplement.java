package pe.edu.upc.intellisave1.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.intellisave1.entities.ClimateRecord;
import pe.edu.upc.intellisave1.repositories.IClimateRecordRepository;
import pe.edu.upc.intellisave1.servicesinterfaces.IClimateRecordService;

import java.util.List;
import java.util.Optional;

@Service
public class ClimateRecordServiceImplement implements IClimateRecordService {
    private final IClimateRecordRepository cR;

    public ClimateRecordServiceImplement(IClimateRecordRepository cR) {
        this.cR = cR;
    }


    @Override
    public List<ClimateRecord> list() {
        return cR.findAll();
    }

    @Override
    public void insert(ClimateRecord climate) {
        cR.save(climate);
    }

    @Override
    public void update(ClimateRecord climate) {
        cR.save(climate);
    }

    @Override
    public Optional<ClimateRecord> listById(Long id) {
        return cR.findById(id);
    }

    @Override
    public void delete(Long id) {
        cR.deleteById(id);
    }

    /*
    @Override
    public List<ClimateRecord> findByIdBranch(Long idBranch) {
        return cR.findByIdBranch(idBranch);
    }
    */
}
