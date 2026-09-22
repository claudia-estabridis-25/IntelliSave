package pe.edu.upc.trabajoavance_kevin.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajoavance_kevin.dtos.UserDTO;
import pe.edu.upc.trabajoavance_kevin.entities.Role;
import pe.edu.upc.trabajoavance_kevin.entities.User;
import pe.edu.upc.trabajoavance_kevin.exceptions.ResourceNotFoundException;
import pe.edu.upc.trabajoavance_kevin.servicesinterfaces.IRoleService;
import pe.edu.upc.trabajoavance_kevin.servicesinterfaces.IUserService;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final IUserService uS;
    private final IRoleService rS;
    private final ModelMapper modelMapper;

    public UserController(IUserService uS, IRoleService rS, ModelMapper modelMapper) {
        this.uS = uS;
        this.rS = rS;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<UserDTO> register(@Valid @RequestBody UserDTO dto) {
        Role role = rS.listId(dto.getIdRole()).orElseThrow(() -> new ResourceNotFoundException("No existe el rol con id: " + dto.getIdRole()));
        User user = modelMapper.map(dto, User.class);
        user.setRole(role);
        uS.insert(user);
        UserDTO result = modelMapper.map(user, UserDTO.class);
        result.setIdRole(role.getIdRole());
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping
    public List<UserDTO> list() {
        return uS.list().stream().map(this::toDTO).toList();
    }

    @GetMapping("/{id}")
    public UserDTO listId(@PathVariable Long id) {
        User user = uS.listId(id).orElseThrow(() -> new ResourceNotFoundException("No existe el usuario con id: " + id));
        return toDTO(user);
    }

    @PutMapping
    public UserDTO update(@Valid @RequestBody UserDTO dto) {
        User existing = uS.listId(dto.getIdUser()).orElseThrow(() -> new ResourceNotFoundException("No existe el usuario con id: " + dto.getIdUser()));
        Role role = rS.listId(dto.getIdRole()).orElseThrow(() -> new ResourceNotFoundException("No existe el rol con id: " + dto.getIdRole()));
        modelMapper.map(dto, existing);
        existing.setRole(role);
        uS.update(existing);
        return toDTO(existing);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        uS.listId(id).orElseThrow(() -> new ResourceNotFoundException("No existe el usuario con id: " + id));
        uS.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/status")
    public List<UserDTO> findByStatus(@RequestParam Boolean status) {
        return uS.findByStatus(status).stream().map(this::toDTO).toList();
    }

    private UserDTO toDTO(User user) {
        UserDTO dto = modelMapper.map(user, UserDTO.class);
        if (user.getRole() != null) dto.setIdRole(user.getRole().getIdRole());
        return dto;
    }
}
