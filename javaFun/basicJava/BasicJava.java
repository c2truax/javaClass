public class BasicJava {
    public Integer[] print255(int num) {
        Integer[] myArr;
        myArr = new Integer[num];
        for (int i = 0; i < num; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }
    public Integer[] printOdd255(int num2) {
        Integer[] myArr2;
        myArr2 = new Integer[num2];
        for (int i = 0; i < num2; i++) {
            myArr2[i] = i + 1;
        }
        return myArr2;
    }
    public int printSum(int idx) {
        int sum = 0;
        for (int i=0; i < idx + 1; i++) {
            sum += i;
        }
        return sum;
    }
    public int iterateArray(int num3) {
        int num4 = num3;
        return num4;
    }
    public Integer findMax(Integer[] intArr) {
        Integer max = -10000000;
        for (int i=0; i<intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }
        }
        return max;
    }
    public Integer getAverage(Integer[] intArr) {
        Integer sum = 0;
        for (int i=0; i<intArr.length; i++) {
            sum += intArr[i];
        }
        return sum/intArr.length;
    }
    public Integer[] arrayOdd(int num2) {
        Integer[] myArr3;
        myArr3 = new Integer[Math.abs((num2/2)+1)];
        int i = 1;
        int j = 0;
        while (i < (num2 + 1)) {
            if (i % 2 == 1) {
                myArr3[j] = i;
                j++;
            }
            i++;
        }
        return myArr3;
    }
    public Integer biggerThanY(Integer[] intArr, Integer y) {
        int total = 0;
        for (int i=0; i < intArr.length; i++) {
            if (intArr[i] > y) {
                total += 1;
            }
        }
        return total;
    }
    public Integer[] squareTheVals(Integer[] intArr) {
        Integer[] squaredArr;
        squaredArr = new Integer[intArr.length];
        for (int i=0; i < intArr.length; i++) {
            squaredArr[i] = intArr[i] * intArr[i];
        }
        return squaredArr;
    }
    public Integer[] eliminateNeg(Integer[] intArr) {
        for (int i=0; i < intArr.length; i++) {
            if (intArr[i] < 0) {
                intArr[i] = 0;
            }
        }
        return intArr;
    }
    public Integer[] maxMinAve(Integer[] intArr) {
        Integer[] newArr = new Integer[3];
        Integer max = -10000000;
        Integer min = 10000000;
        Integer sum = 0;
        for (int i=0; i<intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }
            if (min > intArr[i]) {
                min = intArr[i];
            }
            sum += intArr[i];
        }
        newArr[0] = max;
        newArr[1] = min;
        newArr[2] = sum/intArr.length;
        return newArr;
    }
    public Integer[] shiftArray(Integer[] intArr) {
        for (int i=1; i < intArr.length; i++) {
            intArr[i-1] = intArr[i];
        }
        intArr[intArr.length - 1] = 0;
        return intArr;
    }
}