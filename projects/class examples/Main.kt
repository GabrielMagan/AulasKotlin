fun main()
{
   Pessoa("alan", 18,1.92).beber()
}

class Pessoa constructor(name:String, age:Int, alt:Double)
{
    private val idade = age
    private val nome = name
    private val altura = alt
    init
    {
        println("Nome: $nome" )
        println("$idade anos")
        println("$altura Metros")
    }
    fun beber()
    {
        if(idade >= 18)
        {
            println(nome + " esta bebendo pq tem mais de "+ idade + " anos" )
        }
        else
        {
            println(nome + " nao esta bebendo pq tem menos de "+ idade + " anos" )
        }
    }
}