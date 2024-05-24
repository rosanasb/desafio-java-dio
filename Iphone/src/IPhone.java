public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean ligado;

    public IPhone() {
        this.ligado = false;
    }
    @Override
    public void tocar() {
        if (ligado) {
            System.out.println("Reproduzindo musica.");
        } else {
            System.out.println("Nao eh possivel reproduzir musica. O iPhone esta desligado.");
        }
    }
    @Override
    public void pausar() {
        if (ligado) {
            System.out.println("Musica pausada.");
        } else {
            System.out.println("Nao eh possivel pausar musica. O iPhone esta desligado.");
        }
    }
    @Override
    public void selecionarMusica(String musica) {
        if (ligado) {
            System.out.println("Musica selecionada: " + musica);
        } else {
            System.out.println("Nao eh possivel selecionar musica. O iPhone esta desligado.");
        }
    }
    @Override
    public void ligar(String numero) {
        if (ligado) {
            System.out.println("Ligando para: " + numero);
        } else {
            System.out.println("Nao eh possivel fazer chamada. O iPhone esta desligado.");
        }
    }
    @Override
    public void atender() {
        if (ligado) {
            System.out.println("Atendendo chamada.");
        } else {
            System.out.println("Nao eh possivel atender chamada. O iPhone esta desligado.");
        }
    }
    @Override
    public void iniciarCorreioVoz() {
        if (ligado) {
            System.out.println("Iniciando correio de voz.");
        } else {
            System.out.println("Nao eh possivel iniciar correio de voz. O iPhone esta desligado.");
        }
    }
    @Override
    public void exibirPagina(String url) {
        if (ligado) {
            System.out.println("Exibindo pagina: " + url);
        } else {
            System.out.println("Nao eh possivel exibir pagina. O iPhone esta desligado.");
        }
    }
    @Override
    public void adicionarNovaAba() {
        if (ligado) {
            System.out.println("Nova aba adicionada.");
        } else {
            System.out.println("Nao eh possivel adicionar nova aba. O iPhone esta desligado.");
        }
    }
    @Override
    public void atualizarPagina() {
        if (ligado) {
            System.out.println("Pagina atualizada.");
        } else {
            System.out.println("Nao eh possivel atualizar pagina. O iPhone esta desligado.");
        }
    }
    public void ligarIPhone() {
        if (!ligado) {
            ligado = true;
            System.out.println("iPhone esta ligado.");
        } else {
            System.out.println("iPhone ja esta ligado.");
        }
    }
    public void desligarIPhone() {
        if (ligado) {
            ligado = false;
            System.out.println("iPhone esta desligado.");
        } else {
            System.out.println("iPhone ja esta desligado.");
        }
    }
}

