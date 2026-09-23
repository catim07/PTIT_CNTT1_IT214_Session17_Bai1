package com.rikkei.b1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisConfigApplicationTests {

    @Autowired
    private CacheManager cacheManager;

    @Test
    void testCacheManagerBeanLoaded() {
        assertNotNull(cacheManager);
    }
}
