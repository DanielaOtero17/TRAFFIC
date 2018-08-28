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
		carretera.agregarAutomovil("123",100,11);
	}
	

	public void setupStage2() {
		
		carretera= new Carretera();
		carrito = new Carro("123",300.5,8);
		
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
		carretera.agregarAutomovil("123", 100,20);
		 carretera.agregarAutomovil("000", 10,13);
	}


	@Test
	public void testAgregarAutomovil() {
		
		setupStage1();
		carrito = new Carro("4567",200,5);
		boolean result = carretera.agregarAutomovil(carrito);
		assertTrue(result);
		
	}
	@Test
	public void addAutomovil(){
		
		setupStage6();
		
		Carro otro = carretera.agregarAutomovil("300", 11,2);
		int pos= otro.darPosicion();
		assertEquals(pos,2);

		
	}

	@Test
	public void testContarVehiculosEnMovimiento() {
		setupStage3();
		Carro carro1 = carretera.agregarAutomovil("576", 56, 15);
		int result = carretera.contarvehiculosEnMovimientos();
		
	
		
		assertEquals(1,result);
	}

	@Test
	public void testContarAutosTranscurridos() {
		setupStage4();
		Carro carro11 = carretera.agregarAutomovil("487", 56, 400);
		
		int result = carretera.contarAutosTranscurridos();
		
		assertEquals(1,result);
	}

	@Test
	public void testAgrContarMovimiento() {
		
		setupStage5();
		Carro carro11 = carretera.agregarAutomovil("487", 10, 4);
		int result = carretera.contarMovimientos(carro11);
		System.out.println(result);
		assertEquals(20,result);
		
	}
}

