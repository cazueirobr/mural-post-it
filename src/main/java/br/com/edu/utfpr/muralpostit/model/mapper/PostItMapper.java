package br.com.edu.utfpr.muralpostit.model.mapper;

import br.com.edu.utfpr.muralpostit.model.domain.PostIt;
import br.com.edu.utfpr.muralpostit.model.dto.PostItDTO;

public class PostItMapper {

    public static PostIt toEntity(PostItDTO dto){
        PostIt entity = new PostIt(dto.getTema(), dto.getColaborador(), dto.getTexto());
        return entity;
    }

    public static PostItDTO toDTO(PostIt entity){
        PostItDTO dto = new PostItDTO(entity.getTema(), entity.getColaborador(), entity.getTexto());
        return dto;
    }
}