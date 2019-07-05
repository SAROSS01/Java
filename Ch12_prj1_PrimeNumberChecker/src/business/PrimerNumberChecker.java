package business;

import java.util.ArrayList;
import java.util.List;

public class PrimerNumberChecker {
	private List <Integer> primerNumberChecker;
	
	public PrimerNumberChecker() { 
		primerNumberChecker = new ArrayList<>();
		
	}

	public List<Integer> getPrimerNumberChecker() {
		return primerNumberChecker;
	}

	public void addPrimerNumberChecker(Integer factor) {
		primerNumberChecker.add(factor);
	}
	
	

}
