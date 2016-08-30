/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases1;

import javax.swing.JOptionPane;

/**
 *
 * @author vsarmien3
 */
public class test {
    public static void main(String[] args) {
        Persona p;
        p = new Persona (1140898674, "Victor", "Sarmiento");
        Persona q = new Persona (1143136260, "Emis", "Sarmiento");
        
        
        JOptionPane.showMessageDialog(null,"El nombre de p es : "+ p.getPrimer_nombre());
        
        JOptionPane.showMessageDialog(null,"El apellido de p es : "+ p.getPrimer_apellido());
        
        JOptionPane.showMessageDialog(null,"El número de identificación de p es: "+ p.getIdentificacion());
        
    }
}
