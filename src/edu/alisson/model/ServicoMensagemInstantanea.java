package edu.alisson.model;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected abstract void validarConectadoInternet();

    protected abstract void salvarHistoricoMensagem();
}
