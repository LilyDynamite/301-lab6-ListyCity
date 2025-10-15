package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "AB");
    }

    @Test
    public void testAdd()
    {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City c = new City("Regina", "SK");
        cityList.add(c);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(c));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Edmonton", "AB");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        // This line checks if the first city in the cityList (retrieved by cityList.getCities().get(0))
        // is the same as the city returned by mockCity()
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        // Now the original city should be at position 1
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCities()
    {
        CityList cityList = mockCityList();

        //see if we can add a city and have it
        City c = new City("Regina", "SK");
        cityList.add(c);
        assertEquals(true, cityList.hasCity(c));

        //see if we have a city we don't really have
        City fake = new City("Fake", "AB");
        assertEquals(false, cityList.hasCity(fake));
    }


    @Test
    void testDeleteCities()
    {
        //make sure we have a city
        CityList cityList = mockCityList();
        City c = new City("Regina", "SK");
        cityList.add(c);

        //make sure the city is in our list
        assertEquals(true, cityList.hasCity(c));


        //see if we can delete the city
        cityList.deleteCity(c);
        assertEquals(false, cityList.hasCity(c));

    }

    @Test
    void countCities()
    {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        City c = new City("Regina", "SK");
        cityList.add(c);

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.getCities().contains(c));
    }

}