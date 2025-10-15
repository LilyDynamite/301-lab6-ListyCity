package com.example.listycity;
/**
* This class represents a city, which is represented by
* a name and province.
 * @author Lily Wyton
*/
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * Creates a City object
     * @param city : The name of the City
     * @param province: The province of the City
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city.
     * @return String: returns the name of the City this method is called
     * on.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the name of the city's province.
     * @return String: returns the province of the City this method is called
     * on.
     */
    String getProvinceName(){
        return this.province;
    }


    /**
     * This method compares cities based on alphabetical order
     * @param o: Object we're comparing to
     */
    @Override
    public int compareTo(Object o) {
        City c = (City) o;
        return this.city.compareTo(c.getCityName());
    }
}
