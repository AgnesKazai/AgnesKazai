// Create a function that takes 1 parameter:
// An array of {x, y} points
// and connects them with green lines.
// Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
// Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
// {120, 100}, {85, 130}, {50, 100}}

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class XIII_ConnectTheDots {


    public static void mainDraw(Graphics graphics) {
        int[][] pointsOfBox = {
                {10, 10},
                {290, 10},
                {290, 290},
                {10, 290}
        };

        int[][] pointsOfOctagon = {
                {50, 100},
                {70, 70},
                {80, 90},
                {90, 90},
                {100, 70},
                {120, 100},
                {85, 130},
                {50, 100}
        };

        getABox(graphics, pointsOfBox);
        getABox(graphics, pointsOfOctagon);
    }

    private static void getABox(Graphics graphics, int[][] points) {
        for (int row = 0; row < points.length - 1; row++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(points[row][0], points[row][1], points[row + 1][0], points[row + 1][1]);
        }
        graphics.drawLine(points[0][0], points[0][1], points[points.length - 1][0], points[points.length - 1][1]);

    }


    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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
