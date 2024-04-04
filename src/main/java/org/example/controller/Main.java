package org.example.controller;

import org.example.model.Alunos;

import org.springframework.beans.factory.annotation.*;
import org.springFramework.*;
import org.springframework.web.bind.*;

import java.util.List;

public class Main {

    private AlunoRepository repository;

    public List<Alunos> getAlunos() {
        return repository.findAll();
    }

    public Alunos getOne(@PathVariable("nomeAluno") String nomeAluno) {
        return repository.findByNomeAluno(nomeAluno);
    }

    @DeleteMapping("/alunos/{idAluno}")
    public void deleteAluno(@PathVariable("idAluno") Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/nomealunos")
    public void postAluno(@RequestBody Alunos aluno) {
        repository.save(aluno);
    }

    @PutMapping("/nomeAluno/{idAluno}")
    public String putAluno(@PathVariable("idAluno") Long id, @RequestBody Alunos aluno) {
        // para atualizar o aluno
        return "O ID " + id + " do Aluno" + nomeAluno + " foi atualizado.";
    }
}