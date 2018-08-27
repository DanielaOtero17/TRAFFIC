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
		carretera.agregarAutomovil("123",100);
	}
	

	public void setupStage2() {
		
		carretera= new Carretera();
		carretera.moverVehiculo();
		
	}


	public void setupStage3() {
		
		carretera= new Carretera();
		carretera.contarvehiculosEnMovimientos();
	}


	public void setupStage4() {
		
		carretera= new Carretera();
		carretera.contarAutosTranscurridos();
	}

	public void setupStage5() {
		
		carretera= new Carretera();
		carretera.contarvehiculosEnMovimientos();
	}
	
	public void setupStage6(){
		
		carretera = new Carretera();
		carretera.agregarAutomovil("123", 100);
		 carretera.agregarAutomovil("000", 10);
	}


	@Test
	public void testAgregarAutomovil() {
		
		setupStage1();
		Carro x = new Carro("4567",200);
		boolean result = carretera.agregarAutomovil(x);
		assertTrue(result);
		
	}
	@Test
	public void addAutomovil(){
		
		setupStage6();
		
		Carro otro = carretera.agregarAutomovil("300", 11);
		int pos= otro.darPosicion();
		assertEquals(pos,2);
		
	}

	@Test
	public void testAMoverVehiculo() {
	setupStage2();
	
	}

	@Test
	public void testContarVehiculosEnMovimiento() {
		setupStage3();
	
	}

	@Test
	public void testContarAutosTranscurridos() {
		setupStage4();
		
	}

	@Test
	public void testAgrContarMovimiento() {
		
		setupStage5();
	}
}

