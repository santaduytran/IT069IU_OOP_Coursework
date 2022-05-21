package Question1;
public class Rectangle {

    private int width, height;

    public Rectangle(int width, int height) {
        if(width < 0) {
            System.out.println("Invalid width. Setting to 1");
            width = 1;
        }
        if(height < 0) {
            System.out.println("Invalid height. Setting to 1");
            height = 1;
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void visualize() {
        for(int r = 0; r<height; r++) {
            for(int c=0; c<width; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
