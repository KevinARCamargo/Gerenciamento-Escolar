/*Trabalho desenvolvido pelos discentes Gabriel Angelo e Kevin Camargo referente a disciplina de Programação Orientada a Objetos
 do 5 período do curso de bacharel em ciência da computação */
package escola;

import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Escola {

    public static void main(String[] args) {
        //Variáveis
        int op, opc, opco, opcoes;
        String nome, cpf, telefone, dpto, atuacao;
        int dia, mes, ano, ra, cod;
        String dataNascimento = "01/01/2000";
        float ira;
        Aluno a = null;
        TecAdministrativo tec = null;
        Professor prof = null;
        int aux = 1;
        String nomeCompleto;
        String nomeCompletoSplit[];
        String senhaGerada;
        String senhaDigitada;
        Calendar calendario = Calendar.getInstance();

        nomeCompleto = JOptionPane.showInputDialog("Nome Completo");
        nomeCompletoSplit = nomeCompleto.split(" ");
        senhaGerada = nomeCompletoSplit[0] + calendario.get(Calendar.DAY_OF_MONTH) + calendario.get(Calendar.MONTH) + calendario.get(Calendar.YEAR);
        System.out.println(senhaGerada);
        do {
            senhaDigitada = JOptionPane.showInputDialog("Digite a senha");
            if (senhaDigitada.equals(senhaGerada)) {
                op = 0;
            } else {
                op = Integer.parseInt(JOptionPane.showInputDialog("**** Senha Incorreta **** \n 1 - Tentar novamente \n 2 - Encerrar programa \n"));
            }
            if (op == 2) {
                System.exit(0);
            }

        } while (op != 0);
        //Funções
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("***** Menu ***** \n 1 - Cadastro \n 2 - Edição \n 3 - Consulta"));

            switch (op) {
                case 1:
                    //Cadastro
                    opc = Integer.parseInt(JOptionPane.showInputDialog("***** Menu ***** \n 1 - Aluno \n 2 - Tec Administrativo \n 3 - Professor"));
                    switch (opc) {
                        case 1:
                            nome = JOptionPane.showInputDialog("Nome: ");
                            //role de verificar o CPF
                            aux = 1;
                            do {
                                cpf = JOptionPane.showInputDialog("Cpf: ");
                                aux = primeirojava.Pessoa.validaCpf(cpf);
                                if (aux != 0) {
                                    JOptionPane.showMessageDialog(null, "O cpf não é válido, digite novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                                }
                            } while (aux != 0);
                            //data de nascimento
                            dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento no formato:\n dd/mm/aaaa: ");
                            dia = Integer.parseInt(dataNascimento.substring(0, 2));
                            mes = Integer.parseInt(dataNascimento.substring(3, 5));
                            ano = Integer.parseInt(dataNascimento.substring(6, 10));
                            telefone = JOptionPane.showInputDialog("Telefone: ");
                            ra = Integer.parseInt(JOptionPane.showInputDialog("RA: "));
                            ira = Float.parseFloat(JOptionPane.showInputDialog("IRA: "));
                            a = new Aluno(ra, ira, dia, mes, ano, nome, cpf, telefone);
                            break;
                        case 2:
                            //Cadastro Técnico Administrativo
                            nome = JOptionPane.showInputDialog("Nome: ");
                            //role de verificar o CPF
                            aux = 1;
                            do {
                                cpf = JOptionPane.showInputDialog("Cpf: ");
                                aux = primeirojava.Pessoa.validaCpf(cpf);
                                if (aux != 0) {
                                    JOptionPane.showMessageDialog(null, "O cpf não é válido, digite novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                                }
                            } while (aux != 0);
                            //data de nascimento
                            dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento no formato:\n dd/mm/aaaa: ");
                            dia = Integer.parseInt(dataNascimento.substring(0, 2));
                            mes = Integer.parseInt(dataNascimento.substring(3, 5));
                            ano = Integer.parseInt(dataNascimento.substring(6, 10));
                            telefone = JOptionPane.showInputDialog("Telefone: ");
                            cod = Integer.parseInt(JOptionPane.showInputDialog("Cód Func: "));
                            dpto = JOptionPane.showInputDialog("Departamento: ");
                            tec = new TecAdministrativo(dpto, cod, dia, mes, ano, nome, cpf, telefone);
                            break;
                        case 3:
                            //Cadastro Professor
                            nome = JOptionPane.showInputDialog("Nome: ");
                            //role de verificar o CPF
                            aux = 1;
                            do {
                                cpf = JOptionPane.showInputDialog("Cpf: ");
                                aux = primeirojava.Pessoa.validaCpf(cpf);
                                if (aux != 0) {
                                    JOptionPane.showMessageDialog(null, "O cpf não é válido, digite novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                                }
                            } while (aux != 0);
                            //data de nascimento
                            dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento no formato:\n dd/mm/aaaa: ");
                            dia = Integer.parseInt(dataNascimento.substring(0, 2));
                            mes = Integer.parseInt(dataNascimento.substring(3, 5));
                            ano = Integer.parseInt(dataNascimento.substring(6, 10));
                            telefone = JOptionPane.showInputDialog("Telefone: ");
                            cod = Integer.parseInt(JOptionPane.showInputDialog("Código Funcionário: "));
                            atuacao = JOptionPane.showInputDialog("Área: ");
                            prof = new Professor(atuacao, cod, dia, mes, ano, nome, cpf, telefone);
                            break;
                    }
                    break;

                case 2:
                    //Edição
                    opco = Integer.parseInt(JOptionPane.showInputDialog("***** Menu ***** \n 1 - Aluno \n 2 - Tec Administrativo \n 3 - Professor"));
                    switch (opco) {
                        case 1:
                            opcoes = Integer.parseInt(JOptionPane.showInputDialog("***** Atributos ***** \n 1 - Nome \n 2 - Cpf \n 3 - Data de Nascimento \n 4 - Telefone \n 5 - RA \n 6 - Ira"));
                            switch (opcoes) {
                                case 1:
                                    nome = JOptionPane.showInputDialog("Nome: ");
                                    a.setNome(nome);
                                    break;
                                case 2:
                                    //Falta fazer o role de verificar o cpf
                                    aux = 1;
                                    do {
                                        cpf = JOptionPane.showInputDialog("Cpf: ");
                                        aux = primeirojava.Pessoa.validaCpf(cpf);
                                        if (aux != 0) {
                                            JOptionPane.showMessageDialog(null, "O cpf não é válido, digite novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                                        }
                                    } while (aux != 0);
                                    a.setCpf(cpf);
                                    break;
                                case 3:
                                    //data de nascimento
                                    dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento no formato:\n dd/mm/aaaa: ");
                                    a.setDia(Integer.parseInt(dataNascimento.substring(0, 2)));
                                    a.setMes(Integer.parseInt(dataNascimento.substring(3, 5)));
                                    a.setAno(Integer.parseInt(dataNascimento.substring(6, 10)));
                                    break;
                                case 4:
                                    telefone = JOptionPane.showInputDialog("Telefone: ");
                                    a.setTelefone(telefone);
                                    break;
                                case 5:
                                    ra = Integer.parseInt(JOptionPane.showInputDialog("RA: "));
                                    a.setRa(ra);
                                    break;
                                case 6:
                                    ira = Float.parseFloat(JOptionPane.showInputDialog("IRA: "));
                                    a.setIra(ira);
                                    break;
                            }
                            break;
                        case 2:
                            opcoes = Integer.parseInt(JOptionPane.showInputDialog("***** Atributos ***** \n 1 - Nome \n 2 - Cpf \n 3 - Data de Nascimento \n 4 - Telefone \n 5 - Cod Funcionário \n 6 - Departamento"));
                            switch (opcoes) {
                                case 1:
                                    nome = JOptionPane.showInputDialog("Nome: ");
                                    tec.setNome(nome);
                                    break;
                                case 2:
                                    //Falta fazer o role de verificar o cpf
                                    aux = 1;
                                    do {
                                        cpf = JOptionPane.showInputDialog("Cpf: ");
                                        aux = primeirojava.Pessoa.validaCpf(cpf);
                                        if (aux != 0) {
                                            JOptionPane.showMessageDialog(null, "O cpf não é válido, digite novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                                        }
                                    } while (aux != 0);
                                    tec.setCpf(cpf);
                                    break;
                                case 3:
                                    //data de nascimento
                                    dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento no formato:\n dd/mm/aaaa: ");
                                    tec.setDia(Integer.parseInt(dataNascimento.substring(0, 2)));
                                    tec.setMes(Integer.parseInt(dataNascimento.substring(3, 5)));
                                    tec.setAno(Integer.parseInt(dataNascimento.substring(6, 10)));
                                    break;
                                case 4:
                                    telefone = JOptionPane.showInputDialog("Telefone: ");
                                    tec.setTelefone(telefone);
                                    break;
                                case 5:
                                    cod = Integer.parseInt(JOptionPane.showInputDialog("Cod Funcionário: "));
                                    tec.setCod(cod);
                                    break;
                                case 6:
                                    dpto = JOptionPane.showInputDialog("Departamento: ");
                                    tec.setDepartamento(dpto);
                                    break;
                            }
                            break;
                        case 3:
                            opcoes = Integer.parseInt(JOptionPane.showInputDialog("***** Atributos ***** \n 1 - Nome \n 2 - Cpf \n 3 - Data de Nascimento \n 4 - Telefone \n 5 - Cod Funcionário \n 6 - Área de Atuação"));
                            switch (opcoes) {
                                case 1:
                                    nome = JOptionPane.showInputDialog("Nome: ");
                                    prof.setNome(nome);
                                    break;
                                case 2:
                                    //Falta fazer o role de verificar o cpf
                                    aux = 1;
                                    do {
                                        cpf = JOptionPane.showInputDialog("Cpf: ");
                                        aux = primeirojava.Pessoa.validaCpf(cpf);
                                        if (aux != 0) {
                                            JOptionPane.showMessageDialog(null, "O cpf não é válido, digite novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                                        }
                                    } while (aux != 0);
                                    prof.setCpf(cpf);
                                    break;
                                case 3:
                                    //data de nascimento
                                    dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento no formato:\n dd/mm/aaaa: ");
                                    prof.setDia(Integer.parseInt(dataNascimento.substring(0, 2)));
                                    prof.setMes(Integer.parseInt(dataNascimento.substring(3, 5)));
                                    prof.setAno(Integer.parseInt(dataNascimento.substring(6, 10)));
                                    break;
                                case 4:
                                    telefone = JOptionPane.showInputDialog("Telefone: ");
                                    prof.setTelefone(telefone);
                                    break;
                                case 5:
                                    cod = Integer.parseInt(JOptionPane.showInputDialog("Cod Funcionário: "));
                                    prof.setCod(cod);
                                    break;
                                case 6:
                                    atuacao = JOptionPane.showInputDialog("Área de atuação: ");
                                    prof.setAtuação(atuacao);
                                    break;
                            }
                            break;
                    }
                    break;

                case 3:
                    //Consulta
                    opc = Integer.parseInt(JOptionPane.showInputDialog("***** Consulta ***** \n 1 - Aluno \n 2 - Tec Administrativo \n 3 - Professor"));
                    Calendar dataNascimentoCalendar;
                    Calendar dataAtual;
                    int idade;
                    switch (opc) {
                        case 1:
                            //Consulta Aluno (Falta arrumar a data de Nascimento e idade)
                            dataNascimentoCalendar = Calendar.getInstance();
                            dataNascimentoCalendar.set(a.getAno(), a.getMes() - 1, a.getDia());
                            dataAtual = Calendar.getInstance();
                            idade = dataAtual.get(Calendar.YEAR) - dataNascimentoCalendar.get(Calendar.YEAR);
                            if (dataAtual.get(Calendar.MONTH) < dataNascimentoCalendar.get(Calendar.MONTH)
                                    || (dataAtual.get(Calendar.MONTH) == dataNascimentoCalendar.get(Calendar.MONTH)
                                    && dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimentoCalendar.get(Calendar.DAY_OF_MONTH))) {
                                idade--;
                            }
                            JOptionPane.showMessageDialog(null, "***** Aluno *****\n\nNome: " + a.getNome()
                                    + "\nCpf: " + a.getCpf() + "\nTelefone: " + a.getTelefone() + "\nRA: " + a.getRa() + "\nIra: "
                                    + a.getIra() + "\nData de Nascimento" + a.getDia() + "/" + a.getMes() + "/" + a.getAno() + "\nIdade: " + idade);

                            break;
                        case 2:
                            //Consulta Téc Adm (Falta arrumar a data de Nascimento e idade)
                            dataNascimentoCalendar = Calendar.getInstance();
                            dataNascimentoCalendar.set(tec.getAno(), tec.getMes() - 1, tec.getDia());
                            dataAtual = Calendar.getInstance();
                            idade = dataAtual.get(Calendar.YEAR) - dataNascimentoCalendar.get(Calendar.YEAR);
                            if (dataAtual.get(Calendar.MONTH) < dataNascimentoCalendar.get(Calendar.MONTH)
                                    || (dataAtual.get(Calendar.MONTH) == dataNascimentoCalendar.get(Calendar.MONTH)
                                    && dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimentoCalendar.get(Calendar.DAY_OF_MONTH))) {
                                idade--;
                            }
                            JOptionPane.showMessageDialog(null, "***** Técnico Administrativo *****\n\nNome: " + tec.getNome()
                                    + "\nCpf: " + tec.getCpf() + "\nTelefone: " + tec.getTelefone() + "\nFuncionário: " + tec.getCod() + "\nIra: "
                                    + tec.getDepartamento() + "\nData de Nascimento" + tec.getDia() + "/" + tec.getMes() + "/" + tec.getAno()
                                    + "\nIdade: " + idade);
                            break;
                        case 3:
                            //Consulta Professor (Falta arrumar a data de Nascimento e idade)s
                            dataNascimentoCalendar = Calendar.getInstance();
                            dataNascimentoCalendar.set(prof.getAno(), prof.getMes() - 1, prof.getDia());
                            dataAtual = Calendar.getInstance();
                            idade = dataAtual.get(Calendar.YEAR) - dataNascimentoCalendar.get(Calendar.YEAR);
                            if (dataAtual.get(Calendar.MONTH) < dataNascimentoCalendar.get(Calendar.MONTH)
                                    || (dataAtual.get(Calendar.MONTH) == dataNascimentoCalendar.get(Calendar.MONTH)
                                    && dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimentoCalendar.get(Calendar.DAY_OF_MONTH))) {
                                idade--;
                            }
                            JOptionPane.showMessageDialog(null, "***** Professor *****\n\nNome: " + prof.getNome()
                                    + "\nCpf: " + prof.getCpf() + "\nTelefone: " + prof.getTelefone() + "\nFuncionário: " + prof.getCod() + "\nIra: "
                                    + prof.getAtuação() + "\nData de Nascimento" + prof.getDia() + "/" + prof.getMes() + "/" + prof.getAno()
                                    + "\nIdade: " + idade);
                            break;
                    }
                    
                    break;
            }

        } while (op != 0);
        System.exit(0);
    }

}
