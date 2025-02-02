import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RegisterPanel extends JPanel {

    private JButton b;
    private JLabel l;
    private Register register;

    RegisterPanel() {

        register = new Register();
        JPanel inputPanel = new JPanel();
        JTextField input = new JTextField(10);
        PursePanel changePanel = new PursePanel();
        b = new JButton("Enter");
        this.setBackground(Color.BLUE);
        this.setPreferredSize(new Dimension(100, 50));
        b.setBackground(Color.RED);
        b.setForeground(Color.BLACK);


    }

    private class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


        }
    }

}
