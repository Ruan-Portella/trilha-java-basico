import components.navegador.Safari;
import components.reprodutor.ITunes;
import components.aparelho.Telefone;

public class Iphone implements Safari, Telefone, Navegador {
    public void versao() {
        System.out.println("Versão 1.0");
    }
}

