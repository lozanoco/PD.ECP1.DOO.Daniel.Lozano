package PD.Daniel.Lozano.Vehiculos;

import java.util.ArrayList;

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
}
