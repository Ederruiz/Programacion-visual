package arithmeticmethods;

/**
 *
 * @author Eder
 */
public class ArithmeticMethods {
    private Integer a;
    private Integer b;
    
public ArithmeticMethods(Integer numa, Integer numb){
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
      int a,b;
      a=5;
      b=5;
      ArithmeticMethods t=new ArithmeticMethods(a,b);
      
      System.out.println("+10: "+t.displayNumberPlus10()+("\n+100: ")+t.displayNumberPlus100()+("\n+1000: ")+t.displayNumberPlus1000());
    }
    
}
