package controlheRestaurante

class Mesa {

  def mesaId = [:];
  def pedidosMesa = [];
  Cardapio pedidosDaMesa;

  Mesa() {
  }

  Mesa(Cardapio pedidosDaMesa) {
    this.pedidosDaMesa = pedidosDaMesa
  }

  def adicionarPedido(mesa, pedido) {
    // Check if the mesaId contains the mesa key
    if (!mesaId.containsKey(mesa)) {
      // If the mesa is not in mesaId, add it with an empty list
      mesaId.put(mesa, [])
    }

    println("Constrain" + !mesaId.containsKey(mesa))
    // Get the existing list of pedidos for the mesa
     pedidosMesa = mesaId.get(mesa)

    pedidosMesa == null ? pedidosMesa = [] : pedidosMesa.add(pedido)

    // Update mesaId with the modified list of pedidos for the mesa
    mesaId.put(mesa, pedidosMesa)

    // Print the pedidosMesas for debugging
    println(pedidosMesa)
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