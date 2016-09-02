/**
 * Created by WXQ on 2016/9/2.
 */
public class UserService {

    public String getUserName(){
        return "xqwen";
    }

    public void setUserName(){
        System.out.println("Hello World");
    }

    public void getUserList(){
        System.out.println("get UserList");
    }

    public String getNameByUserId(){
        System.out.println("get name by userId ");
        return "user1";
    }

    public String getUserById(){
        System.out.println("get user by id");
        return "user";
    }
}
