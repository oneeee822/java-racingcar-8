package racingcar;

public class Controller {

    public void run(){
        String names = InputView.inputCarNames();
        String tryCnt = InputView.inputTryCnt();
        int tryCount = Validator.validateTryCnt(tryCnt);

        Game game = new Game(names);

        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            game.playSingleRound();
            OutputView.printRoundResult(game.getCars());
        }
    }
}
