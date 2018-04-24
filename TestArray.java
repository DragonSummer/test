public class TestArray {
	public static void main(String[] args){
		
		int size = 10;
		
		//定義數組
		double[] myList = new double[size];
		myList[0]=5.6;
		myList[1]=4.5;
		myList[2]=3.3;
		myList[3]=13.2;
		myList[4]=4.0;
		myList[5]=34.33;
		myList[6]=45.45;
		myList[7]=99.993;
		myList[8]=11123;
		myList[9]=34.0;

		//Sum
		double sum = 0.0;
		for(int i=0; i<myList.length; i++){
			sum += myList[i];
		}
		System.out.println("sum:"+sum);

		//find the Max
		for (int j=0; j<size; j++) {
			if(myList[0]<myList[j]){
				myList[0]=myList[j];
			}
		}
		System.out.println("Max:"+myList[0]);

	}
}