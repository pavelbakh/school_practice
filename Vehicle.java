
/**
 * Write a description of class Vehicle here.
 * This class represents a vehicle
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    // instance variables - replace the example below with your own
    private int kilometres;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        // initialise instance variables
        kilometres = 0;
    }

    /**
     * Drive this vehicle until it breaks!
     */
    public void drive()
    {
        while(kilometres<50)
        {
            kilometres=kilometres+1;
            System.out.println(kilometres);
        }
        System.out.println("Broken!");
    }
}

/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    // instance variables - replace the example below with your own
    private int kilometres;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        // initialise instance variables
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    void drive()
    {
        while(kilometres<50)
        {
        kilometres=kilometres+1;
        System.out.println(kilometres);
        if(kilometres==50)
        {
            System.out.println("Broken!");
        }
    }
    }
}
