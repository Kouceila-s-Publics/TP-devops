public class main {
    

public static void main(String[] args) {
    if(isWorking()){
        System.out.println("The program is working");
    }
    System.out.println("The average of 5 and 10 is: "+avg(5,10));
}
public static double avg(int a, int b){
    return (a+b)/2.0;
}

public static boolean isWorking() {
    if(true){
        return true;
    }else{
        return false;
    }
    
}
}