package giverest

import grails.rest.RestfulController

class GiftController extends RestfulController {

    static responseFormats = ['json']

    static allowedMethods = [testError: 'GET']

    GiftController(){
        super(Gift);
    }

    def testError() {
        render status: 403
    }
}
