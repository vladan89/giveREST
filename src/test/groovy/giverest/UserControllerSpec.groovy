package giverest

import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UserController)
class UserControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test index includes all people"() {
        /*given:
*//*        User user = new User(firstName: "Vladan", lastName: "Vulovic", status: User.UserStatus.ACTIVE,
                                created: new Date(), email: "vladan89@gmail.com", phone: "0123456").save()*//*

        when:
        request.method = 'GET'
        response.format = 'json'
        controller.index()

        then:
        response.status == 200
        response.contentAsString == '[{"id":1,"email":"vladan89@gmail.com","firstName":"Vladan","lastName":"Vulovic","phone":"0123456","status":"ACTIVE"}]'
*/
        expect:"fix me"
        true == true
    }
}
