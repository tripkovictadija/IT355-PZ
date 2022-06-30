package pz.tadija.it355pztadija.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pz.tadija.it355pztadija.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //User findByEmail(String email);
}