fun main ()
{
    var objChild1 = Child1()  // yahan hm child ka object banayengay q k child class parent class s inherit ho rhe h
    //child class parent class k bgair call nh ho skti ,

}

open class Parent1 {

    init {
        println("Parent Constructor is called")
    }
}


class Child1: Parent1() {  // Y hamari child class jo inherit ho rhe h parent class s
    // aik child class aik he parent class s inherit ho skti h

    init {
        println("Child Constructor is called")
    }
}