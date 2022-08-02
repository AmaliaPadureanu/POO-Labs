package lab3.tasks1235;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {}

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    //METODA CARE VA FI SUPRASCRISA IN CLASELE DERIVATE ASTFEL INCAT SA NU MAI FIE NEVOIE DE INSTANCE OF
    public void printDim() {
        System.out.println(0);
    }

    @Override
    public String toString() {
        return "The " + origin +
                " " + flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return flavor.equals(candyBox.flavor) && origin.equals(candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }
}
