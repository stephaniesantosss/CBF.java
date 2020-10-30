package service;

import model.Partida;
import repository.PartidaRepository;

public class PartidaService {
	public Partida GetPartida(int indice) {
		PartidaRepository repository = new PartidaRepository();
		// Partida result = repository.GetPartida(indice); 
		// return result;
		return null;
	}

	public void SetPartida(Partida partida) {
		PartidaRepository repository = new PartidaRepository();

		// repository.SetCampeonato(partida);
	}
}
