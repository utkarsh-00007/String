public class StringIntroduction {
    public static void main(String[] args) {
        String name = "Utkarsh Dwivedi";
        //by literals(variable name2) this is of string pool area(a sort of caching) to optimise memory
        // name2 will be stored in string pool area
        String name2 = new String("Utkarsh Dwivedi");
        // variable name3 will be stored in heap area ie 
        String name3 = "Utkarsh Dwivedi";
        /*
        heap area >> string pool area
        thats why result is false when name2 is compared with name3
         */
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println( name == name2);
        System.out.println( name2 == name3);
        System.out.println( name == name3);
        System.out.println(name.charAt(5));
        System.out.println(name.length());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5,11));
        System.out.println(name.contains("i"));
    }
}
