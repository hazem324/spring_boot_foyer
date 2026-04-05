package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBloc;
    String nomBloc;
    long capaciteBloc;

    @ManyToOne
    @JsonIgnore
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    @JsonIgnore
    Set<Chambre> chambres = new HashSet<Chambre>();
}
