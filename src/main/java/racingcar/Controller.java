package racingcar;

public class Controller {

    public void run(){
        String names = InputView.inputCarNames();
        setupCars(names);

        String tryCnt = InputView.inputTryCnt();
        Validator.validateTryCnt(tryCnt);
    }

    private void setupCars(String carNames){
        String names[] = carNames.split(",");
        Validator.validateNames(names);
    }
}
