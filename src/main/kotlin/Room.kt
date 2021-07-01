
open class Room(val name:String) {
    fun description() = "Room: $name"

    open fun load() = "沒什麼特別的"
}

class TownSquare : Room("Town Square"){
    override fun load() = "你來到了小鎮的廣場!"
}