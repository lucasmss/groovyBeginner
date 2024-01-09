package controlheRestaurante

class Mesa {

  def mesaId = [:];
  def pedidosMesas = [];
  Cardapio pedidosDaMesa;

  Mesa() {
  }

  Mesa(Cardapio pedidosDaMesa) {
    this.pedidosDaMesa = pedidosDaMesa
  }
  def adicionarPedido (mesa, pedido){

    pedidosMesas.add(pedido)
    println(pedidosMesas)

    mesaId.put(mesa, pedidosMesas)
    print(mesaId.get(mesa))
  }

  def removerPedido(){

  }

  def consultarMesa(mesa){
    println(mesaId.get(mesa))
  }

  def fecharMesa(){

  }
  def cadastrarMesa(mesa){

    mesaId.put(mesa, null)

    print(mesaId)

  }
  def listarMesas(){

    println(mesaId)

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