package com.koukoutou.pong;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    private static final long serialVersionUID = -4563624500808410818L;

    GamePanel panel;

    public GameFrame() throws IOException {

        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}
