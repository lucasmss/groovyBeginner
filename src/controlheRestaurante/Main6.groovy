package controlheRestaurante

import controlheRestaurante.enums.TipoCardapio

static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);
  Cardapio cardapio = new Cardapio();
  Mesa mesa = new Mesa();

  def cadastrarMesas;

  //popular o cardapio com alguns valores ai iniciar o sistema;
  Cardapio item1 = new Cardapio(TipoCardapio.BEBIDA, 1, "Café", 2.50);
  Cardapio item2 = new Cardapio(TipoCardapio.SOBREMESA, 12, "Bolo", 5.50);
  Cardapio item3 = new Cardapio(TipoCardapio.REFEICAO, 11, "Pizza", 10.50);

  cardapio.adicionarItem(item1.itemCodigo,item1);
  cardapio.adicionarItem(item2.itemCodigo, item2);
  cardapio.adicionarItem(item3.itemCodigo, item3);

  println("Bem vindo ao Restaurante Comida Caseira");
  println("Deseja adicionar algo no cardapio ? Sim (1) Não (2)");
  def cadastrarIten = entrada.nextInt();

  while (cadastrarIten == 1){
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
    }else if (itemCardapio == 2){
      Cardapio itemAdd = new Cardapio(TipoCardapio.REFEICAO, itemCodigo, itemNome, itemPreco)
      cardapio.adicionarItem(itemCodigo, itemAdd)
    }else if (itemCardapio == 3){
      Cardapio itemAdd = new Cardapio(TipoCardapio.SOBREMESA, itemCodigo, itemNome, itemPreco)
      cardapio.adicionarItem(itemCodigo, itemAdd)
    }

    println("Cadastrar mais itens ? Sim (1) ou Não (2)");
    cadastrarIten = entrada.nextInt();
    println()
  }

  mesa.cadastrarMesa(1);
  mesa.cadastrarMesa(2);
  mesa.cadastrarMesa(3);

  println("Temos 3 mesas. Precisa adicionar mais ? Sim (1) Não (2)")
  cadastrarMesas = entrada.nextInt();

  while (cadastrarMesas == 1){
    println("Digite o Número da nova mesa");
    def mesaNova = entrada.nextInt();

    println("mesa nova: " + mesaNova);

    mesa.cadastrarMesa(mesaNova)

    println("Cadastrar mais mesas ? Sim (1) ou Não (2)");
    cadastrarMesas = entrada.nextInt();
    println()
  }

  println(mesa.listarMesas())

  println("Selecione uma Opção: 1 - Listar Cardapio, 2 - Cadastrar Item no Cardapio, 3 - Cadastrar Mesa. 4 - Sair ")
  def opcao = entrada.nextInt()

  if (opcao == 1){
    cardapio.listarCardapio();
  }else if(opcao == 4){
    println("saiu")
  }




}