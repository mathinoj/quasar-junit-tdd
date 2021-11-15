public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String password){
        String hash = "";

        for(char character : password.toCharArray()){
//            System.out.println(character);
            switch (character){
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                default:
                    hash += character;
            }

        }

        return hash;

        //return password; //this would have been the minimum to get it to compile (according to doug)
    }

    public static boolean checkPassword(String password, String hash){
        //return false; //DOUG did this to see test fail
        return hash.equals(hashPassword(password));
    }
}
//this is implementation for the first method in CodeupCryptTests