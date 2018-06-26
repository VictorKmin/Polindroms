import java.util.Objects;

public class Palondrom implements Comparable<Palondrom>{
    long palindr;
    long firstPrime;
    long secondPrine;

    public Palondrom(long palindr, long firstPrime, long secondPrine) {
        this.palindr = palindr;
        this.firstPrime = firstPrime;
        this.secondPrine = secondPrine;
    }

    public Long getPalindr() {
        return palindr;
    }

    public void setPalindr(long palindr) {
        this.palindr = palindr;
    }

    public long getFirstPrime() {
        return firstPrime;
    }

    public void setFirstPrime(long firstPrime) {
        this.firstPrime = firstPrime;
    }

    public long getSecondPrine() {
        return secondPrine;
    }

    public void setSecondPrine(long secondPrine) {
        this.secondPrine = secondPrine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palondrom)) return false;
        Palondrom palondrom = (Palondrom) o;
        return getFirstPrime() == palondrom.getFirstPrime() &&
                getSecondPrine() == palondrom.getSecondPrine() &&
                Objects.equals(getPalindr(), palondrom.getPalindr());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPalindr(), getFirstPrime(), getSecondPrine());
    }

    @Override
    public String toString() {
        return "Palondrom{" +
                "palindr=" + palindr +
                ", firstPrime=" + firstPrime +
                ", secondPrine=" + secondPrine +
                '}';
    }

    @Override
    public int compareTo(Palondrom o) {
        if (this.palindr > o.getPalindr()) {
            return 1;
        } else if (this.palindr < o.getPalindr()) {
            return -1;
        } else {
            return 0;
        }
    }
}
