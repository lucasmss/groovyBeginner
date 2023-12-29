package controlheRestaurante

 static void main(String[] args) {

   Scanner entrada = new Scanner(System.in);
   Cardapio cardapio = new Cardapio();

   println("Bem vindo ao Restaurante Comida Caseira");
   println("Deseja adicionar algo no cardapio ? Sim (1) Não (2)");
   def cadastrarIten = entrada.nextInt();

   while (cadastrarIten == 1){
     println("Cardapio atual:  " + cardapio.listarCardapio());
     println("O que deseja adicionar: Bebida - (1), Alimento - (2), Sobremesa - (3) ");
     def itemCardapio = entrada.nextInt();

     println("Digite o código do item - código precisa ser diferente dos existentes: ");
     def itemCodigo = entrada.nextInt();

     println("Digite o nome do novo item: ");
     def itemNome = entrada.next();

     switch (itemCardapio){

       case 1:
         cardapio.adicionarItem(itemCodigo, itemNome);
         break

       case 2:
         break
     }

     println("Cadastrar mais itens ? Sim (1) ou Não (2)");
     cadastrarIten = entrada.nextInt();
   }

  }