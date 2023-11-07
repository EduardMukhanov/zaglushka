package controllers;

import models.ZaglushkaUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ZaglushkaController {

    @GetMapping("/getEndPoint")
    public ResponseEntity<?> getEndPoint() {
        ZaglushkaUser User = new ZaglushkaUser("Edo", "qwerty");

        return new ResponseEntity<>(User, HttpStatus.OK);
    }

    @PostMapping("/postEndPoint")
    public ResponseEntity<?> postEndPoint(@RequestBody ZaglushkaUser User){
        User.setDate(LocalDate.now());
        return new ResponseEntity<>(User, HttpStatus.OK);
    }

}
