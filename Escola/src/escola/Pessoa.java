package escola;
public abstract class Pessoa {
    //Atributos
    private int dia, mes, ano;
    private String nome, cpf, telefone;
    
    //Construtor
    public Pessoa(int dia, int mes, int ano, String nome, String cpf, String telefone) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    //Métodos
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
