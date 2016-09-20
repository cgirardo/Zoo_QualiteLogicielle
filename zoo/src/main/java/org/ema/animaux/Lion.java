package org.ema.animaux;

public class Lion extends Animal {

	public Lion(String nom, int poids) {
		super(nom, poids);
	}

	@Override
	public void crier() {
		System.out.println("cri du lion");
	}
}
