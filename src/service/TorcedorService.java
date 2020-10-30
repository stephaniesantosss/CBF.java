package service;

import model.Torcedor;
import repository.TorcedorRepository;

public class TorcedorService {
	public Torcedor GetTorcedor(int indice) {
		TorcedorRepository repository = new TorcedorRepository();
		// Torcedor result = repository.GetTorcedor(indice); 
		// return result;
		return null;
	}

	public void SetTorcedor(Torcedor torcedor) {
		TorcedorRepository repository = new TorcedorRepository();

		// repository.SetTorcedor(torcedor);
	}
}
