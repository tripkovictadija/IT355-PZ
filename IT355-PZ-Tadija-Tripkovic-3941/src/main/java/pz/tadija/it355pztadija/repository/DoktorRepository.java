package pz.tadija.it355pztadija.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pz.tadija.it355pztadija.entity.Doktor;
import pz.tadija.it355pztadija.entity.Proizvod;

@Repository
public interface DoktorRepository extends JpaRepository<Doktor, Integer> {

}
