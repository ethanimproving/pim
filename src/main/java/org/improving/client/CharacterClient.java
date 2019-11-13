package org.improving.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CharacterClient {
    private final RestTemplate restTemplate;

    public CharacterClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Character characterSearch(int query) {
        return restTemplate.getForObject("https://swapi.co/api/people/{query}/",
                Character.class, uriVariables(query));
    }

    private Map<String, Integer> uriVariables(int query) {
        var variables = new HashMap<String, Integer>();
        variables.put("query", query);
        return variables;
    }
}
