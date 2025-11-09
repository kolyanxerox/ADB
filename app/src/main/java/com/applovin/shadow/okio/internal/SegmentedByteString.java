package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C4592SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00O0Oo.o00Oo0;

/* renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes2.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i, int i2, int i3) {
        OooOo.OooO0o0(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final void commonCopyInto(C4592SegmentedByteString c4592SegmentedByteString, int i, byte[] target, int i2, int i3) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        OooOo.OooO0o0(target, "target");
        long j = i3;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c4592SegmentedByteString.size(), i, j);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i2, j);
        int i4 = i3 + i;
        int iSegment = segment(c4592SegmentedByteString, i);
        while (i < i4) {
            int i5 = iSegment == 0 ? 0 : c4592SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i6 = c4592SegmentedByteString.getDirectory$okio()[iSegment] - i5;
            int i7 = c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            OooOOO.Oooo0O0(c4592SegmentedByteString.getSegments$okio()[iSegment], i2, target, i8, i8 + iMin);
            i2 += iMin;
            i += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C4592SegmentedByteString c4592SegmentedByteString, Object obj) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        if (obj == c4592SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c4592SegmentedByteString.size() && c4592SegmentedByteString.rangeEquals(0, byteString, 0, c4592SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C4592SegmentedByteString c4592SegmentedByteString) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        return c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C4592SegmentedByteString c4592SegmentedByteString) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        int hashCode$okio = c4592SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c4592SegmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = c4592SegmentedByteString.getDirectory$okio()[length + i];
            int i5 = c4592SegmentedByteString.getDirectory$okio()[i];
            byte[] bArr = c4592SegmentedByteString.getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        c4592SegmentedByteString.setHashCode$okio(i2);
        return i2;
    }

    public static final byte commonInternalGet(C4592SegmentedByteString c4592SegmentedByteString, int i) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length - 1], i, 1L);
        int iSegment = segment(c4592SegmentedByteString, i);
        return c4592SegmentedByteString.getSegments$okio()[iSegment][(i - (iSegment == 0 ? 0 : c4592SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C4592SegmentedByteString c4592SegmentedByteString, int i, ByteString other, int i2, int i3) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        OooOo.OooO0o0(other, "other");
        if (i < 0 || i > c4592SegmentedByteString.size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iSegment = segment(c4592SegmentedByteString, i);
        while (i < i4) {
            int i5 = iSegment == 0 ? 0 : c4592SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i6 = c4592SegmentedByteString.getDirectory$okio()[iSegment] - i5;
            int i7 = c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!other.rangeEquals(i2, c4592SegmentedByteString.getSegments$okio()[iSegment], (i - i5) + i7, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C4592SegmentedByteString c4592SegmentedByteString, int i, int i2) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c4592SegmentedByteString, i2);
        if (i < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > c4592SegmentedByteString.size()) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(iResolveDefaultParameter, "endIndex=", " > length(");
            sbOooOOo0.append(c4592SegmentedByteString.size());
            sbOooOOo0.append(')');
            throw new IllegalArgumentException(sbOooOOo0.toString().toString());
        }
        int i3 = iResolveDefaultParameter - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(iResolveDefaultParameter, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && iResolveDefaultParameter == c4592SegmentedByteString.size()) {
            return c4592SegmentedByteString;
        }
        if (i == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c4592SegmentedByteString, i);
        int iSegment2 = segment(c4592SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) OooOOO.Oooo(c4592SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i4 = iSegment;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(c4592SegmentedByteString.getDirectory$okio()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr.length] = c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length + i4];
                if (i4 == iSegment2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iSegment != 0 ? c4592SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i - i7) + iArr[length];
        return new C4592SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C4592SegmentedByteString c4592SegmentedByteString) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        byte[] bArr = new byte[c4592SegmentedByteString.size()];
        int length = c4592SegmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = c4592SegmentedByteString.getDirectory$okio()[length + i];
            int i5 = c4592SegmentedByteString.getDirectory$okio()[i];
            int i6 = i5 - i2;
            OooOOO.Oooo0O0(c4592SegmentedByteString.getSegments$okio()[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final void commonWrite(C4592SegmentedByteString c4592SegmentedByteString, Buffer buffer, int i, int i2) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        OooOo.OooO0o0(buffer, "buffer");
        int i3 = i + i2;
        int iSegment = segment(c4592SegmentedByteString, i);
        while (i < i3) {
            int i4 = iSegment == 0 ? 0 : c4592SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i5 = c4592SegmentedByteString.getDirectory$okio()[iSegment] - i4;
            int i6 = c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i3, i5 + i4) - i;
            int i7 = (i - i4) + i6;
            Segment segment = new Segment(c4592SegmentedByteString.getSegments$okio()[iSegment], i7, i7 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                OooOo.OooO0O0(segment2);
                Segment segment3 = segment2.prev;
                OooOo.OooO0O0(segment3);
                segment3.push(segment);
            }
            i += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i2);
    }

    public static final void forEachSegment(C4592SegmentedByteString c4592SegmentedByteString, o00Oo0 action) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        OooOo.OooO0o0(action, "action");
        int length = c4592SegmentedByteString.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = c4592SegmentedByteString.getDirectory$okio()[length + i];
            int i4 = c4592SegmentedByteString.getDirectory$okio()[i];
            action.invoke(c4592SegmentedByteString.getSegments$okio()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    public static final int segment(C4592SegmentedByteString c4592SegmentedByteString, int i) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c4592SegmentedByteString.getDirectory$okio(), i + 1, 0, c4592SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C4592SegmentedByteString c4592SegmentedByteString, int i, int i2, o00Oo0 o00oo0) {
        int iSegment = segment(c4592SegmentedByteString, i);
        while (i < i2) {
            int i3 = iSegment == 0 ? 0 : c4592SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i4 = c4592SegmentedByteString.getDirectory$okio()[iSegment] - i3;
            int i5 = c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i2, i4 + i3) - i;
            o00oo0.invoke(c4592SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf((i - i3) + i5), Integer.valueOf(iMin));
            i += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C4592SegmentedByteString c4592SegmentedByteString, int i, byte[] other, int i2, int i3) {
        OooOo.OooO0o0(c4592SegmentedByteString, "<this>");
        OooOo.OooO0o0(other, "other");
        if (i < 0 || i > c4592SegmentedByteString.size() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iSegment = segment(c4592SegmentedByteString, i);
        while (i < i4) {
            int i5 = iSegment == 0 ? 0 : c4592SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i6 = c4592SegmentedByteString.getDirectory$okio()[iSegment] - i5;
            int i7 = c4592SegmentedByteString.getDirectory$okio()[c4592SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c4592SegmentedByteString.getSegments$okio()[iSegment], (i - i5) + i7, other, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }
}
