package br.com.newton.poo.projeto;

public class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento() {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }



    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto() {
        if(datafim.equals(0)) {
            return true;
        }
         else {
            return false;
        }
    }

    public String imprimeProjeto() {
        String retorno = nomeProjeto, descricao, datainicio, datafim, descAlimento , qtde;
        return retorno;

    }


}
