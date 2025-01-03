import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedHashMap;
import java.util.Map;

public class CurrencyConverter {

    private static LinkedHashMap<String, Double> exchangeRates = new LinkedHashMap<>();

    static {
        // Updated exchange rates relative to USD (as of recent values)
        exchangeRates.put("United States Dollar (USD) - $", 1.0);
        exchangeRates.put("Euro (EUR) - €", 0.94);
        exchangeRates.put("Japanese Yen (JPY) - ¥", 143.0);
        exchangeRates.put("British Pound (GBP) - £", 0.78);
        exchangeRates.put("Indian Rupee (INR) - ₹", 82.5);
        exchangeRates.put("Australian Dollar (AUD) - A$", 1.50);
        exchangeRates.put("Canadian Dollar (CAD) - C$", 1.37);
        exchangeRates.put("Chinese Yuan (CNY) - ¥", 6.97);
        exchangeRates.put("Singapore Dollar (SGD) - S$", 1.35);
        exchangeRates.put("Swiss Franc (CHF) - CHF", 0.92);
        exchangeRates.put("South African Rand (ZAR) - R", 18.12);
        exchangeRates.put("United Arab Emirates Dirham (AED) - د.إ", 3.67);
        exchangeRates.put("Brazilian Real (BRL) - R$", 5.21);
        exchangeRates.put("Mexican Peso (MXN) - $", 17.5);
        exchangeRates.put("Russian Ruble (RUB) - ₽", 97.2);
        exchangeRates.put("Turkish Lira (TRY) - ₺", 27.2);
        exchangeRates.put("South Korean Won (KRW) - ₩", 1325.0);
        exchangeRates.put("Malaysian Ringgit (MYR) - RM", 4.66);
        exchangeRates.put("Thai Baht (THB) - ฿", 34.7);
        exchangeRates.put("Vietnamese Dong (VND) - ₫", 24000.0);
        exchangeRates.put("New Zealand Dollar (NZD) - NZ$", 1.63);
        exchangeRates.put("Philippine Peso (PHP) - ₱", 56.0);
        exchangeRates.put("Egyptian Pound (EGP) - £", 30.9);
        exchangeRates.put("Indonesian Rupiah (IDR) - Rp", 15400.0);
        exchangeRates.put("Pakistani Rupee (PKR) - ₨", 276.0);
        exchangeRates.put("Bangladeshi Taka (BDT) - ৳", 108.5);
        exchangeRates.put("Hong Kong Dollar (HKD) - HK$", 7.83);
        exchangeRates.put("Israeli New Shekel (ILS) - ₪", 3.85);
        exchangeRates.put("Argentine Peso (ARS) - $", 350.0);
        exchangeRates.put("Chilean Peso (CLP) - $", 875.0);
        exchangeRates.put("Colombian Peso (COP) - $", 4150.0);
        exchangeRates.put("Nigerian Naira (NGN) - ₦", 785.0);
        exchangeRates.put("Kenyan Shilling (KES) - KSh", 145.0);
        exchangeRates.put("Ghanaian Cedi (GHS) - ₵", 11.5);
        exchangeRates.put("Tanzanian Shilling (TZS) - TSh", 2500.0);
        exchangeRates.put("Zambian Kwacha (ZMW) - ZK", 22.0);
        exchangeRates.put("Peruvian Sol (PEN) - S/", 3.7);
        exchangeRates.put("Saudi Riyal (SAR) - ﷼", 3.75);
        exchangeRates.put("Qatari Riyal (QAR) - ﷼", 3.64);
    }

    public static double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        double rateFromUSD = getExchangeRate(fromCurrency);
        double rateToUSD = getExchangeRate(toCurrency);

        double amountInUSD = amount / rateFromUSD;
        return amountInUSD * rateToUSD;
    }

    private static double getExchangeRate(String currencyName) {
        for (Map.Entry<String, Double> entry : exchangeRates.entrySet()) {
            if (entry.getKey().contains(currencyName)) {
                return entry.getValue();
            }
        }
        throw new IllegalArgumentException("Invalid currency code provided.");
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(240, 248, 255));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel headerLabel = new JLabel("Currency Converter", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Serif", Font.BOLD, 30));
        headerLabel.setForeground(new Color(25, 118, 210));
        headerLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(25, 118, 210)));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(headerLabel, gbc);

        JLabel fromLabel = new JLabel("Your Currency :");
        fromLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        fromLabel.setForeground(new Color(0, 51, 102));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(fromLabel, gbc);

        JComboBox<String> fromCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        fromCurrency.setFont(new Font("SansSerif", Font.PLAIN, 16));
        fromCurrency.setBackground(new Color(255, 255, 255));
        fromCurrency.setForeground(new Color(0, 51, 102));
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(fromCurrency, gbc);

        JLabel toLabel = new JLabel("To Convert Into :");
        toLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        toLabel.setForeground(new Color(0, 51, 102));
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(toLabel, gbc);

        JComboBox<String> toCurrency = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));
        toCurrency.setFont(new Font("SansSerif", Font.PLAIN, 16));
        toCurrency.setBackground(new Color(255, 255, 255));
        toCurrency.setForeground(new Color(0, 51, 102));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(toCurrency, gbc);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        amountLabel.setForeground(new Color(0, 51, 102));
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(amountLabel, gbc);

        JTextField amountField = new JTextField();
        amountField.setFont(new Font("SansSerif", Font.PLAIN, 16));
        amountField.setBackground(new Color(255, 255, 255));
        amountField.setForeground(new Color(0, 51, 102));
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(amountField, gbc);

        JLabel resultLabel = new JLabel("Converted Amount:");
        resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        resultLabel.setForeground(new Color(0, 51, 102));
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(resultLabel, gbc);

        JLabel resultValue = new JLabel("0.00");
        resultValue.setFont(new Font("SansSerif", Font.BOLD, 18));
        resultValue.setForeground(new Color(34, 139, 34));
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(resultValue, gbc);

        JPanel clickableArea = new JPanel();
        clickableArea.setBackground(new Color(25, 118, 210));
        clickableArea.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clickableArea.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 102), 2));
        JLabel clickableLabel = new JLabel("Click to Convert");
        clickableLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        clickableLabel.setForeground(Color.WHITE);
        clickableArea.add(clickableLabel);
        clickableArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String from = (String) fromCurrency.getSelectedItem();
                    String to = (String) toCurrency.getSelectedItem();
                    double amount = Double.parseDouble(amountField.getText());

                    double convertedAmount = convertCurrency(from, to, amount);
                    resultValue.setText(String.format("%.2f", convertedAmount));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(clickableArea, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
