package ar.edu.unlam.pb2;

import org.junit.Assert;
import org.junit.Test;


public class TestCerradura2 {

	
	@Test 
	public void testQueCreaCerradura(){
		Cerradura2 miCerradura = new Cerradura2();
		Assert.assertTrue(miCerradura.mostrarEstado()); //crea abierta
	}
	
	
	@Test
	public void testQueAbre() {
		Cerradura2 miCerradura = new Cerradura2(1234,4);	
		miCerradura.abrir(1234);
		
		Assert.assertTrue(miCerradura.mostrarEstado()); //true abierto
	}

	@Test 
	public void testQueBloquea(){
		Cerradura2 miCerradura = new Cerradura2(1234,4);
		miCerradura.abrir(124);
		miCerradura.abrir(2);
		miCerradura.abrir(129);
		miCerradura.abrir(223);
		
		Assert.assertFalse(miCerradura.mostrarEstado()); //si el estado es falso 
	}
	
	@Test
	public void testQueCierra() {		
		Cerradura2 miCerradura = new Cerradura2();	
		miCerradura.cerrar(1234);
		
		Assert.assertFalse(miCerradura.mostrarEstado());//tiene q dar falso para q este cerrado
	}
	
	@Test
	public void testQueNoCierra() {
		Cerradura2 miCerradura = new Cerradura2(1234,4);	
		miCerradura.cerrar(111);
		
		Assert.assertTrue(miCerradura.mostrarEstado());//tiene q dar true para q este abierto
	}

		
	@Test 
	public void testQueIgualaCerradura(){
		Cerradura2 miCerradura_A = new Cerradura2(1234,4);
		Cerradura2 miCerradura_B = new Cerradura2(1234,4);

		Assert.assertEquals(miCerradura_A, miCerradura_B);//tiene q ser igual
	}		
		
	@Test 
	public void testQueNoIgualaCerradura(){
		Cerradura2 miCerradura_A = new Cerradura2(1111,4);
		Cerradura2 miCerradura_B = new Cerradura2(1234,4);

		Assert.assertNotEquals(miCerradura_A, miCerradura_B);//tiene q ser diferente
	}		
	
	
}
