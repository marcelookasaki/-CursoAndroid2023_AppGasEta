package dev.omy.appgaseta.model;

public class Pessoa {

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telContato;

    public Pessoa() {
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelContato() {
        return telContato;
    }

    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome ='" + primeiroNome + '\'' +
                ", sobreNome ='" + sobreNome + '\'' +
                ", cursoDesejado ='" + cursoDesejado + '\'' +
                ", telefoneContato ='" + telContato + '\'' +
                '}';
    }


}
