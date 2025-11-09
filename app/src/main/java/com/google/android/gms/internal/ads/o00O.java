package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o00O extends o000OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000O00 f21735OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OoooOOO.o0O0O0O f21736OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(OoooOOO.o0O0O0O o0o0o0o, o000O00 o000o002, o000O00 o000o003) {
        super(o000o002);
        this.f21735OooO0O0 = o000o003;
        this.f21736OooO0OO = o0o0o0o;
    }

    @Override // com.google.android.gms.internal.ads.o000OO, com.google.android.gms.internal.ads.o000O00
    public final o000Oo0 OooO0Oo(long j) {
        o000Oo0 o000oo0OooO0Oo = this.f21735OooO0O0.OooO0Oo(j);
        o000O00O o000o00o2 = o000oo0OooO0Oo.f21729OooO00o;
        long j2 = o000o00o2.f21698OooO0O0;
        long j3 = this.f21736OooO0OO.f14387OooOo0O;
        o000O00O o000o00o3 = new o000O00O(o000o00o2.f21697OooO00o, j2 + j3);
        o000O00O o000o00o4 = o000oo0OooO0Oo.f21730OooO0O0;
        return new o000Oo0(o000o00o3, new o000O00O(o000o00o4.f21697OooO00o, o000o00o4.f21698OooO0O0 + j3));
    }
}
