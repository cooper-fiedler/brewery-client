package com.cooperfiedler.breweryclient.web.client;

import com.cooperfiedler.breweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {

        BeerDto dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);

    }
}