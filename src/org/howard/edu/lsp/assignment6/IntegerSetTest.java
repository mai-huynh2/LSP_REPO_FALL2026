package org.howard.edu.lsp.assignment6;
 
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
 
/**
 * Assignment 6: JUnit 5 tests for IntegerSet.
 *
 * Checks normal, empty, boundary, exceptional, and independent-result behavior.
 * Each test creates its own sets and runs independently.
 */
public class IntegerSetTest {
 
    // clear()
 
    /**
     * Create a populated set; call clear(); assert that it is empty and its length is zero.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testClearClearsPopulatedSet() {
        IntegerSet s = set(-3, 0, 8);
        s.clear();
        assertTrue(s.isEmpty());
        assertEquals(0, s.length());
        assertFalse(s.contains(-3));
        assertFalse(s.contains(0));
        assertFalse(s.contains(8));
        assertEquals("[]", s.toString());
    }
 
    /**
     * Clear an already empty set; verify it remains empty.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testClearClearsEmptySet() {
        IntegerSet s = new IntegerSet();
        s.clear();
        assertTrue(s.isEmpty());
        assertEquals(0, s.length());
        assertEquals("[]", s.toString());
    }
 
    // length()
 
    /**
     * Add repeated and unique integers; assert the number of distinct elements.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testLengthCountsUniqueElements() {
        IntegerSet s = set(3, 3, -2, 0, -2, 7, 0);
        assertEquals(4, s.length());
    }
 
    /**
     * Verify a new empty set has length zero.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testLengthEmptySetLength() {
        IntegerSet s = new IntegerSet();
        assertEquals(0, s.length());
    }
 
    // equals()
 
    /**
     * Construct sets with identical elements in different insertion orders; assert equality.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testEqualsIgnoresInsertionOrder() {
        IntegerSet a = set(-3, 0, 8, 15);
        IntegerSet b = set(15, 8, -3, 0);
        assertNotSame(a, b);
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
 
    /**
     * Construct sets of equal length with different elements; assert inequality.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testEqualsDetectsDifferentContents() {
        IntegerSet a = set(1, 2, 3);
        IntegerSet b = set(1, 2, 4);
        assertEquals(a.length(), b.length());
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }
 
    /**
     * Verify two separately constructed empty sets compare equal.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testEqualsEmptySetsEqual() {
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();
        assertNotSame(a, b);
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
 
    /**
     * Verify a set equals itself and differs from a set of another size.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testEqualsSameObjectAndDifferentSizes() {
        IntegerSet a = set(-1, 0);
        IntegerSet b = set(-1);
        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }
 
    // contains()
 
    /**
     * Verify contains() is true for a present element and false for an absent one.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testContainsPresentAndAbsent() {
        IntegerSet s = set(-3, 0, 9);
        assertTrue(s.contains(-3));
        assertTrue(s.contains(0));
        assertTrue(s.contains(9));
        assertFalse(s.contains(8));
        assertFalse(s.contains(-9));
    }
 
    /**
     * Verify an empty set does not contain an arbitrary integer.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testContainsEmptySetContainsNothing() {
        IntegerSet s = new IntegerSet();
        assertFalse(s.contains(0));
        assertFalse(s.contains(-1));
        assertFalse(s.contains(Integer.MAX_VALUE));
    }
 
    // largest()
 
    /**
     * Verify largest() returns the maximum across negative, zero, and positive values.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testLargestNegativeAndPositiveValues() {
        IntegerSet s = set(-20, -5, 0, 13);
        assertEquals(13, s.largest());
        assertEquals(-5, set(-20, -5, -8).largest());
        assertEquals(7, set(7).largest());
        assertEquals(Integer.MAX_VALUE, set(Integer.MIN_VALUE, 0, Integer.MAX_VALUE).largest());
        assertEquals("[-20, -5, 0, 13]", s.toString());
    }
 
    /**
     * Use assertThrows() to verify IllegalStateException for an empty set.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testLargestEmptySetThrowsException() {
        IntegerSet s = new IntegerSet();
        assertThrows(IllegalStateException.class, () -> s.largest());
    }
 
    // smallest()
 
    /**
     * Verify smallest() returns the minimum across negative, zero, and positive values.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testSmallestNegativeAndPositiveValues() {
        IntegerSet s = set(20, -5, 0, 13);
        assertEquals(-5, s.smallest());
        assertEquals(5, set(20, 5, 8).smallest());
        assertEquals(-7, set(-7).smallest());
        assertEquals(Integer.MIN_VALUE, set(Integer.MIN_VALUE, 0, Integer.MAX_VALUE).smallest());
        assertEquals("[-5, 0, 13, 20]", s.toString());
    }
 
    /**
     * Use assertThrows() to verify IllegalStateException for an empty set.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testSmallestEmptySetThrowsException() {
        IntegerSet s = new IntegerSet();
        assertThrows(IllegalStateException.class, () -> s.smallest());
    }
 
    // add()
 
    /**
     * Add the same integer repeatedly; verify only one copy exists.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testAddIgnoresDuplicates() {
        IntegerSet s = new IntegerSet();
        s.add(4);
        s.add(4);
        s.add(4);
        assertEquals(1, s.length());
        assertTrue(s.contains(4));
        assertEquals("[4]", s.toString());
    }
 
    /**
     * Add Integer.MIN_VALUE, Integer.MAX_VALUE, and zero; verify all are represented.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testAddHandlesIntegerBoundaries() {
        IntegerSet s = new IntegerSet();
        s.add(Integer.MAX_VALUE);
        s.add(Integer.MIN_VALUE);
        s.add(0);
        assertEquals(3, s.length());
        assertTrue(s.contains(Integer.MIN_VALUE));
        assertTrue(s.contains(Integer.MAX_VALUE));
        assertTrue(s.contains(0));
        assertEquals("[-2147483648, 0, 2147483647]", s.toString());
    }
 
    // remove()
 
    /**
     * Remove a present element; verify it is absent and others remain.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testRemoveRemovesExistingElement() {
        IntegerSet s = set(1, 2, 3);
        s.remove(2);
        assertFalse(s.contains(2));
        assertTrue(s.contains(1));
        assertTrue(s.contains(3));
        assertEquals(2, s.length());
        assertEquals("[1, 3]", s.toString());
        IntegerSet singleton = set(-4);
        singleton.remove(-4);
        assertTrue(singleton.isEmpty());
        assertEquals(0, singleton.length());
    }
 
    /**
     * Remove an absent element; verify the set is unchanged.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testRemoveIgnoresAbsentElement() {
        IntegerSet s = set(1, 3);
        s.remove(9);
        assertEquals("[1, 3]", s.toString());
        assertEquals(2, s.length());
        assertFalse(s.contains(9));
        IntegerSet empty = new IntegerSet();
        empty.remove(9);
        assertTrue(empty.isEmpty());
        assertEquals(0, empty.length());
    }
 
    // union()
 
    /**
     * Verify union() contains all distinct elements from two overlapping sets.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testUnionOverlappingSets() {
        IntegerSet a = set(-3, 0, 8);
        IntegerSet b = set(8, 11);
        IntegerSet result = a.union(b);
        assertEquals("[-3, 0, 8, 11]", result.toString());
        assertEquals(4, result.length());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[-3, 0, 8]", a.toString());
        assertEquals("[8, 11]", b.toString());
    }
 
    /**
     * Verify union with an empty set and with the same object.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testUnionEmptyAndSameOperand() {
        IntegerSet s = set(1, 2);
        IntegerSet empty = new IntegerSet();
        IntegerSet withEmpty = s.union(empty);
        IntegerSet fromEmpty = empty.union(s);
        IntegerSet withSelf = s.union(s);
        assertEquals("[1, 2]", withEmpty.toString());
        assertEquals("[1, 2]", fromEmpty.toString());
        assertEquals("[1, 2]", withSelf.toString());
        assertNotSame(s, withEmpty);
        assertNotSame(s, fromEmpty);
        assertNotSame(s, withSelf);
        withEmpty.add(9);
        fromEmpty.remove(1);
        withSelf.clear();
        assertEquals("[1, 2]", s.toString());
        assertEquals("[]", empty.toString());
        assertEquals("[]", empty.union(empty).toString());
    }
 
    /**
     * Verify both inputs remain unchanged; modify the result and verify the inputs are still unchanged.
     * Assignment 5 equivalent: 3 point(s).
     */
    @Test
    public void testUnionDoesNotMutateInputs() {
        IntegerSet a = set(1, 2);
        IntegerSet b = set(2, 3);
        IntegerSet result = a.union(b);
        assertEquals("[1, 2, 3]", result.toString());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        result.remove(2);
        result.add(99);
        assertEquals("[1, 3, 99]", result.toString());
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        a.add(-10);
        b.remove(3);
        assertEquals("[1, 3, 99]", result.toString());
    }
 
