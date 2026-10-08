import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    // Spatial coordinates and dimensions
    private int x, y;
    private final int diameter;
    
    // Velocity vectors (speed and direction)
    private int vx, vy;
    private final Color color;

    // Constructor to initialize the ball's properties
    public Ball(int startX, int startY, int diameter, int speedX, int speedY, Color color) {
        this.x = startX;
        this.y = startY;
        this.diameter = diameter;
        this.vx = speedX;
        this.vy = speedY;
        this.color = color;
    }

    // Updates coordinates and handles wall collisions
    public void move(int containerWidth, int containerHeight) {
        // Detect horizontal wall collision
        if (x + vx < 0 || x + diameter + vx > containerWidth) {
            vx = -vx; // Reverse horizontal direction
        }
        // Detect vertical wall collision
        if (y + vy < 0 || y + diameter + vy > containerHeight) {
            vy = -vy; // Reverse vertical direction
        }

        // Apply movement velocity
        x += vx;
        y += vy;
    }

    // Handles rendering the ball onto the graphics context
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, diameter, diameter);
    }
}
