package escola;

public class TecAdministrativo extends Funcionário{
    //Atributos
    private String departamento;
    
    //Construtor
    public TecAdministrativo(String departamento, int cod, int dia, int mes, int ano, String nome, String cpf, String telefone) {
        super(cod, dia, mes, ano, nome, cpf, telefone);
        this.departamento = departamento;
    }
    
    //Métodos
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
