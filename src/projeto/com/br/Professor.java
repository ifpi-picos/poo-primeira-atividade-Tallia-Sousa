package projeto.com.br;

public class Professor {

    private String nome;
    private String email;
    private String formacao;

    public Professor(String nome){
        this.nome= nome;
    }


    public String getNome() {

        return nome;
    }
    @Override
    public boolean equals(Object obj){
        return this.nome.equals(((Professor)obj).nome);
    }
}

