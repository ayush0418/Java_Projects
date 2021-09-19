import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends  Rectangle {
    static  int GAME_WIDTH;
    static  int GAME_HEIGHT;
    int player1;
    int player2;
    Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN,60));
        g.drawString(String.valueOf(player1), GAME_WIDTH/2 - 85, 50 );
        g.drawString(String.valueOf(player2), GAME_WIDTH/2 + 20, 50 );
        g.drawLine(GAME_WIDTH/2,0,GAME_WIDTH/2,GAME_HEIGHT);
    }
}
