package src.mino;

import java.awt.Color;
import java.awt.Graphics2D;

public class Mino {
    
    public Block b[] = new Block[4];
    public Block tempB[] = new Block[4];

    public void create(Color c) {

        b[0] = new Block(c);
        b[1] = new Block(c);
        b[2] = new Block(c);
        b[3] = new Block(c);
        tempB[0] = new Block(c);
        tempB[1] = new Block(c);
        tempB[2] = new Block(c);
        tempB[3] = new Block(c);
    }

    public void setXY(int x, int y) {


    }
    
    public void updateXY(int direction) {


    }

    public void update() {


    }

    public void draw(Graphics2D g2) {

        
    }
}

