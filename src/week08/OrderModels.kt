package Week06.week08

import kotlin.properties.Delegates

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)