package vehiculos;
import java.util.ArrayList;
public class Camioneta extends Vehiculo {
	
	boolean volco;
	static ArrayList<Camioneta> camionetas = new ArrayList<>();
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, 
			boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.camionetas.add(this);
	}
	
	public boolean isVolco() {
		return this.volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int numeroCamionetas() {
		return Camioneta.camionetas.size();
	}
	

}
