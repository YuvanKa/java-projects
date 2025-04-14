import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    private static Map<String, Double> fetchExchangeRates(String baseCurrency) {
        // Mock exchange rates for demonstration purposes.
        // In a real-world scenario, you'd call an API like https://exchangeratesapi.io/
        // or https://openexchangerates.org/
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0); // Assuming USD as the base currency
        rates.put("EUR", 0.84);
        rates.put("GBP", 0.75);
        rates.put("INR", 74.50);
        rates.put("JPY", 110.0);
        return rates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Currency Selection
        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Step 2: Fetch exchange rates
        Map<String, Double> rates = fetchExchangeRates(baseCurrency);
        if (!rates.containsKey(targetCurrency)) {
            System.out.println("Invalid target currency or exchange rate not available.");
        }

        // Step 3: Amount Input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Step 4: Currency Conversion
        double exchangeRate = rates.get(targetCurrency);
        double convertedAmount = amount * exchangeRate;

        // Step 5: Display Result
        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);

        scanner.close();
    }
}
