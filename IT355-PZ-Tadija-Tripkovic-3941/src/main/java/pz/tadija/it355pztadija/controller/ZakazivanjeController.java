package pz.tadija.it355pztadija.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pz.tadija.it355pztadija.entity.Proizvod;
import pz.tadija.it355pztadija.entity.Zakazivanje;
import pz.tadija.it355pztadija.service.ZakazivanjeService;

@RestController
public class ZakazivanjeController {
    @Autowired
    ZakazivanjeService zakazivanjeService;


    @PostMapping(path = "/dodajZakazivanje")
    public ResponseEntity insertZakazivanje(@RequestBody Zakazivanje zakazivanje) {
        return ResponseEntity.ok(zakazivanjeService.insertZakazivanje(zakazivanje));
    }

    @DeleteMapping("/deleteZakazivanje/{id}")//
    public boolean deleteById(@PathVariable("id") Integer id) {
        zakazivanjeService.deleteById(id);
        return true;
    }

    @PutMapping(path = "/updateZakazivanje/{id}")//
    public ResponseEntity updateZakazivanje(@PathVariable int id, @RequestBody Zakazivanje zakazivanje) {
        return ResponseEntity.ok(zakazivanjeService.updateZakazivanje(id, zakazivanje));
    }

    @GetMapping(path = "/zakazivanja")//
    public ResponseEntity getZakazivanja() {
        return ResponseEntity.ok(zakazivanjeService.fetchZakazivanja());
    }

    @GetMapping(path = "/zakazivanje/{id}")//
    public ResponseEntity getZakazivanje(@PathVariable int id) {
        return ResponseEntity.ok(zakazivanjeService.getZakazivanje(id));
    }

    @GetMapping(path = "/doktori")//
    public ResponseEntity getDoktori() {
        return ResponseEntity.ok(zakazivanjeService.fetchDoktori());
    }
}
