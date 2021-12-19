package DataStructure.Lists;

public class Employee_DoubleLinkedList {
    public static void main(String[] arg)
    {
        Employee john=new Employee("Jane","Jean",1);
        Employee elsa=new Employee("John","nerla",1);
        Employee yuki=new Employee("Mary","rom",1);
        Employee tanya=new Employee("Mike","doge",1);
        Employee bt=new Employee("bt","bt",1);
        Employee Before=new Employee("before","after",1);
        EmployeeDoubleLinkedList list=new EmployeeDoubleLinkedList();

        list.addtoFront(john);
        list.addtoFront(elsa);
        list.addtoFront(yuki);
        list.addtoFront(tanya);

        list.addBefore(Before,elsa);
        list.printlist();
//
        System.out.println(list.getSize());

        System.out.println("************************************\n\n");

        list.addBefore(Before,tanya);
        list.printlist();
//
        System.out.println(list.getSize());



        System.out.println("************************************\n\n");

        list.addBefore(Before,john);
        list.printlist();
//
        System.out.println(list.getSize());

//
//        System.out.println("***************************\n*****************************\n\n");
//
//        Employee bill=new Employee("Tanya The Love","Senki",8888);
//        Employee bill2=new Employee("The Killua Love","Zoldyck",16);
//
//        list.addtoEnd(bill);
//        list.addtoEnd(bill2);
//
//        list.printlist();
//        System.out.println(list.getSize());
//
//        list.removetoStart();
//
//        list.printlist();
//        System.out.println(list.getSize());
//
//        list.removetoEnd();
//        list.printlist();
//        System.out.println(list.getSize());
//
//        list.addtoFront(new Employee("tanya","dego",8));
//
//        list.printlist();
//        System.out.println(list.getSize());
//
//
//        list.addtoEnd(new Employee("tanya","dego",8));
//
//        list.printlist();
//        System.out.println(list.getSize());

    }
}
