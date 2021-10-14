public class GoodStudentDriver
{

    public static void main (String[] args)
    {

        GoodStudent turing = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent nightingale = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent hopper = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);


//        GoodStudent gates = new GoodStudent("Bill", "Gates", 3.98, true);
//
//        System.out.println(hopper.CreateID());
//        System.out.println(gates.CSGPA());

        System.out.println(turing.toString());
        System.out.println();

    } // end main

    //math.floor divide by 100
} // end GoodStudentDriver class
