package giverest

import com.github.rahulsom.swaggydoc.SwaggyDelete
import com.github.rahulsom.swaggydoc.SwaggyList
import com.github.rahulsom.swaggydoc.SwaggyPatch
import com.github.rahulsom.swaggydoc.SwaggySave
import com.github.rahulsom.swaggydoc.SwaggyShow
import com.github.rahulsom.swaggydoc.SwaggyUpdate
import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import grails.rest.RestfulController
@Api(value = 'category')
class CategoryController extends RestfulController {

    static responseFormats = ['json']

    CategoryController() {
        super(Category)
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
