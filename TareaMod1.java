/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */



public class TareaMod1 {
    public static void main(String[] args) {
        
/* 
Ejercicio 1
Crear el código que imprima la siguiente salida: "Hola, soy Arnol Gutiérrez" (Usar su nombre)
*/
    System.out.println("Hola, Soy Jonathan Castro");
        
        
/* 
Ejercicio 2
Crear un programa que imprima en consola todas las operaciones aritméticas de 
dos números enteros (suma, resta, multiplicación, divición, mod)
*/
       int num1=10, num2=2;
       int resul_suma,resul_resta,resul_multi,resul_div,resul_mod;
       resul_suma=num1+num2;
       System.out.println("El resultado de la suma es: "+ resul_suma);
       resul_resta=num1-num2;
       System.out.println("El resultado de la resta es: "+ resul_resta);
       resul_multi=num1*num2;
       System.out.println("El resultado de la multiplicacion es: "+ resul_multi);
       resul_div=num1/num2;
       System.out.println("El resultado de la division es: "+ resul_div);
       resul_mod=num1%num2;
       System.out.println("El resultado del modulo es: "+ resul_mod); 

       
/* 
Ejercicio 3
Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas 
expresiones daría como resultado verdadero o falso:
M > T
T / K == -5
(M+T == 7) || (M-T == 5)
*/
 int M=6,T=1,K=-10;
      boolean op1,op2,op3,val_1,val_2,val_3;
      op1=M>T;
      val_1=op1;
      op2=T/K==-5;
      val_2=op2;
      op3=(M+T==7)||(M-7==5);
      val_3=op3;
      System.out.println("El resultado de M>T es: "+ val_1);
      System.out.println("El resultado de T/K==-5 es: "+ val_2);
      System.out.println("El resultado de (M+T==7)||(M-7==5) es: "+ val_3);
      
      
/* 
Ejercicio 4
Crear un arrelo que guarde e imprima 10 nombres de tus compañeros de la clase
*/
String[] nombres= {"Juan","Alberto","Jessenia","Andrea","Luciana","Mario","Daniel","Fredy","Kevin","Roberto"};
     
 for(int i=0;i<10;i++){
     System.out.println("Nombre "+ (i+1) +":"+ nombres[i]);
     }

 
 
 /* 
Ejercicio 5
Crear un arreglo multidimensional que guarde más datos personales tus compañeros de clase (nombre, apellido, carrera, lugarTrabajo), 
tomando como referencia de la información colocada en el foro Conociendonos. Llenar 5 registros Ejemplo:
Daniel Medina Electronica TEST
Monica Jiz Computación IMSA
*/
 String[][] compas={
         {"Alberto","Gutierrez","Ingenieria en Sistemas","BAC"},
         {"Andrea","Gonzales","Laboratorio","BANPAIS"},
         {"Luis","Castillo","Ingenieria Industrial","SULA"},
         {"Marco","Vasquez","Ingenieria Civil","Cargill"},
         {"Sergio","Acevedo","Ingenieria Quimica","Leyde"}
     };
     
     System.out.println(compas[0][0]+" "+compas[0][1]+" "+compas[0][2]+" "+compas[0][3]);
     System.out.println(compas[1][0]+" "+compas[1][1]+" "+compas[1][2]+" "+compas[1][3]);
     System.out.println(compas[2][0]+" "+compas[2][1]+" "+compas[2][2]+" "+compas[2][3]);
     System.out.println(compas[3][0]+" "+compas[3][1]+" "+compas[3][2]+" "+compas[3][3]);
     System.out.println(compas[4][0]+" "+compas[4][1]+" "+compas[4][2]+" "+compas[4][3]);
     
     
/* 
Crear un programa que imprima en consola un nombre de estudiante, una nota y una etiqueta que diga Aprobado o Reprobado, dependiendo del valor 
de la nota que tenga. Ejemplo:
Daniel 65 Reprobado
Monica 89 Aprobado
*/
  String nombre= "Jonathan";
  
  int nota= 56;
  
  if (nota<70){
      System.out.println(nombre +" "+nota+" "+"Reprobado");
  }else{
      System.out.println(nombre +" "+nota+" "+"Aprobado");
  }

    
/* 
Escribe un programa que imprima mediante un ciclo los números pares del 2 al 100
*/
  for(int i=2;i<=100;i+=2){
        System.out.println(i);
        } 
     
     
    } 
    }
    
    

