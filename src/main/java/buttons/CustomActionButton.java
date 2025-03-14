package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomActionButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;
    JLabel label;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Click the button!");
        label.setOpaque(true);
        label.setBackground(new Color(200, 200, 200));
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
    }

    public void onClick() {
        button = new JButton("Change Text");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
                System.out.println("Custom action executed!");
            }
        });
    }
}