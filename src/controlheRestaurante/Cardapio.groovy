package controlheRestaurante

import controlheRestaurante.enums.TipoCardapio

class Cardapio {

  TipoCardapio itemTipo;
  def itemCodigo;
  def itemNome;
  def itemPreco;

  Cardapio() {
  }

  Cardapio(TipoCardapio itemTipo, itemCodigo, itemNome, itemPreco) {
    this.itemTipo = itemTipo
    this.itemCodigo = itemCodigo
    this.itemNome = itemNome
    this.itemPreco = itemPreco
  }

  def cardapio = [:];

  def listarCardapio(){

    println(cardapio)

  }

  def buscarPedido(numeroitem){
    cardapio.get(numeroitem)
  }

  def adicionarItem(codigo, item){

    cardapio.put(codigo, item)

  }

  TipoCardapio getItemTipo() {
    return itemTipo
  }

  void setItemTipo(TipoCardapio itemTipo) {
    this.itemTipo = itemTipo
  }

  def getItemCodigo() {
    return itemCodigo
  }

  void setItemCodigo(itemCodigo) {
    this.itemCodigo = itemCodigo
  }

  def getItemNome() {
    return itemNome
  }

  void setItemNome(itemNome) {
    this.itemNome = itemNome
  }

  def getItemPreco() {
    return itemPreco
  }

  void setItemPreco(itemPreco) {
    this.itemPreco = itemPreco
  }


  @Override
  public String toString() {

    return "[nome: " + itemNome +
        ", preco: " + itemPreco +
        ']\n';
  }
}
