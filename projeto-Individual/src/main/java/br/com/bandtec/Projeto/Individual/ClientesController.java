package br.com.bandtec.Projeto.Individual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    private List<Cliente> listaClientes = new ArrayList<>();



    // Mostra todos os Clientes cadastrados na ListaCliente (List)
    @GetMapping
    public List<Cliente> getListaClientes(){
        return listaClientes;
    }

    // Cadastrando Cliente Infantil
    @PostMapping("infantil")
    public String setCadastrarInfantil(@RequestBody ClienteInfantil novoCliente){
        listaClientes.add(novoCliente);
        return "Novo cliente infantil cadastrado";
    }

    // Cadastrando Cliente Adulto
    @PostMapping("adulto")
    public String setCadastrarAdulto(@RequestBody ClienteAdulto novoCliente){
        listaClientes.add(novoCliente);
        return "Novo cliente adulto cadastrado";
    }

    // Mostra o Clientes cadastrados através do Id
    @GetMapping("{id}")
    public Cliente getListaClientesId(@PathVariable int id){
        return listaClientes.get(id-1);
    }


    // Deletando um cliente
    @DeleteMapping("{remove}")
    public String setExcluirCliente(@PathVariable int remove){
        listaClientes.remove(remove-1);

        return "Cliente excluido";
    }

    

}
