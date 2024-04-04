package org.example.model;

public class Alunos {

    private Long idAluno;
    private String nomeAluno;
    private String matriculaAluno;
    private String cursoAluno;
    private int idadeAluno;

    public Alunos(String nome, String matricula, String curso, int idade) {
        this.nomeAluno = nome;
        this.matriculaAluno = matricula;
        this.cursoAluno = curso;
        this.idadeAluno = idade;
    }

    public String toString() {
        return "Aluno{" +
                "Nome='" + nomeAluno + '\'' +
                ", Matricula='" + matriculaAluno + '\'' +
                ", Curso='" + cursoAluno + '\'' +
                ", Idade='" + idadeAluno + '\'' +
                '}';
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }
}