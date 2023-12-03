public class Bstmain {
    public static void main(String[] args) {
        BstImp<Integer> bstImp = new BstImp<Integer>();

        bstImp.insertData(56);
        bstImp.insertData(30);
        bstImp.insertData(70);
        bstImp.insertData(40);
        bstImp.insertData(22);
        bstImp.insertData(60);
        bstImp.insertData(95);
        bstImp.insertData(11);
        bstImp.insertData(65);
        bstImp.insertData(3);
        bstImp.insertData(16);
        bstImp.insertData(63);
        bstImp.insertData(67);

        System.out.println(bstImp.size());
        System.out.println(bstImp.searchData(11));
        System.out.println(bstImp.searchData(100));

    }
}
