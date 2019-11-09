package org.improving;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class AppControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void home_should_return_index_with_products_and_status_200() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("products"));
    }

    @Test
    void getProductList_should_return_list_of_products() {
        // Act
        var result = AppController.getProductList().get(0).getClass();

        // Assert
        assertEquals(Product.class, result);
    }

    @Test
    void product_should_return_product_view_with_ok_status() throws Exception {
        mockMvc.perform(get("/product"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("product"));
    }

    @Test
    void form() throws Exception {
        mockMvc.perform(get("/form"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("form"));
    }

    @Test
    void add_should_redirect_to_home() throws Exception {
        var product = new Product();
        product.setName("Tissues");
        product.setBrand("Kleenex");
        product.setPrice(200);
        product.setStock(15);

        String json = mapper.writeValueAsString(product);
        System.out.println("THIS IS MY NEW PRODUCT: " + json);
        mockMvc.perform(post("/form/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is3xxRedirection());
    }

    @Test
    void login() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("login"));
    }
}