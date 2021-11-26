import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

extra["spring.boot.version"] = "2.6.0"

plugins {
	id("java")
	id("org.springframework.boot") version "2.6.0"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.0"
	kotlin("plugin.spring") version "1.6.0"
}

dependencies {
	implementation(project(":presentation"))
	implementation(project(":application"))
	implementation(project(":domain"))
	implementation(project(":infrastructure"))
}

allprojects {
	group = "me.lab.pguma.lab"
	version = "0.0.1-SNAPSHOT"

	apply(plugin = "java")
	apply(plugin = "kotlin")
	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
	apply(plugin = "io.spring.dependency-management")

	repositories {
		mavenCentral()
	}

	dependencyManagement {
		imports {
			mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
		}
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "1.8"
		}
	}
}

subprojects {

	sourceSets {
		main {
			java.srcDir("src/main/kotlin")
			resources.srcDir("src/main/resources")
		}

		test {
			java.srcDir("src/test/kotlin")
			resources.srcDir("src/test/resources")
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}

project(":presentation") {
	dependencies {
	}
}

project(":application") {
	dependencies {
	}
}

project(":domain") {
	dependencies {
	}
}

project(":infrastructure") {
	dependencies {
	}
}