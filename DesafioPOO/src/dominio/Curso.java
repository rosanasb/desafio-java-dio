package dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(){

    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }
    public String toString(){
        return "Mentoria{" + "titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", carga horaria = " + cargaHoraria;
    }
}