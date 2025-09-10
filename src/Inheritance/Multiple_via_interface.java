package Inheritance;

interface Ronaldo{
    void scores();
}

interface Neymar{
    void dribbles();
}

class Football implements Ronaldo, Neymar{
    public void scores(){
        System.out.println("Ronaldo scores goals");
    }
    public void dribbles(){
        System.out.println("Neymar dribbles the ball");
    }


}

public class Multiple_via_interface {
    public static void main(String[] args) {
        Football fb = new Football();
        fb.scores();
        fb.dribbles();
    }
}
