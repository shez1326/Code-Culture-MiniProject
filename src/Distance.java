public class Distance {
    private static Postcodes postcodes = new Postcodes();

    public static void main(String[] args) {
        double[] latlng1 = queryDatabaseForLongLat("AB11 6UL");
        double lat1 = latlng1[0];
        double lng1 = latlng1[1];

        double[] latlng2 = queryDatabaseForLongLat("YO30 5QL");
        double lat2 = latlng2[0];
        double lng2 = latlng2[1];

        System.out.println(haversine(lat1, lng1, lat2, lng2));
    }

    private static double[] queryDatabaseForLongLat(String postcode){
        return postcodes.postcodes.get(postcode); // dummy method
    }

    private static double haversine(double lat1, double lng1, double lat2, double lng2) {
        int r = 6371; // average radius of the earth in km

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lng2 - lng1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                        * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return r * c;
    }


}
