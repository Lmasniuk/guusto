package com.example.Guusto;

import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {

    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/merchants")
	public Merchant greeting(
        @RequestParam(value = "name", defaultValue = "Example Merchant") String name,
        @RequestParam(value = "country", defaultValue = "Example Country") String country
    ) 
    {
		System.out.println("==== get merchant ====");
        return new Merchant(counter.incrementAndGet(), name, country);
	}

	
}
