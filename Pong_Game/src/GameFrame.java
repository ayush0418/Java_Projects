import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class GameFrame extends JFrame {
    GamePanel gamePanel;
    GameFrame(){
        this.add(new GamePanel());
        this.setBackground(Color.black);
        this.setVisible(true);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
