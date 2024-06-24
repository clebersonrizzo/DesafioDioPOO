public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Chamando métodos do ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Nome da Música");

        // Chamando métodos do AparelhoTelefonico
        iphone.fazerLigacao("123456789");
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();

        // Chamando métodos do NavegadorInternet
        iphone.exibirPagina("https://exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
