
package programacion.visual.percentages;

/**
 *
 * @author Eder
 */
public class percentages {
    private Double a;
    private Double b;
    public percentages(Double numa,Double numb){
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
        double a,b;
        a=2.0;
        b=5.0;
        percentages t=new percentages(a,b);
        System.out.println(a+" is "+t.computePercent()+"% "+b);
    }

}
