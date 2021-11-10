package HaikuAnalysis;

public class HaikuPoem {
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    public void haikuPoem(String firstLine, String secondLine, String thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public String getFirstLine(){
        return this.firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }
}
