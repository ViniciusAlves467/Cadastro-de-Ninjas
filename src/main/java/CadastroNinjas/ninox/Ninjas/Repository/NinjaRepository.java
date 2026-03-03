package CadastroNinjas.ninox.Ninjas.Repository;


import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
