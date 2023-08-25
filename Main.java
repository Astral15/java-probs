public class Main {
  public static void main(String[] args) {
    System.out.println(mean(new int[]{ 5, 2, 5, 9, 8, 12 }));
  }

  public static double mean(int[] nums) {
    int total = 0;
    int count = 0;
    for (int i = 1; i < nums.length; i += 2) {
      total += nums[i];
      count++;
    }
    return total / (double) count;
  }

  public static boolean isPalindrome(int number) {
    int reversed = 0, num = number;
    while (number > 0) {
      reversed = reversed * 10 + number % 10;
      number /= 10;
    }
    return reversed == num;
  }

  public static boolean arrayContains(int[] numbers, int number) {
    for (int num : numbers)
      if (num == number)
        return true;
    return false;
  }

  public static int countOnes(int number) {
    String bin = Integer.toBinaryString(number);
    int count = 0;
    for (char i : bin.toCharArray())
      if (i == '1')
        count++;
    return count;
  }

}
