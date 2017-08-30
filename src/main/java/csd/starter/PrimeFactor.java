package csd.starter;

import java.util.ArrayList;
import java.util.List;

class PrimeFactor {
    List<Integer> getFactors(int factor) {
        List<Integer> resList = new ArrayList<>();
        for (int leastPrimeFactor = 2; leastPrimeFactor < factor; leastPrimeFactor++) {
            while (factor % leastPrimeFactor == 0 && factor != leastPrimeFactor) {
                resList.add(leastPrimeFactor);
                factor = factor / leastPrimeFactor;
            }
        }
        resList.add(factor);
        return resList;
    }
}
