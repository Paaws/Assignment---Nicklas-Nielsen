public class Count {

    private int rowCount;
    private int letterCount;

    public Count() {
        rowCount = 0;
        letterCount = 0;

    }

    public void increaseRows() {
        rowCount += 1;
    }

    public int getRows() {
        return rowCount;
    }

    public void increaseLetters(String letterIncrease) {
        letterCount = letterCount + letterIncrease.length();
    }

    public int getLetterAmount() {
        return letterCount;
    }

    public boolean isStop(String stop) {
        if (stop.contains("Stop") || stop.contains("stop")) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println("Amount of rows: " + rowCount);
        System.out.println("Amount of letters: " + letterCount);
    }
}
