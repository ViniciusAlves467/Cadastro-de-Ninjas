package CadastroNinjas.ninox.Ninjas.Repository;


import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpqlQueryBuilder;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
