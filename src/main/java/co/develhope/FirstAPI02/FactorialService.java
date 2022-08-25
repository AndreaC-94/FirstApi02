package co.develhope.FirstAPI02;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    public int factorial(int n) {

        if (n <= 0) return 0;
        int tot = 1;
        while (n > 1) {
            tot = tot * n;
            n--;
        }
        return tot;
    }
}
