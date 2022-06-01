package streatfoods.capstone.grails.version

class User {

    static hasOne = [truck: Truck]

    static hasMany = [reviews: List<Review>]

    String username

    String password

    String email

    boolean truckOwner

    static constraints = {
        username nullable: false, unique: true

        password nullable: false

        email nullable: false, unique: true

        truckOwner nullable: false
    }

}
