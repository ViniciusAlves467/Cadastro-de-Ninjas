package CadastroNinjas.ninox.missoes.Repository;


import CadastroNinjas.ninox.missoes.Model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository  extends JpaRepository<MissoesModel, Long> {

}
