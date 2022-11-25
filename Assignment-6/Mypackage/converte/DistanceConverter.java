package Mypackage.converte;

public class DistanceConverter {
    public float meterToKm(float meter){
        return (meter / 1000);
    }
    public float kmToMeter(float km){
        return (km * 1000);
    }
    public float milesToKm(float mile){
        return (mile * 1.609344f);
    }
    public float kmToMiles(float km){
        return (km * 0.62139f);
    }
}
