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
			//Inser��o de dados
			numPrimo = (Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: ")));
			
			primo.imprimirPrimo(primo.itsPrimo(numPrimo), numPrimo);
			
			numbers = (Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros voc� quer descobrir se � primo ou n�o? ")));
			
			array = new int[numbers];
			
			for (int counter = 0; counter < numbers; counter++) {
				array[counter] = (Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (counter + 1) +"� n�mero: ")));
			}
			
			primo.imprimirPrimo(primo.itsPrimo(array), array);
			
			asnwer = JOptionPane.showConfirmDialog(
					null, "Quer descobrir mais n�meros primos?"
				);
			
		} while(asnwer == 0);

	}

}
