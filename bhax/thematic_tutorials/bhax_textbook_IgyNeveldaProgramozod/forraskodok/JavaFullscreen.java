import javax.swing.*;
import java.awt.*;

public class JavaFullscreen extends JFrame {

    public static void main(String[] args) {
        JavaFullscreen frame = new JavaFullscreen();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setVisible(true);
        JLabel label = new JLabel("Hello World!", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        label.setForeground(Color.blue);
        frame.add(label);
    }
}