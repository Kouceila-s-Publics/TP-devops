public class main {
    

public static void main(String[] args) {
    if(isWorking()){
        System.out.println("The program is working");
    }
    compterA10();
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
}