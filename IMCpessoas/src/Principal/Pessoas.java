package Principal;


public class Pessoas {

    private String nome;
    private String DataNascimento;


    public Pessoas(String nome_, String DataNascimento_) {

        setNome(nome_);
        setDataNascimento(DataNascimento_);

    }

    @Override

    public String toString() {

        return "Nome: " + this.nome + ", nome" + this.nome +
                ", DataNascimento" + this.DataNascimento;



    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }



}
