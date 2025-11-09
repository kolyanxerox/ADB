package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.InterfaceC3173h3;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hx */
/* loaded from: classes2.dex */
public final class C2855hx<T> extends C2722cz implements InterfaceC2707ck, InterfaceC2851ht<T> {

    /* renamed from: ﮐ */
    private static int f6682 = 0;

    /* renamed from: ﱟ */
    private static int[] f6683 = {-1756802235, -1064028084, -750845654, -88022561, -986125088, -1378334124, 2030642054, -70982709, 1155652130, -1155944456, 322288988, -1509271477, -776707607, -514941796, -609881498, -1611498786, 870276461, 2009668450};

    /* renamed from: ﱡ */
    private static int f6684 = 10;

    /* renamed from: ﻏ */
    private static int f6685 = 1;

    /* renamed from: ﻐ */
    private Collection f6686;

    /* renamed from: ﻛ */
    private Object f6687;

    /* renamed from: ｋ */
    private InterfaceC2851ht f6688;

    /* renamed from: ﾇ */
    private Map f6689;

    /* renamed from: ﾒ */
    private Field f6690;

    public C2855hx(Field field, Object obj, InterfaceC2851ht interfaceC2851ht) {
        this.f6690 = field;
        this.f6687 = obj;
        this.f6688 = interfaceC2851ht;
    }

    /* renamed from: ﮐ */
    private Object m6993() {
        int i = (f6685 + 41) % 128;
        f6682 = i;
        Object obj = this.f6687;
        int i2 = i + 79;
        f6685 = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﱟ */
    private InterfaceC2851ht m6994() {
        int i = f6685 + 57;
        f6682 = i % 128;
        if (i % 2 == 0) {
            return this.f6688;
        }
        int i2 = 95 / 0;
        return this.f6688;
    }

    /* renamed from: ﱡ */
    private Map m6995() {
        int i = f6682 + 109;
        f6685 = i % 128;
        if (i % 2 != 0) {
            return this.f6689;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    private Collection m6996() {
        int i = f6682;
        Collection collection = this.f6686;
        f6685 = (i + 99) % 128;
        return collection;
    }

    /* renamed from: ﻐ */
    private boolean m6998() {
        int i = f6685;
        int i2 = i + 79;
        f6682 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.f6686 != null) {
            return true;
        }
        int i3 = i + 41;
        f6682 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private boolean m6999() {
        int i = f6685;
        int i2 = (i + 53) % 128;
        f6682 = i2;
        if (this.f6690 != null) {
            f6682 = (i + 59) % 128;
            return true;
        }
        f6685 = (i2 + 23) % 128;
        return false;
    }

    /* renamed from: ﾇ */
    private void m7000(T t) throws IllegalAccessException, IllegalArgumentException {
        f6682 = (f6685 + 55) % 128;
        if (m6999()) {
            f6682 = (f6685 + 79) % 128;
            try {
                this.f6690.set(this.f6687, t);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ﾒ */
    private boolean m7002() {
        if (this.f6689 != null) {
            f6682 = (f6685 + 27) % 128;
            return true;
        }
        f6682 = (f6685 + 81) % 128;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2851ht
    /* renamed from: ｋ */
    public final T mo6934() {
        int i = f6682 + InterfaceC3173h3.d.b.f8823f;
        f6685 = i % 128;
        if (i % 2 == 0) {
            m6999();
            throw null;
        }
        if (m6999()) {
            try {
                return (T) this.f6690.get(this.f6687);
            } catch (Exception unused) {
            }
        } else if (m6998() || m7002()) {
            T t = (T) this.f6687;
            f6685 = (f6682 + 67) % 128;
            return t;
        }
        return null;
    }

    /* renamed from: ﻐ */
    private static String m6997(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f6684);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ */
    private static String m7001(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6683.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public C2855hx(Collection collection, Object obj, InterfaceC2851ht interfaceC2851ht) {
        this.f6686 = collection;
        this.f6687 = obj;
        this.f6688 = interfaceC2851ht;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2851ht
    /* renamed from: ﾇ */
    public final Field mo6935() {
        int i = f6682 + 67;
        int i2 = i % 128;
        f6685 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        Field field = this.f6690;
        int i3 = i2 + 119;
        f6682 = i3 % 128;
        if (i3 % 2 == 0) {
            return field;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5466(java.lang.String r12, java.util.List<java.lang.Object> r13, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2855hx.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    public C2855hx(Map map, Object obj, InterfaceC2851ht interfaceC2851ht) {
        this.f6689 = map;
        this.f6687 = obj;
        this.f6688 = interfaceC2851ht;
    }
}
