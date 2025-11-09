package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

/* renamed from: com.google.android.gms.internal.ads.rt */
/* loaded from: classes2.dex */
public final class C2023rt implements zza {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C2134ut f23941OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final vd0 f23942OooOo0o;

    public C2023rt(C2134ut c2134ut, vd0 vd0Var) {
        this.f23941OooOo0O = c2134ut;
        this.f23942OooOo0o = vd0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        vd0 vd0Var = this.f23942OooOo0o;
        C2134ut c2134ut = this.f23941OooOo0O;
        String str = vd0Var.f24955OooO0o;
        synchronized (c2134ut.f24783OooO00o) {
            try {
                Integer num = (Integer) c2134ut.f24784OooO0O0.get(str);
                c2134ut.f24784OooO0O0.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
