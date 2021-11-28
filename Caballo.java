package Laboratorio1;



public class Caballo extends Thread{
	private String nombre;
	private int meta;
	

	public Caballo (String nombre) {
		this.nombre = nombre;
		
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getMeta() {
		return meta;
	}


	public void setMeta(int meta) {
		this.meta = meta;
	}



	
	@Override
	public void run() {
		int min =50;
		int max = 1000;
		double demora = Math.random();
		if (demora > max) demora = max - 1;
		long demora2 = (long)demora;
		for (int i=1; i <= meta; i++) {
		//	System.out.println("tengo tantos metros al inicio: " + meta);
		System.out.println("Soy el caballo " + nombre + " y estoy a " + i + " de distancia de la meta");
		try {
			Thread.sleep(demora2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.yield();
		}
	}

}
