package controlheRestaurante

class Cardapio {

    def cardapioBebidas = [1:"Cafe", 2: "Agua", 3:"Suco", 4:"Drink", 5:"Bebida Alcoolica"];

    def listarCardapio(){

      return cardapioBebidas;
    }

    def adicionarItem(codigo, nome){

      cardapioBebidas.put(codigo, nome)

      println(cardapioBebidas);

      return cardapioBebidas;
    }
}
