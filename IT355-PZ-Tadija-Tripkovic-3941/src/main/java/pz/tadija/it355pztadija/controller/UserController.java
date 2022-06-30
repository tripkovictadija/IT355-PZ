package pz.tadija.it355pztadija.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pz.tadija.it355pztadija.dto.KupovinaDTO;
import pz.tadija.it355pztadija.entity.Proizvod;
import pz.tadija.it355pztadija.entity.User;
import pz.tadija.it355pztadija.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {

    @Autowired
    UserService userService;

   // @Autowired
   // LoginService loginService;

    @PostMapping(path = "/register")
    public ResponseEntity insertUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.insertUser(user));
    }



    @GetMapping(path = "/user")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(userService.fetchAll());
    }



//
//    @GetMapping(path = "/single_user/{id}")
//    public ResponseEntity getUser(@PathVariable("id") Integer id) {
//        return ResponseEntity.ok(userService.getUser(id));
//    }
///
//
//    @PostMapping("/login")
//    public ResponseEntity loginUser(@RequestBody LoginRequestDto por) {
//
//        User user = userService.findUser(por.getUser_id());
//
//        System.out.println("User id " + por.getUser_id());
//
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date now = new Date();
//
//        LoginUser pore = new LoginUser();
//
//        pore.setDate(now);
//        pore.setUser_login(user);
//
//        System.out.println(now);
//
//        if (pore == null) {
//            return (ResponseEntity) ResponseEntity.badRequest();
//        }
//
//        return ResponseEntity.ok(loginService.insertUser(pore));
//    }
}
