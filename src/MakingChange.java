import java.awt.*;
import javax.swing.*;
public class MakingChange {
    JFrame frame = new JFrame("CoinFlipper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    CoinFlipPanel panel = new CoinFlipPanel();
        panel.setPreferredSize(new
    Dimension(500, 500));

        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
}
