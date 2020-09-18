package dk.cphbusiness.dm.sets;

public class Program {
    public static void main(String[] args) {
        IntegerSet A = new RangeSet(30, Long.MAX_VALUE);
        IntegerSet B = new RangeSet(Long.MIN_VALUE, 21);
        IntegerSet C = A.union(B);

        System.out.println("0: "+C.isMember(0));
        System.out.println("25: "+C.isMember(25));
        System.out.println("32: "+C.isMember(32));
    }
}
