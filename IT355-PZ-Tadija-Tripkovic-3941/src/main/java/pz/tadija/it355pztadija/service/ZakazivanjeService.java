package pz.tadija.it355pztadija.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pz.tadija.it355pztadija.entity.Doktor;
import pz.tadija.it355pztadija.entity.Proizvod;
import pz.tadija.it355pztadija.entity.Zakazivanje;
import pz.tadija.it355pztadija.repository.DoktorRepository;
import pz.tadija.it355pztadija.repository.ProizvodRepository;
import pz.tadija.it355pztadija.repository.ZakazivanjeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ZakazivanjeService {

    @Autowired
    private ZakazivanjeRepository zakazivanjeRepository;

    @Autowired
    private DoktorRepository doktorRepository;

    public Zakazivanje insertZakazivanje(Zakazivanje zakazivanje) {
        return zakazivanjeRepository.save(zakazivanje);
    }

    public List<Zakazivanje> fetchAll() {
        return zakazivanjeRepository.findAll();
    }

    public List<Doktor> fetchDoktori() {
        return doktorRepository.findAll();
    }

    public Zakazivanje getZakazivanje(int id) {
        Optional<Zakazivanje> zakazivanje = zakazivanjeRepository.findById(id);
        if (zakazivanje.isPresent()) {
            return zakazivanje.get();
        }
        return null;
    }

    public Zakazivanje updateZakazivanje(int id, Zakazivanje zakazivanje) {
        zakazivanje.setId_zakazivanje(id);
        return zakazivanjeRepository.save(zakazivanje);
    }

    public List<Zakazivanje> fetchZakazivanja() {
        return zakazivanjeRepository.findAll();
    }

    public void deleteById(int id) {
        zakazivanjeRepository.deleteById(id);
    }
}
