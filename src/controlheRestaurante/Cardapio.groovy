package controlheRestaurante

class Cardapio {

    def itemTipo;
    def itemCodigo;
    def itemNome;
    def itemPreco;

    Cardapio(itemTipo, itemCodigo, itemNome, itemPreco) {
      this.itemTipo = itemTipo
      this.itemCodigo = itemCodigo
      this.itemNome = itemNome
      this.itemPreco = itemPreco
    }

    def listarCardapio(){


    }

    def adicionarItem(tipo, codigo, nome, preco){

    }

    def getItemTipo() {
      return itemTipo
    }

    void setItemTipo(itemTipo) {
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

    return "item[" +
        "tipo: " + itemTipo +
        ", codigo: " + itemCodigo +
        ", nome: " + itemNome +
        ", preco: " + itemPreco +
        ']';
  }
}
