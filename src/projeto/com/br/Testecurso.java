package projeto.com.br;


import javax.swing.*;

public class Testecurso {

    public static void main(String[] args) {

        Professor professor = new Professor("joão de Sousa");

        Curso curso = new Curso("ADS", "Superior", 2000, professor);

        System.out.println(curso);
        for(int i=0; i < 3; i++){            String nomedoaluno= JOptionPane.showInputDialog(
                    null, "cadastre o nome do aluno" );
            curso.MatricularAluno(new Aluno(nomedoaluno,null));
        }
        JOptionPane.showMessageDialog(null, "Curso:"
                +curso.getNome() + "\n Alunos:" +curso.getAlunos(),  "Dados do Curso:",1);

        System.out.println("Quantidade de alunos matriculados : "  +curso.getQuantidadeAlunos());

    }}

