package service;

import model.Jogador;
import repository.JogadorRepository;

public class JogadorService {
	public Jogador GetJogador(int indice) {
		JogadorRepository repository = new JogadorRepository();
		// Jogador result = repository.GetJogador(indice); 
		// return result;
		return null;
	}

	public void SetJogador(Jogador jogador) {
		JogadorRepository repository = new JogadorRepository();

		// repository.SetJogador(jogador);
	}
}
