package com.hrm.test;

import com.hrm.vo.test.TestGetStatusVo;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
class TestControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    void testHello() {
        HttpRequest<TestGetStatusVo> request = HttpRequest.GET("/tests/status");
        TestGetStatusVo result = client.toBlocking().retrieve(request, TestGetStatusVo.class);

        String expectionStatus = "ok";

        assertNotNull(result);
        assertEquals(result.getStatus(), expectionStatus);
    }

}
