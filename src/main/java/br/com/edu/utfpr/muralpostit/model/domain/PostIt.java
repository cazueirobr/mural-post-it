package br.com.edu.utfpr.muralpostit.model.domain;
import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "postits")
@Data(staticConstructor = "of")
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class PostIt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String tema;
    @NonNull
    private String colaborador;
    @NonNull
    private String texto;
}