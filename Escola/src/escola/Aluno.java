package escola;

public class Aluno extends Pessoa{
    //Atributos
    private int ra;
    private float ira;
    
    //Construtor
    public Aluno(int ra, float ira, int dia, int mes, int ano, String nome, String cpf, String telefone) {
        super(dia, mes, ano, nome, cpf, telefone);
        this.ra = ra;
        this.ira = ira;
    }
    
    //Métodos
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public float getIra() {
        return ira;
    }

    public void setIra(float ira) {
        this.ira = ira;
    }
    
    
}
