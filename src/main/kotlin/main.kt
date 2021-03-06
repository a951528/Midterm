/*挑戰練習4-16 Fireball醉酒程度與狀態報告
利用castFireball 函數返回醉酒程度值 (介於 1 到 50 之間)展現玩家醉酒程度與狀態報告
*/
import java.lang.Math.pow
import java.lang.Math.random

fun main() {



    /*var currentRoom = Room("Foyer")
    println( currentRoom.description())
    println( currentRoom.load())*/




    //println( player.auraColor() )
    //printPlayerStatus(healthPoints, karma, auraColor, isBlessed, player.name, healthStatus)


    Game.play()

    //castFireBall(12)
    //drunkenness(x=castFireBall(50))
}



object Game{
    //val player = Player("Madrigal",89,true,false)
    val player = Player("Madrigal")
    //println( player.name + " TheBrave") //出錯?
    private  var currentRoom : Room = TownSquare() //?

    init{
        println("你好，冒險者")
        player.castFireBall()
    }

    fun play(){
        while(true){
            println( currentRoom.description())
            println( currentRoom.load())
            println(player.formaHealthStatus())
            //printPlayerStatus(player)

            print(">Enter your command: ")
            //println("Last command: ${readLine()}")
            println( GameInput(readLine()).processCommand() )

        }
    }

    private fun printPlayerStatus(
        healthPoints: Int,
        karma: Int,
        auraColor: String,
        isBlessed: Boolean,
        name: String,
        healthStatus: String
    ) {
        val statusFormatString =
            "(健康指數: $healthPoints)(karma: $karma ，光環: $auraColor) (運勢: ${if (isBlessed) "走運" else "很背"}) -> $name $healthStatus"

        println(statusFormatString)
    }

    private class GameInput(arg:String?){
        private val input = arg ?: ""
        val command = input.split(" ")[0]
        val argument = input.split(" ").getOrElse(1, { "" })

        fun processCommand() = when(command.toLowerCase()){
            else -> commandNotFound()
        }

        private fun commandNotFound() = "不確定您要做什麼"
    }

}

/*private fun drunkenness(x: Int) {
    val s = when (x) {
        in 41..50 -> "爛醉如泥"
        in 31..40 -> "大醉stewed"
        in 21..30 -> "醉了soused"
        in 11..20 -> "微醉sloshed"
        in 1..10 -> "微醺tipsy"
        0 -> "未喝酒"
        else -> "超出範圍"
    }
    println("醉酒程度：$s")
}*/

