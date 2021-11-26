package lab.pguma

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringbootMultiModuleTemplateApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringbootMultiModuleTemplateApplication>(*args)
}