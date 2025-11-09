package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.du */
/* loaded from: classes2.dex */
public final class C1507du implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f18407OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1764kt f18408OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f18409OooO0OO;

    public C1507du(C1764kt c1764kt, p31 p31Var) {
        this.f18407OooO00o = 1;
        this.f18408OooO0O0 = c1764kt;
        this.f18409OooO0OO = p31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f18407OooO00o) {
            case 0:
                return new C1471cu(this.f18408OooO0O0.OooO00o());
            case 1:
                return new C1474cx(this.f18408OooO0O0.OooO00o(), (hg0) this.f18409OooO0OO.zzb());
            case 2:
                return new C2285yw((Context) this.f18409OooO0OO.zzb(), new HashSet(), this.f18408OooO0O0.OooO00o());
            default:
                return new e10((C1508dv) this.f18409OooO0OO.zzb(), this.f18408OooO0O0.OooO00o());
        }
    }

    public /* synthetic */ C1507du(p31 p31Var, C1764kt c1764kt, int i) {
        this.f18407OooO00o = i;
        this.f18409OooO0OO = p31Var;
        this.f18408OooO0O0 = c1764kt;
    }
}
