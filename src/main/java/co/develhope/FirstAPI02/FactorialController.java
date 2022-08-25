package co.develhope.FirstAPI02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @Autowired
    FactorialService service;

    @GetMapping ("/factorial/{num}")
    public int factiorial(@PathVariable(name = "num") int num){
        if (num > 50) return 0;
        else return service.factorial(num);
    }
}
