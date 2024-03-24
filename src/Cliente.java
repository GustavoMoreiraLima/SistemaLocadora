public class Cliente {
    private String nome;
    private int idade;
    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void verificarIdade(){
        if (getIdade() > 18){
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade");
        }
    }
}
