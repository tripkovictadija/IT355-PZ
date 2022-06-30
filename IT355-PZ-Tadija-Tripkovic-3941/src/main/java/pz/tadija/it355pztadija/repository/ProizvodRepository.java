package pz.tadija.it355pztadija.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pz.tadija.it355pztadija.entity.Proizvod;
import pz.tadija.it355pztadija.entity.User;

import java.util.List;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod, Integer> {

}
