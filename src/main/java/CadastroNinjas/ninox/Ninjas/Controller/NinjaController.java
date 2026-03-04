package CadastroNinjas.ninox.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Hello world";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    @GetMapping("/todos")
    public String mostrarTodosNinjas(){
        return "Ninjas";
    }

    @GetMapping("/todosID")
    public String mostrarTodosNinjasPorId(){
        return "Ninjas por id";
    }

    @PutMapping("/alterarID")
    public String alterarNinjaId(){
        return "Alterar ninja por id";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }




}
