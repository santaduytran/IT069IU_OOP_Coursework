package Question4;

import java.util.List;

public class Order {
    private int id;
    List <Item> ilist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order(int id, List<Item> ilist) {
        this.id = id;
        this.ilist = ilist;
    }

    public double calculateAverageCost() {
        double price=0;
        for (int i=0;i<ilist.size();i++) {
            price= price+ilist.get(i).getPrice();

        }
        return price/ilist.size();
    }
}