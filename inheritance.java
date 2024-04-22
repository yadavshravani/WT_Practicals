// Java program to illustrate the
// concept of inheritance

// base class
public class Inheritance {

        public int gear;
        public int speed;

        //  constructor
        public Inheritance(int gear, int speed)
        {
            this.gear = gear;
            this.speed = speed;
        }

        //  methods
        public void applyBrake(int decrement)
        {
            speed -= decrement;
        }

        public void speedUp(int increment)
        {
            speed += increment;
        }

        // toString() method to print info of Bicycle
        public String toString()
        {
            return ("No of gears are " + gear + "\n"
                    + "speed of bicycle is " + speed);
        }
    }

    // derived class
    class MountainBike extends Inheritance {

        // the MountainBike subclass adds one more field
        public int seatHeight;

        // the MountainBike subclass has one constructor
        public MountainBike(int gear, int speed,
                            int startHeight)
        {
            // invoking base-class constructor
            super(gear, speed);
            seatHeight = startHeight;
        }

        // the MountainBike subclass adds one more method
        public void setHeight(int newValue)
        {
            seatHeight = newValue;
        }

        // overriding toString() method print more info
        @Override public String toString()
        {
            return (super.toString() + "\nseat height is "
                    + seatHeight);
        }
    }

    // driver class
     class Test {
        public static void main(String args[])
        {

            MountainBike mb = new MountainBike(3, 100, 25);
            System.out.println(mb.toString());
        }
    }
