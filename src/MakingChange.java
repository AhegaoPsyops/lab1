import java.awt.*;
import javax.swing.*;
public class MakingChange {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RegisterPanel panel = new RegisterPanel();
        frame.setPreferredSize(new Dimension(500,500));
        //panel.setPreferredSize(new Dimension(500, 500));
        //frame.getContentPane().setBackground(Color.BLUE);

        frame.getContentPane().add(panel);
        frame.pack();


        frame.setVisible(true);

    }
}
