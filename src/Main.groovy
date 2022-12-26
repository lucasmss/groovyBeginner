static void main(String[] args) {
  /*
    Groovy um linguagem de programação muito semelhante ao java, porém possui suas caracteriticas proprias,
    se torna bem mais simples que java o que tornar sua curva de aprendizado ainda mais rápida para quem já
    programa a algum tempo.

    Veja algumas dicas para começar com groovy a seguir.
  */

  //Groovy não cobra ponto e vírgula em seu código.
  println "Hello world!"

  //Em Groovy uma variável com seu tipo definido não pode ser alterada dinâmicamente.
  int x = 104

  //Uma das formar de mostrar o valor no console.
  println x

  /*
    Exemplo de tentativa de alterar o tipo de uma variável declarada. Resultado (Erro);
    x = "guru"
  */

  //Como fazer um for em groovy
  1.upto(5) {println "$it"}

  //Outra forma
  6.times{println "$it"}
}