package com.ironsource;

import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.x6 */
/* loaded from: classes2.dex */
public interface InterfaceC3826x6 extends InterfaceC3460nn<Integer, Integer> {

    /* renamed from: com.ironsource.x6$a */
    public static final class a {

        /* renamed from: a */
        public static final a f12575a = new a();

        /* renamed from: b */
        public static final int f12576b = 3009;

        /* renamed from: c */
        public static final int f12577c = 3008;

        private a() {
        }
    }

    /* renamed from: com.ironsource.x6$b */
    public static final class b {

        /* renamed from: a */
        public static final b f12578a = new b();

        /* renamed from: b */
        public static final int f12579b = 3002;

        /* renamed from: c */
        public static final int f12580c = 3005;

        /* renamed from: d */
        public static final int f12581d = 3300;

        /* renamed from: e */
        public static final int f12582e = 3503;

        /* renamed from: f */
        public static final int f12583f = 3504;

        private b() {
        }
    }

    /* renamed from: com.ironsource.x6$d */
    public static final class d {

        /* renamed from: a */
        public static final d f12584a = new d();

        /* renamed from: b */
        public static final int f12585b = 83500;

        /* renamed from: c */
        public static final int f12586c = 83510;

        /* renamed from: d */
        public static final int f12587d = 83300;

        /* renamed from: e */
        public static final int f12588e = 83302;

        /* renamed from: f */
        public static final int f12589f = 83004;

        /* renamed from: g */
        public static final int f12590g = 88002;

        /* renamed from: h */
        public static final int f12591h = 83301;

        /* renamed from: i */
        public static final int f12592i = 83302;

        /* renamed from: j */
        public static final int f12593j = 3305;

        private d() {
        }
    }

    /* renamed from: com.ironsource.x6$c */
    public static final class c implements InterfaceC3826x6 {
        /* renamed from: a */
        public Integer m13027a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = b.f12582e;
            } else if (i == 207) {
                i2 = b.f12583f;
            } else if (i == 405) {
                i2 = 3009;
            } else if (i != 406) {
                switch (i) {
                    case InterfaceC3173h3.d.b.f8819b /* 101 */:
                        i2 = 83500;
                        break;
                    case 102:
                        i2 = 83510;
                        break;
                    case InterfaceC3173h3.d.b.f8821d /* 103 */:
                        i2 = d.f12591h;
                        break;
                    case 104:
                        i2 = 83300;
                        break;
                    default:
                        switch (i) {
                            case 109:
                                i2 = 88002;
                                break;
                            case InterfaceC3173h3.d.b.f8825h /* 110 */:
                                i2 = 83004;
                                break;
                            case InterfaceC3173h3.d.b.f8826i /* 111 */:
                                break;
                            case InterfaceC3173h3.d.b.f8827j /* 112 */:
                                i2 = 3305;
                                break;
                            default:
                                switch (i) {
                                    case InterfaceC3173h3.c.b.f8810b /* 201 */:
                                        i2 = 3002;
                                        break;
                                    case InterfaceC3173h3.c.b.f8811c /* 202 */:
                                        i2 = 3005;
                                        break;
                                    case InterfaceC3173h3.c.b.f8812d /* 203 */:
                                        i2 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "Unknown event code: "));
                                }
                        }
                    case InterfaceC3173h3.d.b.f8823f /* 105 */:
                        i2 = 83302;
                        break;
                }
            } else {
                i2 = 3008;
            }
            return Integer.valueOf(i2);
        }

        @Override // com.ironsource.InterfaceC3460nn
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Integer mo8213a(Integer num) {
            return m13027a(num.intValue());
        }
    }
}
