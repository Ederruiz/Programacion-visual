package MetricConversion;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class MetricConversion {
    private Integer inch;
    private Integer gallon;
public MetricConversion(Integer t){
    inch=t;
    gallon=t;
    
}
public Double centimetros(){
   
    return inch*2.54;
}
public Double gallon(){
    
    return gallon*3.7854;
}
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    System.out.println("Ingresa un numero entero");
    int a=teclado.nextInt();
    MetricConversion p=new MetricConversion(a);
    System.out.println("hay "+p.centimetros()+" centimetros "+"\nhay "+p.gallon()+" galones");
}    
}
