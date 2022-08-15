package com.recosoft.geradorloteria.service;

import com.recosoft.geradorloteria.exception.LoteriaNameNullException;
import com.recosoft.geradorloteria.exception.LoteriaNegativeNumberException;
import com.recosoft.geradorloteria.exception.LoteriaNotFoundException;
import com.recosoft.geradorloteria.model.Loteria;
import com.recosoft.geradorloteria.repository.LoteriaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LoteriaService {

    private final LoteriaRepository repository;

    public LoteriaService(LoteriaRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Loteria findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new LoteriaNotFoundException(id));
    }

    public Loteria create(Loteria loteriaCreate) {
        if(loteriaCreate.getNome() == null)
            throw new LoteriaNameNullException();
        if(loteriaCreate.getMaiorNumero() < 0 || loteriaCreate.getMenorNumero() < 0 || loteriaCreate.getQtdNumeros() < 1)
            throw new LoteriaNegativeNumberException();

        return repository.save(loteriaCreate);
    }

    public List<Loteria> findAll() {
        return repository.findAll();
    }
}
