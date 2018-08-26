package test;

import modelo.Carretera;
import modelo.Carro;
import static org.junit.Assert.*;
import org.junit.Test;

public class modeloTest {

	private Carretera carretera;
	private Carro carrito;

	public void setupStage1() {
		
		carretera = new Carretera();
		carrito = new Carro("123",100);
		carretera.agregarAutomovil(carrito);
	}
	

	public void setupStage2() {
		
	}


	public void setupStage3() {
		
	}


	public void setupStage4() {
		
	}


	@Test
	void testAgregarAutomovil() {
		
		setupStage1();
		Carro x = new Carro("456",200);
		carretera.agregarAutomovil(x);
		assertEquals(x.darPosicion(),1);
		
	}

	@Test
	void testAMoverVehiculo() {
	
	}

	@Test
	void testContarVehiculosEnMovimiento() {
	
	}

	@Test
	void testContarAutosTranscurridos() {
		
	}

	@Test
	void testAgrContarMovimiento() {
		
	}
}

