package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;
import moneycalculator.ui.MoneyDisplay;
import moneycalculator.ui.SwingMoneyDisplay.SwingMoneyDisplay;

public class MainFrame extends JFrame {
    
    private MoneyDisplay moneyDisplay;

    public MainFrame() {
        setTitle("Money Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(SwingMoneyDisplayPanel(), BorderLayout.NORTH);
    }
    
    public MoneyDisplay getMoneyDisplay() {
        return moneyDisplay;
    }    

    private Component SwingMoneyDisplayPanel() {
        SwingMoneyDisplay display = new SwingMoneyDisplay ();
        this.moneyDisplay = display;
        return display;
    }
    
    
    /*
    Metodo de prueba, no util [add(label())]

        private Component label() {
            JPanel jPanel = new JPanel();
            jPanel.add(new JLabel("Hola"));
            return jPanel;
        }

    */    
    
}
