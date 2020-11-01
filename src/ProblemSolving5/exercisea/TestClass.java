package ProblemSolving5.exercisea;

public class TestClass {
    public static void main(String[] args) {


        Class yogaClass = new Class("Yoga for Beginners", "Community Centre,Ballyheigue", 23, new Time(19, 30, 0), new Time(20, 45, 00));

        Class zumbaClass = new Class("Intermediate Zumba", "Cacherciveen S.S Sports Hall", 23, new Time(19, 30, 0), new Time(20, 45, 00));

        Class oopClass = new Class("Yoga for Beginners", "Community Centre,Ballyheigue", 23, new Time(19, 30, 0), new Time(20, 45, 00));

        Class[] allClasses = new Class[3];


        allClasses[0] = yogaClass;
        allClasses[1]= zumbaClass;
        allClasses[2] = oopClass;

        System.out.println("Displaying the state of the " + allClasses.length + " Class objects at this point\n\n");

        for (int i=0;i< allClasses.length;i++){
            System.out.println("Class " + (i+1) + "\n\n" + allClasses[i] + "\n\n");

        }

        System.out.println("Trying to change the start and finish times of the Object Oriented Programming class to dodgy values of 11:60:-12 and -2:58:61 respectively");

        oopClass.setStartTime(new Time(11,60,-12));
        oopClass.setFinishTime(new Time(-2,58,61));

        System.out.println("\n\nThe state of the Object Oriented Programming Class object is now" + oopClass);

        Time yogaStartTime = new Time(19,45,00);
        System.out.println("\n\nTrying to change the start time of the Yoga class to 19:45:00 using a referenced Time object called yogaStartTime");

       yogaClass.setStartTime(yogaStartTime);

       System.out.println("The state of the YogaStartTime object is now\n\n" + yogaStartTime);

       System.out.println("\n\nNow changing the time of the referenced yogaStartTime object to 18:50:00");

       yogaStartTime.setHour(18);
       yogaStartTime.setMinute(50);

       System.out.println("\n\nThe state of Yoga Class object is now" + yogaClass);

       System.out.println("Now calling getFinishTime() to return the finish time of the zumba Class object - this is being stored in a Time object called zumbaFinishTime\n\n");

       Time zumbaFinishTime = zumbaClass.getFinishTime();

       System.out.println("\n\nNow trying to change....");

       zumbaFinishTime.setHour(19);
       zumbaFinishTime.setMinute(50);

       System.out.print("\n\nThe state of the zumba Class now " + zumbaFinishTime);

       System.out.println("\n\nThe stat of Zumba Class is now\n\n" + zumbaClass);






    }


    }

