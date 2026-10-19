public class main {
    

public static void main(String[] args) {
    if(isWorking()){
        System.out.println("The program is working");
        
    }compterA10();
    System.out.println("The average of 5 and 10 is: "+avg(5,10));
    sayMyName("heisenburg");
}
public static double avg(int a, int b){
    return (a+b)/2.0;
}
public static void compterA10() {
    for(int i = 1; i <= 10; i++){
         System.out.println("le nombre est :" +i);
    }
   
}
public static boolean isWorking() {
    if(true){
        return true;
    }else{
        return false;
    }
    
}
public static void  sayMyName(String name) {
    System.out.println(name);
    if(name.equals("heisenburg")){
        System.out.println("You're gdr");
}
}
}