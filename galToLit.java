
package galToLit;

import java.util.Scanner;
        
public class GalToLit {
    
    public static void main(String[] args) {
         // declare as variáveis
         double gallons=10;
         double liters=0;
         // adicione o cálculo aqui
         Scanner in = new Scanner(System.in);
         // exiba o resultado para o usuário
         System.out.println(gallons+" gallons equals "+liters+" liters");
         in.nextDouble(gallons);
    }
}
