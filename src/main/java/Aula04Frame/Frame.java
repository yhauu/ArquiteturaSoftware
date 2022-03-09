/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fabricio.vbelomo
 */
public class Frame extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel painel = new JPanel();
        JButton botao1 = new JButton();
        JButton botao2 = new JButton();
        JTextField campo = new JTextField();
        
        painel.add(campo);
        painel.add(botao1);
        painel.add(botao2);
        
        frame.add(painel);
        frame.setBounds(10,10,200,10);
        frame.setVisible(true);
    }
}
