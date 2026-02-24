
package controller;
public class Metodos {
    public Metodos(){
        super();
    }
    public int RestoPorSubtraçao(int divisor, int dividendo){
     if(dividendo==0){
        return 0;
    }else{
         if(dividendo<divisor){
             return dividendo;
         }else{
             return RestoPorSubtraçao(divisor,dividendo-divisor);
         }
     }
 }
}