fun main() {
    val onePlus1 = OnePlus1("Smart Phone")
    onePlus1.display()

    // ANY CLASS sbki super class hai to jtne b method hamaray ANY CLASS mein hongay wo sb hamaray SUB CLASS ko define hongay
    println(onePlus1.toString())
}


class OnePlus1(typeParam:String): Mobile(typeParam) //pehle hard code that ab hm n type Param kr diya
{
    override fun display() {   // parent method m hm OPEN lkhengay or uski child class m jis method ko over ride kr rhe us m OVERRIDE lkhengay
        super.display()  //yahan parent ka function call ho rha h
        println("One Plus Display ")
    }

    override fun toString(): String {
        return "OnePlus1(size =' $size' )"
    }

}

