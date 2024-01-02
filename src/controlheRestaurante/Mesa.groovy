package controlheRestaurante

class Mesa {

  def numeroMesa;
  def pedidosDaMesa;

  Mesa(numeroMesa, pedidosDaMesa) {
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
//
//  }
//
//  fecharMesa(){
//
//  }
  def getNumeroMesa() {
    return numeroMesa
  }

  def getPedidosDaMesa() {
    return pedidosDaMesa
  }


  @Override
  public String toString() {
    return "Mesa{" +
        "Mesa: " + numeroMesa +
        ", pedidos: " + pedidosDaMesa +
        '}';
  }
}
