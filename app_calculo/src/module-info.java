import br.com.curso.app.Calculadora;
import br.com.curso.app.calculo.CalculadoraImpl;

open module app.calculo {
	
	requires transitive app.logging;
	exports br.com.curso.app.calculo;
	
//	exports br.com.curso.app.calculo.interno
//		to app.financeiro;
	
	requires app.api;
	provides Calculadora with CalculadoraImpl;
	
}