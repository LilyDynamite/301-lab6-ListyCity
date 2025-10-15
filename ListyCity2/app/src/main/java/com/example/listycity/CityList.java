package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* This class contains a list of City objects
 * @author Lily Wyton
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
    * This method adds a City to the city list, excluding duplicates
    * @param c: the object to add
     */
    public void add(City c)
    {
        //check if given city already exists in our list
        if(cities.contains(c))
        {
            throw new IllegalArgumentException();
        }
        cities.add(c);
    }

    /**
     * Returns a list of cities sorted in alphabetical order
     * @return List: a list of cities sorted in alphabetical order
     */
    public List<City> getCities()
    {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a given City is already in our list.
     * @param c: City we want to check if CityList contains
     * @return boolean: True if CityList contains City c already, false otherwise
     */
    public boolean hasCity(City c)
    {
        return cities.contains(c);
    }

    /**
     * This function deletes the given city from the CityList. Throws an
     * exception if the city is not in the list.
     * @param c: City to be deleted
     */
    public void deleteCity(City c)
    {
        if(hasCity(c)) {
            cities.remove(c);
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * Counts the number of elements in the CityList
     * @return int: Number of Cities in the CityList
     */
    public int countCities()
    {
        return cities.size();
    }

}
