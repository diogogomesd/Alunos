package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
    private String registroEducação;
    private int tempoDireção;
    private String titulacao;
    private String login;
    private String senha;

    public Diretor(String login, String senha) {
        //super();
        this.login = login;
        this.senha = senha;
    }

    public String getRegistroEducação() {
        return registroEducação;
    }

    public void setRegistroEducação(String registroEducação) {
        this.registroEducação = registroEducação;
    }

    public int getTempoDireção() {
        return tempoDireção;
    }

    public void setTempoDireção(int tempoDireção) {
        this.tempoDireção = tempoDireção;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "registroEducação='" + registroEducação + '\'' +
                ", tempoDireção=" + tempoDireção +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }
    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }
}
