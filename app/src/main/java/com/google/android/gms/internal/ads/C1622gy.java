package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gy */
/* loaded from: classes2.dex */
public final class C1622gy implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f19480OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1982qp f19481OooO0O0;

    public /* synthetic */ C1622gy(C1982qp c1982qp, int i) {
        this.f19480OooO00o = i;
        this.f19481OooO0O0 = c1982qp;
    }

    public o90 OooO00o() {
        VersionInfoParcel versionInfoParcelOooO00o = this.f19481OooO0O0.OooO00o();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new o90(versionInfoParcelOooO00o, c2163vl);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final /* synthetic */ Object zzb() {
        switch (this.f19480OooO00o) {
            case 0:
                VersionInfoParcel versionInfoParcelOooO00o = this.f19481OooO0O0.OooO00o();
                zzv.zzq();
                return new C1408b3(UUID.randomUUID().toString(), versionInfoParcelOooO00o, IronSourceConstants.EVENTS_NATIVE, new JSONObject(), true);
            default:
                return OooO00o();
        }
    }
}
