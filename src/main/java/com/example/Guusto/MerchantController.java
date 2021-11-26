package com.example.Guusto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {

    @CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/merchants")
	public List<Merchant> getMerchants() 
    {
        ObjectMapper mapper = new ObjectMapper();
        List<Merchant> merchants = new ArrayList<Merchant>();
        
        try {
            InputStream inputStream = new FileInputStream(new File("./src/main/resources/exampleMerchantsData.json"));
            merchants = Arrays.asList(mapper.readValue(inputStream, Merchant[].class));

            for(Merchant m: merchants) {
                System.out.println(m);
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception Encountered");
            System.out.println(e);
        }

        return merchants;
	}
}
