package question4;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Lines2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // number of increments each side is divided
        int increments = 15;

        // total width, height
        int width = getWidth();
        int height = getHeight();

        // width, height increment
        int widthStep = width / increments;
        int heightStep = height / increments;

        // loop counter
        int count = 0;

        // draws lines in a pattern between adjacent edges
        while (count < increments){
            // left to bottom
            g.drawLine(0, count * heightStep,(count+1) * widthStep, height);
            // right to top
            g.drawLine(width, count * heightStep,width - (count+1) * widthStep, height);
            // right to bottom
            g.drawLine(width, height - count * heightStep,width - (count+1) * widthStep, 0);
            // left to top
            g.drawLine(0, height - count * heightStep,(count+1) * widthStep, 0);

            count++;
        }
    }
}