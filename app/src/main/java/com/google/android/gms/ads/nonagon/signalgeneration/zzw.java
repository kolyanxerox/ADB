package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.InterfaceC1584fx;
import com.google.android.gms.internal.ads.f20;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzw implements InterfaceC1584fx {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f16635OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final f20 f16636OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final zzv f16637OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f16638OooOoO0;

    @VisibleForTesting
    public zzw(f20 f20Var, zzv zzvVar, String str, int i) {
        this.f16636OooOo0O = f20Var;
        this.f16637OooOo0o = zzvVar;
        this.f16635OooOo = str;
        this.f16638OooOoO0 = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zze(@Nullable zzbk zzbkVar) {
        String strOptString;
        if (zzbkVar == null || this.f16638OooOoO0 == 2) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(zzbkVar.zzc);
        f20 f20Var = this.f16636OooOo0O;
        zzv zzvVar = this.f16637OooOo0o;
        if (zIsEmpty) {
            zzvVar.zzd(this.f16635OooOo, zzbkVar.zzb, f20Var);
            return;
        }
        try {
            strOptString = new JSONObject(zzbkVar.zzc).optString("request_id");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("RenderSignals.getRequestId", e);
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        zzvVar.zzd(strOptString, zzbkVar.zzc, f20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1584fx
    public final void zzf(@Nullable String str) {
    }
}
