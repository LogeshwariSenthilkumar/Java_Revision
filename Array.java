import java.util.Arrays;
class Demo{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Demo1{
    public static void main(String[] args){
        int[] arr1={30,40,20,50,10};
        int max=arr1[0];
        int min=arr1[0];
        for(int j=0;j<arr1.length;j++){
            if(arr1[j]>max){
                max=arr1[j];
            }
            else if(arr1[j]<min){
                min=arr1[j];
            }
        }
        System.out.println("Largest Element is : "+max);
        System.out.println("Smalles Element is : "+min);
    }
}

class Demo2{
    public static void main(String[] args){
        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
        for(int k=0;k<arr2.length;k++){
            for(int l=0;l<arr2.length;l++){
                System.out.print(arr2[k][l]+" ");
            }
            System.out.println();
        }
    }
}

class Demo3{
    public static void main(String[] args){
        int[][] arr3={{1,2,3},{4,5},{6},{7,8,9}};
        for(int m=0;m<arr3.length;m++){
          for(int n=0;n<arr3[m].length;n++){
             System.out.print(arr3[m][n]+" ");
          }
          System.out.println();
        }
    }
}

class Demo4{
    public static void main(String[] args){
        int[] arr4={9,3,8,1,2};
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}

class Demo5{
    public static void main(String[] args){
        int[] arr5={3,2,4,5};
        int[] arr6={3,2,4,5};
        System.out.println(Arrays.equals(arr5,arr6));

        int[] arr7=new int[arr5.length];
        arr7=Arrays.copyOf(arr5,(arr5.length));
        System.out.println(Arrays.toString(arr7));

        int[] arr8={3,4,5,6};
        System.out.println(Arrays.toString(arr8));
        Arrays.fill(arr8,100);
        System.out.println(Arrays.toString(arr8));
    }
}

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
   void display(){
    System.out.println("ID: "+id);
    System.out.println("Name: "+name);
   }
}

class Demo6{
    public static void main(String[] args){
        Student[] students={new Student(101,"Logu"),new Student(102,"Janu"),new Student(103,"Barani")};
        for(Student s:students){
            s.display();
        }
    }
}

class Book{
    String title;
    int price;
    Book(String title,int price){
        this.title=title;
        this.price=price;
    }
}
class Demo7{
    public static void main(String[] args){
       Book[] books={new Book("Book1",450),new Book("Book2",550),new Book("Bokk3",350),new Book("Book4",950)};
        int total=0;
       for(Book b:books){
        total+=b.price;
       }
       System.out.println("Total Price: "+total);
    }
}