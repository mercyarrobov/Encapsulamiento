package clases;

public class Mesa {
	
	private String color;
	private int numeroDeVecesPintada;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		
		if("Blanco".equals(color) || "Negro".equals(color)
				|| "Rojo".equals(color) ) {
			this.color = color;
			numeroDeVecesPintada++;
		}else {
			System.out.println("Color no disponible. Mesa no pintada");
		}
	}

	public int getNumeroDeVecesPintada() {
		return numeroDeVecesPintada;
	}

	 
	
}
