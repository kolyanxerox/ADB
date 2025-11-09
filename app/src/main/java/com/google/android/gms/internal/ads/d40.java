package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final /* synthetic */ class d40 implements lp0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f18155OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C2197wi f18156OooO0O0;

    public /* synthetic */ d40(C2197wi c2197wi, int i) {
        this.f18155OooO00o = i;
        this.f18156OooO0O0 = c2197wi;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f18155OooO00o) {
            case 0:
                return ii0.OooooOO(new w40(inputStream, this.f18156OooO0O0));
            case 1:
                return ii0.OooooOO(new w40(inputStream, this.f18156OooO0O0));
            default:
                String str = new String(co0.OooO00o(inputStream), StandardCharsets.UTF_8);
                C2197wi c2197wi = this.f18156OooO0O0;
                c2197wi.zzj = str;
                return ii0.OooooOO(c2197wi);
        }
    }
}
