package com.fintech.client.service;

import com.fintech.client.model.Client;
import com.fintech.client.repository.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllClients() {
        Client client1 = new Client(1L, "John Doe", "john.doe@example.com", "2024-06-10");
        Client client2 = new Client(2L, "Jane Doe", "jane.doe@example.com", "2024-06-11");
        when(clientRepository.findAll()).thenReturn(Arrays.asList(client1, client2));

        List<Client> clients = clientService.getAllClients();
        assertEquals(2, clients.size());
        assertEquals("John Doe", clients.get(0).getName());
        assertEquals("Jane Doe", clients.get(1).getName());
    }

    @Test
    void getClientById() {
        Client client = new Client(1L, "John Doe", "john.doe@example.com", "2024-06-10");
        when(clientRepository.findById(1L)).thenReturn(Optional.of(client));

        Optional<Client> foundClient = clientService.getClientById(1L);
        assertTrue(foundClient.isPresent());
        assertEquals("John Doe", foundClient.get().getName());
    }

    @Test
    void createClient() {
        Client client = new Client(null, "John Doe", "john.doe@example.com", "2024-06-10");
        when(clientRepository.save(client)).thenReturn(new Client(1L, "John Doe", "john.doe@example.com", "2024-06-10"));

        Client savedClient = clientService.createClient(client);
        assertNotNull(savedClient.getId());
        assertEquals("John Doe", savedClient.getName());
    }

    @Test
    void updateClient() {
        Client existingClient = new Client(1L, "John Doe", "john.doe@example.com", "2024-06-10");
        Client updatedClient = new Client(1L, "John Doe Updated", "john.doe.updated@example.com", "2024-06-10");
        when(clientRepository.findById(1L)).thenReturn(Optional.of(existingClient));
        when(clientRepository.save(updatedClient)).thenReturn(updatedClient);

        Client result = clientService.updateClient(1L, updatedClient);
        assertNotNull(result);
        assertEquals("John Doe Updated", result.getName());
    }

    @Test
    void deleteClient() {
        doNothing().when(clientRepository).deleteById(1L);
        clientService.deleteClient(1L);
        verify(clientRepository, times(1)).deleteById(1L);
    }
}