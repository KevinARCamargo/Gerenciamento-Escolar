package escola;
public abstract class Funcionário extends Pessoa{
    //Atributos
    private int cod;
    
    //Construtor
    public Funcionário(int cod, int dia, int mes, int ano, String nome, String cpf, String telefone) {
        super(dia, mes, ano, nome, cpf, telefone);
        this.cod = cod;
    }
    
    //Métodos
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
