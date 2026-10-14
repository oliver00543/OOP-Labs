import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class SearchPage extends JFrame implements ActionListener {
    private JTextField priceTxt, shelfLifeTxt, packagingTxt;
    private JTextArea searchResults;
    private JButton searchBtn, backMainBtn;

    public SearchPage() {
        super("Fruit Inventory System");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(550, 550);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Fruit Search Module", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 20));

        JLabel priceLbl = new JLabel("Price >= (THB):");
        JLabel shelfLifeLbl = new JLabel("Shelf Life >= (Days):");
        JLabel packagingLbl = new JLabel("Packaging contains:");

        priceTxt = new JTextField(20);
        shelfLifeTxt = new JTextField(20);
        packagingTxt = new JTextField(20);

        searchResults = new JTextArea(12, 45);
        searchResults.setEditable(false);
        searchResults.append("Results:\n");

        searchBtn = new JButton("Search");
        searchBtn.addActionListener(this);

        backMainBtn = new JButton("Back to Main Page");
        backMainBtn.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 2, 5, 5));
        formPanel.add(priceLbl);
        formPanel.add(priceTxt);
        formPanel.add(shelfLifeLbl);
        formPanel.add(shelfLifeTxt);
        formPanel.add(packagingLbl);
        formPanel.add(packagingTxt);

        JPanel btnPanel = new JPanel();
        btnPanel.add(searchBtn);
        btnPanel.add(backMainBtn);

        JPanel topContainer = new JPanel();
        topContainer.setLayout(new BoxLayout(topContainer, BoxLayout.Y_AXIS));
        topContainer.add(formPanel);
        topContainer.add(btnPanel);

        panel.add(topContainer, BorderLayout.NORTH);
        panel.add(new JScrollPane(searchResults), BorderLayout.CENTER);

        add(titleLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private List<FruitInterface> search(List<FruitInterface> products, double minPrice) {
        List<FruitInterface> results = new ArrayList<>();
        for (FruitInterface p : products) {
            if (p.getPrice() >= minPrice) {
                results.add(p);
            }
        }
        return results;
    }

    private List<FruitInterface> search(List<FruitInterface> products, int minShelfLife) {
        List<FruitInterface> results = new ArrayList<>();
        for (FruitInterface p : products) {
            if (p instanceof FreshFruit) {
                FreshFruit f = (FreshFruit) p;
                if (f.getShelfLifeDays() >= minShelfLife) {
                    results.add(p);
                }
            }
        }
        return results;
    }

    private List<FruitInterface> search(List<FruitInterface> products, String packagingSubstr) {
        List<FruitInterface> results = new ArrayList<>();
        for (FruitInterface p : products) {
            if (p instanceof ProcessedFruit) {
                ProcessedFruit pf = (ProcessedFruit) p;
                if (pf.getPackagingType().toLowerCase().contains(packagingSubstr.toLowerCase())) {
                    results.add(p);
                }
            }
        }
        return results;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Search")) {
            try {
                List<FruitInterface> products = Database.products;

                if (!priceTxt.getText().isEmpty()) {
                    double minPrice = Double.parseDouble(priceTxt.getText());
                    products = search(products, minPrice);
                }

                if (!shelfLifeTxt.getText().isEmpty()) {
                    int minShelfLife = Integer.parseInt(shelfLifeTxt.getText());
                    products = search(products, minShelfLife);
                }

                if (!packagingTxt.getText().isEmpty()) {
                    String packaging = packagingTxt.getText();
                    products = search(products, packaging);
                }

                searchResults.setText("");
                searchResults.append("Results:\n");
                if (products.isEmpty()) {
                    searchResults.append("Not Found\n");
                } else {
                    for (FruitInterface p : products) {
                        searchResults.append(p.toString());
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Price or Shelf Life.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (actionCommand.equals("Back to Main Page")) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new SearchPage();
    }
}
