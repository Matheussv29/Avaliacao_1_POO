package br.com.newton.poo.projeto3;
import javax.swing.*;

public class Main_Mensalidade {


    public static void main(String[] args){
         double valorMensalidade;
         int numeroIrmaos;

        Mensalidade mensalidade = new Mensalidade(1000,3 );

        double valorFinal = mensalidade.calcularMensalidade();

        JOptionPane.showMessageDialog(null,"Valor da mensalidade: "+ valorFinal , " Menssagem ", JOptionPane.DEFAULT_OPTION);

    }


}
