import java.util.Objects;

public class Palondrom {
    Long palindr;
    int firstPrime;
    int secondPrine;

    public Palondrom(Long palindr, int firstPrime, int secondPrine) {
        this.palindr = palindr;
        this.firstPrime = firstPrime;
        this.secondPrine = secondPrine;
    }

    public Long getPalindr() {
        return palindr;
    }

    public void setPalindr(Long palindr) {
        this.palindr = palindr;
    }

    public int getFirstPrime() {
        return firstPrime;
    }

    public void setFirstPrime(int firstPrime) {
        this.firstPrime = firstPrime;
    }

    public int getSecondPrine() {
        return secondPrine;
    }

    public void setSecondPrine(int secondPrine) {
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
}
