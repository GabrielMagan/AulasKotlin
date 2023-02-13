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

fun expoente(numero1: Float):Float
{
  val expo = numero1*numero1
  return expo
}

fun raiz(numero1: Float):Float
{
  val raiz = Math.sqrt(numero1.toDouble())
  return raiz.toFloat()
}

fun main()
{
  while(true){
    println("Qual Operacao deseja fazer:\n[1] Soma\n[2] Sub\n[3] Multi\n[4] Div\n[5] Expoente\n[6] Raiz")
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
    else if (choice == "5"){
      println("Digite o numero")
      val num1 = readln()
      val soma = expoente(num1.toFloat())
      println("Sua exponenciação é "+ soma)
    }
    else if (choice == "6"){
      println("Digite o numero")
      val num1 = readln()
      val soma = raiz(num1.toFloat())
      println("A raiz quadrada de "+num1+ " é "+ soma)
    }
    println("deseja continuar?(s/n)")
    val cond = readLine()
    if(cond == "n"){
      break
    }
    else {
      continue
    }
  }
}


