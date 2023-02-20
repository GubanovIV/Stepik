package Stepik.Peremashenie;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class MyFrame extends JFrame implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - 20, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - 20);
            case 'd' -> label.setLocation(label.getX() + 20, label.getY());
            case 's' -> label.setLocation(label.getX(), label.getY() + 20);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released: "+e.getKeyChar());
        System.out.println("Code: " + e.getKeyCode());
    }

    JLabel label = new JLabel();
    static int width = 1000, height = 700;//размеры окна
    MyFrame() throws IOException {

        this.setVisible(true); // окошко
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height + 30);
        this.addKeyListener(this);

        BufferedImage im = ImageIO.read(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8o3uPH7EezUIPGsTPZ9iRfoGtyOGNv_TCig&usqp=CAU"));//скачиваем картинку
        JPanel panel = new JPanel (new FlowLayout(FlowLayout.LEFT));//создаем панель, чтобы ей отлавливать события клавиатуры, ставим ее слева
        panel.setFocusable(true);
        label = new JLabel(new ImageIcon(im),JLabel.RIGHT);//создаем объект слева
        panel.add(label, BorderLayout.NORTH);//добавляем на панель
        this.add(panel);//добавляем панель на форму

        //this.add(label);

    }
}