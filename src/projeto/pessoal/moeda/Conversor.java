package projeto.pessoal.moeda;

import java.util.Scanner;



public class Conversor{
    public static double EUR(double moeda1, double moeda2){
    
        return moeda1 * moeda2;
    
    }
    public static void main(String[] args) {
        boolean valormoeda = true;
        Scanner scan = new Scanner(System.in);

        while (valormoeda) {
        System.out.println("\n escolha uma opção: ");
        System.out.println("01. Euro");
        System.out.println("02. Libra Estrelina");
        System.out.println("03. Iene Japonês");
        System.out.println("04. Dólar Canadense");
        System.out.println("05. Franco Suíço");
            
        }
        



        scan.close();
    }

}
