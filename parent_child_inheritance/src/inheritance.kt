fun main ()
{
    var objChild = Child()  // yahan hm child ka object banayengay q k child class parent class s inherit ho rhe h
    objChild.myParent()
    objChild.myChild()
}

open class Parent {
    val name: String = "" //yahan hm n property banaye r y hm n empty string s initialize kiya

    fun myParent ()
    {
        println("I am in Parent class")
    }

}

class Child: Parent() {  // Y hamari child class jo inherit ho rhe h parent class s
                            // aik child class aik he parent class s inherit ho skti h
    val name2:String = ""
    fun myChild()
    {
        println("I am in Child class")
    }

}