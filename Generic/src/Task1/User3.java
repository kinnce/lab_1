package Task1;

public class User3 {
    private static String login;
    private static String password;

    public User3(String login, String password) {
        User3.login = login;
        User3.password = password;
    }

    public User3() {}

    public static class  Query{
        public void printToLog(){
            if(password != null || login != null){
                System.out.println("User with login '" + login + "' and password '" + password + "' sent request"); return;
            }
            System.out.println("Error! Login and password not specified");
        }
    }
    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
}
