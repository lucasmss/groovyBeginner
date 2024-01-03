package controlheRestaurante

class Mesa {

  def numeroMesa;
  Cardapio pedidosDaMesa;

  Mesa(numeroMesa, Cardapio pedidosDaMesa) {
    this.numeroMesa = numeroMesa
    this.pedidosDaMesa = pedidosDaMesa
  }
//  adicionarPedido (){
//
//  }
//
//  removerPedido(){
//
//  }
//
//  consultarMesa(){
//  }
//
//  fecharMesa(){
//
//  }
  def getNumeroMesa() {
    return numeroMesa
  }

  void setNumeroMesa(numeroMesa) {
    this.numeroMesa = numeroMesa
  }

  Cardapio getPedidosDaMesa() {
    return pedidosDaMesa
  }

  void setPedidosDaMesa(Cardapio pedidosDaMesa) {
    this.pedidosDaMesa = pedidosDaMesa
  }

  @Override
  public String toString() {
    return "Mesa{" +
        "Mesa: " + numeroMesa +
        ", pedidos: " + pedidosDaMesa +
        '}';
  }
}
