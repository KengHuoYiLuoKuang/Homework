package xiaoming;

public class Xiaoming {
    public void gohome(Traffic b){
        System.out.print("小明");
        b.toolName();
        System.out.println("回家");
    }

    public static void main(String[] args) {
        String time = "7:10";
        Xiaoming xiaom = new Xiaoming();
        if(time.compareTo("6:00")<0){
            xiaom.gohome(new Bicycle());
        }else if(time.compareTo("7:00")<0){
            xiaom.gohome(new Bus());
        }else {
            xiaom.gohome(new Taxi());
        }
    }
}
