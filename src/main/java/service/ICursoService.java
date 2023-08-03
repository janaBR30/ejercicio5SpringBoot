
package service;

import dto.CursoTemaDTO;
import entity.Curso;
import java.util.List;


public interface ICursoService {
    
    //método para consulta todos los cursos
    public List<Curso> getCursos();
    
    //método para dar de alta un curso
    public void saveCurso(Curso curso);

    //método para borrar un curso
    public void deleteCurso(Long id);

    //método para encontrar un curso
    public Curso findCurso(Long id);

    //método para editar un curso
    public void editCurso(Curso curso);

    public CursoTemaDTO temasPorCurso(Long id_curso);

    public List<Curso> getCursosJava();
    
    
}
