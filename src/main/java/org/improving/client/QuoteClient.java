package org.improving.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class QuoteClient {
    private final RestTemplate restTemplate;

    public QuoteClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String quoteRetriever() {
        return restTemplate.getForObject("https://api.kanye.rest/?format=text",
                String.class);
    }

}
