package com.galiglobal.codereview

import spock.lang.Specification

class AppTest extends Specification {
    def "application has the correct greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result == "Hello, world!";
    }
}
