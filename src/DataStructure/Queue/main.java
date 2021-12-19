package DataStructure.Queue;

public class main {
    public static void main(String[] arg)
    {
        Employee john=new Employee("Jane","Jean",1);
        Employee elsa=new Employee("John","nerla",1);
        Employee yuki=new Employee("Mary","rom",1);
        Employee tanya=new Employee("Mike","doge",1);
        Employee bt=new Employee("bt","bt",1);
        Employee Before=new Employee("before","after",1);

        Array_Queue q=new Array_Queue(5);
        q.add(john);
//        q.add(elsa);
//        q.add(yuki);
//        q.add(tanya);
//        q.add(bt);
//        q.add(Before);
 //        q.add(elsa);

//        q.remove(); q.remove(); q.remove(); q.remove(); q.remove(); q.remove();
//
        q.add(elsa);
//        q.remove();
//
        q.add(elsa);
        q.remove();

        q.add(elsa);
        q.remove();

        q.add(elsa);
        q.remove();

        q.add(elsa);
        q.remove();

        q.add(elsa);
        q.remove();


//        q.add(yuki);
//        q.add(tanya);
//        q.add(bt);
//        q.add(Before);

        q.printQueue();

//        System.out.println(q.size());

//        q.printQueue();
//        System.out.println(q.peek());

    }
}
