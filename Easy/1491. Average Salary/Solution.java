
public class Solution {
    public double average(int[] salary) {
        double sum = 0;
        mergeSort(salary);
        for (int i = 1; i < salary.length-1; i++) {
            sum+= salary[i];
        }
        return sum / (salary.length-2);
    }

    private void mergeSort(int[] salary) {
        int length = salary.length;

        if (length<2)return;

        int[] left = new int[length/2];
        int[] right = new int[length - length/2];

        System.arraycopy(salary, 0, left, 0, length / 2);

        if (length - length / 2 >= 0)
            System.arraycopy(salary, length / 2, right, 0, length - length / 2);

        mergeSort(left);
        mergeSort(right);
        merge(salary,left,right);

    }

    private void merge(int[] salary, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (left.length > i && right.length > j ){
            if (left[i] <= right[j]){
                salary[k] = left[i];
                i++;
            }else{
                salary[k] = right[j];
                j++;
            }
            k++;
        }

        while (left.length > i){
            salary[k] = left[i];
            i++;
            k++;
        }

        while (right.length > j){
            salary[k] = right[j];
            j++;
            k++;
        }
    }
}
