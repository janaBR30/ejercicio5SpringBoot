package service;

import entity.Tema;
import java.util.List;


public interface ITemaService {
    
   //leitura
    public List<Tema> getTemas();

  //alta
    public void saveTema(Tema tema);

  //baja
    public void deleteTema(Long id);

  //encontrar por id
    public Tema findTema(Long id);

  //modificar
    public void editTema(Tema tema);
    
    
}
