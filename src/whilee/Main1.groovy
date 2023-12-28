package whilee

static void main(String[] args) {
  int contador = 0;

  //Enquanto o contador for menos ou igual a 5 ele vai executar o while
  //Essa condição o contador vai até 5 se fizer (contador < 5) contador vai até 4
  while(contador <= 5){

    //Forma de escrever no terminal o valor do contador;
    println("Contador " + contador);

    //contador está sendo incrementado, isso garante que não vire um loop infinito
    //contador++

    //Outras formas
    //contador += 1
    //contador = contador + 1;
  }

}