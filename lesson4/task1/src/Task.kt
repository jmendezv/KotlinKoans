class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        get() = field
        set(value) {
            field = value
            counter++
        }

}
