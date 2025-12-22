import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel{
    private class Tile{
        int x;
        int y;

        Tile(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    int borderWidth;
    int borderHeight;
    int tileSize = 25;

    Tile snakeHead;

    SnakeGame(int borderWidth, int borderHeight){
        this.borderWidth = borderWidth;
        this.borderHeight = borderHeight;
        setPreferredSize(new Dimension(this.borderWidth, this.borderHeight));
        setBackground(Color.black);

        snakeHead = new Tile(5 , 5);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        // Grid
        for(int i = 0 ; i < borderWidth/tileSize; i++){
            // (x1,y1,x2,y2)
            g.drawLine(i*tileSize, 0, i*tileSize, borderHeight);
            g.drawLine(0, i*tileSize,borderWidth, i*tileSize);
        }

        // Snake
        g.setColor(Color.green);
        g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);
    }
}
