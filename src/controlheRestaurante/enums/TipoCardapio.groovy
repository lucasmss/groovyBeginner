package controlheRestaurante.enums

enum TipoCardapio {

  REFEICAO("refeição"),
  BEBIDA("bebida"),
  SOBREMESA("sobremesa");

  private String descricao;

  TipoCardapio(String descricao) {
    this.descricao = descricao
  }

  String getDescricao() {
    return descricao
  }
}