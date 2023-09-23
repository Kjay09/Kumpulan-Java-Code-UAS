package NO_3;
interface flying{
    void fly();
}

class Eagle implements flying {
    public void fly() {
        System.out.println("Elang terbang di udara mengintai mangsa");
    }
}

class Jet implements flying {
    public void fly() {
        System.out.println("Pesawat berada dalam posisi take off");
    }
}

class Owl implements flying {
    public void fly() {
        System.out.println("Burung hantu bertengger dan bersuara Huuu hu hu huu");
    }
}

class Crow implements flying {
    public void fly() {
        System.out.println("Gagak terbang dan berkoak");
    }
}


class Helicopter implements flying {
    public void fly() {
        System.out.println("Helikopter terbang mengitari gedung");
    }
}
public class NO_3 {
    public static void main(String[] args) {

        flying eagle = new Eagle();
        eagle.fly();


        flying crow = new Crow();
        crow.fly();
        

        flying owl = new Owl();
        owl.fly();

        
        flying jet = new Jet();
        jet.fly();

        
        flying helicopter = new Helicopter();
        helicopter.fly();
    } 
}
