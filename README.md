# TestEbayWeb
TestEbayWeb is a java based test automation for web app.
#### This test will only run on chrome browser Version 98.xxx

### TechStack
Java, Cucumber, Maven, Selenium

## To run

Maven based build environment should be ready as a pre requisite.
- Download this repo from Github
- Open the pom.xml file as a project in the IntelliJ (any IDE)
- Make sure the chrome version on the machine is 98.xxx, if want to run on any other version, download the chrome driver for the same and store under `src/test/resources/drivers/chrome/chromedriver_win_98` from [URL] (https://chromedriver.chromium.org/downloads).
- Then run below command

```bash
mvn clean test
```

## Output
- All the tests will run and generate a HTMLreport.html file under `target/Reports/`
- And screenshots are stored under `target/screenshot/`

 