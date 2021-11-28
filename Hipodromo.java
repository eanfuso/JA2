package Laboratorio1;

//import com.sun.org.apache.xpath.internal.functions.Function;

public class Hipodromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Caballo c1 = new Caballo ("pepe");
	Caballo c2 = new Caballo ("carl");	
	Caballo c3 = new Caballo ("juan");	
	
	Meta m = new Meta (10);
	System.out.println("la meta asignada es de : " + m.getMetros());
	c1.setMeta(m.getMetros() + 2);
	c2.setMeta(m.getMetros());
	c3.setMeta(m.getMetros());
	System.out.println("Comienza la carrera");
	
	c1.start();
	if (c1.getMeta() >= m.getMetros())
		if (!m.isPrimeroEnLlegar()) {
			Meta.primeroEnLlegar = true;
			m.setGanador(c1.getNombre());
		}else {
//			try {
//				c1.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	
	c2.start();
	if (c2.getMeta() >= m.getMetros())
		if (!m.isPrimeroEnLlegar()) {
			Meta.primeroEnLlegar = true;
			m.setGanador(c2.getNombre());
		}else {
//			try {
//				c2.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	
	
	c3.start();
	if (c3.getMeta() >= m.getMetros())
		if (!m.isPrimeroEnLlegar()) {
			Meta.primeroEnLlegar = true;
			m.setGanador(c3.getNombre());
		}else {
//			try {
//				c3.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
			
		
	
	
	System.out.println("El ganador es " + m.getGanador());
	
	
	

	
	
	
	
	

	}

}
