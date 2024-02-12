package com.example.touristguideapi2.repository;

import com.example.touristguideapi2.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TourisRepository {

    private List<TouristAttraction> touristAttractionList;

    public TourisRepository(){
        touristAttractionList = new ArrayList<>();
        attractioner();
    }

    public void attractioner(){
        touristAttractionList.add(new TouristAttraction("Tivoli", "Forlystelsespark"));
        touristAttractionList.add(new TouristAttraction("Zoologiske have", "København Zoo eller Zoologisk Have i København er på 11 ha og en af Europas ældste zoologiske haver. Den ligger på Frederiksberg ved Roskildevej på Valby Bakke. København Zoo har 181 fuldtidsansatte og et årligt besøgstal på ca. 1.3 mio. Der er over 3.500 dyr fordelt på 227 arter i København Zoo."));
        touristAttractionList.add(new TouristAttraction("Rundetårn", "Rundetårn er et 41,55 meter højt observationstårn, der ligger i Købmagergade i Indre By, København. Højden på 34,8 meter refererer kun til udsigtsplatformens højde over gadeniveau. Dertil kommer observatoriet, som er 6,75 meter højt."));
        touristAttractionList.add(new TouristAttraction("Legoland", "Legoland Billund Resort er en dansk forlystelsespark i Billund med fokus på LEGO og Legoklodser. Parken åbnede 7. juni 1968 som den første Legoland-park. Med 1,7 mio. besøgende i 2012 og over 50 mio. besøgende siden åbningen er det den største danske turistattraktion udenfor København."));
    }

    public List<TouristAttraction> readfil(){
        return touristAttractionList;
    }

    public void createAttraction(TouristAttraction touristAttraction){
        touristAttractionList.add(touristAttraction);
    }



    public void updateAttraction(TouristAttraction touristAttraction){
        for (TouristAttraction attraction : touristAttractionList){
            if (attraction.getName().equals(touristAttraction.getName())){
                attraction.setName(touristAttraction.getName());
                attraction.setDescription(attraction.getDescription());
            }
        }
    }

    public void deleteAttraction(TouristAttraction touristAttraction){
        touristAttractionList.remove(touristAttraction);
    }
}

