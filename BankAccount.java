package bankaccount;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class BankAccount {
    private String[] nombre;
    private Integer numcuenta;
    private Double saldo;
    
public BankAccount(String a,Integer b, Double c){
    
    
}   
public void setnombre(String[] j){
    nombre=j;
}    
public String[] getingrediente(){
    return nombre;
}
public void setnumcuenta(Integer l){
    numcuenta=l;
}    
public Integer getpan(){
    return numcuenta;
}
public void setprecio(Double t){
    saldo=t;
}    
public Double getprecio(){
    return saldo;
}
public Double deductMonthlyFee(Double a){
    
    return a-4.00;
}
public void explainAccountPolicy(){
    System.out.println("Por cada mes el saldo de su cuenta se reducira en $4.00");
    
}
 public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Ingrese su nombre");
     String nombre=teclado.next();
     System.out.println("Ingrese su numero de cuenta");
     int numcue=teclado.nextInt();
     System.out.println("Ingrese su saldo ultimo");
     double saldo=teclado.nextDouble();
     
     BankAccount nueva=new BankAccount(nombre,numcue,saldo);
     System.out.println("Su saldo en este momento es:\n "+nueva.deductMonthlyFee(saldo) );
     nueva.explainAccountPolicy();
 }
    
}
