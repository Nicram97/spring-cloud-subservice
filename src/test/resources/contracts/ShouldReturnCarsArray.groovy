package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return list of cars"

    request {
        method("GET")
        url("/")
    }

    response {
        status 200
        body([
                [
                    "Name" : "someString" ,
                    "Year" : "1970-01-01" ,
                    "Origin" : "USA"
                ]
        ])
        bodyMatchers {
            jsonPath('$.[*].Name', byType())
            jsonPath('$.[*].Year', byType())
            jsonPath('$.[*].Origin', byType())
        }
        headers {
            contentType("application/json")
        }
    }
}

