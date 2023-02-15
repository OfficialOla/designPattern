public class MailServices {
    public void sendEmail(){
        connect();
        authenticate();
        // actual email
        disconnect();


    }
    private  void connect(){
        System.out.println("Connected");
    }
    private void authenticate(){
        System.out.println("Authenticate");
    }
    private  void disconnect(){
        System.out.println(("Disconnected"));
    }
}
