package day3;

public interface Converter {
    public String decToBin(long num);

    public String decToOct(long num);

    public String decToHex(long num);

    public void saveStack(String result);
}
