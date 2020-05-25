package micronaut.issue

import javax.inject.Singleton

@Singleton
class MyService(private val myClient: MyClient) {

    // ((myClient as InterceptedProxy<*>).interceptedTarget() as MyClient).getSomeFoos() works
    fun getFoos() = myClient.getSomeFoos()
}