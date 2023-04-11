
package br.com.edu.utfpr.muralpostit.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class PostItDTO {
    @NonNull
    private String tema;
    @NonNull
    private String colaborador;
    @NonNull
    private String texto;
}