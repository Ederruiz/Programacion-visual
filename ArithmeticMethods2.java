/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArithmeticMethods2;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class ArithmeticMethods2 {
  private Integer a;
    private Integer b;
    
public ArithmeticMethods2(Integer numa, Integer numb){
    a=numa;
    b=numb;
    
}    
public void seta(Integer t){//modificar
    a=t;
}
public Integer geta(){//mostrar
    return a;
}
public void setb(Integer j){//funciones para introducir las medidas
    b=j;
}
public Integer getb(){
    return b;
}
public Integer displayNumberPlus10(){
    return a+b+10;
}    
public Integer displayNumberPlus100(){
    return a+b+100;
}    
public Integer displayNumberPlus1000(){
    return a+b+1000;
}    

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Ingresa dos numeros para sumarlos:");
      int a=teclado.nextInt();
      int b=teclado.nextInt();
      ArithmeticMethods2 t=new ArithmeticMethods2(a,b);
      
      System.out.println("+10: "+t.displayNumberPlus10()+("\n+100: ")+t.displayNumberPlus100()+("\n+1000: ")+t.displayNumberPlus1000());
    }
    
}
  

