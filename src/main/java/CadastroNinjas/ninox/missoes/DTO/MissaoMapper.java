package CadastroNinjas.ninox.missoes.DTO;

import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import CadastroNinjas.ninox.missoes.Model.MissoesModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MissaoMapper {

    public MissoesModel map(MissaoDTO missaoDTO){
        MissoesModel missoesModel = new MissoesModel();

        missoesModel.setId(missaoDTO.getId());
        missoesModel.setNome(missaoDTO.getNome());
        missoesModel.setDificuldade(missaoDTO.getDificuldade());

        return missoesModel;
    }

    public MissaoDTO map(MissoesModel missoesModel){
        MissaoDTO missaoDTO = new MissaoDTO();

        missaoDTO.setId(missoesModel.getId());
        missaoDTO.setNome(missoesModel.getNome());
        missaoDTO.setDificuldade(missoesModel.getDificuldade());

        if (missoesModel.getNinjas() != null) {
            List<NinjaResumoDTO> ninjasResumo = missoesModel.getNinjas()
                    .stream()
                    .map(this::mapNinjaResumo)
                    .toList();

            missaoDTO.setNinjas(ninjasResumo);
        }

        return missaoDTO;
    }

    private NinjaResumoDTO mapNinjaResumo(NinjaModel ninjaModel){
        NinjaResumoDTO ninjaResumoDTO = new NinjaResumoDTO();

        ninjaResumoDTO.setNome(ninjaModel.getNome());
        ninjaResumoDTO.setRankingNinja(ninjaModel.getRankingNinja());

        return ninjaResumoDTO;
    }
}
