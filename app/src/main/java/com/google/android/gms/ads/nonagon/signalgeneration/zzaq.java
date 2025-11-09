package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1449c8;
import com.google.android.gms.internal.ads.C1646hl;
import com.google.android.gms.internal.ads.InterfaceC1389al;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.mf0;
import com.google.android.gms.internal.ads.vp0;
import java.util.concurrent.atomic.AtomicBoolean;
import o00000oO.OooOOO;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzaq implements vp0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1389al f16485OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ OooOOO f16486OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1646hl f16487OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ zzau f16488OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ jf0 f16489OooOoO0;

    public zzaq(zzau zzauVar, OooOOO oooOOO, C1646hl c1646hl, InterfaceC1389al interfaceC1389al, jf0 jf0Var) {
        this.f16486OooOo0O = oooOOO;
        this.f16487OooOo0o = c1646hl;
        this.f16485OooOo = interfaceC1389al;
        this.f16489OooOoO0 = jf0Var;
        this.f16488OooOoO = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0Oo)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oO("SignalGeneratorImpl.generateSignals", th);
        } else {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("SignalGeneratorImpl.generateSignals", th);
        }
        mf0 mf0VarO000OOo0 = zzau.o000OOo0(this.f16486OooOo0O, this.f16487OooOo0o);
        if (((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() && mf0VarO000OOo0 != null) {
            jf0 jf0Var = this.f16489OooOoO0;
            jf0Var.OooO0Oo(th);
            jf0Var.OooOO0(false);
            mf0VarO000OOo0.OooO00o(jf0Var);
            mf0VarO000OOo0.OooO0oo();
        }
        InterfaceC1389al interfaceC1389al = this.f16485OooOo;
        if (interfaceC1389al == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            interfaceC1389al.zzb(message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo13705zzb(@Nullable Object obj) {
        zzbk zzbkVar = (zzbk) obj;
        mf0 mf0VarO000OOo0 = zzau.o000OOo0(this.f16486OooOo0O, this.f16487OooOo0o);
        zzau zzauVar = this.f16488OooOoO;
        AtomicBoolean atomicBoolean = zzauVar.f16527OoooOOO;
        String str = zzauVar.f16519Oooo0o0;
        String str2 = zzauVar.f16518Oooo0o;
        atomicBoolean.set(true);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o00O)).booleanValue();
        jf0 jf0Var = this.f16489OooOoO0;
        InterfaceC1389al interfaceC1389al = this.f16485OooOo;
        if (!zBooleanValue) {
            if (interfaceC1389al != null) {
                try {
                    interfaceC1389al.zzb("QueryInfo generation has been disabled.");
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
                }
            }
            if (!((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() || mf0VarO000OOo0 == null) {
                return;
            }
            jf0Var.OooO0o0("QueryInfo generation has been disabled.");
            jf0Var.OooOO0(false);
            mf0VarO000OOo0.OooO00o(jf0Var);
            mf0VarO000OOo0.OooO0oo();
            return;
        }
        try {
            try {
                if (zzbkVar == null) {
                    if (interfaceC1389al != null) {
                        interfaceC1389al.o000000o(null, null, null);
                    }
                    jf0Var.OooOO0(true);
                    if (!((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() || mf0VarO000OOo0 == null) {
                        return;
                    }
                    mf0VarO000OOo0.OooO00o(jf0Var);
                    mf0VarO000OOo0.OooO0oo();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbkVar.zzc) ? new JSONObject(zzbkVar.zzc) : new JSONObject(zzbkVar.zzb)).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("The request ID is empty in request JSON.");
                        if (interfaceC1389al != null) {
                            interfaceC1389al.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        jf0Var.OooO0o0("Request ID empty");
                        jf0Var.OooOO0(false);
                        if (!((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() || mf0VarO000OOo0 == null) {
                            return;
                        }
                        mf0VarO000OOo0.OooO00o(jf0Var);
                        mf0VarO000OOo0.OooO0oo();
                        return;
                    }
                    Bundle bundle = zzbkVar.zzf;
                    if (zzauVar.f16517Oooo0OO && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, zzauVar.f16520Oooo0oO.get());
                    }
                    if (zzauVar.f16516Oooo0O0 && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(zzauVar.f16511Oooo)) {
                            zzauVar.f16511Oooo = com.google.android.gms.ads.internal.zzv.zzq().zzc(zzauVar.f16503OooOo0o, zzauVar.f16521Oooo0oo.afmaVersion);
                        }
                        bundle.putString(str, zzauVar.f16511Oooo);
                    }
                    if (interfaceC1389al != null) {
                        if (TextUtils.isEmpty(zzbkVar.zzc)) {
                            interfaceC1389al.o000000o(zzbkVar.zza, bundle, zzbkVar.zzb);
                        } else {
                            interfaceC1389al.o000000o(zzbkVar.zza, bundle, zzbkVar.zzc);
                        }
                    }
                    jf0Var.OooOO0(true);
                    if (!((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() || mf0VarO000OOo0 == null) {
                        return;
                    }
                    mf0VarO000OOo0.OooO00o(jf0Var);
                    mf0VarO000OOo0.OooO0oo();
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create JSON object from the request string.");
                    if (interfaceC1389al != null) {
                        interfaceC1389al.zzb("Internal error for request JSON: " + e2.toString());
                    }
                    jf0Var.OooO0Oo(e2);
                    jf0Var.OooOO0(false);
                    com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("SignalGeneratorImpl.generateSignals.onSuccess", e2);
                    if (!((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() || mf0VarO000OOo0 == null) {
                        return;
                    }
                    mf0VarO000OOo0.OooO00o(jf0Var);
                    mf0VarO000OOo0.OooO0oo();
                }
            } catch (Throwable th) {
                if (((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() && mf0VarO000OOo0 != null) {
                    mf0VarO000OOo0.OooO00o(jf0Var);
                    mf0VarO000OOo0.OooO0oo();
                }
                throw th;
            }
        } catch (RemoteException e3) {
            jf0Var.OooO0Oo(e3);
            jf0Var.OooOO0(false);
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("SignalGeneratorImpl.generateSignals.onSuccess", e3);
            if (!((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue() || mf0VarO000OOo0 == null) {
                return;
            }
            mf0VarO000OOo0.OooO00o(jf0Var);
            mf0VarO000OOo0.OooO0oo();
        }
    }
}
