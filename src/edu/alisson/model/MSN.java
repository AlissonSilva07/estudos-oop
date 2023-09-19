package edu.alisson.model;

public class MSN extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem via MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via MSN");
    }

    @Override
    protected void validarConectadoInternet() {

    }

    @Override
    protected void salvarHistoricoMensagem() {

    }
}
