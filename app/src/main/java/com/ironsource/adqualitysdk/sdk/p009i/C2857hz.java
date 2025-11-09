package com.ironsource.adqualitysdk.sdk.p009i;

import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hz */
/* loaded from: classes2.dex */
public final class C2857hz {

    /* renamed from: ﻛ */
    private a f6691;

    /* renamed from: ﾇ */
    private InterfaceC2856hy f6692;

    /* renamed from: ﾒ */
    private InterfaceC2848hq f6693;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hz$a */
    public static class a {

        /* renamed from: ﮌ */
        private Object f6696;

        /* renamed from: ﻐ */
        private int f6702;

        /* renamed from: ﻛ */
        private Class f6703;

        /* renamed from: ｋ */
        private Class f6704;

        /* renamed from: ﾇ */
        private List<String> f6705;

        /* renamed from: ﾒ */
        private Class f6706;

        /* renamed from: ﻏ */
        private int f6701 = -1;

        /* renamed from: ﱟ */
        private int f6698 = -1;

        /* renamed from: ﺙ */
        private int f6700 = -1;

        /* renamed from: ﮐ */
        private int f6697 = -1;

        /* renamed from: ﱡ */
        private int f6699 = Integer.MAX_VALUE;

        /* renamed from: ﮉ */
        private int f6695 = Integer.MAX_VALUE;

        /* renamed from: ﭖ */
        private boolean f6694 = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f6702 != aVar.f6702 || this.f6701 != aVar.f6701 || this.f6698 != aVar.f6698 || this.f6700 != aVar.f6700 || this.f6697 != aVar.f6697 || this.f6699 != aVar.f6699 || this.f6695 != aVar.f6695 || this.f6694 != aVar.f6694) {
                    return false;
                }
                Class cls = this.f6703;
                if (cls == null ? aVar.f6703 != null : !cls.equals(aVar.f6703)) {
                    return false;
                }
                Class cls2 = this.f6704;
                if (cls2 == null ? aVar.f6704 != null : !cls2.equals(aVar.f6704)) {
                    return false;
                }
                Class cls3 = this.f6706;
                if (cls3 == null ? aVar.f6706 != null : !cls3.equals(aVar.f6706)) {
                    return false;
                }
                List<String> list = this.f6705;
                if (list == null ? aVar.f6705 != null : !list.equals(aVar.f6705)) {
                    return false;
                }
                Object obj2 = this.f6696;
                Object obj3 = aVar.f6696;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f6703;
            int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f6704;
            int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f6706;
            int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f6705;
            int iHashCode4 = (((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f6702) * 31) + this.f6701) * 31) + this.f6698) * 31) + this.f6700) * 31) + this.f6697) * 31) + this.f6699) * 31) + this.f6695) * 31) + (this.f6694 ? 1 : 0)) * 31;
            Object obj = this.f6696;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hz$d */
    public static class d {

        /* renamed from: ﾇ */
        private C2857hz f6707 = new C2857hz(0);

        /* renamed from: ﱟ */
        public final d m7040(int i) {
            this.f6707.f6691.f6699 = i;
            return this;
        }

        /* renamed from: ﻐ */
        public final d m7041(int i) {
            this.f6707.f6691.f6700 = i;
            return this;
        }

        /* renamed from: ﻛ */
        public final d m7043(int i) {
            this.f6707.f6691.f6701 = i;
            return this;
        }

        /* renamed from: ｋ */
        public final d m7046(int i) {
            this.f6707.f6691.f6697 = i;
            return this;
        }

        /* renamed from: ﾇ */
        public final d m7049(int i) {
            this.f6707.f6691.f6698 = i;
            return this;
        }

        /* renamed from: ﾒ */
        public final d m7051(int i) {
            this.f6707.f6691.f6695 = i;
            return this;
        }

        /* renamed from: ﻐ */
        public final d m7042(boolean z) {
            this.f6707.f6691.f6694 = z;
            return this;
        }

        /* renamed from: ﻛ */
        public final d m7044(Object obj) {
            this.f6707.f6691.f6696 = obj;
            return this;
        }

        /* renamed from: ｋ */
        public final C2857hz m7048(InterfaceC2856hy interfaceC2856hy, InterfaceC2848hq interfaceC2848hq, List<String> list, int i) {
            this.f6707.f6692 = interfaceC2856hy;
            this.f6707.f6693 = interfaceC2848hq;
            this.f6707.f6691.f6705 = list;
            this.f6707.f6691.f6702 = i;
            this.f6707.f6691.f6704 = interfaceC2856hy.getClass();
            this.f6707.f6691.f6706 = interfaceC2848hq != null ? interfaceC2848hq.getClass() : null;
            return this.f6707;
        }

        /* renamed from: ﾇ */
        public final d m7050(boolean z) {
            this.f6707.f6691.f6698 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﾒ */
        public final C2857hz m7053(InterfaceC2856hy interfaceC2856hy, List<String> list, int i) {
            return m7048(interfaceC2856hy, null, list, i);
        }

        /* renamed from: ﻛ */
        public final d m7045(boolean z) {
            this.f6707.f6691.f6699 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﾒ */
        public final d m7052(boolean z) {
            this.f6707.f6691.f6697 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ｋ */
        public final d m7047(boolean z) {
            this.f6707.f6691.f6695 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }

    public /* synthetic */ C2857hz(byte b) {
        this();
    }

    /* renamed from: ﻛ */
    private static boolean m7004(int i, int i2) {
        return i >= i2;
    }

    /* renamed from: ｋ */
    public final boolean m7013(int i) {
        return m7004(i, this.f6691.f6695);
    }

    /* renamed from: ﾒ */
    public final List<String> m7016() {
        return this.f6691.f6705;
    }

    private C2857hz() {
        this.f6691 = new a();
    }

    /* renamed from: ﻐ */
    public final InterfaceC2856hy m7008() {
        return this.f6692;
    }

    /* renamed from: ﻛ */
    public final int m7009() {
        return this.f6691.f6702;
    }

    /* renamed from: ｋ */
    public final boolean m7012() {
        return this.f6691.f6694;
    }

    /* renamed from: ﾒ */
    public final boolean m7017(int i) {
        return m7004(i, this.f6691.f6697);
    }

    /* renamed from: ﻐ */
    public final int m7007(int i) {
        if (m7004(i, this.f6691.f6698)) {
            return this.f6691.f6700;
        }
        return 0;
    }

    /* renamed from: ﻛ */
    public final boolean m7010(int i) {
        return m7004(i, this.f6691.f6699);
    }

    /* renamed from: ｋ */
    public final a m7011(Class cls) {
        this.f6691.f6703 = cls;
        return this.f6691;
    }

    /* renamed from: ﾇ */
    public final InterfaceC2848hq m7014() {
        return this.f6693;
    }

    /* renamed from: ﾇ */
    public final boolean m7015(int i) {
        return m7004(i, this.f6691.f6701);
    }
}
