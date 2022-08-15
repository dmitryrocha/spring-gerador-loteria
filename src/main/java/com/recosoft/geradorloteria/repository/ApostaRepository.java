package com.recosoft.geradorloteria.repository;

import com.recosoft.geradorloteria.model.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApostaRepository  extends JpaRepository<Aposta, Long> {
}
