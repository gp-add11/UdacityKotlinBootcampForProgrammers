package Aquarium

class Aquarium (var width: Int = 20, var length: Int = 40, var height: Int = 60) {
    var volume: Int
            get() = width * height * length
            set(value) {height = value/(width*length)}
}