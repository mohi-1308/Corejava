package abtract;
abstract class Bird {
abstract void makeSound();
}
class Sparrow extends Bird {
public void makeSound() {
System.out.println("The sound that a sparrow makes : chiv chiv");
}
}
class Crow extends Bird {
public void makeSound() {
System.out.println("The sound that an crow makes: cav cav");
}
}

public class AbractBirdsEX {
public static void main(String[]args) {
Sparrow s = new Sparrow();
s.makeSound();
Crow c = new Crow();
c.makeSound();
/*Bird beref;//reference object
beref=s;
beref.makeSound();
Bird ceref;
ceref=c;
ceref.makeSound();*/
}
}






