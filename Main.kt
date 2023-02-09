fun soma(numero1:Float, numero2:Float):Float
{
  val soma = numero1 + numero2
  return soma
}

fun sub(numero1:Float, numero2:Float):Float
{
  val sub = numero1 - numero2
  return sub
}

fun multi(numero1:Float, numero2:Float):Float
{
  val multi = numero1 * numero2
  return multi
}

fun div(numero1:Float, numero2:Float):Float
{
  val div = numero1 / numero2
  return div
}

fun main(args: Array<String>) {
  while(true){
    println("qual Operacao deseja fazer:\nSoma\nSub\nMulti\nDiv")
    val choice = readln()
    if (choice == "1"){
      println("Digite o primeiro numero")
      val num1 = readln()
      println("Digite o segundo numero")
      val num2 = readln()
      val soma = soma(num1.toFloat(),num2.toFloat())
      println("Sua soma é "+ soma)
    }
    else if (choice == "2"){
      println("Digite o primeiro numero")
      val num1 = readln()
      println("Digite o segundo numero")
      val num2 = readln()
      val soma = sub(num1.toFloat(),num2.toFloat())
      println("Sua sub é "+ soma)
    }
    else if (choice == "3"){
      println("Digite o primeiro numero")
      val num1 = readln()
      println("Digite o segundo numero")
      val num2 = readln()
      val soma = multi(num1.toFloat(),num2.toFloat())
      println("Sua multi é "+ soma)
    }
    else if (choice == "4"){
      println("Digite o primeiro numero")
      val num1 = readln()
      println("Digite o segundo numero")
      val num2 = readln()
      val soma = soma(num1.toFloat(),num2.toFloat())
      println("Sua div é "+ soma)
    }
  }
}

