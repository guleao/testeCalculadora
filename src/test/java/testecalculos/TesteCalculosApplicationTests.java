package testecalculos;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import testecalculos.calculo.Calculos;

@SpringBootTest
class TesteCalculosApplicationTests {

	// - Teste média
	@Test
	public void testeMedia() {
		Calculos calculos = new Calculos();
		double media = calculos.calculaMedia();
		Assert.assertEquals(15.0, media, 0.001);
	}

	// - Teste mediana
	@Test
	public void testeMediana (){
		Calculos calculos = new Calculos();
		double mediana = calculos.calculaMediana();
		Assert.assertEquals(5.0, mediana, 0.001);
	}

	// - Teste desvio padrão
	@Test
	public void testeDesvioPad () {
		Calculos calculos = new Calculos();
		double desvPad = calculos.calculaDesvPad();
		Assert.assertEquals(3.1240998703626617, desvPad, 0.001);
	}

	// - Teste total de todos os valores
	@Test
	public void testeTotal(){
		Calculos calculos = new Calculos();
		double total = calculos.calculaTotal();
		Assert.assertEquals(25.0,total,0.001);
	}

	// - Teste valor máximo
	@Test
	public void testeMax (){
		Calculos calculos = new Calculos();
		double max = calculos.calculaMax();
		Assert.assertEquals(5,max,0.001);
	}

	// - Teste valor mínimo
	@Test
	public void testeMin(){
		Calculos calculos = new Calculos();
		double min = calculos.calculaMin();
		Assert.assertEquals(10,min,0.001);
	}

}
