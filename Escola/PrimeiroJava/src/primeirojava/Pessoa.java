package primeirojava;

import static java.lang.Character.digit;
import java.util.Calendar;

public class Pessoa {
   private String nome;
   private int diaNasc, mesNasc, anoNasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
       
   public String getDataNasc(){
       return diaNasc + "/" + mesNasc + "/" + anoNasc;
   }
   
   public void setDataNasc(int dn, int mn, int an){
       diaNasc = dn;
       mesNasc = mn;
       anoNasc = an;
   }
   
   private int calculaIdade(){
       int id, da, ma, aa;
       
       Calendar hoje = Calendar.getInstance();
       
       da = hoje.get(Calendar.DAY_OF_MONTH);
       ma = hoje.get(Calendar.MONTH)+1;
       aa = hoje.get(Calendar.YEAR);
       
       id = aa - anoNasc;
       if(ma < mesNasc) id--;
       else if((ma == mesNasc) && (da < diaNasc)) id--;
       
       return id;
   }
   
   private int calculaIdade2(){
       int id, da, aa, dn, an;
       
       Calendar data = Calendar.getInstance();
       
       da = data.get(Calendar.DAY_OF_YEAR);
       aa = data.get(Calendar.YEAR);
       
       data.set(anoNasc, mesNasc-1, diaNasc);
       dn = data.get(Calendar.DAY_OF_YEAR);
       an = data.get(Calendar.YEAR);
       
       id = aa - an;
       if(da < dn) id--;
       
       return id;
   }
   
   public int getIdade(){
       return calculaIdade2();
   }
   
      private static boolean algumNaoNumerico(String cpf){
       String digitos = "0123456789";
       
       for(int i = 0; i <cpf.length(); i++){
           if(digitos.indexOf(cpf.charAt(i)) == -1) return true;
       }
       return false;
   }
   
   private static boolean digitosIguais(String cpf){
       int i;
       
       char[] charCpf = cpf.toCharArray();
       for(i = 1; i < cpf.length(); i++)
           if(charCpf[i]!= charCpf[0]) return false;
       return true;
   }
   
   public static int validaCpf(String cpf){
       int i;
       int soma=0;
       int resto=0;
       int digitoGerado1, digitoGerado2;
       char[] charCpf;
       
       if(cpf.length() != 11) return 1;
       else if(algumNaoNumerico(cpf)) return 2;
       else if(digitosIguais(cpf)) return 3;
       else{
           charCpf = cpf.toCharArray();
           //Gerando o 1º dígito verificador
           for(i = 0; i < cpf.length()-2; i++)
               soma += digit(charCpf[i], 10)*(10-i);
           resto = soma % 11;
           if(resto < 2) digitoGerado1 = 0;
           else digitoGerado1 = 11 - resto;
           //Gerando o 2º dígito verificador
           soma = 0;
           for(i = 0; i < cpf.length()-2; i++)
               soma += digit(charCpf[i], 10)*(11-i);
           soma += digitoGerado1 * 2;
           resto = soma % 11;
           if(resto < 2) digitoGerado2 = 0;
           else digitoGerado2 = 11 - resto;
           if((digit(charCpf[9], 10) != digitoGerado1) ||
               (digit(charCpf[10], 10) != digitoGerado2))
               return 4;
       }
       
       return 0;
   }
   
} //Fim classe Pessoa
