package micronaut.issue

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("http://some-other-server.example.com")
interface MyClient {
    @Get("/api/foo")
    fun getSomeFoos(): List<Foo>
}