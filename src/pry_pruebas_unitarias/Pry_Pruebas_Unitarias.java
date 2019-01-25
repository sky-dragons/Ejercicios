/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_pruebas_unitarias;

import java.util.Scanner;

/**
 *
 * @author Ddraig
 */
public class Pry_Pruebas_Unitarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner (System.in);
        float num1,num2,num3;
        int opc;
        System.out.println("Ingrese el primer numero: ");num1=x.nextFloat();
        System.out.println("Ingrese el segundo numero: ");num2=x.nextFloat();
        Operaciones z= new Operaciones();
        do{
            
            System.out.println("\tOPERACIONES");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            System.out.println("Digite el numero de la operacion");opc=x.nextInt();
            if(opc==1){
                num3=z.Suma(num1, num2);
                System.out.println("El resultado es: "+num3);
            }
            if(opc==2){
                num3=z.Resta(num1, num2);
                System.out.println("El resultado es: "+num3);
            }
            if(opc==3){
                num3=z.Multiplicacion(num1, num2);
                System.out.println("El resultado es: "+num3);
            }
            if(opc==4){
                num3=z.Division(num1, num2);
                System.out.println("El resultado es: "+num3);
            }
        }while(opc!=5);
        
    }
    
}
