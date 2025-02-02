import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    Register register = new Register();
    JPanel inputPanel = new JPanel();
    JTextField input = new JTextField(10);
    PursePanel changePanel = new PursePanel();
    public class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
