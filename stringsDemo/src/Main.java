public class Main {
    public static void main(String[] args) {
        String message = "Today, weather is beautiful";

/*
        // string lenght. LENGTH
        System.out.println("Length is " + message.length() );

        // string find a char at any position. CHARAT
        System.out.println("5th digit is " + message.charAt(4) );

        // string merge with string or any text etc.  CONCAT
        System.out.println(message.concat(", I love it!"));
            // It's not saved until you put in a variable
        System.out.println(message);

        // Is your string starting with "anything you want" STARTSWITH
        System.out.println(message.startsWith("To"));
        System.out.println(message.endsWith("."));

        // picking string chars and storing in a variable - GETCHARS
            // Careful! = srcEnd is not searching the last value
        char[] characters = new char[5];
        message.getChars( 0, 5, characters, 0);
        System.out.println(characters);

        // Position of the search as first element INDEXOF
        // Position of the search as last element LASTINDEXOF
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('a'));
*/
        // Replacing the old target with new target REPLACE

            //You can use string
            //System.out.println(message.replace("Tod", "gad"));

            //Or char doesn't matter
        System.out.println(message.replace(' ', '-'));

        // Cutting a piece from variable  SUBSTRING
        System.out.println(message.substring(6, message.length()));

        // SPLITTING from a target into new variables SPLIT
        for (String messageWords : message.split(" ")) {
            System.out.println(messageWords);
        }

        // To make uppercase or lowercase
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

    // Handling spaces start - end
    message = "    Today, weather is beautiful      ";
    System.out.println(message.trim());
    }
}