package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public void run(){
        String names = InputView.inputCarNames();
        List<Car> cars = setupCars(names);

        String tryCnt = InputView.inputTryCnt();
        Validator.validateTryCnt(tryCnt);
    }

    private List<Car> setupCars(String carNames){
        String names[] = carNames.split(",");
        Validator.validateNames(names);

        List<Car> carList = new ArrayList<>();
        for (String n : names) {
            carList.add(new Car(n));
        }

        return carList;
    }
}
