package CadastroNinjas.ninox.Ninjas.DTO;


import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel =new NinjaModel();

        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRankingNinja(ninjaDTO.getRankingNinja());
        ninjaModel.setEmail(ninjaDTO.getEmail());


        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();

        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setRankingNinja(ninjaModel.getRankingNinja());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        if(ninjaModel.getMissoes() != null){
            ninjaDTO.setIdMissao(ninjaModel.getMissoes().getId());
            ninjaDTO.setNomeMissao(ninjaModel.getMissoes().getNome());
        }


        return ninjaDTO;
    }
}
