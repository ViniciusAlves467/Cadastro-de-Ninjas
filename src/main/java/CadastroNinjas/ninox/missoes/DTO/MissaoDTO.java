package CadastroNinjas.ninox.missoes.DTO;


import CadastroNinjas.ninox.Ninjas.Model.RankingNinja;
import CadastroNinjas.ninox.missoes.Model.Dificuldade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissaoDTO {

    private Long id;
    private String nome;
    private Dificuldade dificuldade;
    private List<NinjaResumoDTO> ninjas;
}
