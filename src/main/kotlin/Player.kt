
import java.io.File

class Player(_name:String,var healthPoints:Int=80,val isBlessed:Boolean,private val isImmortal:Boolean){
    var name = _name
        //get()= " ${field.capitalize()} of $hometown"
        get() = field.capitalize()
        private set(value){
            field = value.trim()
        }

    val hometown = selectHometown()

    init{
        require(healthPoints>0, {"healthPoints must be greater than zero."} )
        require(name.isNotBlank(),{"Player must have a name."} )
    }

    constructor(name:String): this(name,isBlessed=true,isImmortal=false){
        if(name.toLowerCase()== "GM") healthPoints =100
    }


    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) *20).toInt()


    fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }

    fun auraColor()=
        when (karma) {
            in (0..5) -> "紅色"
            in (6..10) -> "橘黃色"
            in (11..15) -> "紫色"
            in (16..20) -> "綠色"
            else -> "無光環"
        }


    fun formaHealthStatus() =
        when (healthPoints) {
            100 -> "健康狀態極佳"
            in 90..99 -> "有一些小擦傷"
            in 75..89 -> if (isBlessed) {
                "雖有一些傷口，但恢復很快"
            } else {
                "有一些傷口"
            }
            in 15..74 -> "嚴重受傷"
            //顯示玩家狀態
            else -> "情況不妙"
        }

    private fun selectHometown() = File("D:/Kotlin_Project/NyeHack_Ch13/data/town.txt").readText().split("\n").shuffled().first()



}