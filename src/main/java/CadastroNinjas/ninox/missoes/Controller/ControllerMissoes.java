package CadastroNinjas.ninox.missoes.Controller;

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
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @PostMapping("/criar")
    public MissoesModel criarMissoes(@RequestBody MissoesModel missoesModel){
        return missoesService.criarMissao(missoesModel);
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada";
    }

    @GetMapping("/listarId/{id}")
    public MissoesModel listarMissaoPorID(@PathVariable Long id){
        return missoesService.listarMissaoPorID(id);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarMissao(@PathVariable Long id){
        return missoesService.deletarMissao(id);
    }
}

