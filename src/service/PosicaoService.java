package service;

import model.Campeonato;
import model.Posicao;
import repository.PosicaoRepository;

public class PosicaoService {
	public Posicao GetPosicao(int indice) {
		PosicaoRepository repository = new PosicaoRepository();
		// Posicao result = repository.GetPosicao(indice); 
		// return result;
		return null;
	}

	public void SetPosicao(Posicao posicao) {
		PosicaoRepository repository = new PosicaoRepository();

		// repository.SetPosicao(posicao);
	}
}
