package PD.Daniel.Lozano.Vehiculos;

import java.util.ArrayList;
import java.util.Iterator;

public class FactoriaVehiculos {

	private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	private static FactoriaVehiculos factoriaVehiculos = null;
	private  AltaVehiculo tipoVehiculo;

	private FactoriaVehiculos(){
	}

	public static FactoriaVehiculos getFactory(){
		if(factoriaVehiculos == null){
			factoriaVehiculos = new FactoriaVehiculos();
		}		
		return factoriaVehiculos;
	}

	public void crearVehiculo(){
		listaVehiculos.add(this.tipoVehiculo.crearVehiculo());
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
//		System.out.println(listaVehiculos.toString());
		Vehiculo vehiculo=null,vehiculoAux = null;	
		Iterator<Vehiculo> vehiculosIterator = listaVehiculos.iterator();
		while(vehiculosIterator.hasNext()){
//			System.out.println((vehiculosIterator.next().getIdVehiculo()));
			vehiculoAux=vehiculosIterator.next();
			if(vehiculoAux.getIdVehiculo().equals(id)){
				vehiculo = vehiculoAux;
			}
		}
		return vehiculo;
	}


}
