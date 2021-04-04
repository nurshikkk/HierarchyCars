public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        VehicleAd c1Ad = new VehicleAd("c1", "24", new CarType(),
                new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, c1Ad});

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}