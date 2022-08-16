package com.recosoft.geradorloteria.mapper;

import com.recosoft.geradorloteria.dto.LoteriaCreateDto;
import com.recosoft.geradorloteria.dto.LoteriaDto;
import com.recosoft.geradorloteria.model.Loteria;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LoteriaMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public LoteriaDto toLoteriaDto(Loteria loteria) {
        return MODEL_MAPPER.map(loteria, LoteriaDto.class);
    }

    public Loteria toLoteria(LoteriaDto loteriaDto) {
        return MODEL_MAPPER.map(loteriaDto, Loteria.class);
    }

    public Loteria toLoteriaCreate(LoteriaCreateDto loteriaCreateDto) {
        return MODEL_MAPPER.map(loteriaCreateDto, Loteria.class);
    }

    public List<LoteriaDto> toLoteriaDtoList(List<Loteria> loteriaList) {
        return loteriaList.stream().map(this::toLoteriaDto).collect(Collectors.toList());
    }
}
