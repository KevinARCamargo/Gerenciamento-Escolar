package escola;
import javax.swing.JOptionPane;

public class Escola {
    public static void main(String[] args) {
        //Variáveis
        int op, opc, opco, opcoes;
        String nome, cpf, telefone, dpto, atuacao;
        int dia, mes, ano, ra, cod;
        float ira;
        Aluno a = null;
        TecAdministrativo tec = null;
        Professor prof = null;
        
        //Funções
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog( "***** Menu ***** \n 1 - Cadastro \n 2 - Edição \n 3 - Consulta"));
        
            switch(op){
                case 1:
                    //Cadastro
                    opc = Integer.parseInt(JOptionPane.showInputDialog( "***** Menu ***** \n 1 - Aluno \n 2 - Tec Administrativo \n 3 - Professor"));
                    switch(opc){
                        case 1:
                            nome = JOptionPane.showInputDialog( "Nome: ");
                            //Falta fazer o role de verificar o CPF
                            cpf = JOptionPane.showInputDialog( "Cpf: ");
                            //Falta fazer o split na data de nascimento
                            dia = Integer.parseInt(JOptionPane.showInputDialog( "Dia Nasc: "));
                            mes = Integer.parseInt(JOptionPane.showInputDialog( "Mes Nasc: "));
                            ano = Integer.parseInt(JOptionPane.showInputDialog( "Ano Nasc: "));
                            telefone = JOptionPane.showInputDialog( "Telefone: ");
                            ra = Integer.parseInt(JOptionPane.showInputDialog( "RA: ")); 
                            ira = Float.parseFloat(JOptionPane.showInputDialog( "IRA: "));
                            a = new Aluno(ra, ira, dia, mes, ano, nome, cpf, telefone);                                                                                                                      
                            break;
                        case 2:
                            //Cadastro Técnico Administrativo
                            nome = JOptionPane.showInputDialog( "Nome: ");
                            //Falta fazer o role de verificar o CPF
                            cpf = JOptionPane.showInputDialog( "Cpf: ");
                            //Falta fazer o split na data de nascimento
                            dia = Integer.parseInt(JOptionPane.showInputDialog( "Dia Nasc: "));
                            mes = Integer.parseInt(JOptionPane.showInputDialog( "Mes Nasc: "));
                            ano = Integer.parseInt(JOptionPane.showInputDialog( "Ano Nasc: "));
                            telefone = JOptionPane.showInputDialog( "Telefone: ");
                            cod = Integer.parseInt(JOptionPane.showInputDialog( "Cód Func: "));
                            dpto = JOptionPane.showInputDialog( "Departamento: ");
                            tec = new TecAdministrativo(dpto, cod, dia, mes, ano, nome, cpf, telefone);
                            break;
                        case 3:
                            //Cadastro Professor
                            nome = JOptionPane.showInputDialog( "Nome: ");
                            //Falta fazer o role de verificar o CPF
                            cpf = JOptionPane.showInputDialog( "Cpf: ");
                            //Falta fazer o split na data de nascimento
                            dia = Integer.parseInt(JOptionPane.showInputDialog( "Dia Nasc: "));
                            mes = Integer.parseInt(JOptionPane.showInputDialog( "Mes Nasc: "));
                            ano = Integer.parseInt(JOptionPane.showInputDialog( "Ano Nasc: "));
                            telefone = JOptionPane.showInputDialog( "Telefone: ");
                            cod = Integer.parseInt(JOptionPane.showInputDialog( "Código Funcionário: "));
                            atuacao = JOptionPane.showInputDialog( "Área: ");
                            prof = new Professor(atuacao, cod, dia, mes, ano, nome, cpf, telefone);
                            break;
                    }
                    break;
                
                case 2:
                    //Edição
                    opco = Integer.parseInt(JOptionPane.showInputDialog( "***** Menu ***** \n 1 - Aluno \n 2 - Tec Administrativo \n 3 - Professor"));
                    switch(opco){
                        case 1:
                            opcoes = Integer.parseInt(JOptionPane.showInputDialog( "***** Atributos ***** \n 1 - Nome \n 2 - Cpf \n 3 - Data de Nascimento \n 4 - Telefone \n 5 - RA \n 6 - Ira"));
                            switch(opcoes){
                                case 1:
                                    nome = JOptionPane.showInputDialog( "Nome: ");
                                    a.setNome(nome);
                                    break;
                                case 2:
                                    //Falta fazer o role de verificar o CPF
                                    cpf = JOptionPane.showInputDialog( "Cpf: ");
                                    a.setCpf(cpf);
                                    break;
                                case 3:
                                    //Falta fazer o split na data de nascimento
                                    dia = Integer.parseInt(JOptionPane.showInputDialog( "Dia Nasc: "));
                                    mes = Integer.parseInt(JOptionPane.showInputDialog( "Mes Nasc: "));
                                    ano = Integer.parseInt(JOptionPane.showInputDialog( "Ano Nasc: "));
                                    break;
                                case 4:
                                    telefone = JOptionPane.showInputDialog( "Telefone: ");
                                    a.setTelefone(telefone);
                                    break;
                                case 5:
                                    ra = Integer.parseInt(JOptionPane.showInputDialog( "RA: "));
                                    a.setRa(ra);
                                    break;
                                case 6:
                                    ira = Float.parseFloat(JOptionPane.showInputDialog( "IRA: "));
                                    a.setIra(ira);
                                    break;
                            }
                            break;
                        case 2:
                            opcoes = Integer.parseInt(JOptionPane.showInputDialog( "***** Atributos ***** \n 1 - Nome \n 2 - Cpf \n 3 - Data de Nascimento \n 4 - Telefone \n 5 - Cod Funcionário \n 6 - Departamento"));
                            switch(opcoes){
                                case 1:
                                    nome = JOptionPane.showInputDialog( "Nome: ");
                                    tec.setNome(nome);
                                    break;
                                case 2:
                                    //Falta fazer o role de verificar o CPF
                                    cpf = JOptionPane.showInputDialog( "Cpf: ");
                                    tec.setCpf(cpf);
                                    break;
                                case 3:
                                    //Falta fazer o split na data de nascimento
                                    dia = Integer.parseInt(JOptionPane.showInputDialog( "Dia Nasc: "));
                                    mes = Integer.parseInt(JOptionPane.showInputDialog( "Mes Nasc: "));
                                    ano = Integer.parseInt(JOptionPane.showInputDialog( "Ano Nasc: "));
                                    break;
                                case 4:
                                    telefone = JOptionPane.showInputDialog( "Telefone: ");
                                    tec.setTelefone(telefone);
                                    break;
                                case 5:
                                    cod = Integer.parseInt(JOptionPane.showInputDialog( "Cod Funcionário: "));
                                    tec.setCod(cod);
                                    break;
                                case 6:
                                    dpto = JOptionPane.showInputDialog( "Departamento: ");
                                    tec.setDepartamento(dpto);
                                    break;
                            }
                            break;
                        case 3: 
                            opcoes = Integer.parseInt(JOptionPane.showInputDialog( "***** Atributos ***** \n 1 - Nome \n 2 - Cpf \n 3 - Data de Nascimento \n 4 - Telefone \n 5 - Cod Funcionário \n 6 - Área de Atuação"));
                            switch(opcoes){
                                case 1:
                                    nome = JOptionPane.showInputDialog( "Nome: ");
                                    prof.setNome(nome);
                                    break;
                                case 2:
                                    //Falta fazer o role de verificar o CPF
                                    cpf = JOptionPane.showInputDialog( "Cpf: ");
                                    prof.setCpf(cpf);
                                    break;
                                case 3:
                                    //Falta fazer o split na data de nascimento
                                    dia = Integer.parseInt(JOptionPane.showInputDialog( "Dia Nasc: "));
                                    mes = Integer.parseInt(JOptionPane.showInputDialog( "Mes Nasc: "));
                                    ano = Integer.parseInt(JOptionPane.showInputDialog( "Ano Nasc: "));
                                    break;
                                case 4:
                                    telefone = JOptionPane.showInputDialog( "Telefone: ");
                                    prof.setTelefone(telefone);
                                    break;
                                case 5:
                                    cod = Integer.parseInt(JOptionPane.showInputDialog( "Cod Funcionário: "));
                                    prof.setCod(cod);
                                    break;
                                case 6:
                                    atuacao = JOptionPane.showInputDialog( "Área de atuação: ");
                                    prof.setAtuação(atuacao);
                                    break;
                            }
                            break;
                    }
                    break;
                    
                case 3:
                    //Consulta
                    opc = Integer.parseInt(JOptionPane.showInputDialog( "***** Consulta ***** \n 1 - Aluno \n 2 - Tec Administrativo \n 3 - Professor"));
                    switch(opc){
                        case 1:
                            //Consulta Aluno (Falta arrumar a data de Nascimento e idade)
                            JOptionPane.showMessageDialog(null, "***** Aluno *****\n\nNome: " + a.getNome() + 
                                    "\nCpf: " + a.getCpf() + "\nTelefone: " + a.getTelefone() + "\nRA: " + a.getRa() + "\nIra: "
                                    + a.getIra());                                                                                                                
                            break;
                        case 2:
                            //Consulta Téc Adm (Falta arrumar a data de Nascimento e idade)
                            JOptionPane.showMessageDialog(null, "***** Técnico Administrativo *****\n\nNome: " + tec.getNome() + 
                                    "\nCpf: " + tec.getCpf() + "\nTelefone: " + tec.getTelefone() + "\nFuncionário: " + tec.getCod()+ "\nIra: "
                                    + tec.getDepartamento()); 
                            break;
                        case 3:
                            //Consulta Professor (Falta arrumar a data de Nascimento e idade)s
                            JOptionPane.showMessageDialog(null, "***** Professor *****\n\nNome: " + prof.getNome() + 
                                    "\nCpf: " + prof.getCpf() + "\nTelefone: " + prof.getTelefone() + "\nFuncionário: " + prof.getCod()+ "\nIra: "
                                    + prof.getAtuação()); 
                            break;
                    }
                    break;
            }
            
        }while(op != 0);
    }
        
    
}
