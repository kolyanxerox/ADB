package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ay */
/* loaded from: classes2.dex */
public final class C1402ay implements InterfaceC2042sb {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f17123OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final WeakReference f17124OooOo0o;

    public /* synthetic */ C1402ay(C1475cy c1475cy, int i) {
        this.f17123OooOo0O = i;
        switch (i) {
            case 1:
                this.f17124OooOo0o = new WeakReference(c1475cy);
                break;
            default:
                this.f17124OooOo0o = new WeakReference(c1475cy);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) {
        switch (this.f17123OooOo0O) {
            case 0:
                C1475cy c1475cy = (C1475cy) this.f17124OooOo0o.get();
                if (c1475cy != null && "_ac".equals((String) map.get("eventName"))) {
                    c1475cy.f18077OooO0oo.onAdClicked();
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO000)).booleanValue()) {
                        C2322zw c2322zw = c1475cy.f18069OooO;
                        c2322zw.Oooo000();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2322zw.zzu();
                            break;
                        }
                    }
                }
                break;
            default:
                C1475cy c1475cy2 = (C1475cy) this.f17124OooOo0o.get();
                if (c1475cy2 != null) {
                    c1475cy2.f18077OooO0oo.onAdClicked();
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO000)).booleanValue()) {
                        C2322zw c2322zw2 = c1475cy2.f18069OooO;
                        c2322zw2.Oooo000();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2322zw2.zzu();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
