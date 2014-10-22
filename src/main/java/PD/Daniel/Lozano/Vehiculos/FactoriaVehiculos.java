package PD.Daniel.Lozano.Vehiculos;

import java.util.ArrayList;
import java.util.Iterator;

public class FactoriaVehiculos {

	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	private static FactoriaVehiculos factoriaVehiculos = null;
	private AltaVehiculo tipoVehiculo;
	private Vehiculo vehiculo;

	private FactoriaVehiculos(){
	}

	public static FactoriaVehiculos getFactory(){
		if(factoriaVehiculos == null){
			factoriaVehiculos = new FactoriaVehiculos();
		}		
		return factoriaVehiculos;
	}

	public void crearVehiculo(){
		this.vehiculo = this.tipoVehiculo.crearVehiculo();
		listaVehiculos.add(this.vehiculo);
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

	public double calcularAlquiler(String id, int dias){
		Vehiculo vehiculo = obtenerVehiculo(id);
		return vehiculo.calcularAlquiler(dias);
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

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

}
