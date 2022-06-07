package br.com.mjv.MJVSchoolProjetoFinal.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mjv.projetofinal.controllers.ClienteController;
import com.mjv.projetofinal.model.Cliente;
import com.mjv.projetofinal.model.Endereco;
import org.junit.jupiter.api.*;
import org.junit.runner.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@ContextConfiguration
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClienteTestController {


    private final MockMvc mockMvc;

    private final ObjectMapper objectMapper;

    private final ClienteController clienteController;

    private final Cliente cliente;

    private final Endereco endereco;



    @Autowired
    public ClienteTestController(MockMvc mockMvc, ObjectMapper objectMapper, ClienteController clienteController, Cliente cliente, Endereco endereco){
        this.mockMvc = mockMvc;
        this.objectMapper = objectMapper;
        this.clienteController = clienteController;
        this.cliente = cliente;
        this.endereco = endereco;

        cliente = new Cliente();
        endereco = new Endereco();
        cliente.setId(1);
        cliente.setCpf("01111511151");
        cliente.setNomeCompleto("João José");
        cliente.setCpf("(61)9295295954)");
        endereco.setId(1);
        endereco.setRua("Pres. Dutra");
        endereco.setNumero("09A");
        endereco.setBairro("Centro");
        endereco.setCidade("São Gabriel");
        endereco.setEstado("Bahia");
        endereco.setComplemento("Esquina Mercado Dia a dia");
    }

    @Test
    @Order(1)
    void whenGetAccounts_thenStatus200() throws Exception {


//                perform(get("/cliente")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content()
//                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

//        mockMvc.perform(post("/cliente")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(clienteController)))
//                .andExpect(status().isCreated())
//                .andExpect(content()
//                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

}
