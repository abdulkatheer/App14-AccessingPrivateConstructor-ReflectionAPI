package test;

import beans.Staff;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Client {
    /*
    This strategy is used by the spring framework to create instances even using a private constructor
     */

    public static Staff createObject() throws Exception {
        //Getting constructor with zero-arg
        Constructor<Staff> constructor = Staff.class.getDeclaredConstructor();

        //checking if private
        if(Modifier.isPrivate(constructor.getModifiers())){
            //make it accessible
            constructor.setAccessible(true);
            //create new instance
            Staff s = constructor.newInstance();
            return s;
        }

        return null;
    }

    public static Staff createObject(int id, String name, int salary) throws Exception {
        //Getting constructor with zero-arg
        Constructor<Staff> constructor = Staff.class.getDeclaredConstructor(Integer.class, String.class, Integer.class);

        //checking if private
        if(Modifier.isPrivate(constructor.getModifiers())){
            //make it accessible
            constructor.setAccessible(true);
            //create new instance
            Staff s = constructor.newInstance(id, name, salary);
            return s;
        }

        return null;
    }

    public static void main(String[] args) throws Exception{
        Staff s1 = createObject();
        s1.setId(101);
        s1.setName("Abdul Katheer");
        s1.setSalary(870000);

        Staff s2 = createObject(102, "Dhanalakshmi", 720000);

        System.out.println(s1);
        System.out.println(s2);
    }
}
