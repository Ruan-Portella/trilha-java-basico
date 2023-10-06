package components.aparelho;

public interface AparelhoTelefonico {
    public void ligar(String numero);
    public void atender(String numero);
    public void iniciarCorreioVoz(String numero);
}

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println("Iniciando correio de voz para " + numero);
    }
}