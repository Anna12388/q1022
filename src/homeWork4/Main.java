package homeWork4;

import java.io.PrintStream;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Employee worker1 = new Worker("W1", "WS1", 1);
        Employee worker2 = new Worker("W2", "WS2", 2);
        Employee worker3 = new Worker("W3", "WS3", 3);
        Employee worker4 = new Worker("W4", "WS4", 4);
        Employee trainee1 = new Trainee("T1","TS1",1);
        Employee cleaner = new Cleaner("C1", "C2", 2);

        Employee director1 = new Director("D1", "DS1", 1 );
        Employee director2 = new Director("D2", "DS2", 2);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        ((Director)director1).addWorker(worker3);

        ((Director)director2).addWorker(worker4);

        ((Director)director1).addWorker(director2);
        
        worker1.addWorker(trainee1);

        Service service = new Service();

        out.println(service.find(worker1,"T1"));



    }
}
