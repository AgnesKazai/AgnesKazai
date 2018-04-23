// Create a square drawing function that takes 2 parameters:
// The square size, and the fill color,
// and draws a square of that size and color to the center of the canvas.
// Create a loop that fills the canvas with rainbow colored squares.

import jdk.nashorn.internal.ir.WithNode;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
    public static void mainDraw(Graphics graphics) {

        int[][] colorsOfTheRainbow = {
                {148, 0, 211},
                {75, 0, 130},
                {0, 0, 255},
                {0, 255, 0},
                {255, 255, 0},
                {255, 127, 0},
                {255, 0, 0}
        };
        Random rnd = new Random();
        for (int i = 0; i < WIDTH; i++) {
            int rainBow = rnd.nextInt(7);
            Color color = new Color(colorsOfTheRainbow[rainBow][0],colorsOfTheRainbow[rainBow][1],colorsOfTheRainbow[rainBow][2]);
            graphics.setColor(color);
            graphics.fillRect(rnd.nextInt(WIDTH), rnd.nextInt(HEIGHT),50,50);
        }
        squareDrawing(graphics, 80, Color.MAGENTA);
    }

    public static void squareDrawing(Graphics graphics, int size, Color c) {
        int x = WIDTH / 2 - size / 2;
        int y = HEIGHT / 2 - size / 2;
        graphics.setColor(c);
        graphics.fillRect(x, y, size, size);

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
