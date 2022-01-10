<h1>Spring-cloud-subservice</h1>

<p>This service is used to co-work with <b>Spring-cloud-setup</b>
it enables endpoint with cars.json on "/" path.
</p>

<h3>How-to</h3>

<h4>Get cars list</h4>
<p>To access list of cars send request to "ip:server.port/" server.port is available in <b>application.properties</b> in resources folder.</p>
<h4>Generate contract tests stub</h4>
<p>
Contract tests are generated after triggering gradle build but to make it available in m2 memory
You need to push created stubs to Maven local it is easier to access stubs that way (default in memory access is based on maven) more examples about
this behaviour is present in Spring contract testing co-creator repository https://github.com/spring-cloud-samples/spring-cloud-contract-samples/blob/main/producer_with_junit4/build.gradle
</p>
<h4>Add service to kubernetes</h4>
<p>
To create deployment and service You can use spring-deployment/service.yaml with command "kubectl apply (-f FILENAME | -k DIRECTORY)"
If You want deployment to work remember to use proper name whe creating and pushing app docker build.
</p>