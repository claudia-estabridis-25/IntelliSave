package pe.edu.upc.trabajoavance_kevin.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajoavance_kevin.entities.Role;
import pe.edu.upc.trabajoavance_kevin.repositories.IRoleRepository;
import pe.edu.upc.trabajoavance_kevin.servicesinterfaces.IRoleService;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImplement implements IRoleService {
    private final IRoleRepository rR;

    public RoleServiceImplement(IRoleRepository rR) {
        this.rR = rR;
    }

    @Override
    public void insert(Role role) { rR.save(role); }

    @Override
    public List<Role> list() { return rR.findAll(); }

    @Override
    public Optional<Role> listId(Long id) { return rR.findById(id); }

    @Override
    public void update(Role role) { rR.save(role); }

    @Override
    public void delete(Long id) { rR.deleteById(id); }
}
