package com.recosoft.geradorloteria.controller;

import com.recosoft.geradorloteria.dto.JogadorCreateDto;
import com.recosoft.geradorloteria.dto.JogadorDto;
import com.recosoft.geradorloteria.mapper.JogadorMapper;
import com.recosoft.geradorloteria.model.Jogador;
import com.recosoft.geradorloteria.service.JogadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private final JogadorService service;
    private final JogadorMapper mapper;

    public JogadorController(JogadorService service, JogadorMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<JogadorDto> findById(@PathVariable Long id) {
        Jogador jogador = service.findById(id);
        return ResponseEntity.ok(mapper.toJogadorDto(jogador));
    }

    @PostMapping
    public ResponseEntity<JogadorDto> create(@RequestBody JogadorCreateDto jogadorCreateDto) {
        var jogadorCreate = mapper.toJogadorCreate(jogadorCreateDto);
        var jogador = service.create(jogadorCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toJogadorDto(jogador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
