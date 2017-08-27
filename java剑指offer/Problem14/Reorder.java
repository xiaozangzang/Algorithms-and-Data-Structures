package Problem14;

public class Reorder {
	/*
	 * 输入一个整数数组，实现一个函数来调整数组中的数字的顺序，使得所有奇数位于数组的前半部分，偶数位于后半部分
	 */
	public void reOrderArray(int [] array) {
        for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
public void reOrderArray(int [] array) {
        for(int i = 1;i < array.length;i++){
           int temp = array[i];
            if(temp % 2 == 1){
            	for(int j = i;j > 0;j--){
                    if(array[j - 1] % 2 == 0){
                          int t = array[j];
                          array[j] = array[j - 1];
                          array[j - 1] = t;
                     }
                }
            }
        }
    }

}
