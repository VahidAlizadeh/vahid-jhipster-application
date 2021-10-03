package com.vahid.classmate;

import com.vahid.classmate.RedisTestContainerExtension;
import com.vahid.classmate.VahidJhipsterApplicationApp;
import com.vahid.classmate.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { VahidJhipsterApplicationApp.class, TestSecurityConfiguration.class })
@ExtendWith(RedisTestContainerExtension.class)
public @interface IntegrationTest {
}