    // intersect()
 
    /**
     * Verify intersection contains exactly the shared elements.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIntersectOverlappingSets() {
        IntegerSet a = set(-3, 0, 8);
        IntegerSet b = set(8, -3, 11);
        IntegerSet result = a.intersect(b);
        assertEquals("[-3, 8]", result.toString());
        assertEquals(2, result.length());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[-3, 0, 8]", a.toString());
        assertEquals("[-3, 8, 11]", b.toString());
    }
 
    /**
     * Verify disjoint intersection is empty and self-intersection is unchanged.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIntersectDisjointAndSameOperand() {
        IntegerSet a = set(1);
        IntegerSet b = set(2);
        IntegerSet disjoint = a.intersect(b);
        assertEquals("[]", disjoint.toString());
        assertNotSame(a, disjoint);
        assertNotSame(b, disjoint);
        assertEquals("[1]", a.toString());
        assertEquals("[2]", b.toString());
        IntegerSet s = set(1, 2);
        IntegerSet withSelf = s.intersect(s);
        assertEquals("[1, 2]", withSelf.toString());
        assertNotSame(s, withSelf);
        withSelf.remove(1);
        assertEquals("[1, 2]", s.toString());
        assertEquals("[]", s.intersect(new IntegerSet()).toString());
        assertEquals("[]", new IntegerSet().intersect(s).toString());
    }
 
    /**
     * Modify the intersection result and verify both input sets remain unchanged.
     * Assignment 5 equivalent: 3 point(s).
     */
    @Test
    public void testIntersectIndependentResult() {
        IntegerSet a = set(1, 2);
        IntegerSet b = set(2, 3);
        IntegerSet result = a.intersect(b);
        assertEquals("[2]", result.toString());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        result.remove(2);
        result.add(99);
        assertEquals("[99]", result.toString());
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        a.add(-10);
        b.add(10);
        assertEquals("[99]", result.toString());
    }
 
