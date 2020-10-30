package service;

import model.Ingresso;
import repository.IngressoRepository;

public class IngressoService {
	public Ingresso GetIngresso(int indice) {
		IngressoRepository repository = new IngressoRepository();
		// Ingresso result = repository.GetIngresso(indice); 
		// return result;
		return null;
	}

	public void SetIngresso(Ingresso ingresso) {
		IngressoRepository repository = new IngressoRepository();

		// repository.SetIngresso(ingresso);
	}
}
