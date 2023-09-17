package src.mino;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Block extends Rectangle {
    
    public int x;
    public int y;
    public static final int SIZE = 30;
    public Color c;

    public Block(Color c) {

        this.c = c;
    }

    public void draw(Graphics2D g2) {

        g2.setColor(c);
        g2.fillRect(x, y, SIZE, SIZE);
    }
}
