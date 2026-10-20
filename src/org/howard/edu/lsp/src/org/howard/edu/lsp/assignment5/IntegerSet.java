package org.howard.edu.lsp.assignment5;

import java.util.TreeSet;

/**
 * Represents a set of unique integers in ascending order.
 * Set operations return independent results without changing either input.
 */
public class IntegerSet {
    private final TreeSet<Integer> values = new TreeSet<>();

    /** Creates an empty set. */
    public IntegerSet() {
    }

    /** Removes all elements from this set. */
    public void clear() {
        values.clear();
    }

    /**
     * Returns the number of unique elements.
     * @return the set size
     */
    public int length() {
        return values.size();
    }

    /**
     * Compares the elements of two sets, regardless of insertion order.
     * @param b the set to compare
     * @return true if both sets contain the same elements; false if b is null
     */
    public boolean equals(IntegerSet b) {
        return b != null && values.equals(b.values);
    }

    /**
     * Checks whether this set contains a value.
     * @param value the integer to find
     * @return true if the value is present
     */
    public boolean contains(int value) {
        return values.contains(value);
    }

    /**
     * Returns the largest element.
     * @return the largest integer
     * @throws IllegalStateException if this set is empty
     */
    public int largest() {
        if (isEmpty()) {
            throw new IllegalStateException("The set is empty.");
        }
        return values.last();
    }

    /**
     * Returns the smallest element.
     * @return the smallest integer
     * @throws IllegalStateException if this set is empty
     */
    public int smallest() {
        if (isEmpty()) {
            throw new IllegalStateException("The set is empty.");
        }
        return values.first();
    }

    /**
     * Adds an integer, ignoring duplicates.
     * @param item the integer to add
     */
    public void add(int item) {
        values.add(item);
    }

    /**
     * Removes an integer if it is present.
     * @param item the integer to remove
     */
    public void remove(int item) {
        values.remove(item);
    }

    /**
     * Returns a new set containing elements from either set.
     * @param b the other non-null set
     * @return the union of the two sets
     */
    public IntegerSet union(IntegerSet b) {
        IntegerSet result = new IntegerSet();
        result.values.addAll(values);
        result.values.addAll(b.values);
        return result;
    }

    /**
     * Returns a new set containing elements shared by both sets.
     * @param b the other non-null set
     * @return the intersection of the two sets
     */
    public IntegerSet intersect(IntegerSet b) {
        IntegerSet result = new IntegerSet();
        result.values.addAll(values);
        result.values.retainAll(b.values);
        return result;
    }

    /**
     * Returns a new set containing elements in this set but not in b.
     * @param b the other non-null set
     * @return this set minus b
     */
    public IntegerSet diff(IntegerSet b) {
        IntegerSet result = new IntegerSet();
        result.values.addAll(values);
        result.values.removeAll(b.values);
        return result;
    }

    /**
     * Returns a new set containing elements in b but not in this set.
     * @param b the other non-null set
     * @return b minus this set, as defined by the assignment
     */
    public IntegerSet complement(IntegerSet b) {
        return b.diff(this);
    }

    /**
     * Checks whether every element of this set is also in b.
     * @param b the other non-null set
     * @return true if this set is a subset of b, including an empty set
     */
    public boolean isSubsetOf(IntegerSet b) {
        return b.values.containsAll(values);
    }

    /**
     * Checks whether the two sets have no elements in common.
     * @param b the other non-null set
     * @return true if there are no shared elements
     */
    public boolean isDisjoint(IntegerSet b) {
        for (int value : values) {
            if (b.contains(value)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a new set containing elements that occur in exactly one set.
     * @param b the other non-null set
     * @return the symmetric difference of the two sets
     */
    public IntegerSet symmetricDiff(IntegerSet b) {
        IntegerSet result = union(b);
        IntegerSet shared = intersect(b);
        result.values.removeAll(shared.values);
        return result;
    }

    /**
     * Checks whether this set has no elements.
     * @return true if the set is empty
     */
    public boolean isEmpty() {
        return values.isEmpty();
    }

    /**
     * Returns elements in ascending order, separated by a comma and space.
     * @return the elements in square brackets, or [] for an empty set
     */
    @Override
    public String toString() {
        return values.toString();
    }
}
