package CadastroNinjas.ninox.missoes.Service;


import CadastroNinjas.ninox.missoes.DTO.MissaoDTO;
import CadastroNinjas.ninox.missoes.DTO.MissaoMapper;
import CadastroNinjas.ninox.missoes.Model.MissoesModel;
import CadastroNinjas.ninox.missoes.Repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;
    private MissaoMapper missaoMapper;

    public MissoesService(MissoesRepository missoesRepository, MissaoMapper missaoMapper) {
        this.missoesRepository = missoesRepository;
        this.missaoMapper = missaoMapper;
    }

    public List<MissaoDTO> listarMissoes(){
        return missoesRepository.findAll()
                .stream()
                .map(missaoMapper::map)
                .toList();
    }

    public MissaoDTO listarMissaoPorID(Long id){
        Optional <MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.map(missaoMapper::map).orElse(null);
    }

    public String deletarMissao(Long id){
        if(listarMissaoPorID(id)==null){
            return "ID da missão inválida";
        }else{
            String nomeDelete = listarMissaoPorID(id).getNome();
            missoesRepository.deleteById(id);
            return nomeDelete+" foi deletada com sucesso.";

        }
    }

    public MissaoDTO criarMissao(MissaoDTO missaoDTO){
        MissoesModel missoesModel = missaoMapper.map(missaoDTO);
        missoesModel = missoesRepository.save(missoesModel);
        return missaoMapper.map(missoesModel);
    }

    public MissaoDTO atualizarMissao(Long id, MissaoDTO missaoDTO){
        if(!missoesRepository.existsById(id)){
            return null;
        }

        MissoesModel missoesModel = missaoMapper.map(missaoDTO);
        missoesModel.setId(id);

        missoesModel = missoesRepository.save(missoesModel);
        return missaoMapper.map(missoesModel);
    }
}
