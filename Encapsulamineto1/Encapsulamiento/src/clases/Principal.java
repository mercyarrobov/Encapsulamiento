package clases;
import clases.Mesa;
public class Principal {
	
	public static void main(String[] args) {
		Mesa mesa1 = new Mesa();
		mesa1.setColor("Blanco");
		mesa1.setColor("Rojo");
		mesa1.setColor("Azul");
		System.out.println("mesa1 pintada" + mesa1.getNumeroDeVecesPintada()+"veces.");
		
		Mesa mesa2 = new Mesa();
		mesa2.setColor("Negro");
		System.out.println("mesa1 pintada" + mesa2.getNumeroDeVecesPintada()+"veces.");
	}

}
