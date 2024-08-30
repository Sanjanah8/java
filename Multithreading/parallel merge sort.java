import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

class ParallelMergeSort extends RecursiveAction {
    private int[] array;
    private int left, right;

    public ParallelMergeSort(int[] array, int left, int right) {
        this.array = array;
        this.left = left;
        this.right = right;
    }

    @Override
    protected void compute() {
        if (right - left <= 1) {
            return;
        }

        int mid = (left + right) / 2;

        ParallelMergeSort leftTask = new ParallelMergeSort(array, left, mid);
        ParallelMergeSort rightTask = new ParallelMergeSort(array, mid, right);

        invokeAll(leftTask, rightTask);

        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {
        int[] temp = new int[right - left];
        int i = left, j = mid, k = 0;

        while (i < mid && j < right) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i < mid) {
            temp[k++] = array[i++];
        }

        while (j < right) {
            temp[k++] = array[j++];
        }

        System.arraycopy(temp, 0, array, left, temp.length);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ParallelMergeSort(array, 0, array.length));

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
