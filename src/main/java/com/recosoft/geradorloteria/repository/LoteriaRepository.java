package com.recosoft.geradorloteria.repository;

import com.recosoft.geradorloteria.model.Loteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteriaRepository  extends JpaRepository<Loteria, Long> {
}
