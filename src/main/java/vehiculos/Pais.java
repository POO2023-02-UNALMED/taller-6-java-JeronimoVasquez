package vehiculos;
import java.util.ArrayList;
public class Pais {
	
	protected String nombre;
	int ventas;
	static ArrayList<Pais> paises = new ArrayList<>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public void vender() {
		this.ventas++;
	
	}
	public int getVentas() {
		return this.ventas;
	}
	
	public static Pais paisMasVendedor() {
		
		Pais mayor = null;
		for(int i = 0; i <= paises.size(); i++) {
			
			if(paises.get(i).getVentas() >= paises.get(i+1).getVentas()) {
				mayor = paises.get(i);
			}
			else {
				mayor = paises.get(i+1);
			}
		}
		return mayor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
