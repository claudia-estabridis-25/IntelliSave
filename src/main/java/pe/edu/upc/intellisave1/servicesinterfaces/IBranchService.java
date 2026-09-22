package pe.edu.upc.intellisave1.servicesinterfaces;

import pe.edu.upc.intellisave1.entities.Branch;

import java.util.List;
import java.util.Optional;

public interface IBranchService {
    public List<Branch> list();
    public void insert(Branch b);
    public void update(Branch b);
    public Optional<Branch> listById(Long id);
    public void delete(Long id);
}
