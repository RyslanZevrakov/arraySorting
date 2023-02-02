package sortingBubble;
import java.util.Arrays;
public class SortingBubbleImplementation
{

        void SortingBubbleImplementation (int nums[])
        {
            int n = nums.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (nums[j] > nums[j+1])
                    {

                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
        }
       public void implementation(){
            SortingBubbleImplementation  ob = new SortingBubbleImplementation ();
            int nums[] = {7,22,-100,3,22*5/1+12-0, -5, 3, 2, 1, 0, 45};
            System.out.println("Original Array:");
            System.out.println(Arrays.toString(nums));
            ob.SortingBubbleImplementation (nums);
            System.out.println("Sorted Array");
            System.out.println(Arrays.toString(nums));
        }
    }

