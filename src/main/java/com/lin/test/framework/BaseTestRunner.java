package com.lin.test.framework;
import com.lin.test.framework.config.TestMainConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

/*
@RunWith(SpringRunner.class) :
You need this annotation to just enable spring boot features like @Autowire, @MockBean etc.. during junit testing
is used to provide a bridge between Spring Boot test features and JUnit.
Whenever we are using any Spring Boot testing features in our JUnit tests, this annotation will be required.

@SpringBootTest : This annotation is used to load complete application context for end to end integration testing
The @SpringBootTest annotation can be used when we need to bootstrap the entire container.
The annotation works by creating the ApplicationContext that will be utilized in our tests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestMainConfiguration.class)
public class BaseTestRunner {
}
