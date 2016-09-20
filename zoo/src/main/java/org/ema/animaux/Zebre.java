package org.ema.animaux;

public class Zebre extends Animal {

	public Zebre(String nom, int poids) {
		super(nom, poids);
	}

	@Override
	public void crier() {
		System.out.println("cri du zèbre");
	}
}
