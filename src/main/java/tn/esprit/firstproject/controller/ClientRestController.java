package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Client;
import tn.esprit.firstproject.service.interfaces.IClientService;

import java.util.List;

@Tag(name = "Gestion des clients")
@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    IClientService clientService;

    // http://localhost:8089/firstproject/client/retrieve-all-clients
    @Operation(description = "Récupérer tous les clients")
    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        return clientService.retrieveAllClients();
    }

    // http://localhost:8089/firstproject/client/retrieve-client/1
    @Operation(description = "Récupérer un client par son identifiant")
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    // http://localhost:8089/firstproject/client/add-client
    @Operation(description = "Ajouter un client")
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    // http://localhost:8089/firstproject/client/remove-client/1
    @Operation(description = "Supprimer un client")
    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }

    // http://localhost:8089/firstproject/client/modify-client
    @Operation(description = "Modifier un client")
    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client client) {
        return clientService.modifyClient(client);
    }
}