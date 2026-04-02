import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing {
    private JFrame frame;
    private JPanel panel;

    public Drawing() {
        // change the drawing size here
        final int w = 800, h = 800;

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel =
                new JPanel() {
                    @Override
                    public void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        // you can change the drawing color here
                        g.setColor(Color.WHITE);

                        // call your fractal function here
                        fractal(g, 7, 0, 799, 400, 0, 799, 799);
                    }
                };
        // you can change the bg color here
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(w, h));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        frame.setFocusable(true);
        frame.addKeyListener(
                new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                        }
                    }
                });
    }

    public static void main(String[] args) {
        new Drawing();
    }

    public static void fractal(Graphics g, Triangle tri) {
        ArrayStack<Triangle> stack = new ArrayStack<>();
        stack.push(tri);

        while (!stack.isEmpty()) {
            // remove triangle from top of the stack
            Triangle t = stack.pop();

            // TODO: draw triangle if its level is zero
            // TODO: push three smaller triangles with level - 1 if its level is > 0

            // midpoint calculations from last time we did this
            int x12 = (t.x1 + t.x2) / 2;
            int y12 = (t.y1 + t.y2) / 2;
            int x13 = (t.x1 + 2 * t.x3) / 3;
            int y13 = (t.y1 + 2 * t.y3) / 3;
            int x23 = (2 * t.x3 + t.x2) / 3;
            int y23 = (2 * t.y3 + t.y2) / 3;
        }
    }

    static class Triangle {
        int level;
        int x1, x2, x3, y1, y2, y3;

        Triangle(int level, int x1, int y1, int x2, int y2, int x3, int y3) {
            this.level = level;
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.y1 = y1;
            this.y2 = y2;
            this.y3 = y3;
        }
    }
}

