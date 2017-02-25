/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        String opc="s";

    long[] toppings = ciclofor();   
    while(opc.equals("s")){
            
        int num=a();
        if (num<toppings.length){
        System.out.println("El número de la posición "+num+" es: "+toppings[num]);
    }
        else{
            System.out.println("Error");
        }
        
        System.out.println("Desea conocer otro número (s/n)");
        opc=key.next();

}}
    
    
    static int a(){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a=0;
        do{
            try{
        System.out.println("Qué posición deseas conocer: ");
        a=key.nextInt();
        flag=false;
        
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
            }
        }
        while(flag);
        return a;
    }
    static long[] ciclofor(){
        long [] toppings= new long [3];
        Scanner key = new Scanner (System.in);
        
        int i=0;
        boolean flag=true;
        
       do{
        for (i=0;i<toppings.length;i++){
            try{
            System.out.println("Introduce el número de la posición "+i+": ");
            toppings[i]=key.nextLong();
            flag=false;
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
                i=i-1;
            }
        }}
       while (flag);
       return toppings;
    }

        
        
       
    }
    

