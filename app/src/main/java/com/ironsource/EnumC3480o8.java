package com.ironsource;

/* renamed from: com.ironsource.o8 */
/* loaded from: classes2.dex */
public enum EnumC3480o8 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second("s", 1000);


    /* renamed from: c */
    public static final a f10632c = new a(null);

    /* renamed from: a */
    private final String f10637a;

    /* renamed from: b */
    private final long f10638b;

    /* renamed from: com.ironsource.o8$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final EnumC3480o8 m11126a(String str) {
            for (EnumC3480o8 enumC3480o8 : EnumC3480o8.values()) {
                if (kotlin.jvm.internal.OooOo.OooO00o(enumC3480o8.f10637a, str)) {
                    return enumC3480o8;
                }
            }
            return null;
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    EnumC3480o8(String str, long j) {
        this.f10637a = str;
        this.f10638b = j;
    }

    /* renamed from: a */
    public static /* synthetic */ long m11122a(EnumC3480o8 enumC3480o8, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return enumC3480o8.m11125a(num);
    }

    /* renamed from: a */
    public final long m11125a(Integer num) {
        return (num != null ? num.intValue() : 1) * this.f10638b;
    }
}
