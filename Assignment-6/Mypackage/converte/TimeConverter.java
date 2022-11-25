package Mypackage.converte;

public class TimeConverter {
    public int hoursToMin(int hours){
        return hours*60;
    }
    public float minToHours(int min){
        return min/60;
    }
    public int minToSec(int min){
        return min*60;
    }
    public float secToMin(int sec){
        return sec/60;
    }
}
