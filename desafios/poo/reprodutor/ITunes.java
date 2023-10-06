package components.reprodutor;

public interface ITunes {
    public void tocar(String nomeMusica);
    public void pausar(String nomePodcast);
    public void selecionarMusica(String nomeVideo);
}

public class Reprodutor implements ITunes {
    @Override
    public void tocar(String nomeMusica) {
        System.out.println("Tocando " + nomeMusica);
    }

    @Override
    public void pausar(String nomePodcast) {
        System.out.println("Pausando " + nomePodcast);
    }

    @Override
    public void selecionarMusica(String nomeVideo) {
        System.out.println("Selecionando " + nomeVideo);
    }
}