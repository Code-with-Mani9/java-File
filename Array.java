package challange.challengeVVI.Arrray;

public class Array {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 80;
        myArr[1] = 65;
        myArr[2] = 99;
        myArr[3] = 90;
        myArr[4] = 77;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println( myArr[4]);

        myint();
        otherint();

    }

    public static void  myint(){

        int[] myArr = {81,72,49,6,88,77,};
        int index = 3;
      
      
        System.out.println("\n hello 'upar wala wihtout list of value hai','niche wala list of value' \n");
        System.out.println(myArr[index]);
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
        System.out.println(myArr[5]);
        
    }

    public static void otherint(){
        int[] myArr = {105,93,44,56,99,101,};
        int index = 0;
        while(index < myArr.length){
        System.out.println(myArr[index]);
        index++;

        
        }
       
        
    }

}
