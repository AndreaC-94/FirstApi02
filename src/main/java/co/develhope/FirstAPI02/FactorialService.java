package co.develhope.FirstAPI02;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    public int factorial(int n){
        int tot = 0;
        if (n <= 0) return 0;
        while(n > 1){
            tot = n * factorial(n-1);
        }
        return tot;
    }
}
