package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2844hm;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hp */
/* loaded from: classes2.dex */
public class C2847hp extends AbstractC2844hm {

    /* renamed from: ﮐ */
    private int f6644;

    /* renamed from: ﱟ */
    private List<Class> f6645 = new ArrayList();

    /* renamed from: ﺙ */
    private boolean f6646;

    /* renamed from: ｋ */
    private Class f6647;

    public C2847hp() {
        super.mo6875();
        this.f6647 = null;
        this.f6644 = 0;
        this.f6646 = true;
        this.f6645.clear();
    }

    /* renamed from: ﮐ */
    public final Class m6900() {
        return this.f6647;
    }

    /* renamed from: ﱟ */
    public final boolean m6901() {
        return this.f6646;
    }

    /* renamed from: ﺙ */
    public final int m6902() {
        return this.f6644;
    }

    /* renamed from: ﻏ */
    public final List<Class> m6903() {
        return this.f6645;
    }

    /* renamed from: ﾇ */
    public final void m6904(Class cls) {
        this.f6647 = cls;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hp$e */
    public static class e extends AbstractC2844hm.c implements InterfaceC2707ck {

        /* renamed from: ﻛ */
        private static int f6649 = 1;

        /* renamed from: ﾒ */
        private static int f6651;

        /* renamed from: ﾇ */
        private C2847hp f6652 = new C2847hp();

        /* renamed from: ｋ */
        private static char[] f6650 = {'s', 15742, 31298, 46853, 62485, 12791, 28359, 44009, 59575, 9653, 25447, 41031, 56608, 's', 15728, 31327, 46881, 62506, 12782, 28359, 43985, 59580, 9600, 28274, 21375, 5206, 55586, 39438, 24558, 229, 50643, 34475, 19383, 3447, 52809, 45862, 29738, 14639, 64237, 49089, 24751, 'a', 15743, 31314, 46876, 62467, 12771, 28363, 43995, 59569, 9622, 25468, 41050, 56592, 6704, 22323, 38139, 53715, 3751, 19347, 35173, 50809, 37838, 44752, 59901, 9395, 26540, 41548, 64868, 14452, 31518, 46649, 61651, 13301, 20159, 35231, 50320, 1858, 17020, 40200, 55356, 6858, 21974, 62738, 51231, 36662, 16962, 366, 50318, 39818, 24242, 7658, 53479, 38431, 21805, 10327, 61277, 41591, 24981, 9378, 64473, 'a', 15743, 31314, 46853, 62485, 12791, 28359, 44009, 59575, 9658, 25449, 41031, 56619, 6701, 22303, 40499, 41791, 58372, 10613, 27225, 31407, 18339, 146, 52720, 36549};

        /* renamed from: ﻐ */
        private static long f6648 = -4304465796164666085L;

        /* renamed from: ｋ */
        private e m6906(int i) {
            f6649 = (f6651 + 61) % 128;
            this.f6652.f6644 = i;
            f6651 = (f6649 + 61) % 128;
            return this;
        }

        /* renamed from: ﾇ */
        private e m6909() {
            int i = f6649 + 63;
            f6651 = i % 128;
            if (i % 2 == 0) {
                this.f6652.mo6875();
                return this;
            }
            this.f6652.mo6875();
            int i2 = 96 / 0;
            return this;
        }

        /* renamed from: ﻛ */
        public final e m6912(Class cls) {
            f6649 = (f6651 + 55) % 128;
            this.f6652.f6647 = cls;
            f6651 = (f6649 + 99) % 128;
            return this;
        }

        /* renamed from: ﾒ */
        public final e m6914(int i) {
            C2847hp c2847hp;
            int i2;
            int i3 = f6651 + 41;
            int i4 = i3 % 128;
            f6649 = i4;
            if (i3 % 2 == 0) {
                c2847hp = this.f6652;
                i2 = i ^ c2847hp.f6619;
            } else {
                c2847hp = this.f6652;
                i2 = i | c2847hp.f6619;
            }
            c2847hp.f6619 = i2;
            f6651 = (i4 + 93) % 128;
            return this;
        }

        /* renamed from: ｋ */
        private e m6907(boolean z) {
            f6649 = (f6651 + 17) % 128;
            this.f6652.f6646 = z;
            int i = f6649 + 79;
            f6651 = i % 128;
            if (i % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﾒ */
        private e m6910(Class cls) {
            int i = f6649 + 9;
            f6651 = i % 128;
            if (i % 2 == 0) {
                this.f6652.f6645.add(cls);
                return this;
            }
            this.f6652.f6645.add(cls);
            throw null;
        }

        /* renamed from: ﻛ */
        public final e m6911(int i) {
            int i2 = f6651;
            f6649 = (i2 + 17) % 128;
            C2847hp c2847hp = this.f6652;
            c2847hp.f6620 = i | c2847hp.f6620;
            f6649 = (i2 + 61) % 128;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
        /* renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo5466(java.lang.String r12, java.util.List<java.lang.Object> r13, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r14) {
            /*
                Method dump skipped, instructions count: 612
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2847hp.e.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﻛ */
        private static String m6905(int i, int i2, char c) {
            String str;
            synchronized (C2642a.f4435) {
                try {
                    char[] cArr = new char[i];
                    C2642a.f4436 = 0;
                    while (true) {
                        int i3 = C2642a.f4436;
                        if (i3 < i) {
                            cArr[i3] = (char) ((f6650[i2 + i3] ^ (i3 * f6648)) ^ c);
                            C2642a.f4436 = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        /* renamed from: ｋ */
        private e m6908(boolean z, int i) {
            int i2 = f6649;
            f6651 = (i2 + InterfaceC3173h3.d.b.f8821d) % 128;
            C2847hp c2847hp = this.f6652;
            c2847hp.f6618 = z;
            c2847hp.f6621 = i;
            f6651 = (i2 + 59) % 128;
            return this;
        }

        /* renamed from: ｋ */
        public final C2847hp m6913() {
            int i = (f6649 + InterfaceC3173h3.d.b.f8821d) % 128;
            f6651 = i;
            C2847hp c2847hp = this.f6652;
            int i2 = i + InterfaceC3173h3.d.b.f8819b;
            f6649 = i2 % 128;
            if (i2 % 2 != 0) {
                return c2847hp;
            }
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2844hm
    /* renamed from: ﻐ */
    public final void mo6875() {
        super.mo6875();
        this.f6647 = null;
        this.f6644 = 0;
        this.f6646 = true;
        this.f6645.clear();
    }
}
