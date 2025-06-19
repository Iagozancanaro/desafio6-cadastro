import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Criando a LinkedList de Ninjas
        LinkedList<Ninjas> ninjasLinkedList = new LinkedList<>();

        //Adicionando os ninjas na LinkedList
        ninjasLinkedList.add(new Ninjas("Naruto Uzumaki", 17, "Konoha"));
        ninjasLinkedList.add(new Ninjas("Sasuke Uchiha", 18, "Konoha"));
        ninjasLinkedList.add(new Ninjas("Sakura Haruno", 16, "Konoha"));
        ninjasLinkedList.add(new Ninjas("Kakashi Hatake", 30, "Konoha"));
        ninjasLinkedList.add(new Ninjas("Hinata Hyuga", 18, "Konoha"));
        ninjasLinkedList.add(new Ninjas("Killer Bee", 25, "Kumogakure"));
        ninjasLinkedList.add(new Ninjas("Rock Lee", 23, "Konoha"));

       int opcao = 0;

        do {
            //Menu
            System.out.println("--------------MENU--------------");
            System.out.println("1 - Exibir lista completa");
            System.out.println("2 - Remover primeiro ninja da lista");
            System.out.println("3 - Adicionar um novo ninja no inicio da lista");
            System.out.println("4 - Acessar ninja em uma posição especifica");
            System.out.println("5 - Sair do programa");
            System.out.println("--------------X--------------");

            System.out.println("Escolha a opção que deseja");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir linha

            switch (opcao) {
                case 1:
                    // Exibir lista de ninjas
                    System.out.println("--------------Lista Completa--------------");
                    for (Ninjas ninja : ninjasLinkedList) {
                        System.out.println(ninja);
                    }
                    break;

                case 2:
                    // Remover primeiro ninja da lista
                    if (!ninjasLinkedList.isEmpty()){
                        Ninjas removido = ninjasLinkedList.removeFirst();
                        System.out.println("Ninja removido : " + removido);
                    } else {
                        System.out.println("A lista já esta vazia! Não há mais ninjas para remover.");
                    }
                    break;

                case 3:
                    // Adicionar novo ninja no inicio da lista
                    System.out.println("Vamos adicionar um novo ninja no cadastro.");
                    System.out.println("Primeiro digite o nome do ninja: ");
                    String nomeNinja = scanner.nextLine();
                    System.out.println("Agora digite a idade do ninja: ");
                    int idadeNinja = scanner.nextInt();
                    scanner.nextLine(); // consumir linha
                    System.out.println("Por fim, digite a vila em que esse ninja reside: ");
                    String vilaNinja = scanner.nextLine();

                    Ninjas novoNinja = new Ninjas(nomeNinja, idadeNinja, vilaNinja);
                    ninjasLinkedList.addFirst(novoNinja);
                    System.out.println("Novo ninja adicionado com sucesso");
                    break;

                case 4:
                    // Acessar ninja em posição específica
                    System.out.println("Digite qual a posição do ninja que deseja acessar: ");
                    int posicaoNinja = scanner.nextInt();
                    scanner.nextLine(); // consumir linha

                    if (posicaoNinja >= 0 && posicaoNinja < ninjasLinkedList.size()) {
                        System.out.println(ninjasLinkedList.get(posicaoNinja));
                    } else {
                        System.out.println("Posição inválida! A lista tem " +ninjasLinkedList.size()+ " elementos.");
                    }
                    break;

                case 5:
                    System.out.println("Finalizando o programa! ");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;
            }

        } while (opcao != 5);

        scanner.close();
    }
}

