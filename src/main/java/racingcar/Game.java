package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private final List<Car> cars;

    public Game(String carNames) {
        this.cars = setupCars(carNames);
    }

    private List<Car> setupCars(String carNames){
        String names[] = carNames.split(",");
        Validator.validateNames(names);

        List<Car> carList = new ArrayList<>();
        for (String n : names) {
            carList.add(new Car(n.trim()));
        }

        return carList;
    }

    public void playSingleRound() {
        for(Car c : cars){
            c.move();
        }
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public List<String> findWinners() {
        int maxPosition = findMaxPosition();

        return cars.stream()
                .filter(car -> car.getPosition()==maxPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int findMaxPosition() {
        int maxPos = 0;
        for(Car c : cars){
            if(c.getPosition()>maxPos) {
                maxPos = c.getPosition();
            }
        }
        return maxPos;
    }
}
