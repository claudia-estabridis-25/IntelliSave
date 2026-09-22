package pe.edu.upc.trabajoavance_kevin.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajoavance_kevin.dtos.ClimateRecordDTO;
import pe.edu.upc.trabajoavance_kevin.entities.ClimateRecord;
import pe.edu.upc.trabajoavance_kevin.exceptions.ResourceNotFoundException;
import pe.edu.upc.trabajoavance_kevin.servicesinterfaces.IClimateRecordService;
import java.util.List;

@RestController
@RequestMapping("/api/climate-records")
public class ClimateRecordController {
    private final IClimateRecordService cS;
    private final ModelMapper modelMapper;

    public ClimateRecordController(IClimateRecordService cS, ModelMapper modelMapper) {
        this.cS = cS;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<ClimateRecordDTO> register(@Valid @RequestBody ClimateRecordDTO dto) {
        ClimateRecord record = modelMapper.map(dto, ClimateRecord.class);
        cS.insert(record);
        return new ResponseEntity<>(modelMapper.map(record, ClimateRecordDTO.class), HttpStatus.CREATED);
    }

    @GetMapping
    public List<ClimateRecordDTO> list() {
        return cS.list().stream().map(x -> modelMapper.map(x, ClimateRecordDTO.class)).toList();
    }

    @GetMapping("/{id}")
    public ClimateRecordDTO listId(@PathVariable Long id) {
        ClimateRecord record = cS.listId(id).orElseThrow(() -> new ResourceNotFoundException("No existe el registro de clima con id: " + id));
        return modelMapper.map(record, ClimateRecordDTO.class);
    }

    @PutMapping
    public ClimateRecordDTO update(@Valid @RequestBody ClimateRecordDTO dto) {
        ClimateRecord existing = cS.listId(dto.getIdClimate()).orElseThrow(() -> new ResourceNotFoundException("No existe el registro de clima con id: " + dto.getIdClimate()));
        modelMapper.map(dto, existing);
        cS.update(existing);
        return modelMapper.map(existing, ClimateRecordDTO.class);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cS.listId(id).orElseThrow(() -> new ResourceNotFoundException("No existe el registro de clima con id: " + id));
        cS.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/site/{idSite}")
    public List<ClimateRecordDTO> findBySite(@PathVariable Long idSite) {
        return cS.findByIdSite(idSite).stream().map(x -> modelMapper.map(x, ClimateRecordDTO.class)).toList();
    }
}
