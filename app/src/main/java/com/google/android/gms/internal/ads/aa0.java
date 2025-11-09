package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzy;

/* loaded from: classes2.dex */
public final class aa0 implements jb0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f16988OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f16989OooO0O0;

    /* renamed from: OooO0OO */
    public final boolean f16990OooO0OO;

    public /* synthetic */ aa0(Object obj, boolean z, int i) {
        this.f16988OooO00o = i;
        this.f16989OooO0O0 = obj;
        this.f16990OooO0OO = z;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f16988OooO00o) {
            case 1:
                ((C1581fu) obj).f19126OooO0O0.putString("gct", (String) this.f16989OooO0O0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        switch (this.f16988OooO00o) {
            case 0:
                C1581fu c1581fu = (C1581fu) obj;
                String str = (String) this.f16989OooO0O0;
                if (str != null) {
                    Bundle bundleOooO0o = af0.OooO0o(c1581fu.f19125OooO00o, "pii");
                    bundleOooO0o.putString("afai", str);
                    bundleOooO0o.putBoolean("is_afai_lat", this.f16990OooO0OO);
                    break;
                }
                break;
            case 1:
                Bundle bundle = ((C1581fu) obj).f19125OooO00o;
                bundle.putString("gct", (String) this.f16989OooO0O0);
                if (this.f16990OooO0OO) {
                    bundle.putString("de", "1");
                    break;
                }
                break;
            default:
                Bundle bundle2 = ((C1581fu) obj).f19125OooO00o;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOO)).booleanValue()) {
                    bundle2.putBoolean("app_switched", this.f16990OooO0OO);
                }
                zzy zzyVar = (zzy) this.f16989OooO0O0;
                if (zzyVar != null) {
                    int i = zzyVar.zza;
                    if (i != 1) {
                        if (i == 2) {
                            bundle2.putString("avo", "l");
                            break;
                        }
                    } else {
                        bundle2.putString("avo", "p");
                        break;
                    }
                }
                break;
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }
}
