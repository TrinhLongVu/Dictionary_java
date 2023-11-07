package week1.dictionary;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TEST {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Custom Button Message Dialog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold the button
        JPanel panel = new JPanel();

        // Create a JButton
        JButton button = new JButton("Show Message");

        // Add an ActionListener to the button to handle button click
        button.addActionListener(e -> {
            // Custom button labels
            Object[] options = {"OK", "NoOke"};

            // Display a message dialog with custom buttons
            int choice = JOptionPane.showOptionDialog(
                frame,
                "Do you want to continue?",
                "Custom Buttons",
                JOptionPane.YES_NO_OPTION,  // Specify the dialog type
                JOptionPane.QUESTION_MESSAGE, // Specify the icon type
                null,                      // Use the default icon
                options,                   // Custom button labels
                options[0]                 // Default button (OK)
            );

            // Handle the user's choice
            if (choice == JOptionPane.YES_OPTION) {
                // User clicked "OK"
                JOptionPane.showMessageDialog(frame, "You chose OK.", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == JOptionPane.NO_OPTION) {
                // User clicked "NoOke"
                JOptionPane.showMessageDialog(frame, "You chose NoOke.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame's size and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
