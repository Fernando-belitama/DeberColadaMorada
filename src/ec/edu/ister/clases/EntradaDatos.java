/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.clases;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
/**
 *
 * @author FERNANDO
 */
public class EntradaDatos {
    
    Scanner input= new Scanner(System.in);
    public void ingreso1(){
        System.out.println("\t COLADA   MORADA \n ");
        System.out.println("La tradicion dicta que el dia 2 de noviembre\n"
                + "se celebra el Dia de los Difuntos,\npara lo cual preparan "
                + "lo siguiente  \n ");
// **************************************************************************
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        System.out.println("1.- Colada Morada  ");
        System.out.println("2.- Guagua de PAN \n................................  ");
        System.out.println("De que desea saber los ingredientes ?\n > ");
        int x= input.nextInt();
// **************************************************************************       
        if(x==1){
            
            
          System.out.println("Usted a escojido COLADA MORADA\n ");  
          System.out.println("\t-INGREDIENTES-\n\t..............");
          System.out.println("* Mortiño\n* Mora\n* Frutilla\n* Piña\n* Arina de Mais\n* Panela\n"
                  + "* Especies de Dulce:\n  - Canela\n  - Anis Estrellado\n  - "
                  + "Clavo de Olor\n  - Pimienta de Dulce\n  - Ishpingo\n  - Cedron\n  - Hierva Luisa\n");
          System.out.println("\t-PREPARACION-\n\t.............");
          System.out.println("Se hierve el mortiño y la mora,\nHervir todas las especies de dulce incluido la"
                  + "panela,\nSe licua el mortiño y la mora,\nJuntar las dos mesclas conjuntamente con la arina "
                  + "morada,\nAcer hervir y adjuntar las frutas picadas en trocitos.");
        }
// ***************************************************************************       
        if(x==2){
          
            System.out.println("Usted a escojido GUAGUA DE PAN\n");
            System.out.println("\t-INGREDIENTES-\n\t.............");
            System.out.println("* Arina de castilla\n* Huevos\n* Levadura\n* Manteca\n* Azucar\n*"
                    + "Sal");
            System.out.println("\t-PREPARACION-\n\t.............");
            System.out.println("Se mezcla la levadura y un poco de sal en agua tibia,\n"
                    + "mezclar con la arina, huevos y manteca,\n"
                    + "mezclar y obtener una masa uniforme,\n"
                    + "dejar que se leude la maza una media hora,\nmoldear las figuras,\n"
                    + "meter al horno por alrededor de 20 minutos.");
        } 
// **************************************************************************      
        if(x >= 3){
            System.out.println("ESTE VALOR NO ES POSIBLE \n");
        } 
       
      
    }
    
    
}
