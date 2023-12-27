package ifElse
  static void main(String[] args) {
    //número vai cair no if
    int numero = 89;
    //número vai cair no else
    //int numero = 102;

    if (numero <= 100){
      println("Número menor ou igual a 100 : " + numero)
    }else {
      println("Número maior que 100 :" + numero)
    }
  }