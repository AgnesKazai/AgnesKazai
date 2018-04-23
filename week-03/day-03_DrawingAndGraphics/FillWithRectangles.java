// draw four different size and color rectangles.
// avoid code duplication.

import sun.font.FontRunIterator;

import java.util.*;
import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {
    public static void mainDraw(Graphics graphics) {

        Random rnd = new Random();

        for (int i = 0; i < 3; i++) {
            int x1 = rnd.nextInt(HEIGHT / 2);
            int x2 = rnd.nextInt(HEIGHT / 2);
            int y1 = rnd.nextInt(HEIGHT / 2);
            int y2 = rnd.nextInt(HEIGHT / 2);

            Color color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            graphics.setColor(color);
            graphics.fillRect(x1, y1, x2, y2);
        }
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
