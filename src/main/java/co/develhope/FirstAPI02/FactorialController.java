package co.develhope.FirstAPI02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

//    @Autowired
//    FactorialService service;

    @GetMapping ("/factorial/{num}")
    public int factiorial(@PathVariable(name = "num") int num){
        if (num <= 0) return 0;
        int tot = 1;
        while(num > 1){
            tot = tot * num;
            num--;
        }
        return tot;
//        return service.factorial(num);
        /* Questo return l'ho provato con la classe service, ma non funziona, sembra come se entra in loop
        * cosa sto sbagliando? */
    }
}
