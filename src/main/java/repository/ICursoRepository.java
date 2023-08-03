
package repository;

import entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //mapeamos como repositorio
//la interface extiende de JpaRepository 
// en los parametros <> deben ir: <clase a persistir, tipo de dato de su ID> 
public interface ICursoRepository extends JpaRepository<Curso,Long>{
    
}
