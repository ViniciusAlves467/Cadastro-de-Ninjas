package CadastroNinjas.ninox.Ninjas.Service;

import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import CadastroNinjas.ninox.Ninjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }


}
