import java.util.*;

public class PrimeNumbers {

    private Set<Palondrom> palindromes = new HashSet<>();

    private List<Integer> findPrime() {
        int i = 0;
        int num = 0;
        List<Integer> primeNumbers = new ArrayList<>();

        for (i = 10000; i <= 99999; i++) {
            int counter=0;
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
            for (int number : primeList) {
                int arg1 = primeList.get(i);
                int arg2 = number;
                palindromeSearch(arg1, arg2);
            }
        }
        for (Iterator<Palondrom> it = palindromes.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
    private void palindromeSearch(int firstPrime, int secondPrine) {
        long palindr = firstPrime * secondPrine;
        String strResult = String.valueOf(palindr);
        if (strResult.equals(new StringBuilder(strResult).reverse().toString())) {
            palindromes.add(new Palondrom(palindr, firstPrime, secondPrine));
            System.out.println("Palindrom detected !");
        }
    }
}
