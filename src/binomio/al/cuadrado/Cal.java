/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio.al.cuadrado;

/**
 *
 * @author Sosa Estrada María Fernanda, Vega Corona Yazmin María
 * @date 18/08/17
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.*;

public class Cal extends JFrame implements ActionListener {

    Calculadora objCalcu;

    /*
    * Declaramos las variables
     */
    private JTextField numero1, numero2, resultado, procedimiento;
    private JButton Resultado;
    private JLabel titulo, lnumero1, lnumero2, lresultado, lprocedimiento;

    /*
    * Creamos un nuevo objeto de la clase Calculadora
     */
    public Cal() {
        objCalcu = new Calculadora();
        configurarVentana();
        iniciarComponentes();
    }

    /*
    * Todo lo relacionado con el diseño
     */
    private void configurarVentana() {
        setTitle("BINOMIO AL CUADRADO");
        setSize(650, 630);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220, 216, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setIconImage(new ImageIcon(getClass().getResource("PICS/rascacielos.jpg")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon IMG = new ImageIcon(this.getClass().getResource("PICS/rascacielos.jpg"));
        JLabel PIC = new JLabel();
        PIC.setIcon(IMG);
        getLayeredPane().add(PIC, JLayeredPane.FRAME_CONTENT_LAYER);
        PIC.setSize(800, 600);

    }

    /*
    * Ponemos los atributos de las variables
     */
    private void iniciarComponentes() {
        //Labels

        titulo = new JLabel("Binomio al Cuadrado");
        titulo.setBounds(190, 40, 400, 30);
        titulo.setFont(new Font("TimesRoman", Font.BOLD, 23));
        add(titulo);
        titulo.setVisible(true);

        lnumero1 = new JLabel("Ingrese un numero");
        lnumero1.setBounds(100, 100, 200, 20);
        lnumero1.setFont(new Font("TimesRoman", Font.BOLD, 12));
        add(lnumero1);
        lnumero1.setVisible(true);

        lnumero2 = new JLabel("Ingrese un numero");
        lnumero2.setBounds(400, 100, 200, 20);
        lnumero2.setFont(new Font("TimesRoman", Font.BOLD, 12));
        add(lnumero2);
        lnumero2.setVisible(true);

        lresultado = new JLabel("Resultado");
        lresultado.setBounds(290, 400, 200, 20);
        lresultado.setFont(new Font("TimesRoman", Font.BOLD, 12));
        add(lresultado);
        lresultado.setVisible(true);

        lprocedimiento = new JLabel("Procedimiento");
        lprocedimiento.setBounds(280, 300, 200, 20);
        lprocedimiento.setFont(new Font("TimesRoman", Font.BOLD, 12));
        add(lprocedimiento);
        lprocedimiento.setVisible(true);

        //TextFields
        numero1 = new JTextField();
        numero1.setBounds(100, 150, 100, 30);
        numero1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(numero1);
        numero1.setVisible(true);

        numero2 = new JTextField();
        numero2.setBounds(400, 150, 100, 30);
        numero2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });

        add(numero2);
        numero2.setVisible(true);

        resultado = new JTextField();
        resultado.setBounds(270, 430, 100, 30);
        resultado.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(resultado);
        resultado.setVisible(true);

        procedimiento = new JTextField();
        procedimiento.setBounds(220, 350, 200, 30);
        add(procedimiento);
        procedimiento.setVisible(true);

        //buttons
        Resultado = new JButton("Resultado");
        Resultado.setBounds(270, 200, 100, 50);
        add(Resultado);
        Resultado.addActionListener(this);
        Resultado.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int num1, resul, num2, result = 0;
        String proc;

        if (e.getSource() == Resultado) {

            num1 = Integer.parseInt(numero1.getText());
            objCalcu.setNum1(num1);
            num2 = Integer.parseInt(numero2.getText());
            objCalcu.setNum2(num2);

            proc = objCalcu.Procedimiento();
            procedimiento.setText(proc);

            resul = objCalcu.Resultado();
            resultado.setText(Integer.toString(resul));

        }

    }
}
