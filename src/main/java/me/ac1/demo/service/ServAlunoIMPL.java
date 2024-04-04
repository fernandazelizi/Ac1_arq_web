package me.ac1.demo.service;

import me.ac1.demo.model.Alunos;
import me.ac1.demo.repository.RepAluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServAlunoIMPL implements ServAluno {
    private final RepAluno repAluno;


    public ServAlunoIMPL(RepAluno repAluno){
        this.repAluno = repAluno;
    }

    @Override
    public List<Alunos> getAllAluno(){
        return repAluno.findAll();
    }
    @Override
    public Alunos findById(Long id){
        return repAluno.findById(id);
    }
    @Override
    public Alunos findByNomeAluno(String nome){
        return null;
    }
    @Override
    public Alunos save(Alunos aluno){
        return repAluno.save(aluno);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Alunos findByNome(String nomeAluno) {
        return null;
    }

}

