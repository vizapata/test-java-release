package co.ateunti.demos.testjava.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class AppController {

    @GetMapping
    public ResponseEntity<String> message() {
        return ResponseEntity.ok("Hello World");
    }
}
