package pe.edu.upc.intellisave1.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.intellisave1.entities.Branch;
import pe.edu.upc.intellisave1.exceptions.ResourceNotFoundException;
import pe.edu.upc.intellisave1.repositories.IBranchRepository;
import pe.edu.upc.intellisave1.servicesinterfaces.IBranchService;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImplement implements IBranchService {
    private final IBranchRepository bR;

    public BranchServiceImplement(IBranchRepository bR) {
        this.bR = bR;
    }


    @Override
    public List<Branch> list() {
        return bR.findAll();
    }

    @Override
    public void insert(Branch b) {
        bR.save(b);
    }

    @Override
    public void update(Branch b) {
        bR.save(b);
    }

    @Override
    public Optional<Branch> listById(Long id) {
        return bR.findById(id);
    }

    @Override
    public void delete(Long id) {
        bR.deleteById(id);
    }
}
