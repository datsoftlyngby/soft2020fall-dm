package dk.cphbusiness.dm.sets;

public class RangeSet implements IntegerSet {
    private final long min;
    private final long max;

    public RangeSet(long min, long max) {
        this.min = min;
        this.max = max;
        }


    @Override
    public boolean isMember(long member) {
        return min <= member && member < max;
        }

    @Override
    public IntegerSet union(IntegerSet other) {
        // if other is RangeSet and they are overlapping return new RangeSet otherwise
        return new UnionSet(this, other);
    }
}
