package com.ironsource;

/* renamed from: com.ironsource.af */
/* loaded from: classes2.dex */
public enum EnumC2935af {
    SendEvent(0),
    NativeController(1);


    /* renamed from: b */
    public static final a f7494b = new a(null);

    /* renamed from: a */
    private final int f7498a;

    /* renamed from: com.ironsource.af$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final EnumC2935af m7757a(int i) {
            EnumC2935af enumC2935af;
            EnumC2935af[] enumC2935afArrValues = EnumC2935af.values();
            int length = enumC2935afArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC2935af = null;
                    break;
                }
                enumC2935af = enumC2935afArrValues[i2];
                if (enumC2935af.m7756b() == i) {
                    break;
                }
                i2++;
            }
            return enumC2935af == null ? EnumC2935af.SendEvent : enumC2935af;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    EnumC2935af(int i) {
        this.f7498a = i;
    }

    /* renamed from: b */
    public final int m7756b() {
        return this.f7498a;
    }
}
