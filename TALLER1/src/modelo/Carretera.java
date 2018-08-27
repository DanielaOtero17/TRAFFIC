package modelo;

public class Carretera implements ICarretera{
	
	private Carro carro;
	
	public Carretera() {
		
		carro = null;		
	}
	
	public Carro agregarAutomovil(String placa, double velocidad) {
		
		Carro aux = carro; // variable auxiliar.
		
		// si el primer elemento es nulo.
		if(carro== null){
			
			//se crea como nuevo carro.
		carro = new Carro(placa,velocidad);
		// se le da una posición.
		carro.cambiarPosicion(0);
		// retorna el primer elemento.
		return carro;
		}
		else{
			
			int posicion = 0;
			
			//mientras que auxiliar no sea nula.
			while(aux!=null){
				
			//auxiliar es igual al siguiente elemento.
			aux = carro.darSiguiente();
			// se cuenta la posición de axiliar.
			posicion= carro.darPosicion()+1;
			// carro es igual al siguiente elemento
			carro = carro.darSiguiente();
			}
		//cuando auxiliar es nula
			// se crea como nuevo carro.
			carro= new Carro(placa,velocidad);
			//auxiliar se ubica de último.
			//se asigna la posición al nuevo carro.
			carro.cambiarPosicion(posicion);
		}
		//se retorna el nuevo elemento: auxiliar.
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
