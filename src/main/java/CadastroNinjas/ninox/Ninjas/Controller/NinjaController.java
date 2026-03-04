package CadastroNinjas.ninox.Ninjas.Controller;

import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import CadastroNinjas.ninox.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Hello world";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosNinjas(){
        return ninjaService.listarNinjas();
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
