public class volumeofearth {

    public static void main(String[] args){
        double pi = 3.141592653589793; 
        double radiusKm = 6378;        

        
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        
        double kmToMiles = 0.621371;
        double volumeMi3 = volumeKm3 * Math.pow(kmToMiles, 3);

       
        System.out.println("Volume of Earth in cubic km (scientific notation): " + volumeKm3);
        System.out.printf("Volume of Earth in cubic km (full number): %.0f km³\n", volumeKm3);
        System.out.println("Volume of Earth in cubic miles: " + volumeMi3);
        System.out.printf("Volume of Earth in cubic miles (full number): %.0f mi³\n", volumeMi3);
    }
}
