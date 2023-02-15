import MementoPattern.Editor;

public class Main {
    public static void main(String[] args){
//       var account = new Account();
//       account.deposit(5);
//       account.deposit(10);
//       account.withdraw(20);
//        System.out.println(account.getBalance());
        var mailServices = new MailServices();
        mailServices.sendEmail();
        var textBox = new Textbox();
        textBox.enable();
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();

    }
}