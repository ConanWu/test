package com.lin.test.framework;
import com.lin.test.framework.config.TestMainConfiguation;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestMainConfiguation.class)
public class BaseTestRunner {
}
