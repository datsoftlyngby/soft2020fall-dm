package dk.cphbusiness.dm.sets;

public interface IntegerSet {
    boolean isMember(long member);
    default IntegerSet union(IntegerSet other) {
        return new UnionSet(this, other);
        }
    }

