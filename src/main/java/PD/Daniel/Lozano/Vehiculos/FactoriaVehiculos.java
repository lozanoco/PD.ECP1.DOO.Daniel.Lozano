package PD.Daniel.Lozano.Vehiculos;

import java.util.ArrayList;
import java.util.Iterator;

public class FactoriaVehiculos {

	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	private static FactoriaVehiculos factoriaVehiculos = null;
	private static AltaVehiculo tipoVehiculo = null;
	
	private FactoriaVehiculos(){
	}
	
	public static FactoriaVehiculos getFactory(){
		if(factoriaVehiculos == null){
			factoriaVehiculos = new FactoriaVehiculos();
			tipoVehiculo = new AltaBicicleta();
		}		
		return factoriaVehiculos;
	}
	
	public void crearVehiculo(){
		listaVehiculos.add(tipoVehiculo.crearVehiculo());
	}
	
	public void setTipoVehiculo(AltaVehiculo altaVehiculo){
		this.tipoVehiculo = altaVehiculo;
	}
	
	public String mostrarVehiculos(){
		String vehiculos ="";
		Iterator<Vehiculo> vehiculosIterator = listaVehiculos.iterator();
		while(vehiculosIterator.hasNext()){
			vehiculos+=vehiculosIterator.next().toString()+"\n";
		}
	return vehiculos;
	}
	
	public void calcularAlquiler(String id, int dias){
		
	}
	
	public Vehiculo obtenerVehiculo(String id){
		Vehiculo vehiculo = null;	
		Iterator<Vehiculo> vehiculosIterator = listaVehiculos.iterator();
		while(vehiculosIterator.hasNext()){
			if(vehiculosIterator.next().getIdVehiculo().equals(id)){
				vehiculo = vehiculosIterator.next();
			}
		}
	return vehiculo;
	}
}
