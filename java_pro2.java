class Bird{
	Bird(){
		int eagle = 23;
		int tb =164;
		int hawk = 19;
		int snake = 78;
		int deer = 95;
		System.out.println("This is constructor of Bird class and total number of birds are "+ tb + " here");
	}
}
	
class Eagle extends Bird{
	Eagle(){
		System.out.println("The total number of " + deer + " deers are eaten by eagle which counts " + eagle + "of them");
	}
}

class Hawk extends Bird{
	Hawk(){
		System.out.println("In last year the total number of " + snake + " snakes are eaten by hawks which counts total" + hawk + " of them");
	}
}

public class java_pro2{
public static void main(String[] args){

	System.out.println("Now I am in main method");
	
	Bird b = new Bird();
	Eagle E = new Eagle();
	Hawk H = new Hawk();
}
}