import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

void main() {

    JButton button = new JButton("Generate Color");
    JFrame frame = new JFrame("Something Random");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    button.setForeground(Color.white);
    button.setBorderPainted(false);
    button.setBackground(Color.black);
    frame.setPreferredSize(new Dimension(300, 900));
    frame.setSize(new Dimension(300, 600));

    JPanel panel = new JPanel(new GridBagLayout());
    button.setBorder(BorderFactory.createEmptyBorder());
    button.setBorderPainted( false );
    button.setFocusPainted(false);

    frame.add(button);

    var pane = (JPanel) frame.getContentPane();
    pane.add(button, BorderLayout.SOUTH);

    button.setPreferredSize(new Dimension(25 * 10, 20 + 10));
    frame.setVisible(true);



}