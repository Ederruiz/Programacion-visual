
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eder
 */
public class TestBankAccount {
    private String[] nombre;
    private Integer numcuenta;
    private Double saldo;
    
    public TestBankAccount (String a,Integer b, Double c){
    
    
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
     System.out.println("Ingrese su nombre");
     String nombre1=teclado.next();
     System.out.println("Ingrese su numero de cuenta");
     int numcue1=teclado.nextInt();
     System.out.println("Ingrese su saldo ultimo");
     double saldo1=teclado.nextDouble();
     System.out.println("Ingrese su nombre");
     String nombre2=teclado.next();
     System.out.println("Ingrese su numero de cuenta");
     int numcue2=teclado.nextInt();
     System.out.println("Ingrese su saldo ultimo");
     double saldo2=teclado.nextDouble();
     
     TestBankAccount  nueva=new TestBankAccount (nombre,numcue,saldo);
     TestBankAccount  nueva1=new TestBankAccount (nombre1,numcue1,saldo1);
     TestBankAccount  nueva2=new TestBankAccount (nombre2,numcue2,saldo2);
     
     System.out.println("Su saldo en este momento es:\n "+nueva.deductMonthlyFee(saldo) );
     nueva.explainAccountPolicy();
     System.out.println("Su saldo en este momento es:\n "+nueva1.deductMonthlyFee(saldo) );
     nueva1.explainAccountPolicy();
     System.out.println("Su saldo en este momento es:\n "+nueva2.deductMonthlyFee(saldo) );
     nueva2.explainAccountPolicy();
 }
    
}


