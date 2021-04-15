package algoDS;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fuelAtStation[] = new int[] {1,2};
		int fuelNeededForNext[] = new int[] {2,1};
		int start = 0;
		boolean flag = false;
		
		for(int i =0;i<fuelAtStation.length;i++) {
			if(fuelNeededForNext[i]<=fuelAtStation[i] && flag == false) {
				start = i;
				System.out.println("Start "+i);
				flag = true;
			}
			
			if(flag == true) {
				System.out.println(fuelAtStation[i]+ "** "+fuelNeededForNext[i]);
				int diff = fuelAtStation[i] - fuelNeededForNext[i];
				System.out.println("Diff "+diff);
				if(diff < 0) {
					System.out.println("False");
					break;
				}
				if(i == fuelAtStation.length - 1) {
					i = -1;
					System.out.print("circular");
					fuelAtStation[i+1]+=diff;
					System.out.println("Now at "+(i+1)+" "+fuelAtStation[i+1] );
				}
				else {
					System.out.println("Fuel at i+1 "+fuelAtStation[i+1] );
					fuelAtStation[i+1]+= diff;
					System.out.println( "Now at "+(i+1)+" "+fuelAtStation[i+1] );
				}
				if(i == start-1) {
					System.out.println("true");
					break;
				}
				
			}
		}
	}

}
