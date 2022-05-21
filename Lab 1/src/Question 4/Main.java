package Question4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item a= new Item ("001","1989 deluxe version",200);
        Item b = new Item ("002","folklore deluxe version",350);

        List<Item> ilist = new ArrayList<Item>();
        ilist.add(a);
        ilist.add(b);
        Order ord = new Order(1,ilist);

        System.out.printf("The average cost is %.1f",ord.calculateAverageCost());
    }
}