package org.ema.animaux;

import java.util.ArrayList;

public class Gardien {
	
	public void appeler() {
		Zoo zoo = new Zoo();
		zoo.animaux = new ArrayList<Animal>();
		zoo.animaux.add(new Lion("Simba", 100));
		zoo.animaux.add(new Lion("Nala", 80));
		zoo.animaux.add(new Lion("Mufassa", 120));
		zoo.animaux.add(new Zebre("Zebre1", 70));
		zoo.animaux.add(new Zebre("Zebre2", 75));
		zoo.animaux.add(new Zebre("Zebre3", 72));
		zoo.animaux.add(new Zebre("Zebre4", 60));
		
		for(Animal a : zoo.animaux) {
			a.crier();
		}
	}
}
