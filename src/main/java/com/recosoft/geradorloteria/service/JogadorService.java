package com.recosoft.geradorloteria.service;

import com.recosoft.geradorloteria.exception.JogadorNameNullException;
import com.recosoft.geradorloteria.exception.JogadorNotFoundExeption;
import com.recosoft.geradorloteria.model.Jogador;
import com.recosoft.geradorloteria.repository.JogadorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JogadorService {

    private final JogadorRepository repository;

    public JogadorService(JogadorRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Jogador findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new JogadorNotFoundExeption(id));
    }

    @Transactional
    public Jogador create(Jogador jogadorCreate) {
        if(jogadorCreate.getNome() == null || jogadorCreate.getUsername() == null ||
                jogadorCreate.getNome().equals("") || jogadorCreate.getUsername().equals(""))
            throw new JogadorNameNullException();
        if(jogadorCreate.getPassword().equals("") || jogadorCreate.getPassword() == null)
            jogadorCreate.setPassword("1234");

        return repository.save(jogadorCreate);
    }

    @Transactional
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }
}
