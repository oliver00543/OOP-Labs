import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel;
    private JButton enrollButton;
    private JButton searchButton;
    private JButton exitButton;

    public MainPage() {
        setTitle("Chiang Mai Fruit Inventory System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Chiang Mai Fruit System", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 20));

        enrollButton = new JButton("Add Fruit Products");
        enrollButton.addActionListener(this);
        searchButton = new JButton("Search Fruits");
        searchButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        enrollButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        searchButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(Box.createVerticalStrut(20));
        panel.add(enrollButton);
        panel.add(Box.createVerticalStrut(15));
        panel.add(searchButton);
        panel.add(Box.createVerticalStrut(15));
        panel.add(exitButton);

        add(titleLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Add Fruit Products")) {
            new EnrollPage();
        } else if (actionCommand.equals("Search Fruits")) {
            new SearchPage();
        } else if (actionCommand.equals("Exit")) {
            int chosenOption = JOptionPane.showConfirmDialog(this,
                    "Do you want to exit the program?", "Fruit Inventory System",
                    JOptionPane.OK_CANCEL_OPTION);
            if (chosenOption == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new MainPage();
    }
}
