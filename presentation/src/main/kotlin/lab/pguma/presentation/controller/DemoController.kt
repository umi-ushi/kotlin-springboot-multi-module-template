package lab.pguma.presentation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo")
class DemoController {

    @GetMapping("/get")
    fun demo(): String {
        return "Hello Kotlin"
    }
}