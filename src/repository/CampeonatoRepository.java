package repository;

import java.util.ArrayList;
import java.util.List;

import model.Campeonato;

public class CampeonatoRepository {
	
	public List<Campeonato> Lista = new ArrayList<Campeonato>();
	
	public Campeonato GetCampeonato(int indice) {
		return new Campeonato();
	}
	
	public List<Campeonato> GetAllCampeonato(int indice) {
		return new ArrayList<Campeonato>();
	}
	
	public void SetCampeonato(Campeonato campeonato) {
		
	}
	
}
