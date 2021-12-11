import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton buttonText;
    JButton buttonBack;
    JLabel label;
    String font = "Freestyle Script";
    String text = "Thank you for checking this out. Change it now";

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        buttonText = new JButton("Pick text color");
        buttonText.addActionListener(this);


        buttonBack = new JButton("Pick background color");
        buttonBack.addActionListener(this);


        label = new JLabel();
        label.setBackground(new Color(184, 224, 221));
        label.setText(text);
        label.setFont(new Font(font, Font.PLAIN, 80));
        label.setOpaque(true);

        this.add(buttonText);
        this.add(buttonBack);
        this.add(label);
        this.pack();
        this.setTitle("Color Chooser");
        this.setLocationRelativeTo(null); // to make the window appear in the middle
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == buttonText) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.gray);
            label.setForeground(color);
        }

        if(e.getSource() == buttonBack) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.gray);
            label.setBackground(color);
        }
    }
}
