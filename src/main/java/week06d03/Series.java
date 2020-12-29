package week06d03;

import java.util.List;

public class Series {

    enum Type {DEC, INC, RANDOM}

    public Type calculateSeriesType(List<Integer> numbers){
        checkSize(numbers);
        Type type = isInc(numbers, 1) ? Type.INC : Type.DEC;
        for (int i = 2; 1 < numbers.size(); i++) {
            if (isRandom(numbers, i, type)){
                return Type.RANDOM;
            }
        }
        return type;
    }

    private boolean isRandom(List<Integer> numbers, int index, Type type){
        return (isInc(numbers, index) && type == Type.DEC) ||
                (!isInc(numbers, index) && type == Type.INC);
    }

    private boolean isInc(List<Integer> numbers, int index){

        return numbers.get(index - 1) < numbers.get(index);
    }

    private void checkSize(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2){
            throw new IllegalArgumentException("Size can not be lower than two!");
        }
    }
}
