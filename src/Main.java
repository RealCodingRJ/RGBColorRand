import javax.swing.*;
import java.awt.*;


int indexRand (int x) {
    return new Random().nextInt(x, 255);
}


void main() {

    JButton button = new JButton("Generate Color");
    JFrame frame = new JFrame("Something Random");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    button.setForeground(Color.white);
    button.setBorderPainted(false);
    button.setBackground(Color.black);
    frame.setPreferredSize(new Dimension(300, 900));
    frame.setSize(new Dimension(300, 600));

    button.setBorder(BorderFactory.createEmptyBorder());
    button.setBorderPainted( false );
    button.setFocusPainted(false);

    frame.add(button);


    var pane = (JPanel) frame.getContentPane();
    pane.add(button, BorderLayout.SOUTH);

    button.addActionListener(_ -> {

        final int indexR = indexRand(1);
        final int indexG = indexRand(2);
        final int indexB = indexRand(3);

        frame.getContentPane().setBackground(new Color(indexR, indexG, indexB));
    });

    button.setPreferredSize(new Dimension(25 * 10, 20 + 10));
    frame.setVisible(true);



}