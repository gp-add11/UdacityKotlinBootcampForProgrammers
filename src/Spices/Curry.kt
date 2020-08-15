package Spices

class Curry (name: String, spiciness: String, color: SpiceColor = YellowSpiceColor):
    Spice(name, spiciness, color)
    , Grinder
    , SpiceColor by color
{
    override fun grind() {
        TODO("Not yet implemented")
    }

    override fun prepareSpice() {
        grind()
    }

    var updatedSpiceColor: SpiceColor = YellowSpiceColor
        set(value) {
            color = if(spiciness.contains("hot",true)) {
                "red"
            } else {
                "yellow"
            }
        }

}