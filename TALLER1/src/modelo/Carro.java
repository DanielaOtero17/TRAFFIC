package modelo;

public class Carro implements IVehiculo{
	
	private String placa;
	private double velocidad;
	private int posicion;
	private Carro siguiente;
	
	 public Carro(String id, double vel) {
		 
		 this.placa = id;
		 this.velocidad=vel;	
		 posicion = 0;
		 siguiente = null;
	 }
	 
	 @Override
	 public String darPlaca(){
		 
		 return placa;
	 }

	@Override
	public double darVelocidad() {
	
		return velocidad;
	}

	@Override
	public int darPosicion() {
		return posicion;
	}
	
	@Override
	public void cambiarPosicion(int pos){
		
		posicion = pos;
	}
	public Carro darSiguiente(){
		
		return siguiente;
	}

	@Override
	public void cambiarPlaca(String p) {
	
		placa = p;
		
	}

	@Override
	public void cambiarVelocidad(double v) {
		
		velocidad = v;
		
	}

	
}
