/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_pruebas_unitarias;

/**
 *
 * @author Ddraig
 */
public class Operaciones {
    public float num3; 


    public float Suma (float num1,float num2){
        num3=num1+num2;
        
        return num3;
    }
    public float Resta (float num1,float num2){
        num3=num1-num2;
         return num3;
    }
    public float Multiplicacion (float num1,float num2){
        num3=num1*num2;
        return num3;
    }
    public float  Division (float num1,float num2){
        if(num1>num2){
            num3=num1/num2;
          
            return num3;
        }else{
            return 0;
        }
        
    }
   
}
