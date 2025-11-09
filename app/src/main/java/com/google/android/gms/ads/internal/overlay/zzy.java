package com.google.android.gms.ads.internal.overlay;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.ok0;
import com.ironsource.C3912zo;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class zzy implements ok0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ zzz f16161OooO00o;

    public zzy(zzz zzzVar) {
        this.f16161OooO00o = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.ok0
    public final void zza(nk0 nk0Var) {
        zzz zzzVar = this.f16161OooO00o;
        zzzVar.getClass();
        fk0 fk0Var = (fk0) nk0Var;
        if (!TextUtils.isEmpty(fk0Var.f18960OooO0O0)) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOOoo)).booleanValue()) {
                zzzVar.f16162OooO00o = fk0Var.f18960OooO0O0;
            }
        }
        int i = fk0Var.f18959OooO00o;
        switch (i) {
            case 8152:
                zzzVar.OooO00o("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                zzzVar.OooO00o("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                zzzVar.OooO00o("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                zzzVar.f16162OooO00o = null;
                zzzVar.f16163OooO0O0 = null;
                zzzVar.f16167OooO0o0 = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(C3912zo.a.f13038g, String.valueOf(i));
                zzzVar.OooO00o("onLMDOverlayFailedToOpen", map);
                break;
        }
    }
}
