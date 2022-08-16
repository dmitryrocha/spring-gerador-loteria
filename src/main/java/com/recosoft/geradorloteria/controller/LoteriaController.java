package com.recosoft.geradorloteria.controller;

import com.recosoft.geradorloteria.dto.LoteriaCreateDto;
import com.recosoft.geradorloteria.dto.LoteriaDto;
import com.recosoft.geradorloteria.mapper.LoteriaMapper;
import com.recosoft.geradorloteria.model.Loteria;
import com.recosoft.geradorloteria.service.LoteriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loteria")
public class LoteriaController {

    private final LoteriaService service;
    private final LoteriaMapper mapper;

    public LoteriaController(LoteriaService service, LoteriaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<LoteriaDto>> findAll() {
        List<Loteria> loteriaList = service.findAll();
        return ResponseEntity.ok(mapper.toLoteriaDtoList(loteriaList));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoteriaDto> findById(@PathVariable Long id) {
        Loteria loteria = service.findById(id);
        return ResponseEntity.ok(mapper.toLoteriaDto(loteria));
    }

    @PostMapping
    public ResponseEntity<LoteriaDto> create(@RequestBody LoteriaCreateDto loteriaCreateDto) {
        var loteriaCreate = mapper.toLoteriaCreate(loteriaCreateDto);
        var loteria = service.create(loteriaCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toLoteriaDto(loteria));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LoteriaDto> update(@PathVariable Long id, @RequestBody LoteriaCreateDto loteriaCreateDto) {
        var loteriaCreate = mapper.toLoteriaCreate(loteriaCreateDto);
        var loteria = service.update(loteriaCreate.getId(), loteriaCreate);
        return  ResponseEntity.status(HttpStatus.OK).body(mapper.toLoteriaDto(loteria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
