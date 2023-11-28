/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pi.basepi.MODELS;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author dudu2
 */
public class Verficacao {
    
    public void verificacaoTexto(JTextField txt) {

        try {

            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor para o campo ");
            txt.setBackground(Color.red);
        }

    }

    public void verificacaoNumeros(JTextField txtN) {

        String id = txtN.getText();

        if (!txtN.getText().trim().equals("")) {
            try {

                Integer.valueOf(id);

            } catch (Exception e) {
                //Escreva aqui a mensagem para o usuário
                JOptionPane.showMessageDialog(null, "Campo número permite somente números!");
                txtN.setBackground(Color.red);
            }

        }

    }
    
    
       public void verificacaoFloat(JTextField txtNU) {

        String id = txtNU.getText();

        if (!txtNU.getText().trim().equals("")) {
            try {

                Float.valueOf(id);

            } catch (Exception e) {
                //Escreva aqui a mensagem para o usuário
                JOptionPane.showMessageDialog(null, "Campo número permite somente números!");
                txtNU.setBackground(Color.red);
            }

        }

    }
    
    
    
    
    
}
