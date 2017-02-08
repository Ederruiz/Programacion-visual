package gasprice;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class gasprice {
    private Double price;

public gasprice(Double t){
    price=t;
    
}    
    
public void setprice(Double t){
    price=t;
}    
public Double getprice(){
    return price;
}
public Double pricePerBarrel(){
    double pecentege=0.03500;
    return price*pecentege;
}
 public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Cuanto cuesta la gasolina?");
     double a=teclado.nextDouble();
     gasprice l=new gasprice(a);
     System.out.println("El costo aproximado del barril sera: "+l.pricePerBarrel());
 }
    
}
