package primeFactors;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> lista = new ArrayList<>();
        for (int counter = 2; n > 1; counter++)
            for (; n % counter == 0; n /= counter)
                lista.add(counter);

        return lista;
    }
}
