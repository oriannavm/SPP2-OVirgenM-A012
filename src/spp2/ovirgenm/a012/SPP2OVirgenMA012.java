/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a012;
import javax.swing.JOptionPane;
/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMA012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double estatura;
        double peso;
        estatura = solicitarEntero("Introduce la estatura:");
        peso = solicitarEntero("Introduce el peso:");
        double imc;
        
        imc= peso/ Math.pow (estatura,2);
         if(imc>25){
              JOptionPane.showMessageDialog(null, "Usted sufre de sobrepeso. IMC =" +imc);
          }else if(imc<19){
              JOptionPane.showMessageDialog(null, "Usted sufre de desnutrición. IMC =" +imc);
          }else{
              JOptionPane.showMessageDialog(null,"Usted tiene un IMC normal. IMC =" +imc);
          }
        
    }
public static double solicitarEntero(String mensaje){
    boolean ban;
    double dato=0;
    do{
        try{
    String usuario = JOptionPane.showInputDialog (null,mensaje);
    dato= Double.parseDouble(usuario);
    ban = false;
            }catch(Exception ex){
              JOptionPane.showMessageDialog(null, "Error, el dato no es un entero");
                ban = true;
            }
    }while(ban);
           return dato;
    }
}
      
        

