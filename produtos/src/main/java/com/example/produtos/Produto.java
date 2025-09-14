package com.example.produtos;

public class Produto {

}
package com.exemplo.produtos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Diz ao JPA que essa classe será uma tabela no banco
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // chave primária auto-incremento
    private Long id;

    private String nome;
    private Double preco;

    // Construtor vazio (obrigatório para o JPA)
    public Produto() {}

    // Construtor cheio (opcional, para facilitar criação de objetos)
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters (obrigatórios para o JPA acessar os campos)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
