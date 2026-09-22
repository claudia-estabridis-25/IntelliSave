package pe.edu.upc.trabajoavance_kevin.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajoavance_kevin.entities.User;
import pe.edu.upc.trabajoavance_kevin.repositories.IUserRepository;
import pe.edu.upc.trabajoavance_kevin.servicesinterfaces.IUserService;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements IUserService {
    private final IUserRepository uR;

    public UserServiceImplement(IUserRepository uR) {
        this.uR = uR;
    }

    @Override
    public void insert(User user) { uR.save(user); }

    @Override
    public List<User> list() { return uR.findAll(); }

    @Override
    public Optional<User> listId(Long id) { return uR.findById(id); }

    @Override
    public void update(User user) { uR.save(user); }

    @Override
    public void delete(Long id) { uR.deleteById(id); }

    @Override
    public List<User> findByStatus(Boolean status) { return uR.findByStatus(status); }
}
