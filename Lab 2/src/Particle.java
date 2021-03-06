import java.util.Random;

import javax.swing.Box;

public class Particle {
    private int x;
    private int y;
    private int dx;
    private int dy;

    private enum Directions {
        N, NE, E, SE, S, SW, W, NW
    }

    private static final Directions[] DIRECTIONS = Directions.values();
    private static final Random RANDOM = new Random();

    public Particle() {
        this.x = RANDOM.nextInt(Box.WIDTH + 1); // Range [0, Box.WIDTH]
        this.y = RANDOM.nextInt(Box.HEIGHT + 1); // Range [0, Box.HEIGHT]
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        Directions direct = DIRECTIONS[RANDOM.nextInt(8)];
        switch (direct) {
            case N:
                dy = y - 1;
                break;
            case NE:
                dx = x + 1;
                dy = y - 1;
                break;
            case E:
                dx = x + 1;
                break;
            case SE:
                dx = x + 1;
                dy = y + 1;
                break;
            case S:
                dy = y + 1;
                break;
            case SW:
                dx = x - 1;
                dy = y + 1;
                break;
            case W:
                dx = x - 1;
                break;
            case NW:
                dx = x - 1;
                dy = y - 1;
                break;
            default:
                break;
        }
        if (dx < 0 || dy < 0 || dx > Box.WIDTH || dy > Box.HEIGHT) { // If Out of bound error !
            this.move(); // Particle recursively move again until success;
        }
        this.x = dx;
        this.y = dy;
    }
}