public class CheckPassFail{
	public static void main(String[] args){
		int[] mark = {0, 49, 50, 51, 100};
		System.out.println("mark est " + mark);
		for(int i = 0; i < 6; i++) {

			if (mark[i] >= 50){
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		System.out.println("DONE");
			}
	}
}
