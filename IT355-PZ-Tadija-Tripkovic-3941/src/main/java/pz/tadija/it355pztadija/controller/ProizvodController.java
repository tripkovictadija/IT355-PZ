package pz.tadija.it355pztadija.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pz.tadija.it355pztadija.dto.KupovinaDTO;
import pz.tadija.it355pztadija.entity.Proizvod;
import pz.tadija.it355pztadija.entity.User;
import pz.tadija.it355pztadija.service.ProizvodService;
import pz.tadija.it355pztadija.service.UserService;

@RestController
public class ProizvodController {
    @Autowired
    ProizvodService proizvodService;
    @Autowired
    UserService userService;


    @PostMapping("/kupi")
    public ResponseEntity kupi(@RequestBody KupovinaDTO addOrderDto) {

        Proizvod pr = proizvodService.getProizvod(addOrderDto.getId_proizvod());
        User user = userService.findUser(addOrderDto.getId_user());

        user.getProizvodi().add(pr);

        return ResponseEntity.ok(userService.insertUser(user));
    }

    @GetMapping(path = "/preostali/{id}")
    public ResponseEntity preostala(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(proizvodService.preostaliProizvodi(id));
    }

    @GetMapping(path = "/kupljena/{id}")
    public ResponseEntity kupljena(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userService.getUser(id).getProizvodi());
    }


    @PostMapping(path = "/dodajProizvod")
    public ResponseEntity insertProizvod(@RequestBody Proizvod proizvod) {
        return ResponseEntity.ok(proizvodService.insertProizvod(proizvod));
    }
/*
    @DeleteMapping("/deleteProizvod/{id}")//
    public boolean deleteById(@PathVariable("id") Integer id) {
        proizvodService.deleteById(id);
        return true;
    }
*/
    @GetMapping(path = "/proizvodi")//
    public ResponseEntity getProizvodi() {
        return ResponseEntity.ok(proizvodService.fetchProizvodi());
    }


}
