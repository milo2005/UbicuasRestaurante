package unicauca.movil.restaurantes

import android.util.Log

var nombre:String = "Dario"
val edad:Int =27

fun cambiarNombre(n:String, e:Int){
    nombre = n

}

fun sumar(numero1:Int, numero2:Int):Int = numero1 + numero2

fun esMayorDeEdad(edad:Int):Boolean = if(edad > 18)  true
    else  false

fun esMenorDeEdad(edad:Int):Boolean{
    val menor = if(edad <18) true else false
    return menor
}

val colores:List<String> = listOf("Azul", "Amarillo", "Rojo")
val postres:MutableList<String> = mutableListOf("Pie Limon")

fun addPostre(postre:String){
    postres.add(postre)
}

fun removePostre(pos:Int){
    postres.removeAt(pos)
}

fun showPostres(){
    for((index,postre) in postres.withIndex()){
        Log.i("Postres", "postre $index nombre $postre")
    }
}

fun containsColor(color:String):Boolean{
    var contain = false
    for(c in colores){
        if(c==color){
            contain = true
            break
        }
    }
    return contain
}

fun containsColor2(color:String):Boolean =  colores.contains(color)

fun categoryEdad(edad:Int):String = when(edad){
    in 0..2 -> "Bebe"
    in 3..12 -> "Niño"
    in 13..17 -> "Adolecente"
    in 18..28 -> "Joven Adulto"
    else -> "Adulto"
}

fun showType(obj:Any){
    when(obj){
        is Int-> Log.i("Tipo", "Es Entero")
        is String-> Log.i("Tipo", "Es String")
        is Boolean ->Log.i("Tipo", "Es Boolean")
    }

}

data class Perro(val nombre:String, val raza:String, val color:String)
val nacho = Perro("Nacho", "Runa", "Cafe")

open class Operar(type:Int, var nom:String){

    // lateinit var typeOperator:String Inicialización tardia de variable
    //var typeOperator:String? = null
    /*fun getTypeOperatorCap():String?{
        typeOperator?.capitalize()
        return typeOperator
    }*/

    var typeOperator:String

    init {
        typeOperator = if(type == 0) "Tipo1" else "Tipo2"
    }

    constructor():this(0, "")

    fun sumar(vararg numeros:Int) = numeros.sum()



}

class OperacionesTri() : Operar(){

}



