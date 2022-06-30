package pz.tadija.it355pztadija.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Zakazivanje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_zakazivanje;

    @OneToOne
    private Doktor doktor;
    private String ime_pacijenta;
    private String prezime_pacijenta;
    private String naziv;
    private String datum;
    private String vreme;
    private String telefon;

}
