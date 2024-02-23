package Arrays;

import java.util.Scanner;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int tappedWater = 0;
        while(left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(leftMax < rightMax){
                tappedWater += (leftMax - height[left]);
                left++; 
            }
            else{
                tappedWater += (rightMax - height[right]);
                right--;
            }
        }
        return tappedWater;
    }
}
