package com.ironsource;

/* renamed from: com.ironsource.ej */
/* loaded from: classes2.dex */
public enum EnumC3079ej {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* renamed from: b */
    public static final a f8410b = new a(null);

    /* renamed from: a */
    private final int f8415a;

    /* renamed from: com.ironsource.ej$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final EnumC3079ej m8502a(int i) {
            EnumC3079ej enumC3079ej;
            EnumC3079ej[] enumC3079ejArrValues = EnumC3079ej.values();
            int length = enumC3079ejArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC3079ej = null;
                    break;
                }
                enumC3079ej = enumC3079ejArrValues[i2];
                if (enumC3079ej.f8415a == i) {
                    break;
                }
                i2++;
            }
            return enumC3079ej == null ? EnumC3079ej.NotSupported : enumC3079ej;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    EnumC3079ej(int i) {
        this.f8415a = i;
    }

    /* renamed from: b */
    public final int m8500b() {
        return this.f8415a;
    }

    /* renamed from: b */
    public final boolean m8501b(EnumC3079ej instanceType) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceType, "instanceType");
        return instanceType.m8500b() == this.f8415a;
    }
}
