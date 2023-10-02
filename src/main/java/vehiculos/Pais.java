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
		
		Pais mayor = paises.get(0);
		for(int i = 1; i < paises.size(); i++) {
			
			if(mayor.getVentas() <= paises.get(i).getVentas()) {
				mayor = paises.get(i) ;
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
