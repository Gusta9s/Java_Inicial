package sintaxe_basica;

public class LaçoFor {
	public static void main(String [] args) {
	int x = 7;
	int Resultado = 0;
	
	for(int i = 0; i <= 10; i++) {
		Resultado = x * i;
		System.out.println(x + "*" + i + "=" + Resultado);
	}

}
}
