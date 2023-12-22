package Task1;

public class User2 {
    private String login;
    private String password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User2() {}

    public void createQuery(){
        class Query{
            public void printToLog(){
                if(password != null || login != null){
                    System.out.println("User with login '" + login + "' and password '" + password + "' sent request"); return;
                }
                System.out.println("Error! Login and password not specified");
            }
        }
        Query query = new Query();
        query.printToLog();
    }
}
