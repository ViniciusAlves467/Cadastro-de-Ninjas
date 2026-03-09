package CadastroNinjas.ninox.Ninjas.Service;

import CadastroNinjas.ninox.Ninjas.DTO.NinjaDTO;
import CadastroNinjas.ninox.Ninjas.DTO.NinjaMapper;
import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import CadastroNinjas.ninox.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public NinjaDTO listaNinjaPorId(long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
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

    public NinjaDTO atualizarNinja(Long id,NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        if (ninjaModel.isPresent()){
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }



}
