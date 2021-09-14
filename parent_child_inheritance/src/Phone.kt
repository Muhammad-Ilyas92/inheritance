open class Phone    // Y hamari PARENT class hai
                    //kotlin m hamein compiler ko explicity btana parta h k hm is class ko inherit krengay to us k lye hamein Cclass ko OPEN krna hota hai
{
    val name: String = ""
    val type: String = ""
    val volume: Int = 10


    fun makeCall() {}
    fun screenSize() {}
    fun powerOff () {}
    fun charging (){}

    //basicphone or smartphone m jo b common hoga wo PHONE m ayega
    //basic phone mein or smartphone mein code ki duplicay ho rhe h
    //basicphone or smartphone (PHONE) wali class s inherit hoga
    //jb hm application bnatay hein to hm y dekhte hein k in class m aese konse function hein jo common hein
    //code reuseability ka benefit milta h
    //kotlin m hamein compiler ko explicity btana parta h k hm is class ko inherit krengay to us k lye hamein Cclass ko OPEN krna hota hai
}