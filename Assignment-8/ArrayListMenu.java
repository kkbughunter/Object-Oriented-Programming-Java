import java.util.*;
class ArrayListMenu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> arr = new LinkedList<String>();


        System.out.println("1. Append - add at end\n2. Insert  add at particular index\n3. Find the index of a particular element (Search)\n4. Display the list\n5. List all string starts with given letter\n6. List of all string contains the Substring\n7. Sort the elements in ArrayList\n8. Remove a particular element\n9. Replace one string with another string in ArrayList\n10. Remove duplicate elements");

        while(true){
            System.out.print("enter your option : ");
            int opt = sc.nextInt();
            switch(opt){
                case 1:
                    System.out.print("enter the element to be inserted : ");
                    String ele = sc.next();
                    arr.add(ele);
                    System.out.println(arr);
                    break;
                case 2:
                    System.out.print("enter the element to be inserted : ");
                    ele = sc.next();
                    System.out.print("enter the element Index : ");
                    int index = sc.nextInt();
                    index--;
                    arr.add(index, ele);
                    System.out.println(arr);
                    break;
                case 3:
                    System.out.print("enter the element to be inserted find Index : ");
                    ele = sc.next();
                    System.out.println("Index of a element is : " + arr.indexOf(ele));
                    break;
                case 4 :
                    System.out.println("Array elements : " + arr);
                    break;
                case 5 :
                    System.out.print("enter the starting Letter : ");
                    ele = sc.next();
                    for(String s : arr)
                        if(s.startsWith(ele)) System.out.println(s);
                    break;
                case 6:
                    System.out.print("enter the starting Letter : ");
                    ele = sc.next();
                    for(String s : arr)
                        if(s.contains(ele)) System.out.println(s);
                    break;
                case 7:
                    System.out.print("Sorted Array list : ");
                    Collections.sort(arr);
                    System.out.print(arr);
                    break;
                case 8:
                    System.out.print("enter the remove element : ");
                    ele = sc.next();
                    arr.remove(ele);
                    System.out.print(arr);
                    break;
                case 9:
                    System.out.print("enter the element to be removed : ");
                    ele = sc.next();
                    System.out.print("enter the element to be insert : ");
                    String el = sc.next();
                    index = arr.indexOf(ele);
                    arr.remove(index);
                    arr.add(index,el);
                    System.out.println(arr);
                    break;
                case 10:
                    Set<String> set = new LinkedHashSet<String>();
                    set.addAll(arr);
                    arr.clear();
                    arr.addAll(set);
                    System.out.println(arr);
                    break;
            }
        }
    }
}