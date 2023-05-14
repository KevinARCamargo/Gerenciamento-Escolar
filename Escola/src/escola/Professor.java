package escola;

public class Professor extends Funcionário{
    //Atributos
    private String atuação;
    
    //Construtor
    public Professor(String atuação, int cod, int dia, int mes, int ano, String nome, String cpf, String telefone) {
        super(cod, dia, mes, ano, nome, cpf, telefone);
        this.atuação = atuação;
    }
    
    //Métodos
    public String getAtuação() {
        return atuação;
    }

    public void setAtuação(String atuação) {
        this.atuação = atuação;
    }
    
    
}
