package me.ac1.demo.service;

import me.ac1.demo.model.Alunos;

import java.util.List;

public interface ServAluno {

    List<Alunos> findAll();

    Alunos findById(Long id);

    Alunos   getAlunoByNome(String nome);

    Alunos save(Alunos aluno);

    void deleteById(Long id);

    Alunos findByNomeAluno(String nomeAluno);
}

