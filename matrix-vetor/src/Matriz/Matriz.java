package Matriz;

import javax.swing.*;

public class Matriz {
	public void MatrixEx() {
		System.out.println("___Matrix___");
		
		int MatSoma[] [], a, b, soma = 0;
		
		MatSoma = new int[10][12];
		
		for (a = 0; a <= 9; a++) {
			for (b = 0; b <= 11; b++) {
				MatSoma[a] [b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
				soma = soma + MatSoma [a] [b];
			}
		}
		System.out.println("O resultado é: " + soma);
	}
}
