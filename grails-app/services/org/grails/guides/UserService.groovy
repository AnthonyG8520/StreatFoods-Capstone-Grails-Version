package org.grails.guides

import grails.gorm.services.Service

@Service(User)
interface UserService {

    User get(Serializable id)

    List<User> list(Map args)

    Long count()

    void delete(Serializable id)

    User save(String username, String password, String email, boolean truckOwner)
    User save(String username, String password, String email, boolean truckOwner, Truck truck)

}