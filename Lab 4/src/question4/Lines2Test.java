package question4;

import javax.swing.JFrame;

public class Lines2Test {
    public static void main(String[] args){
        // create the panel with the drawing
        Lines2 panel = new Lines2();
        // create a new frame
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add the panel to the frame
        application.add(panel);
        // set the size
        application.setSize(400, 400);
        // show the frame
        application.setVisible(true);
    }
}
