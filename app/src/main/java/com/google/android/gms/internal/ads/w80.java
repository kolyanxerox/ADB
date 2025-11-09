package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w80 extends AbstractBinderC2181w2 implements InterfaceC1604gg {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f25260OooOoOO = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public final JSONObject f25261OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final InterfaceC1530eg f25262OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2274yl f25263OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f25264OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final long f25265OooOoO0;

    public w80(String str, InterfaceC1530eg interfaceC1530eg, C2274yl c2274yl, long j) throws JSONException {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f25261OooOo = jSONObject;
        this.f25264OooOoO = false;
        this.f25263OooOo0o = c2274yl;
        this.f25262OooOo0O = interfaceC1530eg;
        this.f25265OooOoO0 = j;
        try {
            jSONObject.put("adapter_version", interfaceC1530eg.zzf().toString());
            jSONObject.put("sdk_version", interfaceC1530eg.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1604gg
    public final synchronized void OooOo(zze zzeVar) {
        o000O0O0(2, zzeVar.zzb);
    }

    public final synchronized void o000O0O0(int i, String str) {
        try {
            if (this.f25264OooOoO) {
                return;
            }
            try {
                this.f25261OooOo.put("signal_error", str);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17822o000OOo0)).booleanValue()) {
                    JSONObject jSONObject = this.f25261OooOo;
                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f25265OooOoO0);
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17820o000OOO)).booleanValue()) {
                    this.f25261OooOo.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f25263OooOo0o.zzc(this.f25261OooOo);
            this.f25264OooOoO = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zze(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zzf(string2);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            OooOo(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1604gg
    public final synchronized void zze(String str) {
        if (this.f25264OooOoO) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.f25261OooOo.put("signals", str);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17822o000OOo0)).booleanValue()) {
                JSONObject jSONObject = this.f25261OooOo;
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f25265OooOoO0);
            }
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17820o000OOO)).booleanValue()) {
                this.f25261OooOo.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f25263OooOo0o.zzc(this.f25261OooOo);
        this.f25264OooOoO = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1604gg
    public final synchronized void zzf(String str) {
        o000O0O0(2, str);
    }
}
