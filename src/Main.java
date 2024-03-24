public class Main{
    public static void main(String[] args) {
        //Cadastro do primeiro cliente com seus filme locados.
        Cliente c1 = new Cliente("Gabriel", 21);
        Locacao l1 = new Locacao(c1); //Colocando o objeto "c1" na classe "Locacao".
        Filmes filme01 = new Filmes("Vingadores","Ação e Aventura", 133);
        Filmes filme02 = new Filmes("Avatar", "Ação e Ficção Científica", 145);
        l1.addFilme(filme01); //Colocando os filmes locados (objetos) na classe "Locacao".
        l1.addFilme(filme02);
        l1.mostrarFilmes(); //Mostrando os filmes locados pelo cliente.
        c1.verificarIdade();
        //
        System.out.println("\nOutro cliente:\n");
        //
        //Cadastro do segundo cliente com seus filme locados.
        Cliente c2 = new Cliente("Gustavo", 20);
        Locacao l2 = new Locacao(c2);
        Filmes filme03 = new Filmes("Ta Chovendo Hambúrguer", "Infantil e Comédia", 78);
        l2.addFilme(filme03);
        l2.mostrarFilmes();
    }
}