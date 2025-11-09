package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.tk */
/* loaded from: classes2.dex */
public final class C2088tk implements InterfaceC1481d3 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f24325OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f24326OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f24327OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f24328OooOoO0;

    public C2088tk(Context context, String str) {
        this.f24326OooOo0O = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f24325OooOo = str;
        this.f24328OooOoO0 = false;
        this.f24327OooOo0o = new Object();
    }

    public final void OooO00o(boolean z) {
        if (zzv.zzo().OooO0o0(this.f24326OooOo0O)) {
            synchronized (this.f24327OooOo0o) {
                try {
                    if (this.f24328OooOoO0 == z) {
                        return;
                    }
                    this.f24328OooOoO0 = z;
                    if (TextUtils.isEmpty(this.f24325OooOo)) {
                        return;
                    }
                    if (this.f24328OooOoO0) {
                        C2162vk c2162vkZzo = zzv.zzo();
                        Context context = this.f24326OooOo0O;
                        String str = this.f24325OooOo;
                        if (c2162vkZzo.OooO0o0(context)) {
                            c2162vkZzo.OooOO0(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        C2162vk c2162vkZzo2 = zzv.zzo();
                        Context context2 = this.f24326OooOo0O;
                        String str2 = this.f24325OooOo;
                        if (c2162vkZzo2.OooO0o0(context2)) {
                            c2162vkZzo2.OooOO0(context2, str2, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        OooO00o(c1444c3.f17668OooOO0);
    }
}
