import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("java")
    id("jacoco")
    id("checkstyle")
    id("com.github.spotbugs") version "6.0.0-beta.3"
}

group = "it.unibz.digidojo"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:23.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation("junit:junit:4.13.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.mockito:mockito-core:5.6.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.6.0")
    implementation("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.28")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    implementation("org.slf4j:slf4j-api:2.0.9")
}

spotbugs {
    ignoreFailures.set(false)
//    excludeFilter.set(project.file("${project.projectDir}/configuration/spotbugs/spotbugs-filters.xml"))
}

val excludeFromCoverage = listOf(
        "it/unibz/digidojo/**/model/**",
)

val codeCoverageFiles: FileTree = sourceSets.main.get().output.asFileTree.matching {
    exclude(excludeFromCoverage)
}

tasks {
    withType<JacocoReport> {
        classDirectories.setFrom(codeCoverageFiles)
    }

    jacocoTestCoverageVerification {
        /*
         Files to include in code coverage evaluations and reports
         */
        classDirectories.setFrom(codeCoverageFiles)

        /*
         Set minimum code coverage to fail build
        */
        violationRules {
            rule { limit { minimum = BigDecimal.valueOf(0.9) } }
        }
    }

    check {
        dependsOn(jacocoTestCoverageVerification)
    }

    withType<Test> {
        useJUnitPlatform()

        testLogging {
            events = setOf(TestLogEvent.FAILED,
                    TestLogEvent.PASSED,
                    TestLogEvent.SKIPPED)
            exceptionFormat = TestExceptionFormat.FULL
            showCauses = true
            showExceptions = true
            showStackTraces = true
            showStandardStreams = true
        }
    }
}