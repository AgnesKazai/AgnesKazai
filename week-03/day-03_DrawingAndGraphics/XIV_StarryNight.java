// Draw the night sky:
//  - The background should be black
//  - The stars can be small squares
//  - The stars should have random positions on the canvas
//  - The stars should have random color (some shade of grey)

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static java.lang.Math.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class XIV_StarryNight {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        int[][] starColors = {
                {220, 220, 220},
                {211, 211, 211},
                {192, 192, 192},
                {169, 169, 169},
                {128, 128, 128},
                {105, 105, 105},
                {119, 136, 153},
                {112, 128, 144},
                {47, 79, 79}
        };
        Random rnd = new Random();
        for (int i = 0; i < HEIGHT; i++) {

            int randomRow = rnd.nextInt(8);
            Color color = new Color(starColors[randomRow][0], starColors[randomRow][1], starColors[randomRow][2]);
            graphics.setColor(color);
            graphics.fillRect(rnd.nextInt(WIDTH), rnd.nextInt(HEIGHT), 5, 5);
        }
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
