package pz.tadija.it355pztadija.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pz.tadija.it355pztadija.entity.Proizvod;
import pz.tadija.it355pztadija.entity.User;
import pz.tadija.it355pztadija.repository.ProizvodRepository;
import pz.tadija.it355pztadija.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProizvodService {

    @Autowired
    private ProizvodRepository proizvodRepository;

    @Autowired
    private UserRepository userRepository;

    public Proizvod insertProizvod(Proizvod proizvod) {
        return proizvodRepository.save(proizvod);
    }


    public List<Proizvod> preostaliProizvodi(Integer id) {
        List<Proizvod> sva = proizvodRepository.findAll();
        User user = userRepository.findById(id).get();
        List<Proizvod> vlasnikova = user.getProizvodi();
        sva.removeAll(vlasnikova);
        return sva;
    }



    public List<Proizvod> fetchAll() {
        return proizvodRepository.findAll();
    }

    public Proizvod getProizvod(int id) {
        Optional<Proizvod> proizvod = proizvodRepository.findById(id);
        if (proizvod.isPresent()) {
            return proizvod.get();
        }
        return null;
    }

    public List<Proizvod> fetchProizvodi() {
        return proizvodRepository.findAll();
    }

    public void deleteById(int id) {
        proizvodRepository.deleteById(id);
    }
}
