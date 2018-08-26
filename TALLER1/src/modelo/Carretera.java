package modelo;

public class Carretera implements ICarretera{
	
	private Carro carro;
	
	public Carretera() {
		
		carro = null;		
	}
	
	public Carro agregarAutomovil(String placa, double velocidad) {
		
		Carro aux = carro;
		
		if(carro== null){
			
		carro = new Carro(placa,velocidad);
		carro.setPosicion(0);
		return carro;
		}
		else{
				int posicion = 0;
			
				while(aux!=null){
					
			aux = carro.darSiguiente();
			posicion= carro.darPosicion()+1;
			carro = carro.darSiguiente();
			}
			aux = new Carro(placa,velocidad);
			aux.setPosicion(posicion);
		}
		return aux;
	}
	
	public Carro moverVehiculo() {
		
	}

	@Override
	public boolean agregarAutomovil(IVehiculo vehi) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverVehiculo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int contarvehiculosEnMovimientos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int contarAutosTranscurridos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int contarMovimientos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
