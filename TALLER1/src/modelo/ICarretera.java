package modelo;

public interface ICarretera {
	
	
	public boolean agregarAutomovil(Carro vehi);
	
	public void moverVehiculo(Carro vehi,int posicion);
	
	public int contarvehiculosEnMovimientos();
	
	public int contarAutosTranscurridos();
	
	public int contarMovimientos();
	

}
