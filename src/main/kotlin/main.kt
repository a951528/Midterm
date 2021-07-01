/*挑戰練習4-16 Fireball醉酒程度與狀態報告
利用castFireball 函數返回醉酒程度值 (介於 1 到 50 之間)展現玩家醉酒程度與狀態報告
*/
import java.lang.Math.pow
import java.lang.Math.random

fun main() {

    //val player = Player("Madrigal",89,true,false)
    val player = Player("Madrigal")
    println( player.name + " TheBrave")
    player.castFireBall()

    var currentRoom = Room("Foyer")
    println( currentRoom.description())
    println( currentRoom.load())

    println( player.auraColor() )
    //printPlayerStatus(healthPoints, karma, auraColor, isBlessed, player.name, healthStatus)
    println(player.formaHealthStatus())

    //castFireBall(12)
    //drunkenness(x=castFireBall(50))
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

private fun drunkenness(x: Int) {
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
}

