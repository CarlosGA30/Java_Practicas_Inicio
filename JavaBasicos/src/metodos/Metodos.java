package metodos;

public class Metodos {
	int a,b;//atributos
	
	public void sumar() {
		int resultado=a+b;
		System.out.println("La suma de "+a+" y "+b+" es "+resultado);
	}
	public int sumaConRetorno() {
		int resultado=a+b;
		return resultado;
	}
	 public double multiplicacionConArgumentos(int arg1,double arg2) {
		return arg2*arg1;
		
	}
	 //metodo estatico
	public static void imprimeNombre(String nombre) {
		System.out.println("Tu nombre es "+nombre);
	}
	
}
