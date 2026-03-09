package CadastroNinjas.ninox.missoes.DTO;


import CadastroNinjas.ninox.Ninjas.Model.RankingNinja;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaResumoDTO {

    private String nome;
    private RankingNinja rankingNinja;
}
