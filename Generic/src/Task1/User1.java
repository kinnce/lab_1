package Task1;

public class User1 {
    private String login;
    private String password;

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User1() {}

    public class Query{
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
