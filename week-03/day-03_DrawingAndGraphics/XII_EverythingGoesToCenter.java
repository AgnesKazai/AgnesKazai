// Create a line drawing function that takes 2 parameters:
// The x and y coordinates of the line's starting point
// and draws a line from that point to the center of the canvas.
// Fill the canvas with lines from the edges, every 20 px, to the center.

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class XII_EverythingGoesToCenter {
    public static void mainDraw(Graphics graphics) {

        //SOLUTION 1: The first, longer solution.
        //Drawing top
       /* int x = 0;
        int y = 0;
        int i = 0;
        do {
            x = 20 * i;
            lineDrawing(graphics, x, y);
            i++;
        } while (x < WIDTH);
        //Drawing left side
        x = 0;
        y = 0;
        i = 0;
        do {
            y = 20 * i;
            lineDrawing(graphics, x, y);
            i++;
        } while (y < HEIGHT);
        //Drawing bottom side
        x = 0;
        y = HEIGHT;
        i = 0;
        do {
            x = 20 * i;
            lineDrawing(graphics, x, y);
            i++;
        } while (x < WIDTH); //ism top
        //Drawing right side
        x = WIDTH;
        y = 0;
        i = 0;
        do {
            y = 20 * i;
            lineDrawing(graphics, x, y);
            i++;
        } while (y < HEIGHT);*/

        //SOLUTION 2: The second, shorter version
        int x = 0;
        int y = 0;

        for (int i = 0; i * 20 < WIDTH; i++) {
            x = 20 * i;
            lineDrawing(graphics, x, y);
            lineDrawing(graphics, x, HEIGHT);
        }
        x = 0;
        for (int j = 0; j * 20 < HEIGHT; j++) {
            y = 20 * j;
            lineDrawing(graphics, x, y);
            lineDrawing(graphics, WIDTH, y);
        }
    }

    public static void lineDrawing(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);

    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
