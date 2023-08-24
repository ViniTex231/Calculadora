import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame {
//    Declarando os objetos
    private JLabel lbl_texto1;
    private JLabel lbl_texto2;
    private JLabel lbl_resultado;
    private JTextField txt_valor1;
    private JTextField txt_valor2;
    private JTextField txt_resultado;
    private JButton btn_somar;
    private JButton btn_subtrair;
    private JButton btn_multiplicar;
    private JButton btn_dividir;
    private double valor1, valor2;

//    Método construtor da classe
    public Calculadora(){
        setTitle("Calculadora");
        setSize(286,300);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl_texto1          = new JLabel("Valor 1");
        lbl_texto2          = new JLabel("Valor 2");
        lbl_resultado       = new JLabel("Resultado");
        txt_valor1          = new JTextField(10);
        txt_valor2          = new JTextField(10);
        txt_resultado       = new JTextField(10);
        btn_somar           = new JButton("+");
        btn_subtrair  = new JButton("-");
        btn_multiplicar     = new JButton("*");
        btn_dividir         = new JButton("/");

       Operacoes op  = new Operacoes();
        btn_somar           .addActionListener(op);
        btn_subtrair        .addActionListener(op);
        btn_multiplicar     .addActionListener(op);
        btn_dividir         .addActionListener(op);
    }

//    Starta os objetos na janela
    public void inicia(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(204,255,204));
        getContentPane().add(lbl_texto1);
        getContentPane().add(txt_valor1);
        getContentPane().add(lbl_texto2);
        getContentPane().add(txt_valor2);
        getContentPane().add(btn_somar);
        getContentPane().add(btn_subtrair);
        getContentPane().add(btn_multiplicar);
        getContentPane().add(btn_dividir);
        getContentPane().add(lbl_resultado);
        getContentPane().add(txt_resultado);

        lbl_texto1          .setBounds(40,50,100,25);
        txt_valor1          .setBounds(100,50,140,25);
        lbl_texto2          .setBounds(40,80,100,25);
        txt_valor2          .setBounds(100,80,140,25);
        btn_somar           .setBounds(20,120,50,25);
        btn_subtrair        .setBounds(80,120,50,25);
        btn_multiplicar     .setBounds(140,120,50,25);
        btn_dividir         .setBounds(200,120,50,25);
        lbl_resultado       .setBounds(100,170,100,25);
        txt_resultado       .setBounds(10,200,250,25);

        setVisible(true);
    }

//    Operações da calculadora
       private class Calculos {
       public double somar(double v1, double v2) {
            return (v1 + v2);
        }
        public double subtrair(double v1, double v2) {
            return (v1 - v2);
        }
        public double multiplicar(double v1, double v2) {
            return (v1 * v2);
        }
        public double dividir(double v1, double v2) {
            return (v1 / v2);
        }
    }

//    Executa a operação somente se os campos não estiverem vazios
    private class Operacoes implements ActionListener {
        public void actionPerformed(ActionEvent elemento){
            Calculos c = new Calculos();

            if(elemento.getSource() == btn_somar){
                if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
                    JOptionPane.showMessageDialog(null,"Prencha os campos!");
                } else {
                    valor1 = Double.parseDouble(txt_valor1.getText());
                    valor2 = Double.parseDouble(txt_valor2.getText());
                    txt_resultado.setText("" + c.somar(valor1,valor2));
                }
            }
            if(elemento.getSource() == btn_subtrair){
                if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
                    JOptionPane.showMessageDialog(null,"Prencha os camposs!");
                } else {
                    valor1 = Double.parseDouble(txt_valor1.getText());
                    valor2 = Double.parseDouble(txt_valor2.getText());
                    txt_resultado.setText("" + c.subtrair(valor1,valor2));
                }
            }
            if(elemento.getSource() == btn_multiplicar){
                if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
                    JOptionPane.showMessageDialog(null,"Prencha os campos!");
                } else {
                    valor1 = Double.parseDouble(txt_valor1.getText());
                    valor2 = Double.parseDouble(txt_valor2.getText());
                    txt_resultado.setText("" + c. multiplicar (valor1,valor2));
                }
            }
            if(elemento.getSource() == btn_dividir){
                if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
                    JOptionPane.showMessageDialog(null,"Prencha os campos!");
                } else {
                    valor1 = Double.parseDouble(txt_valor1.getText());
                    valor2 = Double.parseDouble(txt_valor2.getText());
                    txt_resultado.setText("" + c.dividir(valor1,valor2));
                }
            }
        }
    }
    public static void main(String args[]){
        Calculadora p = new Calculadora();
        p.inicia();
    }
}