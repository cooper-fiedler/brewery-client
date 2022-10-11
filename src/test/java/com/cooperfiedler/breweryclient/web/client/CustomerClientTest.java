package com.cooperfiedler.breweryclient.web.client;


import com.cooperfiedler.breweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CustomerClientTest {

    @Autowired
    CustomerClient client;

    @Test
    void getBeerById() {
        CustomerDto dto = client.getCustomerById(UUID.randomUUID());
        assertNotNull(dto);

    }

    @Test
    void saveNewBeer() {
        CustomerDto customerDto = CustomerDto.builder().name("New Customer").build();

        URI uri = client.saveNewCustomer(customerDto);

        assertNotNull(uri);

        System.out.println(uri.toString());
    }

    @Test
    void updatBeer() {
        CustomerDto customerDto = CustomerDto.builder().name("New Customer").build();

        client.updatCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void deleteBeer() {
        client.deleteCustomer(UUID.randomUUID());
    }
}