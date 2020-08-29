package Buildings

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(val buildingMaterial: T){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun main(args: Array<String>){
    val building = Building(Wood())
    building.build()

    isSmallBuilding(building)
}

fun  <R: BaseBuildingMaterial> isSmallBuilding(building: Building<R>) {
    if (building.actualMaterialsNeeded <500) {
        println("small building")
    } else {
        println("large building")
    }
}

