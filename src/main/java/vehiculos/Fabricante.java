package vehiculos;
import java.util.ArrayList;
public class Fabricante {
	
	String nombre;
	Pais pais;
	int vehiculosVendidos;
	static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricantes.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void venderVehiculo() {
		this.vehiculosVendidos++;
		
	}
	
	public int getVehiculosVendidos() {
		return this.vehiculosVendidos;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		Fabricante mayor = null;
		for(int i = 1; i < Fabricante.fabricantes.size(); i++) {
			
			if(fabricantes.get(i-1).getVehiculosVendidos() >= fabricantes.get(i).getVehiculosVendidos()) {
				mayor = fabricantes.get(i);
			}
			else {
				mayor = fabricantes.get(i+1);
			}
		}
		return mayor;
		
	}
	

	
	

}
