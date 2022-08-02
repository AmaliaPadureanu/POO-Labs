package lab3.task6;

import lab3.task4.CandyBag;
import lab3.tasks1235.Baravelli;
import lab3.tasks1235.ChocAmor;
import lab3.tasks1235.Lindt;

public class Area {
    private CandyBag bag;
    private int number;
    private String street;

    public Area() {}

    public Area(CandyBag bag, int number, String street) {
        this.number = number;
        this.street = street;
        this.bag = bag;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public void getBirthdayCard() {
        System.out.print("number = " + getNumber() + " " + "street = " + getStreet() + "\n" + "La multi ani!" + "\n");

        for (int i = 0; i < bag.getSize(); i++) {
            System.out.println(bag.getCandyBox(i));
            bag.getCandyBox(i).printDim();
            //AICI FOLOSIM INSTANCEOF
           /* if (bag.getCandyBox(i) instanceof Lindt) {
                ((Lindt) bag.getCandyBox(i)).printLindtDim();
            } else if (bag.getCandyBox(i) instanceof Baravelli) {
                ((Baravelli) bag.getCandyBox(i)).printBaravelliDim();
            } else {
                ((ChocAmor) bag.getCandyBox(i)).printChocAmorDim();
            }
            */
        }
    }
}
