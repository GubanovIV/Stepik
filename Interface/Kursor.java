package Stepik.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Kursor extends JFrame {

    static JFrame frame = new JFrame();//создаем форму
    static JLayeredPane panel = new JLayeredPane();//создаем многослойную панель

    static public void add(MouseEvent e) {//метод добавления объекта по клику
        if (e.getButton() == 1) {//если кнопка левая
            JLabel label = new JLabel("X:" + e.getX() + " Y:" + e.getY());
            label.setBounds(e.getX(), e.getY(), 100, 20);
            label.addMouseListener(new MouseAdapter() {//добавляем слушателя мыши на метку
                public void mouseClicked(MouseEvent e) {
                    delete(e);
                }
            });
            panel.add(label);
        }
    }
    public static void delete(MouseEvent e) {//метод удаления объекта по клику колесика
        if (e.getButton()==2){//если кнопка колесико
            panel.remove((JLabel) e.getSource());//получаем объект, вызвавший событие, кастим его в JLabel и удаляем из панели
            panel.repaint();//обязательно обновляем панель, иначе изменения не отобразятся
        }
    }

    public static void changeCursor(MouseEvent e){//метод изменения курсора
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    public static void defaultCursor(MouseEvent e){//метод возврата курсора к дефолтному
        panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    public static void main(String[] args) throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        frame.setTitle("Удаление мышкой");//заголовок формы
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
        int width = 400, height = 400;//задаем размер окна
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);//выставляем размеры окна
        panel.setFocusable(true);//делаем у панели возможность принимать фокус, иначе она не сможет отловить события клавиатуры
        frame.add(panel);//добавляем панель на форму
        panel.addMouseListener(new MouseAdapter() {//добавляем слушателя мыши на панель
            public void mouseClicked(MouseEvent e) {
                add(e);
            }
        });
        panel.addMouseListener(new MouseAdapter() {//добавляем слушателя мыши на панель
            public void mouseEntered(MouseEvent e) {//если мышь зашла на панель, то меняем курсор
                changeCursor(e);
            }
            public void mouseExited(MouseEvent e) {//если мышь вышла с панели, то курсор дефолтный
                defaultCursor(e);
            }
        });
        frame.setVisible(true);//делаем форму видимой
    }

}
