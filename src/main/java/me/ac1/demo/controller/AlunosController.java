package me.ac1.demo.controller;
import me.ac1.demo.controller.*;
import me.ac1.demo.repository.*;
import me.ac1.demo.model.Alunos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AlunosController {
    @Autowired
    private RepAluno repository;

    @GetMapping("/alunos")
    public List<Alunos> getAlunos() {
        return repository.findAll();
    }

    @GetMapping("/alunos/{nomeAluno}")
    public Alunos getOne(@PathVariable ("nomeAluno") String nomeAluno) {
        return repository.findByNomeAluno(nomeAluno);
    }

    @DeleteMapping("/alunos/{id}")
    public void deleteAluno(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/alunos")
    public void postAluno(@RequestBody Alunos aluno) {
        repository.save(aluno);
    }

    @PutMapping("/alunos/{id}")
    public String putAluno(@PathVariable("id") Long id, @RequestBody Alunos aluno) {
        //atualiza aluno
        return "O ID " + id + " do Aluno" + aluno + " foi atualizado.";
    }

}