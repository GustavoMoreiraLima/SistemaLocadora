import java.util.ArrayList;

public class Locacao {
    Cliente cliente;
    ArrayList<Filmes> filmes;

    public Locacao(Cliente cliente){
        this.cliente = cliente;
        filmes = new ArrayList<Filmes>();
    }
    public void addFilme(Filmes filme){
        filmes.add(filme);
    }
    public void mostrarFilmes(){
        System.out.println("O Cliente: " + cliente.getNome());
        System.out.println("Locou: ");
        for (int x = 0; x < filmes.size(); x++){
            System.out.println(filmes.get(x).getTitulo());
        }
    }
}