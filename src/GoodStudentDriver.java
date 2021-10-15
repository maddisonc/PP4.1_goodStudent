public class GoodStudentDriver
{

    public static void main (String[] args)
    {

        GoodStudent turing = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent nightingale = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent hopper = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);


//        GoodStudent gates = new GoodStudent("Bill", "Gates", 3.98, true);
//        System.out.println(hopper.CreateID());
//        System.out.println(gates.CSGPA());

        // Call toString to output Alan Turing
        System.out.println(turing.toString());

        // Call setters & getters to update and output Florence’s ID: 95366 and gpa: 3.92
        nightingale.setIdNum(95366);
        nightingale.setGpa(3.92);
        System.out.println("\nFlorence's ID: " + nightingale.getIdNum());
        System.out.println("Florence's GPA: " + nightingale.getGpa());

        // Call getters to output Grace’s first name and CS status
        System.out.println("\nFirst name: " + hopper.getFirstName());
        System.out.println("CS status: " + hopper.getIsCsStudent());

        // Call CreateID() for all three
        System.out.println("\nAlan's ID" + turing.CreateID());
        System.out.println("Florence's ID" + nightingale.CreateID());
        System.out.println("Grace's ID" + hopper.CreateID());

        // Call CSGPA() for all three
        System.out.println("\nAlan's CS GPA: " + turing.CSGPA());
        System.out.println("Florence's CS GPA: " + nightingale.CSGPA());
        System.out.println("Grace's CS GPA: " + hopper.CSGPA());

    } // end main

} // end GoodStudentDriver class
