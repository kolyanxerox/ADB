package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class s40 implements InterfaceC2173vv {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f24000OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2162vk f24001OooOo0o;

    public s40(Context context, C2162vk c2162vk) {
        this.f24000OooOo0O = context;
        this.f24001OooOo0o = c2162vk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
        if (TextUtils.isEmpty(((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21209OooO0o0)) {
            return;
        }
        C2162vk c2162vk = this.f24001OooOo0o;
        Context context = this.f24000OooOo0O;
        c2162vk.getClass();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17940oo0o0Oo)).booleanValue() && c2162vk.OooO0o0(context) && C2162vk.OooO0oO(context)) {
            synchronized (c2162vk.f24983OooO) {
            }
        }
        this.f24001OooOo0o.OooOO0O(this.f24000OooOo0O, "_aq", ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21209OooO0o0, null);
    }
}
