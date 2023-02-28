fun greetings(name: String? = null): String {
    return if (name != null) {
        "Hello, $name!"
    } else {
        "Hello, secret user!"
    }
}
