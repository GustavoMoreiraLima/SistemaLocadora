public class Filmes {
    private String titulo;
    private String genero;
    private int duracao;
    public Filmes(String titulo, String genero, int duracao){
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getDuracao(){
        return this.duracao;
    }
}
