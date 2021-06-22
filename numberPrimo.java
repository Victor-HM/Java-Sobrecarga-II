package primoSobrecarga;

public class numberPrimo {
	
	public numberPrimo() {
		
	}
	
	public boolean itsPrimo(int number) {
		if (number>1) {
			for(int cont = 2; cont<number; cont++) {
				if (number % cont == 0 && number != 2) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public boolean[] itsPrimo(int[] array) {
		boolean[] listIsEven = new boolean[array.length];
		
		for (int column = 0; column < array.length; column++) {
			if (array[column]>1) {
				
				listIsEven[column] = true;
				
				for(int cont = 2; cont<array[column]; cont++) {
					if (array[column] % cont == 0 && array[column] != 2) {
						listIsEven[column] = false;
						break;
					}
				}
			
			} else {
				listIsEven[column] = false;
			}
		}
		return listIsEven;
	}
	
	public void imprimirPrimo(boolean answerPrimo, int number) {
		if (answerPrimo) {
			System.out.printf("%nO número %d é primo", number);
		} else {
			System.out.printf("%nO número %d não é primo", number);
		}
	}

	public void imprimirPrimo(boolean[] answerIsPrimeNumber, int[] number) {
		for (int column = 0; column < answerIsPrimeNumber.length; column++) {
			if (answerIsPrimeNumber[column]) {
				System.out.printf("%nO número %d é primo", number[column]);
			} else {
				System.out.printf("%nO número %d não é primo", number[column]);
			}
		}
	}

}
