package com.Model3.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model3.Model.ClienteM;
import com.Model3.Repository.ClienteR;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class ClienteC {

    private final ClienteR clienteR;


    @GetMapping("/cliente")
    public List<ClienteM> getAll(){
        return clienteR.findAll();
    }

    @GetMapping("/cliente/id")
    public ClienteM getId(@PathVariable Long id){
        return clienteR.getReferenceById(id);
    }

    /*@GetMapping("/vliente/nombre")
    public ClienteM getNombre(@PathVariable String nombre){
        return clienteR.ge
    }*/

    @PostMapping("/cliente/add")
    public ClienteM addClienteM(@RequestBody ClienteM nuevo){
        return clienteR.save(nuevo);
    }

    @PutMapping("/cliente/mod")
    public ClienteM modClienteM(@RequestBody ClienteM mod,  @PathVariable Long id ){
        if (clienteR.existsById(id)){
            mod.setId(id);
            return clienteR.save(mod);            
        } else {
            return null;
        }
    }

    @DeleteMapping("/cliente/delete")
    public ClienteM deleteCliente(@PathVariable Long id, Long long1){
        if (clienteR.existsById(id)) {
            ClienteM result = clienteR.getReferenceById(id);
            clienteR.deleteById(long1);
            return result;            
        } else{
            return null;
        }
    }


}
