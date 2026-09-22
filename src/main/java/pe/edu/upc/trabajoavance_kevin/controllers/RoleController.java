package pe.edu.upc.trabajoavance_kevin.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajoavance_kevin.dtos.RoleDTO;
import pe.edu.upc.trabajoavance_kevin.entities.Role;
import pe.edu.upc.trabajoavance_kevin.exceptions.ResourceNotFoundException;
import pe.edu.upc.trabajoavance_kevin.servicesinterfaces.IRoleService;
import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private final IRoleService rS;
    private final ModelMapper modelMapper;

    public RoleController(IRoleService rS, ModelMapper modelMapper) {
        this.rS = rS;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<RoleDTO> register(@Valid @RequestBody RoleDTO dto) {
        Role role = modelMapper.map(dto, Role.class);
        rS.insert(role);
        return new ResponseEntity<>(modelMapper.map(role, RoleDTO.class), HttpStatus.CREATED);
    }

    @GetMapping
    public List<RoleDTO> list() {
        return rS.list().stream().map(x -> modelMapper.map(x, RoleDTO.class)).toList();
    }

    @GetMapping("/{id}")
    public RoleDTO listId(@PathVariable Long id) {
        Role role = rS.listId(id).orElseThrow(() -> new ResourceNotFoundException("No existe el rol con id: " + id));
        return modelMapper.map(role, RoleDTO.class);
    }

    @PutMapping
    public RoleDTO update(@Valid @RequestBody RoleDTO dto) {
        Role existing = rS.listId(dto.getIdRole()).orElseThrow(() -> new ResourceNotFoundException("No existe el rol con id: " + dto.getIdRole()));
        modelMapper.map(dto, existing);
        rS.update(existing);
        return modelMapper.map(existing, RoleDTO.class);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        rS.listId(id).orElseThrow(() -> new ResourceNotFoundException("No existe el rol con id: " + id));
        rS.delete(id);
        return ResponseEntity.noContent().build();
    }
}
