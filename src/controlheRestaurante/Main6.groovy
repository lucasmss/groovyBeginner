package controlheRestaurante

import controlheRestaurante.enums.TipoCardapio

static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);
  Cardapio cardapio = new Cardapio();
  Mesa mesa = new Mesa();

  def cadastrarMesas;
  def cadastrarIten;
  def opcao;

  //Popular o cardapio com alguns valores ao iniciar o sistema;
  Cardapio item1 = new Cardapio(TipoCardapio.BEBIDA, 1, "Café", 2.50);
  Cardapio item2 = new Cardapio(TipoCardapio.SOBREMESA, 12, "Bolo", 5.50);
  Cardapio item3 = new Cardapio(TipoCardapio.REFEICAO, 11, "Pizza", 10.50);

  //chama o metodo para popular o cardapio;
  cardapio.adicionarItem(item1.itemCodigo, item1);
  cardapio.adicionarItem(item2.itemCodigo, item2);
  cardapio.adicionarItem(item3.itemCodigo, item3);

  //chama o metodo para popular mesas
  mesa.cadastrarMesa(1);
  mesa.cadastrarMesa(2);
  mesa.cadastrarMesa(3);

  //inicio do sistema
  println("Bem vindo ao Restaurante Comida Caseira - Vamos Iniciar o Sistema");
  println("Deseja adicionar algo no cardapio ? Sim (1) Não (2)");
  cadastrarIten = entrada.nextInt();

  while (cadastrarIten == 1) {
    println("O que deseja adicionar: Bebida - (1), Refeição - (2), Sobremesa - (3) ");
    def itemCardapio = entrada.nextInt();

    println("Digite o código do item - código precisa ser diferente dos existentes: ");
    def itemCodigo = entrada.nextInt();

    println("Digite o nome do novo item: ");
    def itemNome = entrada.next();

    println("Digite o preço do novo item: ");
    def itemPreco = entrada.nextDouble()

    println("teste: " + itemCardapio + " codigo: " + itemCodigo + " nome: " + itemNome + " preço: " + itemPreco);

    if (itemCardapio == 1) {
      Cardapio itemAdd = new Cardapio(TipoCardapio.BEBIDA, itemCodigo, itemNome, itemPreco)
      cardapio.adicionarItem(itemCodigo, itemAdd)
    } else if (itemCardapio == 2) {
      Cardapio itemAdd = new Cardapio(TipoCardapio.REFEICAO, itemCodigo, itemNome, itemPreco)
      cardapio.adicionarItem(itemCodigo, itemAdd)
    } else if (itemCardapio == 3) {
      Cardapio itemAdd = new Cardapio(TipoCardapio.SOBREMESA, itemCodigo, itemNome, itemPreco)
      cardapio.adicionarItem(itemCodigo, itemAdd)
    }

    println("Cadastrar mais itens ? Sim (1) ou Não (2)");
    cadastrarIten = entrada.nextInt();
    println()
  }

  println("Adicionar mais Mesas ? Sim (1) Não (2)")
  cadastrarMesas = entrada.nextInt();

  while (cadastrarMesas == 1) {
    println("Digite o Número da nova mesa");
    def mesaNova = entrada.nextInt();

    println("mesa nova: " + mesaNova);

    mesa.cadastrarMesa(mesaNova)

    println("Cadastrar mais mesas ? Sim (1) ou Não (2)");
    cadastrarMesas = entrada.nextInt();
    println()
  }

  println(mesa.listarMesas())
  println("Estamos Porntos para Funcionar - Vamos Utilizar o Sistema");

  do {
    println("Selecione uma Opção: 1 - Listar Cardapio, 2 - Adicionar pedido a mesa, 3 - Consultar mesa. 4 - Sair ")
    opcao = entrada.nextInt()

    switch (opcao){
      case 1:
        cardapio.listarCardapio();
        break;

      case 2:
        break;
    }

  }while (opcao != 4)

}