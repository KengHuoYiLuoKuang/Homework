package feb28th.myarraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();

        String str = "MyArrayList.";

        //数组初始大小为10，向数组中放入超过数组大小的元素个数
        for (int i = 0; i < 10; i++) {
            arrayList.add(str);
        }

        str = arrayList.get(5);
        System.out.println(str);
    }
}
