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
                        fractal(g, 0, 0, w, h);
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

    // feel free to change the parameters, but don't delete the Graphics or you
    // won't be able to draw anything!
    public static void fractal(Graphics g, int level, int x1, int y1, int x2, int y2, int x3, int y3) {
        // in case you forget how to draw lines:
        // g.drawLine(x1, y1, x2, y2);
        if (level == 0) {
            // base case

            // TODO: draw the triangle
        } else {
            // recursive case

            // TODO: find the midpoints
            // TODO: draw the fractals
        }
    }
}