    // diff()
 
    /**
     * Verify A.diff(B) returns elements in A but not B, and distinguish direction.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testDiffDirectionMatters() {
        IntegerSet a = set(1, 2, 3);
        IntegerSet b = set(2, 3, 4);
        IntegerSet forward = a.diff(b);
        IntegerSet reverse = b.diff(a);
        assertEquals("[1]", forward.toString());
        assertEquals("[4]", reverse.toString());
        assertNotSame(a, forward);
        assertNotSame(b, forward);
        assertNotSame(a, reverse);
        assertNotSame(b, reverse);
        assertEquals("[1, 2, 3]", a.toString());
        assertEquals("[2, 3, 4]", b.toString());
    }
 
    /**
     * Verify difference with an empty set and difference with itself.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testDiffEmptyAndSameOperand() {
        IntegerSet s = set(1, 2);
        IntegerSet empty = new IntegerSet();
        IntegerSet withEmpty = s.diff(empty);
        IntegerSet withSelf = s.diff(s);
        IntegerSet fromEmpty = empty.diff(s);
        assertEquals("[1, 2]", withEmpty.toString());
        assertEquals("[]", withSelf.toString());
        assertEquals("[]", fromEmpty.toString());
        assertNotSame(s, withEmpty);
        assertNotSame(s, withSelf);
        assertNotSame(empty, fromEmpty);
        withEmpty.clear();
        withSelf.add(9);
        fromEmpty.add(8);
        assertEquals("[1, 2]", s.toString());
        assertEquals("[]", empty.toString());
    }
 
    /**
     * Modify the difference result and verify neither input changes.
     * Assignment 5 equivalent: 3 point(s).
     */
    @Test
    public void testDiffIndependentResult() {
        IntegerSet a = set(1, 2);
        IntegerSet b = set(2, 3);
        IntegerSet result = a.diff(b);
        assertEquals("[1]", result.toString());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        result.remove(1);
        result.add(99);
        assertEquals("[99]", result.toString());
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        a.add(-10);
        b.add(10);
        assertEquals("[99]", result.toString());
    }
 
    // complement()
 
    /**
     * Verify A.complement(B) returns elements in B but not A.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testComplementReverseDifference() {
        IntegerSet a = set(1, 2, 3);
        IntegerSet b = set(2, 3, 4);
        IntegerSet forward = a.complement(b);
        IntegerSet reverse = b.complement(a);
        assertEquals("[4]", forward.toString());
        assertEquals("[1]", reverse.toString());
        assertNotSame(a, forward);
        assertNotSame(b, forward);
        assertNotSame(a, reverse);
        assertNotSame(b, reverse);
        assertEquals("[1, 2, 3]", a.toString());
        assertEquals("[2, 3, 4]", b.toString());
    }
 
    /**
     * Verify complement with an empty receiver and with an empty argument.
     * Assignment 5 equivalent: 1 point(s).
     */
    @Test
    public void testComplementEmptyOperands() {
        IntegerSet empty = new IntegerSet();
        IntegerSet s = set(5);
        IntegerSet fromEmpty = empty.complement(s);
        IntegerSet withEmpty = s.complement(empty);
        IntegerSet withSelf = s.complement(s);
        assertEquals("[5]", fromEmpty.toString());
        assertEquals("[]", withEmpty.toString());
        assertEquals("[]", withSelf.toString());
        assertNotSame(s, fromEmpty);
        assertNotSame(empty, withEmpty);
        assertNotSame(s, withSelf);
        fromEmpty.clear();
        withEmpty.add(9);
        withSelf.add(8);
        assertEquals("[5]", s.toString());
        assertEquals("[]", empty.toString());
    }
 
