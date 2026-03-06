package CadastroNinjas.ninox.Ninjas.Controller;

import CadastroNinjas.ninox.Ninjas.DTO.NinjaDTO;
import CadastroNinjas.ninox.Ninjas.Model.NinjaModel;
import CadastroNinjas.ninox.Ninjas.Service.NinjaService;
import CadastroNinjas.ninox.missoes.Model.MissoesModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninjaDTO){
        return ninjaService.criarNinja(ninjaDTO);
    }

    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosNinjas(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listarID/{id}")
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id){
        return ninjaService.listaNinjaPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaId(@PathVariable Long id, @RequestBody NinjaModel ninjaModel){
        return ninjaService.atualizarNinja(id,ninjaModel);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarNinjaPorId(@PathVariable Long id){
        return ninjaService.deletarNinja(id);
    }




}
