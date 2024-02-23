package Arrays;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalTank = 0;
        int currTank = 0;
        int startingStation = 0;
        
        for (int i = 0; i < n; i++) {
            totalTank += gas[i] - cost[i];
            currTank += gas[i] - cost[i];
            // If current tank is negative, start from the next station
            if (currTank < 0) {
                startingStation = i + 1;
                currTank = 0;
            }
        }
        
        // If total gas is greater than or equal to total cost, there exists a solution
        return totalTank >= 0 ? startingStation : -1;
    }
}
