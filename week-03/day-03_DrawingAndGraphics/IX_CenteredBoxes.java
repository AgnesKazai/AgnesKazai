// create a square drawing function that takes 1 parameter:
// the square size
// and draws a square of that size to the center of the canvas.
// draw 3 squares with that function.
// avoid code duplication.

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class IX_CenteredBoxes {


    public static void mainDraw(Graphics graphics) {

        squareDrawing(graphics, 50);
    }

    private static void squareDrawing(Graphics graphics, int a) {
        int i = 0;
        do {
            int x = WIDTH / 2 - a / 2;
            int y = HEIGHT / 2 - a / 2;
            int x2 = x + a;
            int y2 = y + a;

            graphics.drawLine(x, y, x2, y);
            graphics.drawLine(x2, y, x2, y2);
            graphics.drawLine(x, y, x, y2);
            graphics.drawLine(x, y2, x2, y2);

            a += 30;
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
