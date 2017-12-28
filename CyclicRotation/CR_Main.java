package CyclicRotation;


public class CR_Main {

	public static void main(String[] args) {
		
		int[] myArray = {3, 8, 9, 7, 6};
		int rotations = 3;
		int[] answer = solution(myArray, rotations);
		
		for(int i = 0; i < answer.length; i++)
		{
			System.out.print(answer[i] + " ");
		}
		
	}
	
	public static int[] solution(int[] arr, int rotations) {
		
		while(rotations != 0)
		{
			int temp = arr[arr.length - 1];
			for(int i = arr.length - 1; i > 0 ; i--)
			{
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			rotations--;
		}
		
		return arr;
	}
}
