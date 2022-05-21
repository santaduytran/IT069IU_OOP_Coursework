package question3a;

import javax.swing.JFrame;

public class Lines1Test {
    public static void main(String[] args){
        // create the panel with the drawing
        Lines1 panel = new Lines1();
        // create a new frame
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add the panel to the frame
        application.add(panel);
        // set the size
        application.setSize(300, 300);
        // show the frame
        application.setVisible(true);
    }
}