import java.util.*;

public class PrimeNumbers {

    private TreeSet<Palondrom> palindromes = new TreeSet<>();

    private List<Integer> findPrime() {
        int i = 0;
        long num = 0;
        List<Integer> primeNumbers = new ArrayList<>();

        for (i = 10000; i <= 99999; i++) {
            long counter=0;
            for(num =i; num>=1; num--) {
                if(i%num==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public void killMyCorei3() {
        List<Integer> primeList = findPrime();
        for (int i = 0; i < primeList.size(); i++){
            for (long number : primeList) {
                long arg1 = primeList.get(i);
                long arg2 = number;
                palindromeSearch(arg1, arg2);
            }
        }
        System.out.println("The biggest palindrom is: " + palindromes.last().palindr);
        System.out.println("First prime is: " + palindromes.last().firstPrime);
        System.out.println("Second prime is: " + palindromes.last().secondPrine);
    }
    private void palindromeSearch(long firstPrime, long secondPrine) {
        long palindr = firstPrime * secondPrine;
        String strResult = String.valueOf(palindr);
        if (strResult.equals(new StringBuilder(strResult).reverse().toString())) {
            palindromes.add(new Palondrom(palindr, firstPrime, secondPrine));
        }
    }
}
