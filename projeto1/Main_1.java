package br.com.newton.poo.projeto;
import javax.swing.*;
public class Main_1 {

    public static void main(String[] args){
        String nomeProjeto, descricao, endereco,datainicio,datafim,descAliemto, tipoTrabalho;
        int duracaoTrabalho, opcao;
        float qtde;

        do {
            opcao = Integer.parseInt((String) JOptionPane.showInputDialog("Escolha uma opção a baixo:\n\n<1>  Distribuir Alimentos\n<2>  Trabalho Voluntario\n<3>  Sair"));
switch (opcao){
    case 1:
       DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento();

        String retorno = distribuicaoAlimento.imprimeProjeto();

        JOptionPane.showMessageDialog(null,retorno , " Menssagem ", JOptionPane.DEFAULT_OPTION);
        break;



    case 2:
        TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario();

        String retorno2 = trabalhoVoluntario.imprimeProjeto();

        JOptionPane.showMessageDialog(null,retorno2 , " Menssagem ", JOptionPane.DEFAULT_OPTION);
        break;

    case 3:
    default:

        break;
}
        }while(opcao!=3);

    }
}
