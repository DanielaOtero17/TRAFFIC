package modelo;

public class Carro implements IVehiculo{
	
	private String placa;
	private int velocidad;
	private int posicion;
	
	 public Carro(String id, int vel) {
		 
		 this.placa = id;
		 this.velocidad=vel;	
		 posicion = 0;
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
	 
}
