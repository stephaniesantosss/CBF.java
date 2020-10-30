package repository;

import java.util.ArrayList;
import java.util.List;

import model.Posicao;

public class PosicaoRepository {
public List<Posicao> Lista = new ArrayList<Posicao>();
	
	public Posicao GetPosicao(int indice) {
		return new Posicao();
	}
	
	public List<Posicao> GetAllPosicao(int indice) {
		return new ArrayList<Posicao>();
	}
	
	public void SetPosicao(Posicao posicao) {
		
	}
}
