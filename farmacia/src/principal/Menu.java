package principal;

import java.util.Scanner;

public class Menu {
  public void gerarMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("=====FARMACIA=====");
    System.out.println("[1] Funcionarios");
    System.out.println("[2] Clientes");
    System.out.println("[3] Remedios");
    System.out.println("[4] Sair");

    int opcao = sc.nextInt();

    switch (opcao) {
      case 1:
        
        break;
    
      case 2:

        break;
      case 3:

        break;
      case 4:
      
        break;
    }
    sc.close();
  }
}
