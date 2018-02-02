public class Encryption implements Assignment{
    private String unicodeS;
    private String unicodeR;
    private String equals;
    private String results;

    public Encryption(String unicodeS, String unicodeR, String equals, String results){
        this.unicodeS = unicodeS;
        this.unicodeR = unicodeR;
        this.equals = equals;
        this.results = results;
    }

    public void setUnicodeS(String unicodeS) {
        this.unicodeS = unicodeS;
    }

    public String getUnicodeS() {
        return unicodeS;
    }

    public void setUnicodeR(String unicodeR) {
        this.unicodeR = unicodeR;
    }

    public String getUnicodeR() {
        return unicodeR;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }

    public String getEquals() {
        return equals;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getResults() {
        return results;
    }

    public String toString() {return " unicode S " + getUnicodeS() + "\n unicode R " + getUnicodeR()
    + "\n equals " + getEquals() + "\n results " +getResults();}
}
