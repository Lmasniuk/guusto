package com.example.Guusto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {

    @CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/merchants")
	public Merchant getMerchants(
        @RequestParam(value = "name", defaultValue = "Example Merchant") String name,
        @RequestParam(value = "country", defaultValue = "Example Country") String country
    ) 
    {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            //Get JSON array and print each Array element out
            InputStream inputStream = new FileInputStream(new File("./src/main/resources/exampleMerchantsData.json"));
            Merchant[] merchants = mapper.readValue(inputStream, Merchant[].class);
            for(Merchant m: merchants) {
                System.out.println(m);
            }

            //Return a single merchant
            String jsonMerchant = getMerchants();
            Merchant merchant = mapper.readValue(jsonMerchant, Merchant.class);
            return merchant;
        }
        catch (IOException e)
        {
            System.out.println("Exception Encountered");
        }
        
        return new Merchant(name, country);
	}

    public String getMerchants(){
        JSONObject merchant = new JSONObject();
        merchant.put("name", "Cactus Club");
        merchant.put("country", "Canada");

        return merchant.toString();
    }	
}
