# Goals

kotlin + spring-boot + gradle + multi-project building

# Module-Structure
```text
---root
     |--- src.main.kotlin.KotlinSpringBootPlaygroundApplication.kt
     |--- settings.gradle.kts
     |--- build.gradle.kts
     | // ↓ sub modules
     |--- presentation(sub)
     |--- application(sub)
     |--- domain(sub)
     |--- infrastructure(sub)
```

# Running

1. run gradle task `bootRun`
2. browser access to [LINK](http://localhost:8080/demo/get)
3. you can show `Hello Kotlin`
4. happy kotlin life