/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gimnasio;

import Views.MenuPrincipal;
import bd.Conexion;

/**
 *
 * @author Cetecom
 */
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion cx = new Conexion();
        cx.conectar();
        
        
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        
        
        
    }
    
}
