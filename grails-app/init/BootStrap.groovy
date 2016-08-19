import giverest.Category
import giverest.Gift
import giverest.User
import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
        environments {
            development {

                if(!Gift.count()){

                    User user = new User();
                    user.firstName = "Vladan"
                    user.lastName = "Vulovic"
                    user.status = User.UserStatus.ACTIVE
                    user.created = new Date();
                    user.email = "vladan89@gmail.com"
                    user.phone = "0123456"
                    user.save()

                    Category cat1 = new Category(name: "Book", active: true).save()

                    Gift gift = new Gift();
                    gift.title = "Poklanjam knjigu tri musketara"
                    gift.description = "Knjiga je u tvrdim koricama..."
                    gift.category = cat1
                    gift.created = new Date()
                    gift.status = Gift.GiftStatus.ACTIVE
                    gift.owner = user
                    gift.save()
                }

            }
        }
        JSON.registerObjectMarshaller(Gift) {
            def returnArray = [:]
            returnArray['id'] = it.id
            returnArray['title'] = it.title
            returnArray['description'] = it.description
            returnArray['category'] = it.category?.name
            returnArray['created'] = it.created
            returnArray['status'] = it.status?.name()
            returnArray['owner'] = it.owner?.displayName()
            return returnArray
        }
        JSON.registerObjectMarshaller(User) {
            def returnArray = [:]
            returnArray['id'] = it.id
            returnArray['email'] = it.email
            returnArray['firstName'] = it.firstName
            returnArray['lastName'] = it.lastName
            returnArray['phone'] = it.phone
            returnArray['status'] = it.status?.name()
            return returnArray
        }
    }
    def destroy = {
    }
}
