import kotlin.system.exitProcess

fun main(){
    var resposta = 0
   var veritas=true
    while(veritas){
        println("Para sair digite 1")
                println("Para continuar digite 2")
                resposta = readln().toInt()
         if (resposta==1){
            exitProcess(0)
        }

        else if (resposta==2){
            notasaluno()
        }
        else{
            println("opção invalida")
        }
    }

   }
fun notasaluno(){
    var notasaluno= DoubleArray(4)
    var media:Double=0.0
    for (n in notasaluno.indices){
        println("digite a nota")
        notasaluno[n]= readln().toDouble()
        while(notasaluno[n]<0||notasaluno[n]>10){
            println("nota invalida")
            println("digite a nota corretamente")
            notasaluno[n]= readln().toDouble()
        }
        media=media+notasaluno[n]
    }
    var resultado=media/4
    println("a media é:$resultado")
}