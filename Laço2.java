package sintaxe_basica;

public class Laço2 {
	public static void main(String [] args) {
		for(int Linha = 0; Linha < 10; Linha++) {
			for(int Coluna = 0; Coluna < 10; Coluna++) {
				if(Coluna > Linha) {
					
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
