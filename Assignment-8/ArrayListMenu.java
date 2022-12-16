import java.util.*;
class ArrayListMenu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> arr1 = new LinkedList<Integer>();
        LinkedList<Integer> arr2 = new LinkedList<Integer>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr2.add(30);
        arr2.add(40);
        arr2.add(50);
        arr2.add(60);

        System.out.println("1. Merge the two lists\n2. Find Union of two lists\n3. Find Intersection of two lists\n4. Compare two lists\n");
        System.out.println("List 1 :" + arr1);
        System.out.println("List 2 :" + arr2);
        while(true){
            System.out.print("enter your option : ");
            int opt = sc.nextInt();
            switch(opt){
                case 1:
                    arr1.addAll(arr2);
                    System.out.println("Updated List : " + arr1);
                    break;
                case 2:
                    for(Integer i: arr2)
                            if(arr1.indexOf(i) == -1)
                                arr1.add(i);
                    System.out.println("Updated List : " + arr1);
                    break;
                case 3:
                    int flag =0;
                    for(Integer i: arr2){
                        for(Integer j: arr1){
                            if(i == j){
                                System.out.println("Ther Intersection value is : " + i);
                                flag =1;
                                break;
                            }
                        }
                        if(flag==1)break;
                    }
                    break;
                case 4 :
                    if(arr1.equals(arr2))
                        System.out.println("The given list are equal..");
                    else 
                        System.out.println("The given list are Not equal..");
                    break;
            }
        }
    }
}