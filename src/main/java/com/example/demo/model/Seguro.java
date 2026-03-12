package com.example.demo.model; // Ajuste para o nome exato do seu pacote

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "seguros")
public class Seguro {

    @Id
    private String id;
    private String nomeDoPlano;
    private Double valorMensal;
    private String clienteId; // Para sabermos de qual cliente é este seguro

    // Construtor vazio exigido pelo Spring
    public Seguro() {}

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeDoPlano() {
        return nomeDoPlano;
    }

    public void setNomeDoPlano(String nomeDoPlano) {
        this.nomeDoPlano = nomeDoPlano;
    }

    public Double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(Double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }
}