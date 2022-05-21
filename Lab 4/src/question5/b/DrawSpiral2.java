package question5.b;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiral2 extends JPanel{
    // draw a circular shape that continually spirals outward
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // draw a green spiral
        g.setColor(Color.GREEN);

        // x,y coordinate of upper-left corner
        int x = getWidth() / 2;
        int y = getHeight() / 2;

        int radiusStep = 20; // distance of radius changes
        int diameter = 0; // diameter of the arc

        int arc = 180; // amount and direction of arc to sweep

        // draw individual lines in to form a spiral
        for(int i = 0; i < 20; i++){
            if (i % 2 == 1) // move x every other repetition
                x -= 2 * radiusStep;

            y -= radiusStep; // move y

            diameter += 2 * radiusStep; // increase diameter

            // draw the arc
            g.drawArc(x, y, diameter, diameter,0, arc);
            // reverse direction of the arc
            arc = -arc;
        }
    }
}
