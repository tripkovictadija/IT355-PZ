package pz.tadija.it355pztadija.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_korisnika;

    private String ime_korisnika;
    private String prezime_korisnika;
    private String username;
    private String password;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "kupovina"
    )

    private List<Proizvod> proizvodi;


}
