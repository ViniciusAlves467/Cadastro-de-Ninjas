package CadastroNinjas.ninox.Ninjas.DTO;

import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import CadastroNinjas.ninox.Ninjas.Model.RankingNinja;
import lombok.Data;

@Data
public class NinjaDTO {

    private Long id;
    private String nome;
    private RankingNinja rankingNinja;
    private String email;
    private int idade;

    public static NinjaDTO fromEntity(NinjaModel ninja) {
        NinjaDTO dto = new NinjaDTO();

        dto.setId(ninja.getId());
        dto.setNome(ninja.getNome());
        dto.setRankingNinja(ninja.getRankingNinja());
        dto.setEmail(ninja.getEmail());
        dto.setIdade(ninja.getIdade());
        return dto;
    }

}