package grafica;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class FrmCalculadoraSimples extends JFrame{
    private JTextField txtX, txtY;
    private JComboBox<String> cbxOperacao;
    private JButton btnCalcular;
    public FrmCalculadoraSimples(){
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(320, 120));
        add(new JLabel("X:"));
        add(txtX = new JTextField(10));
        add(new JLabel("Y:"));
        add(txtY = new JTextField(10));
        String operacoes[] = {"Soma", "Subtracao", "Multiplicacao", "Divisão"};
        add(new JLabel("Operação"));
        add(cbxOperacao = new JComboBox<String>(operacoes));
        add(btnCalcular = new JButton("Calcular"));

    }
    
}
