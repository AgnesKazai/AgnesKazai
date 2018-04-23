import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

    public static void mainDraw(Graphics graphics) {
        int x1 = 10;
        int y1 = 10;
        int x2, y2;

        for (int i = 1; i < 7; i++) {
            x2 = 10 * i;
            y2 = 10 * i;
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(x1, y1, x2, y2);
            x1 += x2;
            y1 += y2;
        }

    }

        /*
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(10, 10, 10, 10);
            graphics.fillRect(20, 20, 20, 20);
            graphics.fillRect(40, 40, 30, 30);
            graphics.fillRect(70, 70, 40, 40);
            graphics.fillRect(110, 110, 50, 50);
            graphics.fillRect(160, 160, 60, 60);
*/


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
