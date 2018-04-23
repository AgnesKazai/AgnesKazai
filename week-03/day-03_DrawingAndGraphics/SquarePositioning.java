// create a square drawing function that takes 2 parameters:
// the x and y coordinates of the square's top left corner
// and draws a 50x50 square from that point.
// draw 3 squares with that function.
// avoid code duplication.

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquarePositioning {
    public static void mainDraw(Graphics graphics) {

        squareDrawing(graphics, 100, 100);

    }

    private static void squareDrawing(Graphics graphics, int x, int y) {
        int i = 0;
        do {
            int x2 = x + 50;
            int y2 = y + 50;

            graphics.drawLine(x, y, x2, y);
            graphics.drawLine(x, y, x, y2);
            graphics.drawLine(x2, y, x2, y2);
            graphics.drawLine(x, y2, x2, y2);

            x += 30;
            y += 30;
            i++;
        } while (i < 3);
    }

    //    Don't touch the code below
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
