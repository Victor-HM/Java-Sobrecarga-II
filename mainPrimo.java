package primoSobrecarga;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class mainPrimo {

	public static void main(String[] args) {
		numberPrimo primo = new numberPrimo();
		Scanner in = new Scanner(System.in);
		
		int numbers;
		int numPrimo;
		int asnwer;
		int array[];
		
		do {
			//Inserção de dados
			numPrimo = (Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
			
			primo.imprimirPrimo(primo.itsPrimo(numPrimo), numPrimo);
			
			numbers = (Integer.parseInt(JOptionPane.showInputDialog("Quantos números você quer descobrir se é primo ou não? ")));
			
			array = new int[numbers];
			
			for (int counter = 0; counter < numbers; counter++) {
				array[counter] = (Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (counter + 1) +"º número: ")));
			}
			
			primo.imprimirPrimo(primo.itsPrimo(array), array);
			
			asnwer = JOptionPane.showConfirmDialog(
					null, "Quer descobrir mais números primos?"
				);
			
		} while(asnwer == 0);

	}

}
