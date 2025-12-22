import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int borderWidth = 600;
        int borderHeight = borderWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(borderWidth, borderHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(borderWidth,borderHeight);
        frame.add(snakeGame);
        frame.pack();
    }
}