    /**
     * Modify the complement result and verify neither input changes.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testComplementIndependentResult() {
        IntegerSet a = set(1, 2);
        IntegerSet b = set(2, 3);
        IntegerSet result = a.complement(b);
        assertEquals("[3]", result.toString());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        result.remove(3);
        result.add(99);
        assertEquals("[99]", result.toString());
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        a.add(-10);
        b.add(10);
        assertEquals("[99]", result.toString());
    }
 
    // isSubsetOf()
 
    /**
     * Verify a proper subset is recognized.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIsSubsetOfProperSubset() {
        IntegerSet a = set(-3, 8);
        IntegerSet b = set(-3, 0, 8, 15);
        assertTrue(a.isSubsetOf(b));
        assertFalse(b.isSubsetOf(a));
    }
 
    /**
     * Verify a set with an element missing from the other set is not a subset.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIsSubsetOfNotSubset() {
        IntegerSet a = set(1, 4);
        IntegerSet b = set(1, 2, 3);
        assertFalse(a.isSubsetOf(b));
        assertFalse(b.isSubsetOf(a));
    }
 
    /**
     * Verify equal sets are subsets of each other.
     * Assignment 5 equivalent: 1 point(s).
     */
    @Test
    public void testIsSubsetOfEqualSets() {
        IntegerSet a = set(2, 1);
        IntegerSet b = set(1, 2);
        assertTrue(a.isSubsetOf(b));
        assertTrue(b.isSubsetOf(a));
        assertTrue(a.isSubsetOf(a));
    }
 
    /**
     * Verify the empty set is a subset of a nonempty set, but not vice versa.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIsSubsetOfEmptyCases() {
        IntegerSet empty = new IntegerSet();
        IntegerSet s = set(1);
        assertTrue(empty.isSubsetOf(s));
        assertFalse(s.isSubsetOf(empty));
        assertTrue(empty.isSubsetOf(new IntegerSet()));
        assertTrue(empty.isSubsetOf(empty));
    }
 
    // isDisjoint()
 
    /**
     * Verify disjoint sets return true.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIsDisjointNoOverlap() {
        IntegerSet a = set(-2, 0);
        IntegerSet b = set(3, 4);
        assertTrue(a.isDisjoint(b));
        assertTrue(b.isDisjoint(a));
    }
 
    /**
     * Verify overlapping sets return false.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIsDisjointOverlap() {
        IntegerSet a = set(1, 2);
        IntegerSet b = set(2, 4);
        assertFalse(a.isDisjoint(b));
        assertFalse(b.isDisjoint(a));
    }
 
    /**
     * Verify disjointness with an empty set and with the same nonempty object.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testIsDisjointEmptyAndSameOperand() {
        IntegerSet empty = new IntegerSet();
        IntegerSet s = set(1, 2);
        assertTrue(empty.isDisjoint(s));
        assertTrue(s.isDisjoint(empty));
        assertTrue(empty.isDisjoint(new IntegerSet()));
        assertTrue(empty.isDisjoint(empty));
        assertFalse(s.isDisjoint(s));
    }
 
    // symmetricDiff()
 
    /**
     * Verify symmetric difference contains elements appearing in exactly one set.
     * Assignment 5 equivalent: 3 point(s).
     */
    @Test
    public void testSymmetricDiffPartiallyOverlappingSets() {
        IntegerSet a = set(-3, 0, 8, 15);
        IntegerSet b = set(-3, 8, 11, 22);
        IntegerSet result = a.symmetricDiff(b);
        assertEquals("[0, 11, 15, 22]", result.toString());
        assertEquals(4, result.length());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[0, 11, 15, 22]", b.symmetricDiff(a).toString());
        assertEquals("[-3, 0, 8, 15]", a.toString());
        assertEquals("[-3, 8, 11, 22]", b.toString());
    }
 
