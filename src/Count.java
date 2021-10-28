public class Count {

    private int rowCount;
    private int letterCount;
    private String word;


    public Count(int myRowCount, String letter) {
        rowCount += myRowCount + 1;
        //letterCount = letter.length();
        word = letter;
    }

    public int getRows() {
        return rowCount;
    }

    public void increaseLetters(String letterIncrease) {
        letterCount += letterIncrease.length();
    }

    public int getLetterAmount() {
        return letterCount;
    }

    public boolean isStop(String letter) {
        if (letter.contains("Stop") || letter.contains("stop")) {
            return true;
        } else {
            return false;
        }
    }
}
