import java.util.Scanner;
import java.util.Locale;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro parametro:");
		int isParametro01 = scanner.nextInt();
		System.out.println("Digite o segundo parametro:");
		int isParametro02 = scanner.nextInt();
		
		try {
			isContador(isParametro01, isParametro02);
			
		}catch(ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}finally {
			scanner.close();
		}
		
	


	}

	public static void isContador(int isParametro01, int isParametro02) throws ParametrosInvalidosException{

		if(isParametro01 > isParametro02) {
			throw new ParametrosInvalidosException("O segundo parâmetro de ser maior que o primeiro");
		}
		
		int isCalc = isParametro01 - isParametro02;
		isCalc = Math.abs(isCalc);
		
		for(int i =1; i < isCalc; i++) {
			System.out.printf("Imprimindo o número %d\n", i);
		}
	}
	

}
