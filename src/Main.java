import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Окно");
        JLabel label = new JLabel("My first inscription");
        Font font = new Font("Vladimir script",Font.BOLD,50);
        label.setFont(font);
        frame.add(label);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

      }
    }
