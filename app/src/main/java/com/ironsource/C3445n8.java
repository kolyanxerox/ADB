package com.ironsource;

/* renamed from: com.ironsource.n8 */
/* loaded from: classes2.dex */
public final class C3445n8 {

    /* renamed from: a */
    private final boolean f10382a;

    /* renamed from: b */
    private final EnumC3515p8 f10383b;

    /* renamed from: com.ironsource.n8$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10384a;

        static {
            int[] iArr = new int[EnumC3515p8.values().length];
            try {
                iArr[EnumC3515p8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3515p8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3515p8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10384a = iArr;
        }
    }

    public C3445n8(boolean z, EnumC3515p8 enumC3515p8) {
        this.f10382a = z;
        this.f10383b = enumC3515p8;
    }

    /* renamed from: a */
    public static /* synthetic */ C3445n8 m10961a(C3445n8 c3445n8, boolean z, EnumC3515p8 enumC3515p8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c3445n8.f10382a;
        }
        if ((i & 2) != 0) {
            enumC3515p8 = c3445n8.f10383b;
        }
        return c3445n8.m10962a(z, enumC3515p8);
    }

    /* renamed from: b */
    public final EnumC3515p8 m10964b() {
        return this.f10383b;
    }

    /* renamed from: c */
    public final EnumC3515p8 m10965c() {
        return this.f10383b;
    }

    /* renamed from: d */
    public final boolean m10966d() {
        return this.f10382a;
    }

    /* renamed from: e */
    public final String m10967e() {
        EnumC3515p8 enumC3515p8 = this.f10383b;
        int i = enumC3515p8 == null ? -1 : a.f10384a[enumC3515p8.ordinal()];
        if (i == 1) {
            return "Placement delivery is false";
        }
        if (i == 2) {
            return "In pacing mode";
        }
        if (i != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3445n8)) {
            return false;
        }
        C3445n8 c3445n8 = (C3445n8) obj;
        return this.f10382a == c3445n8.f10382a && this.f10383b == c3445n8.f10383b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f10382a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC3515p8 enumC3515p8 = this.f10383b;
        return i + (enumC3515p8 == null ? 0 : enumC3515p8.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.f10382a + " reason=" + this.f10383b + ')';
    }

    public /* synthetic */ C3445n8(boolean z, EnumC3515p8 enumC3515p8, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(z, (i & 2) != 0 ? null : enumC3515p8);
    }

    /* renamed from: a */
    public final C3445n8 m10962a(boolean z, EnumC3515p8 enumC3515p8) {
        return new C3445n8(z, enumC3515p8);
    }

    /* renamed from: a */
    public final boolean m10963a() {
        return this.f10382a;
    }
}
