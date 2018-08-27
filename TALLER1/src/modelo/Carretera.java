package modelo;

public class Carretera implements ICarretera{
	
	public final int END_WAY = 200;
	
	private Carro carro;
	private int movimientos;
	
	public Carretera() {
		
		carro = null;		
		movimientos = 0;
	}
	
	public Carro agregarAutomovil(String placa, double velocidad,int posicion) {
		
		Carro aux = carro; // variable auxiliar.
		
		// si el primer elemento es nulo.
		if(carro== null){
			
			//se crea como nuevo carro.
		carro = new Carro(placa,velocidad,posicion);
		
		// retorna el primer elemento.
		return carro;
		}
		else{
			
			//mientras que auxiliar no sea nulo.
			while(aux!=null){
			//auxiliar es igual al siguiente elemento.
			aux = carro.darSiguiente();
			// carro es igual al siguiente elemento
			carro = carro.darSiguiente();
			}
		//cuando carro es nulo
			// se crea como nuevo carro.
			carro= new Carro(placa,velocidad,posicion);
		}
		//se retorna el nuevo carro.
		return carro;
	}

	@Override
	public boolean agregarAutomovil(Carro vehi) {
		
		boolean agrega = true; // variable para validar.
		Carro aux = carro; // variable auxiliar.
		
		// mientras que auxiliar no sea nulo.
		while(agrega&&aux!=null){
			
			// si la placa del auxiliar es igual a la del carro ingresado
				if(vehi.darPlaca().equals(aux.darPlaca())){
					
					//agrega es falso.
					agrega=false;
																
				}
				carro= carro.darSiguiente();
				aux = carro;			
		}
		// retorna agrega.
		return agrega;
	}

	public Carro darPrimero(){
		
		return carro;
	}
	@Override
	public void moverVehiculo(Carro vehi) {
		if(vehi != null) {
			vehi.cambiarPosicion((int)(vehi.darPosicion()+vehi.darVelocidad()));
			movimientos += (int)vehi.darVelocidad();
		}
	}

	@Override
	public int contarvehiculosEnMovimientos() {
		Carro aux = carro;
		int cont = 0;
		while(aux != null) {
			if(aux.darPosicion() < END_WAY){
				cont++;}
			carro= carro.darSiguiente();
			aux = carro;
		}
		return cont;
		
	}

	@Override
	public int contarAutosTranscurridos() {
		Carro aux = carro;
		int cont = 0;
		while(aux != null) {
			if(aux.darPosicion() > END_WAY)
				{cont++;}
			carro= carro.darSiguiente();
			aux = carro;
		}
		return cont;
	}

	@Override
	public int contarMovimientos(Carro car) {
		
		int movimientos = ((int)(END_WAY/car.darVelocidad()));
		return movimientos;
	}

}
