import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EnrollPage extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel;
    private JTextField idTxt;
    private JTextField nameTxt;
    private JTextField priceTxt;
    private JTextField shelfLifeTxt;
    private JTextField packagingTxt;
    private JTextArea productListTxtArea;
    private JButton addProductBtn;
    private JButton backMainBtn;
    private JCheckBox isFreshCheckBox;

    public EnrollPage() {
        super("Fruit Inventory System");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(550, 550);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Fruit Enrollment Module", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 20));

        JLabel idLbl = new JLabel("ID");
        JLabel nameLbl = new JLabel("Name");
        JLabel priceLbl = new JLabel("Price/kg (THB)");
        JLabel shelfLifeLbl = new JLabel("Shelf Life (Days)");
        JLabel packagingLbl = new JLabel("Packaging Type");

        idTxt = new JTextField();
        nameTxt = new JTextField();
        priceTxt = new JTextField();
        shelfLifeTxt = new JTextField();
        packagingTxt = new JTextField();

        productListTxtArea = new JTextArea();
        productListTxtArea.setEditable(false);

        JPanel titlePanel = new JPanel();
        JLabel lbl = new JLabel("Enroll new fruit products");
        titlePanel.add(lbl);

        addProductBtn = new JButton("Enroll a Product");
        addProductBtn.addActionListener(this);

        backMainBtn = new JButton("Back to Main Page");
        backMainBtn.addActionListener(this);

        JLabel isFreshLbl = new JLabel("Is Fresh Fruit?");
        isFreshCheckBox = new JCheckBox();

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 2, 5, 5));
        formPanel.add(idLbl);
        formPanel.add(idTxt);
        formPanel.add(nameLbl);
        formPanel.add(nameTxt);
        formPanel.add(priceLbl);
        formPanel.add(priceTxt);
        formPanel.add(shelfLifeLbl);
        formPanel.add(shelfLifeTxt);
        formPanel.add(packagingLbl);
        formPanel.add(packagingTxt);
        formPanel.add(isFreshLbl);
        formPanel.add(isFreshCheckBox);

        JPanel btnPanel = new JPanel();
        btnPanel.add(addProductBtn);
        btnPanel.add(backMainBtn);

        JPanel topContainer = new JPanel();
        topContainer.setLayout(new BoxLayout(topContainer, BoxLayout.Y_AXIS));
        topContainer.add(titlePanel);
        topContainer.add(formPanel);
        topContainer.add(btnPanel);

        productListTxtArea.append("Product List:\n");
        for (FruitInterface p : Database.products) {
            productListTxtArea.append(p.toString());
        }

        panel.add(topContainer, BorderLayout.NORTH);
        panel.add(new JScrollPane(productListTxtArea), BorderLayout.CENTER);

        add(titleLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void clearTextField() {
        idTxt.setText("");
        nameTxt.setText("");
        priceTxt.setText("");
        shelfLifeTxt.setText("");
        packagingTxt.setText("");
        isFreshCheckBox.setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Enroll a Product")) {
            try {
                FruitInterface p;
                if (isFreshCheckBox.isSelected()) {
                    p = new FreshFruit(idTxt.getText(), nameTxt.getText(),
                            Double.parseDouble(priceTxt.getText()),
                            Integer.parseInt(shelfLifeTxt.getText()));
                } else {
                    p = new ProcessedFruit(idTxt.getText(), nameTxt.getText(),
                            Double.parseDouble(priceTxt.getText()),
                            packagingTxt.getText());
                }

                Database.products.add(p);
                productListTxtArea.append(p.toString());
                JOptionPane.showMessageDialog(this, "Add product successfully.");
                clearTextField();

            } catch (NumberFormatException ex) {
                String message = "Wrong input. Please check data type (numeric values required).\nError: " + ex;
                JOptionPane.showMessageDialog(this, message);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Some error occurred. Please contact the admin.\n" + ex);
            }
        } else if (actionCommand.equals("Back to Main Page")) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new EnrollPage();
    }
}
