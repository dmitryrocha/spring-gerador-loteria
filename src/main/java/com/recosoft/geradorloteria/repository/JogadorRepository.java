package com.recosoft.geradorloteria.repository;

import com.recosoft.geradorloteria.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository  extends JpaRepository<Jogador, Long> {
}
