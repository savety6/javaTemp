import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        UserAcc user1 = null;
        try {
            user1 = new UserAcc();
            System.out.print("username: ");
            user1.setUserName(scan.nextLine());
            System.out.print("password: ");
            user1.setPassword(scan.nextLine());
        }catch(UserException e){
            System.err.print(e);
            return;
        }
        System.out.println("hay" + user1.getUserName());
        System.out.println("hay");

    }
}
