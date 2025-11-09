package com.ironsource;

import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.vj */
/* loaded from: classes2.dex */
public interface InterfaceC3771vj extends InterfaceC3460nn<Integer, Integer> {

    /* renamed from: com.ironsource.vj$a */
    public static final class a {

        /* renamed from: a */
        public static final a f12369a = new a();

        /* renamed from: b */
        public static final int f12370b = 2201;

        /* renamed from: c */
        public static final int f12371c = 2203;

        /* renamed from: d */
        public static final int f12372d = 2005;

        /* renamed from: e */
        public static final int f12373e = 2210;

        /* renamed from: f */
        public static final int f12374f = 2006;

        /* renamed from: g */
        public static final int f12375g = 2204;

        /* renamed from: h */
        public static final int f12376h = 2507;

        /* renamed from: i */
        public static final int f12377i = 2211;

        /* renamed from: j */
        public static final int f12378j = 2212;

        private a() {
        }
    }

    /* renamed from: com.ironsource.vj$b */
    public static final class b {

        /* renamed from: a */
        public static final b f12379a = new b();

        /* renamed from: b */
        public static final int f12380b = 2002;

        /* renamed from: c */
        public static final int f12381c = 2003;

        /* renamed from: d */
        public static final int f12382d = 2200;

        /* renamed from: e */
        public static final int f12383e = 2503;

        /* renamed from: f */
        public static final int f12384f = 2504;

        /* renamed from: g */
        public static final int f12385g = 2300;

        private b() {
        }
    }

    /* renamed from: com.ironsource.vj$d */
    public static final class d {

        /* renamed from: a */
        public static final d f12386a = new d();

        /* renamed from: b */
        public static final int f12387b = 82500;

        /* renamed from: c */
        public static final int f12388c = 82510;

        /* renamed from: d */
        public static final int f12389d = 82300;

        /* renamed from: e */
        public static final int f12390e = 82002;

        /* renamed from: f */
        public static final int f12391f = 83004;

        /* renamed from: g */
        public static final int f12392g = 88002;

        /* renamed from: h */
        public static final int f12393h = 82301;

        /* renamed from: i */
        public static final int f12394i = 82302;

        /* renamed from: j */
        public static final int f12395j = 82076;

        private d() {
        }
    }

    /* renamed from: com.ironsource.vj$c */
    public static final class c implements InterfaceC3771vj {
        /* renamed from: a */
        public Integer m12786a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = b.f12383e;
            } else if (i == 207) {
                i2 = b.f12384f;
            } else if (i == 401) {
                i2 = a.f12370b;
            } else if (i == 410) {
                i2 = a.f12377i;
            } else if (i != 411) {
                switch (i) {
                    case InterfaceC3173h3.d.b.f8819b /* 101 */:
                        i2 = d.f12387b;
                        break;
                    case 102:
                        i2 = d.f12388c;
                        break;
                    case InterfaceC3173h3.d.b.f8821d /* 103 */:
                        i2 = d.f12393h;
                        break;
                    case 104:
                        i2 = d.f12389d;
                        break;
                    case InterfaceC3173h3.d.b.f8823f /* 105 */:
                        i2 = d.f12390e;
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
                                i2 = d.f12394i;
                                break;
                            case InterfaceC3173h3.d.b.f8827j /* 112 */:
                                i2 = d.f12395j;
                                break;
                            default:
                                switch (i) {
                                    case InterfaceC3173h3.c.b.f8810b /* 201 */:
                                        i2 = b.f12380b;
                                        break;
                                    case InterfaceC3173h3.c.b.f8811c /* 202 */:
                                        i2 = b.f12381c;
                                        break;
                                    case InterfaceC3173h3.c.b.f8812d /* 203 */:
                                        i2 = b.f12382d;
                                        break;
                                    case 204:
                                        i2 = b.f12385g;
                                        break;
                                    default:
                                        switch (i) {
                                            case InterfaceC3173h3.a.b.f8797c /* 403 */:
                                                i2 = a.f12371c;
                                                break;
                                            case InterfaceC3173h3.a.b.f8798d /* 404 */:
                                                i2 = a.f12372d;
                                                break;
                                            case InterfaceC3173h3.a.b.f8799e /* 405 */:
                                                i2 = a.f12373e;
                                                break;
                                            case InterfaceC3173h3.a.b.f8800f /* 406 */:
                                                i2 = a.f12374f;
                                                break;
                                            case InterfaceC3173h3.a.b.f8801g /* 407 */:
                                                i2 = a.f12375g;
                                                break;
                                            case InterfaceC3173h3.a.b.f8802h /* 408 */:
                                                i2 = a.f12376h;
                                                break;
                                            default:
                                                throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "Unknown event code: "));
                                        }
                                }
                        }
                }
            } else {
                i2 = a.f12378j;
            }
            return Integer.valueOf(i2);
        }

        @Override // com.ironsource.InterfaceC3460nn
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Integer mo8213a(Integer num) {
            return m12786a(num.intValue());
        }
    }
}
