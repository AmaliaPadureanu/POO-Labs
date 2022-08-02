package lab3.task4;

import lab3.task6.Area;
import lab3.tasks1235.Baravelli;
import lab3.tasks1235.CandyBox;
import lab3.tasks1235.ChocAmor;
import lab3.tasks1235.Lindt;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> candyBag;

    public CandyBag() {
        candyBag = new ArrayList<>();
    }

    public void addCandyBox(CandyBox box) {
        candyBag.add(box);
    }

    public CandyBox getCandyBox(int index) {
        return candyBag.get(index);
    }

    public int getSize() {
        return candyBag.size();
    }

    public static void main(String[] args) {
        Lindt l1 = new Lindt("vanilla", "brazil", 3, 4, 5);
        Baravelli b2 = new Baravelli("cocoa", "spain", 2, 4);
        ChocAmor c3 = new ChocAmor("cocos", "italy", 5);

        CandyBag bag = new CandyBag();
        bag.addCandyBox(b2);
        bag.addCandyBox(c3);
        bag.addCandyBox(l1);

        Area a = new Area(bag, 5, "main street");
        a.getBirthdayCard();
    }
}
