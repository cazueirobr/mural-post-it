package br.com.edu.utfpr.muralpostit.model.domain;
import lombok.*;

import jakarta.persistence.*;



@Entity
@Table(name = "employers")
@Data(staticConstructor = "of")
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String nome;

}