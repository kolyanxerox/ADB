package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m13494boximpl(long j) {
        return new IntIntPair(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m13495component1impl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m13496component2impl(long j) {
        return (int) (j & KeyboardMap.kValueMask);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13498constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13499equalsimpl(long j, Object obj) {
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).m13505unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13500equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m13501getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m13502getSecondimpl(long j) {
        return (int) (j & KeyboardMap.kValueMask);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13503hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13504toStringimpl(long j) {
        return "(" + m13501getFirstimpl(j) + ", " + m13502getSecondimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m13499equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m13503hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m13504toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m13505unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13497constructorimpl(int i, int i2) {
        return m13498constructorimpl((i2 & KeyboardMap.kValueMask) | (i << 32));
    }
}
