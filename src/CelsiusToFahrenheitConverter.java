public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        double celsius = -10;

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }

}

//Test
//28.0 °C -> 82.4 °F
//0.0 °C -> 32.0 °F
//-10.0 °C -> 14.0 °F