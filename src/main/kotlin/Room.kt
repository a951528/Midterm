
open class Room(val name:String) {
    protected open val dangerlevel = 5
    fun description() = "當前所在地: $name\n" + "危險等級: $dangerlevel"

    open fun load() = "沒什麼特別的"
}

class TownSquare : Room("Town Square"){
    override val dangerlevel = super.dangerlevel - 3

    override fun load() = "你來到了小鎮的廣場!"

}