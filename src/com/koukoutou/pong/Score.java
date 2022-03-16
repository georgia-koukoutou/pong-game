package com.koukoutou.pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Score extends Rectangle {

    private static final long serialVersionUID = -8281999617022828858L;

    int gameWidth;
    int gameHeight;
    int player1;
    int player2;

    public Score(int gameWidth, int gameHeight) {

        this.gameWidth = gameWidth;
        this.gameHeight = gameHeight;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(gameWidth / 2, 0, gameWidth / 2, gameHeight);
        g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (gameWidth / 2) - 85, 50);
        g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (gameWidth / 2) + 20, 50);
    }

}
