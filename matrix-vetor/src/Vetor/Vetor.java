package Vetor;

import javax.swing.*;

public class Vetor {
public void  vetorEx() {
	System.out.println("___VETOR___");
	int vetSoma [], i, soma = 0;
	vetSoma = new int[100];
	
	for (i=0; i<= 2; i++) {
		vetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		soma = soma + vetSoma[i];
	}
	
	System.out.println("A soma dos valores é: " + soma);
}
}
