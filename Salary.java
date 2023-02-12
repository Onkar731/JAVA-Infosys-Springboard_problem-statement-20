public class Salary {
    public static float findNetSalary(int basicSalary, int travelAllowance, int homeAllowance) {
        // finding gross salary
        int grossSalary = basicSalary + travelAllowance + homeAllowance;
        float taxPercentage = 0.0f;
        
        // calculating net salary based on income category
        if(grossSalary > 5000) {
            taxPercentage = 0.3f;
        } else if(grossSalary >= 1000 && grossSalary <= 5000) {
            taxPercentage = 0.2f;
        } else {
            taxPercentage = 0.1f;
        }

        // returning net salary
        return grossSalary - (grossSalary*taxPercentage);
    }
}
