package pz.tadija.it355pztadija.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Proizvod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_proizvoda;

    private String naziv_proizvoda;
    private String opis_proizvoda;
    private int cena_proizvoda;
    private String proizvodjac;
}
