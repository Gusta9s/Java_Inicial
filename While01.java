package sintaxe_basica;

public class While01 {
	public static void main(String [] args) {
	int i = 0;
	int x = 7;
	int resultado = 0;
	
	while(i <= 10) {
		resultado = x * i;
		System.out.println(x + "x" + i + "=" + resultado);
		i ++;
		
	}
}
}