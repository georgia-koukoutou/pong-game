package com.koukoutou.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Paddle extends Rectangle {

    private static final long serialVersionUID = 8986515023512435792L;
    int id;
    int yVelocity;
    int speed = 10;
    BufferedImage image;

    public Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) throws IOException {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;

        if (id == 1) {
            image = ImageIO.read(new File("green_lightsaber.png"));
        } else {
            image = ImageIO.read(new File("red_lightsaber.png"));
        }
    }

    public void keyPressed(KeyEvent e) {
        switch (id) {
        case 1:
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(-speed);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(speed);
                move();
            }
            break;
        case 2:
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(-speed);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(speed);
                move();
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (id) {
        case 1:
            if (e.getKeyCode() == KeyEvent.VK_W) {
                setYDirection(0);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                setYDirection(0);
                move();
            }
            break;
        case 2:
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(0);
                move();
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(0);
                move();
            }
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void draw(Graphics g) {

        g.drawImage(image, x, y, width, height, Color.BLACK, null);
    }

    public void move() {
        y = y + yVelocity;

    }

}
