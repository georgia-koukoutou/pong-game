package com.koukoutou.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Ball extends Rectangle {

    private static final long serialVersionUID = 3858686788114236240L;

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;
    BufferedImage image;

    public Ball(int x, int y, int width, int height) throws IOException {
        super(x, y, width, height);

        image = ImageIO.read(new File("beam.png"));
        random = new Random();
        int randomXDirection = random.nextInt(2);
        int randomYDirection = random.nextInt(2);
        if (randomXDirection == 0) {
            randomXDirection--;
        }
        setXDirection(randomXDirection * initialSpeed);

        if (randomYDirection == 0) {
            randomYDirection--;
        }
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void draw(Graphics g) {

        g.drawImage(image, x, y, width, height, Color.BLACK, null);
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

}
