package Aquarium

open class Aquarium (var width: Int = 20, var length: Int = 40, var height: Int = 60) {
    var volume: Int
            get() = width * height * length
            set(value) {height = value/(width*length)}
    open var water = volume * 0.9
}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8
}