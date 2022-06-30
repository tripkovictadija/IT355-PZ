package pz.tadija.it355pztadija.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pz.tadija.it355pztadija.entity.Proizvod;
import pz.tadija.it355pztadija.entity.Zakazivanje;

@Repository
public interface ZakazivanjeRepository extends JpaRepository<Zakazivanje, Integer> {
}
