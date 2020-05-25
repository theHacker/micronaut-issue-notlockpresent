package micronaut.issue

import io.kotlintest.specs.StringSpec
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.kotlintest.MicronautKotlinTestExtension.getMock
import io.mockk.every
import io.mockk.mockk


@MicronautTest
class MyServiceTest(
        private val myClient: MyClient,
        private val myService: MyService
) : StringSpec() {

    @MockBean(MyClient::class)
    fun myClientMock(): MyClient = mockk()

    init {
        "MyService uses the MyClient" {
            every { getMock(myClient).getSomeFoos() } returns listOf(Foo(42, "Foo"))

            assert(myService.getFoos().size == 1)
        }
    }
}