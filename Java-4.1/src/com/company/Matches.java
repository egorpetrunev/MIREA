package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Matches extends JFrame{
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JButton button3 = new JButton("Complete the match");
    private JLabel label1 = new JLabel("Result: 0 X 0");
    private JLabel label2 = new JLabel("Last Scorer: N/A");
    private JLabel label3 = new JLabel("Winner: N/A");
    private int milan = 0;
    private int madrid = 0;

    //ПРОГРАММА ЗАКРОЕТСЯ ЧЕРЕЗ 3 СЕКУНДЫ ПОСЛЕ НАЖАТИЯ НА КНОПКУ "Complete the match"
    Timer timer = new Timer();
    TimerTask exitApp = new TimerTask() {
        public void run() {
            System.exit(0);
        }
    };
    public Matches(){
        this.setBounds(200,200,600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6,BoxLayout.Y_AXIS));

        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(button1);
        container.add(button2);
        container.add(button3);
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setFont(new Font("Verdana", Font.PLAIN, 20));
        label1.setPreferredSize(new Dimension(250, 100));
        label1.setForeground(new Color(229, 20, 0));

        label2.setVerticalAlignment(JLabel.TOP);
        label2.setFont(new Font("Verdana", Font.PLAIN, 20));
        label2.setPreferredSize(new Dimension(250, 100));
        label2.setForeground(new Color(229, 20, 0));

        label3.setVerticalAlignment(JLabel.TOP);
        label3.setFont(new Font("Verdana", Font.PLAIN, 20));
        label3.setPreferredSize(new Dimension(250, 100));
        label3.setForeground(new Color(229, 20, 0));

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milan+=1;
                label1.setText("Result: "+milan+" X "+madrid);
                label2.setText("Last scorer: AC Milan");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madrid+=1;
                label1.setText("Result: "+milan+" X "+madrid);
                label2.setText("Last scorer: Real Madrid");

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        button3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (milan > madrid){
                    label3.setText("Winner: AC Milan");

                }
                else if (madrid > milan){
                    label3.setText("Winner: Real Madrid");
                }
                else {
                    label3.setText("Winner: DRAW");
                }
                //ПРОГРАММА ЗАКРОЕТСЯ ЧЕРЕЗ 3 СЕКУНДЫ ПОСЛЕ НАЖАТИЯ НА КНОПКУ "Complete the match"
                timer.schedule(exitApp, new Date(System.currentTimeMillis()+3*1000));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
