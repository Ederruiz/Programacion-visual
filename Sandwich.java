package Sandwich;

import java.util.Scanner;

/**
 *
 * @author Eder
 */
public class Sandwich {
    private String ingrediente;
    private String pan;
    private Double price;
public Sandwich(String a,String p,Double c){
    ingrediente=a;
    pan=p;
    price=c;
    
}    
     

    public String getIngrediente(){
        return ingrediente; 
    }
     
    public void setIngrediente(String s){
        this.ingrediente=s;
    }
     
    public String getpan(){
        return pan; 
    }
     
    public void setpan(String n){
        this.pan=n;
    }
     
    public Double getPrice(){
        return price; 
    }
     
    public void setPrice(Double i){
        this.price=i;
    }
     public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         
         
     
     
    
    
 }
    
}



    

