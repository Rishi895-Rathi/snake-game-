package snakes;
import javax.swing.*;
public class snakes extends JFrame {
    snakes(){
        super("SNAKE GAME");
        add(new board());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new snakes().setVisible(true);
    }
}