package streatfoods.capstone.grails.version

class Truck {

    static hasOne = [truckOwner: User]

    static hasMany = [menu: List<Menu>, reviews: List<Review>]

    String name

    String description

    String phone

    static constraints = {
        name nullable: false

        description nullable: true

        phone nullable: true, unique: true
    }
}
