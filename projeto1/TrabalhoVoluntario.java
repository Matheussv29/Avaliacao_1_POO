package br.com.newton.poo.projeto;

public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario() {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto() {
        if(duracaoTrabalho>2) {
            return true;
        }
        else {
            return false;
        }
    }
    public String imprimeProjeto() {
        String retorno2 =nomeProjeto, descricao,endereco,  datainicio, datafim,  tipoTrabalho, duracaoTrabalho;
        return retorno2;

    }
}
