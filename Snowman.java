package Swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Snowman extends JFrame {
    public Snowman() {
        super();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Снеговик");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 526;
        int height = 616;
        frame.setLayout(null);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setResizable(false);
        Color b = new Color(255, 255, 255);
        frame.getContentPane().setBackground(b);

        SnowmanFigure eye_1 = new SnowmanFigure(4);
        eye_1.setBounds(248, 144, width, height);
        frame.add(eye_1);

        SnowmanFigure eye_2 = new SnowmanFigure(4);
        eye_2.setBounds(284, 144, width, height);
        frame.add(eye_2);

        SnowmanFigure nose = new SnowmanFigure(5);
        nose.setBounds(268, 166, width, height);
        frame.add(nose);

        SnowmanFigure leftHand = new SnowmanFigure(6);
        leftHand.setBounds(20, 192, width, height);
        frame.add(leftHand);

        SnowmanFigure mouth_1 = new SnowmanFigure(3);
        mouth_1.setBounds(240, 188, width, height);
        frame.add(mouth_1);

        SnowmanFigure mouth_2 = new SnowmanFigure(3);
        mouth_2.setBounds(257, 192, width, height);
        frame.add(mouth_2);

        SnowmanFigure mouth_3 = new SnowmanFigure(3);
        mouth_3.setBounds(274, 192, width, height);
        frame.add(mouth_3);

        SnowmanFigure mouth_4 = new SnowmanFigure(3);
        mouth_4.setBounds(291, 186, width, height);
        frame.add(mouth_4);

        SnowmanFigure hat = new SnowmanFigure(8);
        hat.setBounds(178, 36, width, height);
        frame.add(hat);

        SnowmanFigure head = new SnowmanFigure(2);
        head.setBounds(197, 107, width, height);
        frame.add(head);

        SnowmanFigure button_1 = new SnowmanFigure(3);
        button_1.setBounds(268, 265, width, height);
        frame.add(button_1);

        SnowmanFigure button_2 = new SnowmanFigure(3);
        button_2.setBounds(268, 293, width, height);
        frame.add(button_2);

        SnowmanFigure button_3 = new SnowmanFigure(3);
        button_3.setBounds(268, 321, width, height);
        frame.add(button_3);

        SnowmanFigure upperBody = new SnowmanFigure(1);
        upperBody.setBounds(158, 205, width, height);
        frame.add(upperBody);

        SnowmanFigure rightHand = new SnowmanFigure(7);
        rightHand.setBounds(334, 192, width, height);
        frame.add(rightHand);

        SnowmanFigure lowerBody = new SnowmanFigure(0);
        lowerBody.setBounds(130, 325, width, height);
        frame.add(lowerBody);

        frame.pack();
        frame.setVisible(true);

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = image.createGraphics();
        frame.paint(graphics2D);
        try {
            ImageIO.write(image,"jpeg", new File("output.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
