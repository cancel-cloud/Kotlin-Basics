enum class Countries(var currency : String ?= "nix") {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar"),
}


fun main() {
    val reader = System.`in`
    val inputReader = reader.bufferedReader().readLine()
    val countryone = inputReader.split(" ")[0]
    val countrytwo = inputReader.split(" ")[1]
    val countryonecurrency = try {
        Countries.valueOf(countryone.uppercase()).currency
    } catch (e: Exception) {
        "nix"
    }
    val countrytwocurrency = try {
        Countries.valueOf(countrytwo.uppercase()).currency
    } catch (e: Exception) {
        "nix"
    }
    if (countryonecurrency == countrytwocurrency) {
        println("true")
    } else {
        println("false")
    }

}