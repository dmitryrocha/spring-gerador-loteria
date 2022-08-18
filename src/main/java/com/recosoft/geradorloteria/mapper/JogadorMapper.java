package com.recosoft.geradorloteria.mapper;

import com.recosoft.geradorloteria.dto.JogadorCreateDto;
import com.recosoft.geradorloteria.dto.JogadorDto;
import com.recosoft.geradorloteria.model.Jogador;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public JogadorDto toJogadorDto(Jogador jogador) { return MODEL_MAPPER.map(jogador, JogadorDto.class);}

    public Jogador toJogadorCreate(JogadorCreateDto jogadorCreateDto) {
        return MODEL_MAPPER.map(jogadorCreateDto, Jogador.class);
    }
}
