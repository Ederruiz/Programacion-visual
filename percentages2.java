package programacion.visual.percentages;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class percentages2 {
     private Double a;
    private Double b;
    public percentages2(Double numa,Double numb){
        a=numa;
        b=numb;

}
public void seta(Double t){
    a=t;
}
public Double geta(){
    return a;
}
public void setb(Double j){
    b=j;
}
public Double getb(){
    return b;
}
public Double computePercent(){
  return a/b*100;  
}
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresa dos numeros para saber cual es el porcentaje del otro");
        double a=teclado.nextDouble();
        double b=teclado.nextDouble();
        percentages2 t2=new percentages2(a,b);
        System.out.println(a+" is "+t2.computePercent()+"% "+b);
    }

}
