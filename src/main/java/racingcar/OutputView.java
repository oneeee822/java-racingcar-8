package racingcar;

import java.util.List;

public class OutputView {
    public static void printRoundResult(List<Car> cars){
        for(Car c : cars){
            System.out.print(c.getName()+" : ");
            for(int i =0 ; i<c.getPosition(); i++){
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}
