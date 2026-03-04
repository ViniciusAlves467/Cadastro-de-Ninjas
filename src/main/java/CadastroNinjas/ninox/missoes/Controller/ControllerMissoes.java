package CadastroNinjas.ninox.missoes.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class ControllerMissoes {

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Lista de missoes";
    }

    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missao criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada";
    }

    @GetMapping("/listarId")
    public String listarMissaoPorID(){
        return "Missao com id x";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada";
    }
}

