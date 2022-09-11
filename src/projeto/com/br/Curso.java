package projeto.com.br;

import java.util.ArrayList;
import java.util.List;

public class Curso { private String nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }
    public Professor getProfessor(){
        return Professor;
    }
    public String getNomeProfessor(){
        return this.Professor.getNome();

    }
    public String getNivel() {
        return nivel;
    }
    public List<Aluno> getAlunos(){
        return alunos;
    }
    @Override
    public String toString() {

        return " Nome:" + nome + "," + " Nivel: " + nivel + "," + " Carga Horaria: " + cargahoraria
                + "," + " Professor: " + Professor.getNome();
    }}



