package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.r1 */
/* loaded from: classes2.dex */
public final class C3578r1 {

    /* renamed from: a */
    private final AbstractC3438n1 f11173a;

    /* renamed from: b */
    private final LevelPlayAdInfo f11174b;

    public C3578r1(AbstractC3438n1 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f11173a = adUnit;
        this.f11174b = levelPlayAdInfo;
    }

    /* renamed from: a */
    public final AbstractC3438n1 m11702a() {
        return this.f11173a;
    }

    /* renamed from: b */
    public final LevelPlayAdInfo m11704b() {
        return this.f11174b;
    }

    /* renamed from: c */
    public final LevelPlayAdInfo m11705c() {
        return this.f11174b;
    }

    /* renamed from: d */
    public final AbstractC3438n1 m11706d() {
        return this.f11173a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3578r1)) {
            return false;
        }
        C3578r1 c3578r1 = (C3578r1) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f11173a, c3578r1.f11173a) && kotlin.jvm.internal.OooOo.OooO00o(this.f11174b, c3578r1.f11174b);
    }

    public int hashCode() {
        int iHashCode = this.f11173a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f11174b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f11173a + ", adInfo=" + this.f11174b + ')';
    }

    public /* synthetic */ C3578r1(AbstractC3438n1 abstractC3438n1, LevelPlayAdInfo levelPlayAdInfo, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(abstractC3438n1, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    /* renamed from: a */
    public final C3578r1 m11703a(AbstractC3438n1 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        return new C3578r1(adUnit, levelPlayAdInfo);
    }

    /* renamed from: a */
    public static /* synthetic */ C3578r1 m11701a(C3578r1 c3578r1, AbstractC3438n1 abstractC3438n1, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC3438n1 = c3578r1.f11173a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c3578r1.f11174b;
        }
        return c3578r1.m11703a(abstractC3438n1, levelPlayAdInfo);
    }
}
