package pe.edu.upc.trabajoavance_kevin.servicesinterfaces;

import pe.edu.upc.trabajoavance_kevin.entities.Role;
import java.util.List;
import java.util.Optional;

public interface IRoleService {
    void insert(Role role);
    List<Role> list();
    Optional<Role> listId(Long id);
    void update(Role role);
    void delete(Long id);
}
