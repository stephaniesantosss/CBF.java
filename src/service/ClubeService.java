package service;

import model.Clube;
import repository.ClubeRepository;

public class ClubeService {

	public Clube GetClube(int indice) {
		ClubeRepository repository = new ClubeRepository();
		// Clube result = repository.GetClube(indice); 
		// return result;
	}

	public void SetClube(Clube clube) {
		ClubeRepository repository = new ClubeRepository();

		// repository.SetClube(clube);
	}
}

}
