package com.example.demo.model; // Ajuste para o nome exato do seu pacote

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "seguros")
public class Seguro {

    @Id
    private String id;
    private String seguradoId;
    private String tipoSeguro;
    private Double valorPremio;
    private Integer numeroApolice; // Para sabermos de qual cliente é este seguro

    // Construtor vazio exigido pelo Spring
    public Seguro() {}

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getSeguradoId() {
        return seguradoId;
    }

    public void setSeguradoId(String seguradoId) {
        this.seguradoId = seguradoId;
    }

    public Double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(Double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public Integer getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(Integer numeroApolice) {
        this.numeroApolice = numeroApolice;
    }
}