package service;

import model.Campeonato;
import repository.CampeonatoRepository;

public class CampeonatoService {
	
	
	public Campeonato GetCampeonato(int indice) {
		CampeonatoRepository repository = new CampeonatoRepository();
		// Campeonato result = repository.GetCampeonato(indice); 
		// return result;
		return null;
	}

	public void SetCampeonato(Campeonato campeonato) {
		CampeonatoRepository repository = new CampeonatoRepository();

		// repository.SetCampeonato(campeonato);
	}
}
