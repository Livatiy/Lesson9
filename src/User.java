public class User {
    private String login;
    Acount acount;

    User(String login, String password) {
        this.login = login;

        this.acount = new Acount(password);

    }


    class Acount {
        private String password;


        Acount(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.println("Account Login successful! Login: " + login + ", Password: " + password);
        }
    }
}


