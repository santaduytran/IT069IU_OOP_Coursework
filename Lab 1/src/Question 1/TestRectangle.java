package Question1;

import Question1.Rectangle;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 10);
        r1.visualize();

        Rectangle r2 = new Rectangle(-6, 10);
        r2.visualize();

        Rectangle r3 = new Rectangle(6, -10);
        r3.visualize();

    }
}
