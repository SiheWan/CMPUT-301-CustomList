import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();//4
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize + 1,list.getCount());//5
    }

    @Test
    public void hasCityTest() {
        City citytest1=new City("Halifax", "NS");
        list.addCity(citytest1);
        assertEquals(true,list.hasCity(citytest1));
    }

    @Test
    public void deleteCityTest() {
        City citytest1=new City("Halifax", "NS");
        list.addCity(citytest1);
        list.delete(citytest1);
        assertEquals(false,list.hasCity(citytest1));
    }

    @Test
    public void countCityTest() {
        City citytest1=new City("Halifax", "NS");
        City citytest2=new City("Edmonton", "AB");
        City citytest3=new City("Red deer", "AB");
        list.addCity(citytest1);
        list.addCity(citytest2);
        list.addCity(citytest3);
        assertEquals(3,list.countCities());
    }




}
