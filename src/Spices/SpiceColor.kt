package Spices

interface SpiceColor {
    var color: String
}

object YellowSpiceColor : SpiceColor {
    override var color: String = "Yellow"
}

object RedSpiceColor : SpiceColor {
    override var color: String = "Red"
}