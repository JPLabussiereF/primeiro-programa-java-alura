public class Temperatura {
    public static void main(String[] args) {
        double celsiusTemperature = 23.4;
        double fahrenheitTemperature = celsiusTemperature * 1.8 + 32;

        int fahrenheitTemperatureWithoutDecimalCases = (int) fahrenheitTemperature;
        System.out.println("A temperatura Fahrenheit sem casas decimais é: " + fahrenheitTemperatureWithoutDecimalCases);
    }
}
