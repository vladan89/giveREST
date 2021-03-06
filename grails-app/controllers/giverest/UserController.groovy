package giverest

import com.github.rahulsom.swaggydoc.*
import com.wordnik.swagger.annotations.Api
import grails.rest.RestfulController

@Api(value = 'user')
class UserController extends RestfulController {

    static responseFormats = ['json']

    UserController() {
        super(User)
    }

    @SwaggyList
    def index(final Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond listAllResources(params)
    }

    @SwaggyShow
    def show() {
        super.show()
    }

    @SwaggySave
    def save() {
        super.save()
    }

    @SwaggyUpdate
    def update() {
        super.update()
    }

    @SwaggyDelete
    def delete() {
        super.delete()
    }

    @SwaggyPatch
    Object patch() {
        return super.patch()
    }

}
