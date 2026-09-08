package com.fintech.client.controller;

import com.fintech.client.model.Client;
import com.fintech.client.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
@Tag(name = "Client", description = "API for managing clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    @Operation(summary = "Get all clients")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "List of clients", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class)))
    })
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get client by ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Client found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))),
        @ApiResponse(responseCode = "404", description = "Client not found")
    })
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        Optional<Client> client = clientService.getClientById(id);
        return client.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new client")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Client created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client savedClient = clientService.createClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedClient);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update client by ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Client updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))),
        @ApiResponse(responseCode = "404", description = "Client not found")
    })
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client client) {
        Client updatedClient = clientService.updateClient(id, client);
        if (updatedClient!= null) {
            return ResponseEntity.ok(updatedClient);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete client by ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Client deleted"),
        @ApiResponse(responseCode = "404", description = "Client not found")
    })
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
}