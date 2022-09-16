package projeto.com.br;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String nivel;
    private int cargahoraria;
    private Professor Professor;
    private List <Aluno> alunos;


    public Curso (String nome, String nivel, int cargahoraria, Professor Professor) {
        this.nome = nome;
        this.nivel = nivel;
        this.cargahoraria = cargahoraria;
        this.Professor = Professor;
        this.alunos = new ArrayList<>();

    }
    public void MatricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public int getQuantidadeAlunos(){
        return this.alunos.size();

    }
    public String getNome() {
        return nome;
    }

    public Professor getProfessor(){
        return Professor;
    }
    public String getNomeProfessor(){
        return this.Professor.getNome();

    }
    public List<Aluno> getAlunos(){
        return alunos;
    }
    @Override
    public String toString() {
        return " Nome:" + nome + "," + " Nivel: " + nivel + "," + " Carga Horaria: " + cargahoraria
                + "," + " Professor: " + Professor.getNome();
    }}



