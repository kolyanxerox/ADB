package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.y6 */
/* loaded from: classes2.dex */
public final class C3860y6 extends C3673sq {

    /* renamed from: b */
    private final C3349m1 f12718b;

    /* renamed from: c */
    private final ISBannerSize f12719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3860y6(C3349m1 adTools, ISBannerSize size, String placement) {
        super(placement);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(size, "size");
        kotlin.jvm.internal.OooOo.OooO0o0(placement, "placement");
        this.f12718b = adTools;
        this.f12719c = size;
    }

    @Override // com.ironsource.C3673sq, com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        LinkedHashMap linkedHashMapOooOoO0 = o00O0.o0O0O00.OooOoO0(super.mo4765a(enumC3889z1));
        this.f12718b.m9961a(linkedHashMapOooOoO0, this.f12719c);
        return linkedHashMapOooOoO0;
    }
}
