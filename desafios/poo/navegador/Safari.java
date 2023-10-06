package components.navegador;

public interface Navegador {
    public void exibirPagina(String url);
    public void adicionarNovaAba(String url);
    public void atualizarPagina(String url);
}

public class Safari implements Navegador {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a página " + url);
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando página " + url);
    }
}