package CadastroNinjas.ninox.Ninjas.Service;

import CadastroNinjas.ninox.Ninjas.DTO.NinjaDTO;
import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import CadastroNinjas.ninox.Ninjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listaNinjaPorId(long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninjaModel){
        return ninjaRepository.save(ninjaModel);
    }

    public String deletarNinja(Long id){
        if(listaNinjaPorId(id)==null){
            return "ID de ninja inválido";
        }else {
            String nomeDelete = listaNinjaPorId(id).getNome();
            ninjaRepository.deleteById(id);
            return  nomeDelete+ " deletado com sucesso";
        }
    }

    public NinjaModel atualizarNinja(Long id,NinjaModel ninjaModel){
        if(ninjaRepository.existsById(id)){
            ninjaModel.setId(id);
            return ninjaRepository.save(ninjaModel);
        }
        return null;
    }



}
