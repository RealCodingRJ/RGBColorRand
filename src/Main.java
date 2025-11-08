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

    JLabel lbl1 = new JLabel();
    JLabel lbl2 = new JLabel();
    JLabel lbl3 = new JLabel();

    button.setBorderPainted(false);
    button.setFocusPainted(false);

    var pane = frame.getContentPane();
    pane.add(button, BorderLayout.SOUTH);
    frame.setLayout(new FlowLayout());

    pane.add(lbl1);
    pane.add(lbl2);
    pane.add(lbl3);

    button.addActionListener(_ -> {

        var indexR = indexRand(9);
        var indexG = indexRand(5);
        var indexB = indexRand(2);

        System.out.println("Hello");
        frame.getContentPane().setBackground(new Color(indexR, indexG, indexB));

        lbl1.setText("R: " + indexR);
        lbl2.setText("G: " + indexG);
        lbl3.setText("B: " + indexB);
    });

    button.setPreferredSize(new Dimension(330, 20 + 10));
    frame.setVisible(true);

}