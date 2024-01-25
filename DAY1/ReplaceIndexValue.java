public class ReplaceIndexValue {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9},i;
        System.out.println("old arry");
        for(i=0;i<a.length;i++)
        {
            System.out.println(+a[i]);
            if(a[2]==7){
                a[2]=1;
            }
            System.out.println("new arry");
            for(i=0;i<=a.length;i++){
                System.out.println(+a[i]);
            }

        }
    }
}

