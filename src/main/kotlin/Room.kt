
open class Room(val name:String) {
    fun description() = "Room: $name"

    fun load() = "這裡沒有特別的"
}

class TownSquare : Room("Town Square")