/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogithub;


public class Formatos {

  
    public static void main(String[] args) {
    String cabecera = "\n\t PRONOSTICO DE CLIMA: \n ";
    cabecera += "\n\t Dia \t\t Mañana \t Noche \t Condiciones \n";
    cabecera+= "\t----\t\t-----\t-----\t-----\n";
    String pronostico = "\t Domingo \t25c\t\t33c\t\t Soleado\n";
    pronostico += "\t Lunes \t 18 C\t\t 19 C \t\t Nublado\n";
    pronostico += "\t Martes \t 40 C\t\t 29 C \t\t Caluroso\n";
        System.out.print(cabecera + pronostico);
    }
    
}
