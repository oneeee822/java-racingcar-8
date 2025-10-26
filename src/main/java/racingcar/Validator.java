package racingcar;

public class Validator {
    public static void validateNames(String names[]){
        for(String n : names){
            if(n.length()>5 || n.isEmpty()){
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
            }
        }
    }

    public static int validateTryCnt(String tryCntInput){
        int tryCnt;

        try{
            tryCnt = Integer.parseInt(tryCntInput);
        } catch(NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 합니다.");
        }

        if (tryCnt < 1) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 1 이상이어야 합니다.");
        }

        return tryCnt;
    }
}
