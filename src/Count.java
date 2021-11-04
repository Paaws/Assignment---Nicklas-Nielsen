public class Count {

    private int rowCount;
    private int letterCount;

    public Count() {
        rowCount = 0;
        letterCount = 0;
    } //Konstruktor

    public void increaseRows() {
        rowCount += 1;
    } //Ökar raderna varje gång den kallas

    public int getRows() {
        return rowCount;
    } //Retunerar ökningen av rader

    public void increaseLetters(String letterIncrease) {
        letterCount = letterCount + letterIncrease.length();
    } //Ökar antalet tecken efter varje ord som inmatas

    public int getLetterAmount() {
        return letterCount;
    } //Retunerar antalet tecken

    public boolean isStop(String stop) {
        if (stop.contains("Stop") || stop.contains("stop")) {
            return true;
        } else {
            return false;
        }
    } //Kollar om ordet "Stop" inmatas, stannar om det görs, fortsätter annars

    public void print() {
        System.out.println("Amount of rows: " + rowCount);
        System.out.println("Amount of letters: " + letterCount);
    } //Skriver ut antalet tecken och rader när den kallas

}
