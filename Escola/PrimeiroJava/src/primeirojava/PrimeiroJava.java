package primeirojava;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class PrimeiroJava {

        static boolean validaData2(int d, int m, int a){
        
        if((m >= 1) && (m <= 12)){
            int diasPorMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if((d>0) && (d<=diasPorMes[m]))
                return true;
            else if((m==2) && (d==29) && (((a%4==0) && (a%100!=0)) || (a%400==0)))
                return true;
        }
        return false;
    } //Fim validaData2()

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, 
                "Hello World!\nBem vindo ao meu primeiro programa Java");
        System.out.println("Hello World!");
        System.out.print("Este é ");
        System.out.println("o primeiro programa da disciplina no Netbeans.");
        
        Pessoa p = new Pessoa();
        
        p.setNome(JOptionPane.showInputDialog("Digite seu nome."));
        
        int d, m, a;
        boolean dataValida;
        Calendar hoje = Calendar.getInstance();
        Calendar nascimento = Calendar.getInstance();
        
        do{
            d = Integer.parseInt(JOptionPane.showInputDialog("Dia do nascimento."));
            m = Integer.parseInt(JOptionPane.showInputDialog("Mês do nascimento."));
            a = Integer.parseInt(JOptionPane.showInputDialog("Ano do nascimento."));
            dataValida = validaData2(d, m, a);
            if(dataValida){
                nascimento.set(a, m - 1, d);
                if(hoje.before(nascimento))
                    dataValida = false;
            }
            if(!dataValida){
                JOptionPane.showMessageDialog(null, "Data inválida!", 
                                              "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } while(!dataValida);
        p.setDataNasc(d, m, a);
        
        JOptionPane.showMessageDialog(null, p.getNome() + " - " + p.getDataNasc());
    } //Fim do main()
    
} //Fim classe PrimeiroJava