    /**
     * Verify symmetric difference of identical sets is empty.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testSymmetricDiffIdenticalSets() {
        IntegerSet a = set(1, 2);
        IntegerSet b = set(2, 1);
        IntegerSet equalSets = a.symmetricDiff(b);
        IntegerSet withSelf = a.symmetricDiff(a);
        assertEquals("[]", equalSets.toString());
        assertEquals("[]", withSelf.toString());
        assertNotSame(a, equalSets);
        assertNotSame(b, equalSets);
        assertNotSame(a, withSelf);
        equalSets.add(9);
        withSelf.add(8);
        assertEquals("[1, 2]", a.toString());
        assertEquals("[1, 2]", b.toString());
    }
 
    /**
     * Verify behavior with an empty set and with disjoint sets.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testSymmetricDiffEmptyAndDisjointSets() {
        IntegerSet empty = new IntegerSet();
        IntegerSet a = set(2, 3);
        IntegerSet fromEmpty = empty.symmetricDiff(a);
        IntegerSet withEmpty = a.symmetricDiff(empty);
        assertEquals("[2, 3]", fromEmpty.toString());
        assertEquals("[2, 3]", withEmpty.toString());
        assertNotSame(a, fromEmpty);
        assertNotSame(a, withEmpty);
        fromEmpty.clear();
        withEmpty.add(9);
        assertEquals("[2, 3]", a.toString());
        assertEquals("[]", empty.toString());
        IntegerSet b = set(5, 7);
        IntegerSet disjoint = a.symmetricDiff(b);
        assertEquals("[2, 3, 5, 7]", disjoint.toString());
        assertNotSame(a, disjoint);
        assertNotSame(b, disjoint);
        assertEquals("[2, 3]", a.toString());
        assertEquals("[5, 7]", b.toString());
        assertEquals("[]", empty.symmetricDiff(empty).toString());
    }
 
    /**
     * Modify the result and verify both input sets remain unchanged.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testSymmetricDiffIndependentResult() {
        IntegerSet a = set(1, 2);
        IntegerSet b = set(2, 3);
        IntegerSet result = a.symmetricDiff(b);
        assertEquals("[1, 3]", result.toString());
        assertNotSame(a, result);
        assertNotSame(b, result);
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        result.remove(1);
        result.remove(3);
        result.add(99);
        assertEquals("[99]", result.toString());
        assertEquals("[1, 2]", a.toString());
        assertEquals("[2, 3]", b.toString());
        a.add(-10);
        b.add(10);
        assertEquals("[99]", result.toString());
    }
 
    // isEmpty()
 
    /**
     * Verify a newly constructed set is empty.
     * Assignment 5 equivalent: 1 point(s).
     */
    @Test
    public void testIsEmptyNewSet() {
        IntegerSet s = new IntegerSet();
        assertTrue(s.isEmpty());
    }
 
    /**
     * Verify a set with an element is not empty.
     * Assignment 5 equivalent: 1 point(s).
     */
    @Test
    public void testIsEmptyPopulatedSet() {
        IntegerSet s = set(0);
        assertFalse(s.isEmpty());
    }
 
    /**
     * Clear a populated set and verify it is empty.
     * Assignment 5 equivalent: 1 point(s).
     */
    @Test
    public void testIsEmptyAfterClear() {
        IntegerSet s = set(1, 2, 3);
        assertFalse(s.isEmpty());
        s.clear();
        assertTrue(s.isEmpty());
        assertEquals(0, s.length());
    }
 
    // toString()
 
    /**
     * Verify elements appear in ascending numeric order regardless of insertion order.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testToStringAscendingOrder() {
        IntegerSet s = set(8, -3, 15, 0, -10, 2);
        assertEquals("[-10, -3, 0, 2, 8, 15]", s.toString());
        assertEquals(6, s.length());
    }
 
    /**
     * Verify an empty set formats as [].
     * Assignment 5 equivalent: 1 point(s).
     */
    @Test
    public void testToStringEmptyFormatting() {
        IntegerSet s = new IntegerSet();
        assertEquals("[]", s.toString());
    }
 
    /**
     * Verify comma-space formatting, brackets, and duplicate suppression.
     * Assignment 5 equivalent: 2 point(s).
     */
    @Test
    public void testToStringExactSpacingAndDuplicates() {
        IntegerSet s = set(2, 1, 2, 3, 1);
        assertEquals("[1, 2, 3]", s.toString());
        assertEquals("[-5]", set(-5, -5).toString());
    }
 

    private IntegerSet set(int... values) {
        IntegerSet result = new IntegerSet();
        for (int value : values) {
            result.add(value);
        }
        return result;
    }
}
