package CadastroNinjas.ninox.missoes.Controller;

import CadastroNinjas.ninox.missoes.DTO.MissaoDTO;
import CadastroNinjas.ninox.missoes.Model.MissoesModel;
import CadastroNinjas.ninox.missoes.Service.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class ControllerMissoes {
    private MissoesService missoesService;

    public ControllerMissoes(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/listar")
    public List<MissaoDTO> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @PostMapping("/criar")
    public MissaoDTO criarMissoes(@RequestBody MissaoDTO missaoDTO){
        return missoesService.criarMissao(missaoDTO);
    }

    @PutMapping("/alterar")
    public MissaoDTO atualizarMissao(@PathVariable Long id, @RequestBody MissaoDTO missaoDTO){
        return missoesService.atualizarMissao(id, missaoDTO);
    }

    @GetMapping("/listarId/{id}")
    public MissaoDTO listarMissaoPorID(@PathVariable Long id){
        return missoesService.listarMissaoPorID(id);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarMissao(@PathVariable Long id){
        return missoesService.deletarMissao(id);
    }
}

