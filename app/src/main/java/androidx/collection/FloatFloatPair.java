package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m13482boximpl(long j) {
        return new FloatFloatPair(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m13483component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m13484component2impl(long j) {
        return Float.intBitsToFloat((int) (j & KeyboardMap.kValueMask));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13486constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13487equalsimpl(long j, Object obj) {
        return (obj instanceof FloatFloatPair) && j == ((FloatFloatPair) obj).m13493unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13488equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m13489getFirstimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m13490getSecondimpl(long j) {
        return Float.intBitsToFloat((int) (j & KeyboardMap.kValueMask));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13491hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13492toStringimpl(long j) {
        return "(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & KeyboardMap.kValueMask)) + ')';
    }

    public boolean equals(Object obj) {
        return m13487equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m13491hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m13492toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m13493unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13485constructorimpl(float f, float f2) {
        return m13486constructorimpl((Float.floatToRawIntBits(f2) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f) << 32));
    }
}
