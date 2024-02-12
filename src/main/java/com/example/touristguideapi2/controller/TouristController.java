package com.example.touristguideapi2.controller;

import com.example.touristguideapi2.model.TouristAttraction;
import com.example.touristguideapi2.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    TouristService touristService = new TouristService();

    @GetMapping("/alle")
    public ResponseEntity<List<TouristAttraction>> getAttractions(){
        return new ResponseEntity<>(touristService.readAtrraktioner(), HttpStatus.OK);
    }
}

