package CadastroNinjas.ninox.missoes.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControllerMissoes {

    @GetMapping("/listarMissoes")
    public String listarMissoes(){
        return "Lista de missoes";
    }

    @PostMapping("/criarMissoes")
    public String criarMissoes(){
        return "Missao criada";
    }

    @PutMapping("/alterarMissao")
    public String alterarMissao(){
        return "Missão alterada";
    }

    @GetMapping("/listarMissaoId")
    public String listarMissaoPorID(){
        return "Missao com id x";
    }

    @DeleteMapping("/deletarMissoes")
    public String deletarMissao(){
        return "Missão deletada";
    }
}

