package grafica;
import javax.swing.*;

public class ActionCalcular extends AbstractAction{
    private JTextField txtX, txtY;
    private JComboBox<String> cbxOperacao;
    public ActionCalcular(JTextField txtX, JTextField txtY, JComboBox<String> cbxOperacao){
        this.txtX = txtX;
        this.txtY = txtY;
        this.cbxOperacao = cbxOperacao;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());
        Calculadora calc = new Calculadora(x, y);
        if(cbxOperacao.getSelectedItem().equals("Soma")){
            JOptionPane.showMessageDialog(null, String.format("O resultado de %f + %f é %f", x, y calc.somar()),"Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
        } //fazer para as demais operações
    }
    
}
