package com.ironsource.adqualitysdk.sdk.p009i;

import java.io.UnsupportedEncodingException;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.db */
/* loaded from: classes2.dex */
public final class C2725db extends C2722cz {

    /* renamed from: ﻛ */
    private static char[] f5958 = {'\"', '[', 'r', 'p', 'p', 'I', 'A', 'j', 'k', 'c', 'j', 'n', 'k', 'j', 'C', 'F', 'i', 'l', 'n', 'k', 'i', 'B', 'I', 's', 'q', 'n', 'g', 'a', 'g', 'h'};

    /* renamed from: ｋ */
    private static int f5959 = 0;

    /* renamed from: ﾇ */
    private static int f5960 = 1;

    /* renamed from: ﱡ */
    public final Object m6470(C2712cp c2712cp, List<Object> list, C2741dr c2741dr) {
        int i = f5959 + 13;
        f5960 = i % 128;
        if (i % 2 != 0) {
            C2926s.m7594(m6473(c2712cp, list, c2741dr), m6469(list));
            return null;
        }
        C2926s.m7594(m6473(c2712cp, list, c2741dr), m6469(list));
        int i2 = 53 / 0;
        return null;
    }

    /* renamed from: ﺙ */
    public final Object m6471(C2712cp c2712cp, List<Object> list, C2741dr c2741dr) {
        f5960 = (f5959 + 17) % 128;
        C2926s.m7600(m6473(c2712cp, list, c2741dr));
        int i = f5959 + 11;
        f5960 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final Object m6472(C2712cp c2712cp, List<Object> list, C2741dr c2741dr) {
        int i = f5960 + 5;
        f5959 = i % 128;
        if (i % 2 != 0) {
            C2926s.m7596(m6473(c2712cp, list, c2741dr));
            int i2 = 58 / 0;
        } else {
            C2926s.m7596(m6473(c2712cp, list, c2741dr));
        }
        int i3 = f5960 + 59;
        f5959 = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public final AbstractRunnableC2878it m6473(final C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final List<Object> listM6460;
        try {
            if (C2722cz.m6458(list, 0, AbstractRunnableC2878it.class)) {
                AbstractRunnableC2878it abstractRunnableC2878it = (AbstractRunnableC2878it) C2722cz.m6459(list, 0, AbstractRunnableC2878it.class);
                f5960 = (f5959 + 59) % 128;
                return abstractRunnableC2878it;
            }
            final C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            if (list.size() > 2) {
                f5960 = (f5959 + 9) % 128;
                listM6460 = C2722cz.m6460(list, 2);
            } else {
                listM6460 = C2722cz.m6460(list, 1);
            }
            return new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.db.2
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    listM6460.add(0, this);
                    c2743dt.m6711(c2741dr, c2712cp, listM6460);
                    listM6460.remove(0);
                }
            };
        } catch (Exception e) {
            C2713cq.m6350(c2712cp.m6290(), m6468(false, new int[]{0, 30, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern(), e);
            return null;
        }
    }

    /* renamed from: ｋ */
    public final Object m6474(C2712cp c2712cp, List<Object> list, C2741dr c2741dr) {
        int i = f5960 + 59;
        f5959 = i % 128;
        if (i % 2 != 0) {
            C2926s.m7591(m6473(c2712cp, list, c2741dr));
            throw null;
        }
        C2926s.m7591(m6473(c2712cp, list, c2741dr));
        f5959 = (f5960 + 77) % 128;
        return null;
    }

    /* renamed from: ﾇ */
    public final Object m6475(C2712cp c2712cp, List<Object> list, C2741dr c2741dr) {
        f5960 = (f5959 + 81) % 128;
        C2926s.m7592(m6473(c2712cp, list, c2741dr), m6469(list));
        f5959 = (f5960 + 67) % 128;
        return null;
    }

    /* renamed from: ﾒ */
    public final Object m6476(C2712cp c2712cp, List<Object> list, C2741dr c2741dr) {
        int i = f5959 + 93;
        f5960 = i % 128;
        if (i % 2 == 0) {
            C2926s.m7598(m6473(c2712cp, list, c2741dr));
            throw null;
        }
        C2926s.m7598(m6473(c2712cp, list, c2741dr));
        int i2 = f5959 + 31;
        f5960 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static long m6469(List<Object> list) {
        long j;
        int iIntValue;
        if (list.size() > 1 && C2722cz.m6458(list, 1, Integer.class)) {
            iIntValue = ((Integer) C2722cz.m6459(list, 1, Integer.class)).intValue();
        } else if (list.size() > 2) {
            f5959 = (f5960 + 43) % 128;
            iIntValue = ((Integer) C2722cz.m6459(list, 2, Integer.class)).intValue();
        } else {
            j = 0;
            f5960 = (f5959 + 95) % 128;
            return j;
        }
        j = iIntValue;
        f5960 = (f5959 + 95) % 128;
        return j;
    }

    /* renamed from: ﻛ */
    private static String m6468(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (C2831h.f6553) {
            try {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f5958, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        C2831h.f6552 = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2831h.f6552 = 0;
                    while (true) {
                        int i7 = C2831h.f6552;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        C2831h.f6552 = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C2831h.f6552 = 0;
                    while (true) {
                        int i8 = C2831h.f6552;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        C2831h.f6552 = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
