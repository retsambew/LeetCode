/*
 * 1491. Average Salary Excluding the Minimum and Maximum Salary
 * Daily Problem - 1st may
 */

public class AvgSalaryExcl {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0];
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (min > salary[i])
                min = salary[i];
            if (max < salary[i])
                max = salary[i];
            sum += salary[i];
        }
        sum -= max + min;
        return sum / (salary.length - 2);
    }
}
