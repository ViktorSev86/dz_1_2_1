fun main(){
    val amount = 1000000
    val tempCom = amount * 0.0075
    val commission = if(tempCom <= 3500) 3500 else (tempCom).toInt()
    println("Комиссия за перевод: $commission коп.")
}