package vehiculos;
import java.util.ArrayList;
public class Automovil extends Vehiculo{
	
	int asientos;
	static ArrayList<Automovil> automoviles = new ArrayList<>();
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int asientos){
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.asientos = asientos;
		Automovil.automoviles.add(this);
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	
	public static int numeroAutomoviles() {
		return Automovil.automoviles.size();
	}
		
		
		
	

}
