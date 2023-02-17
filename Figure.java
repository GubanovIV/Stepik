import java.awt.*;
import javax.swing.JFrame;

public class Figure extends Canvas{

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(new Color(64, 64, 64));
        g.fillRoundRect(250, 100, 120, 350, 15, 15);
        g.fillRoundRect(280, 455, 60, 60, 15, 15);
        g.fillPolygon(new int[]{180, 240, 240}, new int[]{120, 120, 180}, 3);
        g.fillPolygon(new int[]{180, 240, 240}, new int[]{220, 220, 280}, 3);
        g.fillPolygon(new int[]{180, 240, 240}, new int[]{320, 320, 380}, 3);
        g.fillPolygon(new int[]{380, 380, 440}, new int[]{120, 180, 120}, 3);
        g.fillPolygon(new int[]{380, 380, 440}, new int[]{220, 280, 220}, 3);
        g.fillPolygon(new int[]{380, 380, 440}, new int[]{320, 380, 320}, 3);
        g.setColor(Color.RED);
        g.fillOval(265,120,90, 90);
        g.setColor(Color.YELLOW);
        g.fillOval(265,230,90, 90);
        g.setColor(Color.GREEN);
        g.fillOval(265,340,90, 90);
        g.setColor(new Color(64, 64, 64));
        g.fillArc(270, 80, 80, 30, 0, 180);
    }

    public static void main(String[] args) {
        Figure figure = new Figure();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(figure);
        frame.setSize(800,800);
        frame.setVisible(true);
    }

}
