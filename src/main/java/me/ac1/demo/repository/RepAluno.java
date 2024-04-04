package me.ac1.demo.repository;


import me.ac1.demo.model.Alunos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepAluno {

    public Alunos save(Alunos aluno){
        if (aluno.getIdAluno()==null) {
            System.out.println("Salvar novo aluno");
        } else {
            System.out.println(" atualizar dados do aluno");
        }
        System.out.println(aluno);
        return aluno;
    }
    public void deleteById(Long id) {
        System.out.println(String.format("excluir um aluno", id));
        System.out.println(id);
    }
    public List<Alunos> findAll(){
        System.out.print("Exibir lista de alunos");
        List<Alunos> alunos = new ArrayList<>();;
        alunos.add(new Alunos("Fernanda", "78955", "EI", 31));
        alunos.add(new Alunos("Luiz", "7488", "EP", 50));
        return alunos;
    }
    public Alunos findById(Long id) {
        System.out.print(String.format("Localizar Id do aluno", id));
        return new Alunos("Fernanda", "78955", "EI", 31);
    }
    public Alunos findByNomeAluno(String nomeAluno){
        System.out.print(String.format("Localizar nome de aluno", nomeAluno));
        return new Alunos("Fernanda", "78955", "EI", 31);
    }

}


