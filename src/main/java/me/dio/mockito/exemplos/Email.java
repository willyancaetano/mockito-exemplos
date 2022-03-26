package me.dio.mockito.exemplos;

public class Email {

    private String enderecoEmail;

    private String mensagem;

    private Formato formato;

    public Email(String enderecoEmail, String mensagem, Formato formato) {
        this.enderecoEmail = enderecoEmail;
        this.mensagem = mensagem;
        this.formato = formato;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Formato getFormato() {
        return formato;
    }
}
