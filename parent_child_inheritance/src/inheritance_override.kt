fun main() {
    val onePlus = OnePlus()
    onePlus.display()
    val generalMobile = Mobile("General Mobile")
    generalMobile.display()
}

open class Mobile(val type:String) {  // y hamari parent class hai , mobile() is m hm parametrized constructor hoga jo kuch paramter accept kr rha hoga
    open val name:String = ""
    open var size: Int= 5
    fun makeCall () = "Calling Phone"
    fun powerOff () = "Power Off"
    open fun display () = println("Mobile Display") //hm ksi method ko b override kr skte hein OPEN laga k
}
class OnePlus: Mobile("smart phone") //
{
    override fun display() {   // parent method m hm OPEN lkhengay or uski child class m jis method ko over ride kr rhe us m OVERRIDE lkhengay
        println("Display Chnage")
    }
    override val name: String = "One Plus"
    override var size: Int = 8


}

