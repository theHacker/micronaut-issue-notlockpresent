package micronaut.issue

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.issue")
                .mainClass(Application.javaClass)
                .start()
    }
}