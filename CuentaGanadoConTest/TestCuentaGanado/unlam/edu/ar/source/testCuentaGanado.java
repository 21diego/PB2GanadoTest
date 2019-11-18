package unlam.edu.ar.source;

import org.junit.Test;

import org.junit.Assert;

public class testCuentaGanado {

	@Test
	public void testParaVerificarEstadoInicial() {
		CuentaGanado cuentaVaca = new CuentaGanado(10);
		Integer contInicialActual = cuentaVaca.getContador();
		Integer contInicialEsperado = 0;
		
		Assert.assertEquals(contInicialEsperado, contInicialActual);
				
	}
	
	@Test
	public void testParaVerificarContador() {
		CuentaGanado cuentaVaca = new CuentaGanado(10);
		
		for(int i = 0; i < 5; i++) {
			cuentaVaca.contar();
		}
		
		Integer contActual = cuentaVaca.getContador();
		Integer contEsperado = 5;
		
		Assert.assertEquals(contEsperado, contActual);
				
	}
	
	@Test
	public void testParaVerificarContadorAlLimite() {
		CuentaGanado cuentaVaca = new CuentaGanado(10);
		
		for(int i = 0; i < 15; i++) {
			cuentaVaca.contar();
		}
		
		Integer contActual = cuentaVaca.getContador();
		Integer contEsperado = 10;
		
		Assert.assertEquals(contEsperado, contActual);
	}
	
	@Test
	public void testParaVerificarReseteo() {
		CuentaGanado cuentaVaca = new CuentaGanado(10);
		
		for(int i = 0; i < 15; i++) {
			cuentaVaca.contar();
		}
		
		cuentaVaca.reset();
		
		Integer contActual = cuentaVaca.getContador();
		Integer contEsperado = 0;
		
		Assert.assertEquals(contEsperado, contActual);
	}

}
