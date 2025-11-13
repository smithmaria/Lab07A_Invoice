import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class InvoiceFrame extends JFrame {
    private Invoice invoice;

    // GUI Components
    private JTextField productNameInput;
    private JTextField unitPriceInput;
    private JTextField quantityInput;

    private JButton addItemButton;

    private JTextArea invoiceTextArea;

    private JLabel totalLabel;

    /**
     * Constructor for InvoiceFrame
     */
    public InvoiceFrame () {
        super("Invoice Application");

        setLayout(new BorderLayout());
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        invoice = new Invoice();

        createInputPanel();
        createInvoicePanel();

    }

    private void createInputPanel () {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        TitledBorder border = new TitledBorder(
                BorderFactory.createEtchedBorder(EtchedBorder.RAISED),
                "Item Input"
        );
        inputPanel.setBorder(border);

        JLabel nameLabel = new JLabel("Product Name");
        productNameInput = new JTextField(15);

        JLabel unitPriceLabel = new JLabel("Unit Price");
        unitPriceInput = new JTextField(10);

        JLabel quantityLabel = new JLabel("Quantity");
        quantityInput = new JTextField(5);

        addItemButton = new JButton("Add Item");

        inputPanel.add(nameLabel);
        inputPanel.add(productNameInput);
        inputPanel.add(unitPriceLabel);
        inputPanel.add(unitPriceInput);
        inputPanel.add(quantityLabel);
        inputPanel.add(quantityInput);

        inputPanel.add(new JLabel(""));
        inputPanel.add(addItemButton);

        add(inputPanel, BorderLayout.NORTH);
    }

    private void createInvoicePanel () {
        JPanel invoicePanel = new JPanel();
        invoicePanel.setLayout(new BorderLayout());

        TitledBorder border = new TitledBorder(
                BorderFactory.createEtchedBorder(EtchedBorder.RAISED),
                "Invoice"
        );
        invoicePanel.setBorder(border);

        invoiceTextArea = new JTextArea(10, 40);
        invoiceTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(invoiceTextArea);
        scrollPane.setPreferredSize(new Dimension(400, 250));

        totalLabel = new JLabel("Total: $0.00");

        invoicePanel.add(scrollPane, BorderLayout.CENTER);
        invoicePanel.add(totalLabel, BorderLayout.SOUTH);

        add(invoicePanel, BorderLayout.CENTER);
    }
}
