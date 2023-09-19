package edu.alisson.model;

public class Facebook extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem via Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via Facebook");
    }

    @Override
    protected void validarConectadoInternet() {

    }

    @Override
    protected void salvarHistoricoMensagem() {

    }
}
