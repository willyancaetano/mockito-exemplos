package me.dio.mockito.exemplos;

import java.util.UUID;

public class Mensagem {

    private String id;

    private String mensagem;

    public Mensagem(final String mensagem) {
        this.id = UUID.randomUUID().toString();
        this.mensagem = mensagem;
    }

    public String getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

}
