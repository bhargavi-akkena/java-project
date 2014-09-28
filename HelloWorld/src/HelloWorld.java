public class HelloWorld 
{ 
    public static int DistributingMedals(int input1,int[] input2,int[] input3,int[] input4,int input5)
    {
        //Write code here
        if(input1 < 1 || input1 > 1000){
        	return -1;
        }
        if(input5 < 1 || input5 > 1000000000){
        	return -1;
        }
       for(int i = 0; i < input2.length;i++){
       	if(input2[i] < 1 || input2[i] > 100){
       		return -1;
        }
       }
       if((input3.length != input4.length) || (input2.length != input3.length) || (input1 != input3.length)){
       	return -1;
       }
       
        int sum = 0;
        for(int i =0; i < input1; i++){
        	if((input3[i] > input4[i]) || (input3[i] < 1) 
        	|| (input4[i]<1) || (input3[i] > 1000000) || (input4[i] > 1000000)){
        		return -1;
        	}
        	for(int j = input3[i];j <= input4[i];j++){
           		sum = sum + input2[i];
           		if(sum > input5){
           			return j;
           		}
           	}
        }
        return -1;
    }
}