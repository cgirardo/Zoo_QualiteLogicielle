package org.ema.animaux;

public abstract class Animal {
	
	public String nom;
	public int poids;
	
	public Animal(String nom, int poids) {
		this.nom = nom;
		this.poids = poids;
	}
	
	public abstract void crier();
}
