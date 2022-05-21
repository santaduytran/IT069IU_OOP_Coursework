package question3a;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Lines1 extends JPanel {
    // draw lines that fan out from the corners and intersect along the center
    public void paintComponent(Graphics g){
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

        while ( count < increments ){
            // lines fanning out from the top-left
            g.drawLine(0,0,count * widthStep, height - count * heightStep );
            // lines fanning from the bottom-right
            g.drawLine(width, height, count * widthStep, height - count * heightStep );
            //  lines fanning from the bottom-left
            g.drawLine( 0, height, count * widthStep, count * heightStep );
            // lines fanning from the top-right
            g.drawLine( width, 0, count * widthStep, count * heightStep );

            count++;
        }
    }
}
