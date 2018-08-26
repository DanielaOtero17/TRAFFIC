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
		carro.setPosicion(0);
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
			aux = new Carro(placa,velocidad);
			//se asigna la posición al nuevo carro.
			aux.setPosicion(posicion);
		}
		//se retorna el nuevo elemento: auxiliar.
		return aux;
	}

	@Override
	public boolean agregarAutomovil(Carro vehi) {
		
		boolean agrega = true; // variable para validar.
		Carro aux = carro; // variable auxiliar.
		
		// mientras que existe sea verdadero y el auxiliar no sea nulo.
		while(agrega = true && aux != null){
			
			// auxiliar es igual a carro.
			aux = carro;
			
			// si la placa del auxiliar es igual a la del carro ingresado
				if(aux.darPlaca()== vehi.darPlaca()){
					
					//existe es falso.
					agrega=false;
					// detiene el ciclo.
					break;
			}
			//  carro es igual al siguiente.
			carro= carro.darSiguiente();
		}
		
		// retorna agrega.
		return agrega;
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
