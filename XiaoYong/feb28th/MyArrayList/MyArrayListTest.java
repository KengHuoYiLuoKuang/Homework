package basestone.practice.feb28th;

import basestone.practice.feb26th.salary.Employee;
import basestone.practice.feb26th.salary.Manager;
import basestone.practice.feb26th.salary.Salesperson;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Employee> arrayList = new MyArrayList<>();

        Manager manager = new Manager("001", "Tom");
        Salesperson salesperson = new Salesperson("002", "Jerry", 8000);

        //数组初始大小为10，向数组中放入超过数组大小的元素个数
        for (int i = 0; i < 10; i++) {
            arrayList.add(manager);
        }
        for (int j = 0; j < 5; j++) {
            arrayList.add(salesperson);
        }
        manager = (Manager) arrayList.get(5);

        if (arrayList.get(13) != null) {
            salesperson = (Salesperson)arrayList.get(13);
            System.out.println(salesperson.getName());
        }

    }
}
