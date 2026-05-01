package com.back

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import kotlin.jvm.java

// object 필요없음
@SpringBootApplication
class RestApiApplication  // 그냥 class

fun main(args: Array<String>) {  // 클래스 밖에 main
    runApplication<RestApiApplication>(*args)
}