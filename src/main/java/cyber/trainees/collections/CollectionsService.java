package cyber.trainees.collections;

import cyber.trainees.inheritance.Color;
import cyber.trainees.inheritance.VehicleModel;

import java.util.ArrayList;
import java.util.List;

public class CollectionsService {
    public void printCollections(){
        List<String> pets = new ArrayList<>();
        pets.add("cat");
        pets.add("dog");
        pets.add("snake");
        pets.add("squirrel");
        System.out.println(pets.get(2));

        VehicleModel modelVehicle = new VehicleModel(
                "Volvo",
                "2022",
                "all wheels drive",
                "XC60",
                1000,
                2000.0,
                Color.WHITE);
        List<VehicleModel> vehicleModelList = new ArrayList<>();
        vehicleModelList.add(modelVehicle);
        vehicleModelList.add(new VehicleModel("Toyota","2022", "all wheels drive", "Yaris", 2000, 3000.0, Color.BLACK));
        System.out.println(vehicleModelList.get(1));
    }
}
