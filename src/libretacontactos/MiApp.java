/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretacontactos;

import javax.swing.JOptionPane;

/**Contiene el menú de la aplicación y es desde donde se invocan los métodos principales de la aplicación
 * @author Pablite5
 * @version 2.1
 * 
 */
public class MiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libreta libreta = new Libreta();
        boolean condicion = true;
        do{
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog("1)Engadir contacto\n2)Listar contactos\n3)Borrar contacto\n5)Crear grupo\n6)Añadir contacto a grupo\n7)Salir"));
        switch(seleccion){
            case 1:
                libreta.engadir();
                break;
            case 2:
                libreta.listar();
                break;
            case 3:
                libreta.borrar();
                break;
            case 5:
                libreta.crearGrupo();
                break;
            case 6:
                libreta.agregarAGrupo();
                break;
            case 7:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }
        }while(condicion);
        
        
    }
    
}
