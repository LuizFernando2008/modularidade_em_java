package br.com.curso.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritmeticas {

	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0, (t, a) -> (t + a));
	}
	
}
