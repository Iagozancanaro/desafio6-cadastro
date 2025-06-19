public class Ninjas {

    String nome;
    int idade;
    String vila;

    public Ninjas() {
    }

    public Ninjas(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getVila() {
        return vila;
    }

    @Override
    public String toString() {
        return "Meu nome é: " +nome+ ", tenho " +idade+ " anos e vivo na Vila " +vila+ ".";
    }

}
