import java.util.Scanner;
import java.util.Arrays;

class arrayArithmetic {

  int size, sum=0;
  int arr[];
  Scanner inp = new Scanner(System.in);

  void input() {
    System.out.print("Input Size of the Array : ");
    size = inp.nextInt();
    arr = new int[size];
    System.out.print("Input " + size + " Elements into an Array : ");
    int i = 0;
    while(i<size) {
      arr[i] = inp.nextInt(); 
      i++;
    }
  }

  void sum() {
    for(int i=0; i<size; i++) {
      sum += arr[i];
    }
    System.out.println("Sum of the elements of an Array : " + sum);
  }

  void average() {
    System.out.println("Average of the elements of an Array : " + (sum/(float)size));
  }

  void sortArray() {
    Arrays.sort(arr);
    System.out.println("\n--Sorted Elements of an Array--");
    for(int i=0; i<size; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  void searchArray() {
    System.out.print("\n\nInput an element to search into an Array : ");
    int element = inp.nextInt();
    int index=-1, s=0, e=size-1;
    while(s <= e) {
      int mid = s+(e-s)/2; //s = 3, e = 4 => mid = 3 (if not break then will go into infinity)
      if(arr[mid] == element) {
        index = mid;
        break;
      } else if(arr[mid] < element) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }
    if(index == -1) {
      System.out.println("Element is not present in an Array"); 
    } else {
      System.out.println("Element is found at index : " + index); 
    }
  }   
  
  protected void finalize() {   //arrayMain.java uses or overrides a deprecated API.
    inp.close();
  }
}

class arrayMain {
  public static void main(String args[]) {
    arrayArithmetic A = new arrayArithmetic();
    A.input();
    A.sum();
    A.average();
    A.sortArray();
    A.searchArray();
  }
}