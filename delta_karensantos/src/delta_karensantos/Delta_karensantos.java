/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delta_karensantos;
import java.util.Scanner;
public class Delta_karensantos {

 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double a,b,c,del,x1,x2;
       System.out.print("Digite um valor: ");
       a= input.nextDouble();
       System.out.print("Digite mais um valor: ");
       b= input.nextDouble();
       System.out.print("Digite mais um valor: ");
       c= input.nextDouble();
       if (a!=0){
           del=((b*b)-(4*a*b*c));
                  System.out.print("Não é possível calcular a equação");           
                   
       
       if (del>0){
           x1 =((-b)+Math.sqrt(del)/(2*a));
           x2 =((-b)-Math.sqrt(del)/(2*a));
           System.out.print("Esse é o valor do x1 " +x1);
           System.out.print("Esse é o valor do x2"+x2 );
       }
       }
       else{       
                   System.out.print("A equação não possui resultados reais");
                         
                   }
                   }
       
    }
    

