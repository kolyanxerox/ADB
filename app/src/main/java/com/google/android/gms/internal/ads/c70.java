package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class c70 implements i60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f17943OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC1990qx f17944OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f17945OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final jd0 f17946OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final h20 f17947OooO0o0;

    public c70(Context context, Executor executor, AbstractC1990qx abstractC1990qx, jd0 jd0Var, h20 h20Var) {
        this.f17943OooO00o = context;
        this.f17944OooO0O0 = abstractC1990qx;
        this.f17945OooO0OO = executor;
        this.f17946OooO0Oo = jd0Var;
        this.f17947OooO0o0 = h20Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) throws JSONException {
        String string;
        Context context = this.f17943OooO00o;
        if (!(context instanceof Activity) || !C1927p7.OooO00o(context)) {
            return false;
        }
        try {
            string = kd0Var.f20506OooOo0O.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return !TextUtils.isEmpty(string);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) throws JSONException {
        String string;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OOoO)).booleanValue()) {
            C1548ey c1548eyOooO00o = this.f17947OooO0o0.OooO00o();
            c1548eyOooO00o.OooO0oO("action", "cstm_tbs_rndr");
            c1548eyOooO00o.OooOOO0();
        }
        try {
            string = kd0Var.f20506OooOo0O.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return ii0.ooOO(yp0.f25991OooOo0o, new b70(this, string != null ? Uri.parse(string) : null, rd0Var, kd0Var, (md0) rd0Var.f23849OooO0O0.f24096OooOo, 0), this.f17945OooO0OO);
    }
}
