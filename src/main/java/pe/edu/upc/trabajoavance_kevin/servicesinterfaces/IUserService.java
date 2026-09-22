package pe.edu.upc.trabajoavance_kevin.servicesinterfaces;

import pe.edu.upc.trabajoavance_kevin.entities.User;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    void insert(User user);
    List<User> list();
    Optional<User> listId(Long id);
    void update(User user);
    void delete(Long id);
    List<User> findByStatus(Boolean status);
}
