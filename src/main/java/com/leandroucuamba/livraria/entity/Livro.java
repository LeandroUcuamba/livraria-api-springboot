package com.leandroucuamba.livraria.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_livro")
public class Livro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Livro(Long id, String nome, Autor autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }

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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
