package com.leandroucuamba.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leandroucuamba.livraria.entity.Livro;
import com.leandroucuamba.livraria.repository.LivroRepository;
import com.leandroucuamba.livraria.service.exception.EntityNotFound;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public Livro create(Livro livro){
        return repository.save(livro);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Livro getId(Long id){
        Optional<Livro> livro = repository.findById(id);
        if (livro.isEmpty()){
            throw new EntityNotFound("Livro de ID: "+id+" não encontrado!");
        }
        return livro.get();
    }

    public List<Livro> getAll(){
        return repository.findAll();
    }

    public Livro update(Livro livro){
        Optional<Livro> novoLivro = repository.findById(livro.getId());
        if (novoLivro.isEmpty()){
            throw new EntityNotFound("Livro de ID: "+livro.getId()+" não encontrado!");
        }
        updateLivro(novoLivro, livro);
        return repository.save(novoLivro.get());
    }

    private void updateLivro(Optional<Livro> novoLivro, Livro livro) {
        novoLivro.get().setNome(livro.getNome());
    }
}
