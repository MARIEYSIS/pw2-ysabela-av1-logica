import java.util.Scanner;

public class RelogioAtleta {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int FCR;
		int FCA;
		int Oxe;
		
		System.out.println("Informe a frequencia cardiaca (repouso):");
		FCR = ler.nextInt();
		System.out.println("Informe a frequencia cardiaca (atual):");
		FCA = ler.nextInt();
		System.out.println("Informe a oxigenação:");
		Oxe = ler.nextInt();
		
		
		if (FCA > 3* FCR || Oxe < 95 )
		{
			System.out.println("DIMINUIR");
		}
		else if (FCA < 2 * FCR && Oxe > 97)
		{
			System.out.println("AUMENTAR");
		}
		else 
		{
			System.out.println("MANTER");
		}
		
			
			
	}

}
