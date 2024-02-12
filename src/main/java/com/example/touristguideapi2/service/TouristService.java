package com.example.touristguideapi2.service;

import com.example.touristguideapi2.model.TouristAttraction;
import com.example.touristguideapi2.repository.TourisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    TourisRepository tourisRepository = new TourisRepository();


    public void update(TouristAttraction touristAttraction){
        tourisRepository.updateAttraction(touristAttraction);
    }

    public void create(TouristAttraction touristAttraction){
        tourisRepository.createAttraction(touristAttraction);
    }

    public List<TouristAttraction> readAtrraktioner(){
        return tourisRepository.readfil();
    }

    public void delete(TouristAttraction touristAttraction){
        tourisRepository.deleteAttraction(touristAttraction);
    }





}
