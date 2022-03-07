fun main(){
    val amount = 1000000
    val commission = if(amount * 0.0075 <= 3500) 3500 else (amount * 0.0075).toInt()
    println("Комиссия за перевод: " + commission + " коп.")
}