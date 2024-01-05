package controlheRestaurante

class Mesa {

  def mesas = [:];
  Cardapio pedidosDaMesa;

  Mesa() {
  }

  Mesa(Cardapio pedidosDaMesa) {
    this.pedidosDaMesa = pedidosDaMesa
  }
  def adicionarPedido (){

  }

  def removerPedido(){

  }

  def consultarMesa(){

  }

  def fecharMesa(){

  }
  def cadastrarMesa(mesa){

    mesas.put(mesa, null)

  }
  def listarMesas(){

    println(mesas)

  }

  Cardapio getPedidosDaMesa() {
    return pedidosDaMesa
  }

  void setPedidosDaMesa(Cardapio pedidosDaMesa) {
    this.pedidosDaMesa = pedidosDaMesa
  }

  @Override
  public String toString() {
    return "Mesa[" +
        ", pedidos: " + pedidosDaMesa +
        ']';
  }
}