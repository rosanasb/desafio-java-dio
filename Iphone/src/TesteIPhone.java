public class TesteIPhone {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.ligarIPhone();
        meuIPhone.selecionarMusica("Save Me by Jelly Roll");
        meuIPhone.tocar();
        meuIPhone.pausar();

        meuIPhone.ligar("99880-1156");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();

        meuIPhone.desligarIPhone();
    }
}
