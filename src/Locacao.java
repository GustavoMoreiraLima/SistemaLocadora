import java.util.ArrayList;

public class Locacao {
    ArrayList<Filmes> filmesAlugados = new ArrayList<Filmes>();
    private String cliente;
    private String filmesLocados;
    public Locacao(Cliente cliente) {
        this.cliente = cliente.getNome();
    }

    public void setFilmesAlugados(Filmes filme) {
        filmesAlugados.add(filme);
        filmesLocados = filme.getTitulo();
    }
    public void mostrarLocacoesCliente(){
        String nc = cliente;
        String nf = filmesLocados;
        System.out.println("O Cliente: \n" + nc + "\nPossui tais filmes locados: \n" + nf);
    }
}