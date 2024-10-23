package homework_27;

public enum Season {
    WINTER(2.7), SPRING(7.5), SUMMER( 20.1), FALL( 15);

    private final double avgDegree;

    Season(double avgDegree){
        this.avgDegree = avgDegree;
    }

    public double getAvgDegree(){
        return avgDegree;
    }

    public String getSeasonInfo(){
        return String.format("Season: %s. Average temperature: %.1f°C", this.name().toLowerCase(), this.getAvgDegree());
    }
}

class displayAvgTemperatureInfo{
    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.println(season.getSeasonInfo());
        }
    }
}