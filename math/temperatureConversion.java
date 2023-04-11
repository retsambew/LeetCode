/*
 * Problem 2469 - Maths
 * Convert the Temperature
 */

 
class temperatureConversion {
    public double[] convertTemperature(double celsius) {
        double f=celsius*1.8 + 32.00;
        double k=celsius+273.15;
        double[] ans={k,f};
        return ans;
    }
}