
package br.com.edu.utfpr.muralpostit.model.dto;

import br.com.edu.utfpr.muralpostit.model.domain.Employer;
import lombok.Data;
import lombok.NonNull;

@Data
public class PostItDTO {
    @NonNull
    private String tema;
    @NonNull
    private Employer colaborador;
    @NonNull
    private String texto;
}