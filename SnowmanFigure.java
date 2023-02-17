package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SnowmanFigure extends JComponent {

    private Color color;
    private int type;

    public SnowmanFigure(int type) {
        this.type = type;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        switch (type) {
            /* Oval - Lower Body */
            case 0: g2.drawOval(0,0,256,230); break;
            /* Oval - Upper Body */
            case 1:
                g2.setColor(Color.WHITE);
                g2.fillOval(0,0,200,174);
                g2.setColor(Color.BLACK);
                g2.drawOval(0,0,200,174);
                break;
            /* Oval - head */
            case 2:
                g2.setColor(Color.WHITE);
                g2.fillOval(0,0,125,119);
                g2.setColor(Color.BLACK);
                g2.drawOval(0,0,125,119);
                break;
            /* Circle - mouth & button */
            case 3:
                g2.drawOval(0,0,10,10);
                break;
            /* Circle - eye */
            case 4:
                g2.drawOval(0,0,12,12);
                break;
            /* Triangle - nose */
            case 5:
                g2.setColor(Color.WHITE);
                g2.fillPolygon(new int[] {0, 80, 4}, new int[] {0, 0, 16}, 3);
                g2.setColor(Color.BLACK);
                g2.drawPolygon(new int[] {0, 80, 4}, new int[] {0, 0, 16}, 3);
                break;
            /* Polygon - left hand*/
            case 6:
                g2.setColor(Color.WHITE);
                g2.fillPolygon(new int[] {0, 4, 38, 22, 32, 48, 164, 160, 48, 24, 12, 34}, new int[] {40, 24, 32, 6, 0, 34, 66, 82, 48, 70, 62, 44}, 12);
                g2.setColor(Color.BLACK);
                g2.drawPolygon(new int[] {0, 4, 38, 22, 32, 48, 164, 160, 48, 24, 12, 34}, new int[] {40, 24, 32, 6, 0, 34, 66, 82, 48, 70, 62, 44}, 12);
                break;
            /* Polygon - left hand*/
            case 7:
                g2.setColor(Color.WHITE);
                g2.fillPolygon(new int[] {0, 114, 132, 144, 126, 164, 168, 130, 152, 142, 116, 6}, new int[] {72, 32, 0, 6, 32, 24, 38, 44, 62, 70, 46, 84}, 12);
                g2.setColor(Color.BLACK);
                g2.drawPolygon(new int[] {0, 114, 132, 144, 126, 164, 168, 130, 152, 142, 116, 6}, new int[] {72, 32, 0, 6, 32, 24, 38, 44, 62, 70, 46, 84}, 12);
                break;
            /* Hat*/
            case 8:
                g2.setColor(Color.WHITE);
                g2.fillOval(0, 68, 160, 24);
                g2.setColor(Color.BLACK);
                g2.drawOval(0, 68, 160, 24);
                g2.setColor(Color.WHITE);
                g2.fillRoundRect(34,0,92, 75,20,20);
                g2.setColor(Color.BLACK);
                g2.drawRoundRect(34,0,92, 75,20,20);
                g2.drawLine(34, 50,126,50);
                break;
        }
    }
}
