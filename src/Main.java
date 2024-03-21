public class Main{
    public static void main(String[] args) {
        //Cadastro do primeiro cliente com seus filme locados.
        Cliente c1 = new Cliente("Gabriel", 21);
        Locacao l1 = new Locacao(c1); //Colocando o objeto "c1" na classe "Locacao".
        Filmes filme01 = new Filmes("Vingadores","Ação e Aventura", 133);
        Filmes filme02 = new Filmes("Avatar", "Ação e Aventura", 150);
        l1.setFilmesAlugados(filme01); //Colocando os filmes locados (objetos) na classe "Locacao".
        l1.setFilmesAlugados(filme02);
        l1.mostrarLocacoesCliente(); //Mostrando os filmes locados pelo cliente.
        //
        System.out.println("\nOutro cliente:\n");
        //
        //Cadastro do segundo cliente com seus filme locados.
        Cliente c2 = new Cliente("Gustavo", 20);
        Locacao l2 = new Locacao(c2);
        Filmes filme03 = new Filmes("Ta Chovendo Hamburguer", "Animação e Comédia", 110);
        l2.setFilmesAlugados(filme03);
        l2.mostrarLocacoesCliente();
    }
}