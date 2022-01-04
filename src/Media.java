import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0;
        double nota = 0.0;
        double total = 0.0;
        while (nota != -1) {
        	System.out.println("Digita uma nota: (ou digite -1 para finalizar)");
        	nota = entrada.nextDouble();
        	
        	if(nota >=0 && nota <= 10) {
        		quantidadeNotas += 1;
        		total += nota;
        	} else if(nota == -1) {
        		double media = (total / quantidadeNotas);
        		System.out.println("Quanidade de notas digitadas : " + quantidadeNotas);
        		System.out.printf("Média = %.2f", media);
        	} else {
        		System.out.println("Nota invalida!");
        	}
        }
		entrada.close();
	}

}
