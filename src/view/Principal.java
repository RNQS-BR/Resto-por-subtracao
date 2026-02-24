
package view;
import controller.Metodos;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
      Metodos m = new Metodos();
      int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
      int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
      System.out.println("O resto da divisao e: "m.RestoPorSubtraçao(divisor, dividendo));
    }
}

