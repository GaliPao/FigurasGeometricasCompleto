public class Main {
	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas",20,10,15);
		Triangulo t = new Triangulo("Triangulin",250,175,145);
		Cuadrado bob = new Cuadrado("Bob",80);
		Rectangulo jhon = new Rectangulo("Jhon", 78, 49);
		Rombo Aldous = new Rombo("Adous", 25,26,15); 
		Romboide jose = new Romboide ("Jose", 78,46);
		Trapecio miguel = new Trapecio ("Miguel", 10,11,12,13,14,15,25);
	
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(bob);
		imprimirCalculo(jhon);
		imprimirCalculo(Aldous);
		imprimirCalculo(jose);
		imprimirCalculo(miguel);
	}// main
	
	public static void imprimirCalculo (FiguraGeometrica f) {
		System.out.println(f);
		System.out.println("+===================================");
		System.out.println(" El area del ["+ f.getNombre() + "] es : " + f.calcularArea());
		System.out.println(" El perimeto de [" + f.getNombre() + "] es : " + f.calcularPerimetro());
		System.out.println("+===================================");
	}//imprimirCalculo
	
}//classMain