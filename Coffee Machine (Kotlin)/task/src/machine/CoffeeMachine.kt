package machine

enum class Products(val productName : String, val water : Int, val milk : Int, val beans : Int, val cost : Int) {
    ESPRESSO("espresso", 250, 0, 16, 4),
    LATTE("latte", 350, 75, 20, 7),
    CAPPUCCINO("cappuccino", 200, 100, 12, 6)
}

class CoffeeMachine(private var water : Int, private var milk : Int, private var beans : Int, private var cups : Int, private var money : Int) {

    fun printState() {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")
    }

    fun buy(product : Products) {
        if (water < product.water) {
            println("Sorry, not enough water!")
        } else if (milk < product.milk) {
            println("Sorry, not enough milk!")
        } else if (beans < product.beans) {
            println("Sorry, not enough coffee beans!")
        } else if (cups < 1) {
            println("Sorry, not enough disposable cups!")
        } else {
            println("I have enough resources, making you a coffee!")
            water -= product.water
            milk -= product.milk
            beans -= product.beans
            cups -= 1
            money += product.cost
        }
    }

    fun fill(water : Int, milk : Int, beans : Int, cups : Int) {
        this.water += water
        this.milk += milk
        this.beans += beans
        this.cups += cups
    }

    fun take() {
        println("I gave you $$money")
        money = 0
    }
}

fun main() {
    val machine = CoffeeMachine(400, 540, 120, 9, 550)
    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        when (readLine()!!) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                when (readLine()!!) {
                    "1" -> machine.buy(Products.ESPRESSO)
                    "2" -> machine.buy(Products.LATTE)
                    "3" -> machine.buy(Products.CAPPUCCINO)
                }
            }
            "fill" -> {
                print("Write how many ml of water do you want to add: ")
                val water = readLine()!!.toInt()
                print("Write how many ml of milk do you want to add: ")
                val milk = readLine()!!.toInt()
                print("Write how many grams of coffee beans do you want to add: ")
                val beans = readLine()!!.toInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                val cups = readLine()!!.toInt()
                machine.fill(water, milk, beans, cups)
            }
            "take" -> machine.take()
            "remaining" -> machine.printState()
            "exit" -> return
        }
    }
}