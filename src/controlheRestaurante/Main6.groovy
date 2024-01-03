package controlheRestaurante

import controlheRestaurante.enums.TipoCardapio

static void main(String[] args) {

   Scanner entrada = new Scanner(System.in);

   def cadastrarMesas;

   //Cardapio cardapio = new Cardapio();

   //popular o cardapio com alguns valores ai iniciar o sistema;
   Cardapio item1 = new Cardapio(TipoCardapio.BEBIDA, 1, "Café", 2.50);
   Cardapio item2 = new Cardapio(TipoCardapio.SOBREMESA, 12, "Bolo", 5.50);
   Cardapio item3 = new Cardapio(TipoCardapio.REFEICAO, 11, "Pizza", 10.50);

   def cardapio = [];

   cardapio.add(item1);
   cardapio.add(item2);
   cardapio.add(item3);
//
//   //def cardapioBebidas = [1:[1:"Cafe", preco: 2.50], 2:[2: "Agua", preco: 4.0], 3:[3:"Suco", preco: 7.0], 4:[4:"Drink", preco: 14.0], 5:[5:"Bebida Alcoolica", preco: 10.0]];
//   //def cardapioComidas = [1:"Pizzas", 2:"Massas", 3:"Refeições", 4:"Rodizios"];
//   //def cardapioSobremesas = [1: "Pudim", 2:"Bolo", 3:"Sorvete"];
//
//   println("Bem vindo ao Restaurante Comida Caseira");
//   println("Deseja adicionar algo no cardapio ? Sim (1) Não (2)");
//   def cadastrarIten = entrada.nextInt();
//
//   while (cadastrarIten == 1){
//     println("Cardapio atual: " + cardapio);
//     println("O que deseja adicionar: Bebida - (1), Refeição - (2), Sobremesa - (3) ");
//     def itemCardapio = entrada.nextInt();
//
//     println("Digite o código do item - código precisa ser diferente dos existentes: ");
//     def itemCodigo = entrada.nextInt();
//
//     println("Digite o nome do novo item: ");
//     def itemNome = entrada.next();
//
//     println("Digite o preço do novo item: ");
//     def itemPreco = entrada.nextDouble()
//
//     println("teste: " + itemCardapio + " codigo: " + itemCodigo + " nome: " + itemNome + " preço: " + itemPreco);
//
//     if (itemCardapio == 1) {
//       Cardapio itemAdd = new Cardapio(TipoCardapio.BEBIDA, itemCodigo, itemNome, itemPreco)
//       cardapio.add(itemAdd)
//     }else if (itemCardapio == 2){
//       Cardapio itemAdd = new Cardapio(TipoCardapio.REFEICAO, itemCodigo, itemNome, itemPreco)
//       cardapio.add(itemAdd)
//     }else if (itemCardapio == 3){
//       Cardapio itemAdd = new Cardapio(TipoCardapio.SOBREMESA, itemCodigo, itemNome, itemPreco)
//       cardapio.add(itemAdd)
//     }
//
//     println("NOVO: " + cardapio.sort())
//
//     println("Cadastrar mais itens ? Sim (1) ou Não (2)");
//     cadastrarIten = entrada.nextInt();
//     println()
//   }

  def mesas = [];

  Mesa mesa1 = new Mesa(1, null);
  Mesa mesa2 = new Mesa(2, null);
  Mesa mesa3 = new Mesa(3, null);

  mesas.add(mesa1);
  mesas.add(mesa2);
  mesas.add(mesa3);

   println("Temos 3 mesas. Precisa adicionar mais ? Sim (1) Não (2)")
   cadastrarMesas = entrada.nextInt();

  while (cadastrarMesas == 1){
     println("Número de mesas atual: " + mesas);
     println("Digite o Número da nova mesa");
     def mesaNova = entrada.nextInt();

     println("mesa nova: " + mesaNova);

    Mesa addMesa = new Mesa(mesaNova, null)

    mesas.add(addMesa)

    println("NOVO: " + mesas)

    println("Cadastrar mais mesas ? Sim (1) ou Não (2)");
    cadastrarMesas = entrada.nextInt();
    println()
  }


  println(mesas)






  }