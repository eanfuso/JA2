package Laboratorio1;

public class Meta {
	private int metros;
	static boolean primeroEnLlegar = false;
	static String ganador;
	
	
	
	public String getGanador() {
		return ganador;
	}



	public void setGanador(String ganador) {
		this.ganador = ganador;
	}



	public Meta (int distancia) {
		this.metros = distancia; 
	}



	public int getMetros() {
		return metros;
	}



	public void setMetros(int metros) {
		this.metros = metros;
	}



	public static boolean isPrimeroEnLlegar() {
		return primeroEnLlegar;
	}



	public static void setPrimeroEnLlegar(boolean primeroEnLlegar) {
		Meta.primeroEnLlegar = primeroEnLlegar;
	}
	
	
	
	
	
	
}

	
