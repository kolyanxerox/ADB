package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class k20 {

    /* renamed from: OooO */
    public final AtomicBoolean f20415OooO;

    /* renamed from: OooO00o */
    public final HashMap f20416OooO00o;

    /* renamed from: OooO0O0 */
    public final Context f20417OooO0O0;

    /* renamed from: OooO0OO */
    public final cq0 f20418OooO0OO;

    /* renamed from: OooO0Oo */
    public final zzu f20419OooO0Oo;

    /* renamed from: OooO0o */
    public final CsiUrlBuilder f20420OooO0o;

    /* renamed from: OooO0o0 */
    public final boolean f20421OooO0o0;

    /* renamed from: OooO0oO */
    public final boolean f20422OooO0oO;

    /* renamed from: OooO0oo */
    public final boolean f20423OooO0oo;

    /* renamed from: OooOO0 */
    public final AtomicReference f20424OooOO0;

    public k20(cq0 cq0Var, zzu zzuVar, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        HashMap map = new HashMap();
        this.f20416OooO00o = map;
        this.f20415OooO = new AtomicBoolean();
        this.f20424OooOO0 = new AtomicReference(new Bundle());
        this.f20418OooO0OO = cq0Var;
        this.f20419OooO0Oo = zzuVar;
        this.f20421OooO0o0 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17843o000o0oO)).booleanValue();
        this.f20420OooO0o = csiUrlBuilder;
        this.f20422OooO0oO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17848o000oo00)).booleanValue();
        this.f20423OooO0oo = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00o0o)).booleanValue();
        this.f20417OooO0O0 = context;
        csiParamDefaults.set(map);
    }

    public final void OooO00o(Map map) {
        if (map == null || map.isEmpty()) {
            zzo.zze("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f20415OooO.getAndSet(true);
        AtomicReference atomicReference = this.f20424OooOO0;
        if (!andSet) {
            String str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0oOo);
            atomicReference.set(zzad.zza(this.f20417OooO0O0, str, new SharedPreferencesOnSharedPreferenceChangeListenerC2236xk(this, str, 1)));
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void OooO0O0(Map map, boolean z) {
        if (map.isEmpty()) {
            zzo.zze("Empty paramMap.");
            return;
        }
        OooO00o(map);
        String strGenerateUrl = this.f20420OooO0o.generateUrl(map);
        zze.zza(strGenerateUrl);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f20421OooO0o0) {
            if (!z || this.f20422OooO0oO) {
                if (!z2 || this.f20423OooO0oo) {
                    this.f20418OooO0OO.execute(new l20(this, strGenerateUrl, 0));
                }
            }
        }
    }
}
