package question5.a;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiral1 extends JPanel {
    // draw a square shape that continually spirals outward
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // draw a red spiral
        g.setColor(Color.RED);

        // starting X,Y
        int oldX = getWidth() / 2;
        int oldY = getHeight() / 2;

        // distance to move
        int distance = 0;

        // draw individual lines in to form a spiral
        for(int i=0; i<20; i++) {
            // new X,Y position
            int newX = oldX;
            int newY = oldY;

            // increment the distance every other leg
            if(i % 2 == 0)
                distance += 40; // set distance between lines

            // set the endpoint depending on the desired direction
            switch (i % 4) {
                case 0:
                    newY += distance;
                    break;
                case 1:
                    newX -= distance;
                    break;
                case 2:
                    newY -= distance;
                    break;
                case 3:
                    newX += distance;
                    break;
            }

            g.drawLine(oldX, oldY, newX, newY);
            // replace old positions with new ones
            oldX = newX;
            oldY = newY;
        }
    }
}
