package br.com.edu.utfpr.muralpostit.model.mapper;

import br.com.edu.utfpr.muralpostit.model.domain.Employer;

import br.com.edu.utfpr.muralpostit.model.dto.EmployerDTO;


public class EmployerMapper {

    public static Employer toEntity(EmployerDTO dto){
        Employer entity = new Employer(dto.getNome());
        return entity;
    }

    public static EmployerDTO toDTO(Employer entity){
        EmployerDTO dto = new EmployerDTO(entity.getNome());
        return dto;
    }
}