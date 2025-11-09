package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pz */
/* loaded from: classes2.dex */
public final class C1955pz implements InterfaceC2176vy {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC1640hf f23457OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2320zu f23458OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1950pu f23459OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C2322zw f23460OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final kd0 f23461OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Context f23462OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final VersionInfoParcel f23463OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final vd0 f23464OooO0oo;
    public final C1493df OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final C1529ef f23467OooOOO0;

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f23456OooO = false;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f23465OooOO0 = false;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f23466OooOO0O = true;

    public C1955pz(C1493df c1493df, C1529ef c1529ef, InterfaceC1640hf interfaceC1640hf, C2320zu c2320zu, C1950pu c1950pu, C2322zw c2322zw, Context context, kd0 kd0Var, VersionInfoParcel versionInfoParcel, vd0 vd0Var) {
        this.OooOO0o = c1493df;
        this.f23467OooOOO0 = c1529ef;
        this.f23457OooO00o = interfaceC1640hf;
        this.f23458OooO0O0 = c2320zu;
        this.f23459OooO0OO = c1950pu;
        this.f23460OooO0Oo = c2322zw;
        this.f23462OooO0o0 = context;
        this.f23461OooO0o = kd0Var;
        this.f23463OooO0oO = versionInfoParcel;
        this.f23464OooO0oo = vd0Var;
    }

    public static final HashMap OooOo00(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO00o(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f23456OooO) {
                this.f23456OooO = zzv.zzt().zzn(this.f23462OooO0o0, this.f23463OooO0oO.afmaVersion, this.f23461OooO0o.f20511OooOoo.toString(), this.f23464OooO0oo.f24955OooO0o);
            }
            if (this.f23466OooOO0O) {
                InterfaceC1640hf interfaceC1640hf = this.f23457OooO00o;
                C2320zu c2320zu = this.f23458OooO0O0;
                if (interfaceC1640hf != null && !interfaceC1640hf.zzB()) {
                    interfaceC1640hf.zzx();
                    c2320zu.zza();
                    return;
                }
                C1493df c1493df = this.OooOO0o;
                if (c1493df != null) {
                    Parcel parcelOooOOO = c1493df.OooOOO(c1493df.OooO(), 13);
                    ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                    boolean z = parcelOooOOO.readInt() != 0;
                    parcelOooOOO.recycle();
                    if (!z) {
                        c1493df.o000OO0O(c1493df.OooO(), 10);
                        c2320zu.zza();
                        return;
                    }
                }
                C1529ef c1529ef = this.f23467OooOOO0;
                if (c1529ef != null) {
                    Parcel parcelOooOOO2 = c1529ef.OooOOO(c1529ef.OooO(), 11);
                    ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
                    boolean z2 = parcelOooOOO2.readInt() != 0;
                    parcelOooOOO2.recycle();
                    if (z2) {
                        return;
                    }
                    c1529ef.o000OO0O(c1529ef.OooO(), 8);
                    c2320zu.zza();
                }
            }
        } catch (RemoteException e) {
            zzo.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0O0() {
        this.f23465OooOO0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[Catch: RemoteException -> 0x0036, JSONException -> 0x0054, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0054, blocks: (B:46:0x00bb, B:48:0x00d3), top: B:68:0x00bb }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(android.view.View r17, java.util.Map r18, java.util.Map r19, com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz r20, com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC1881nz r21) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1955pz.OooO0OO(android.view.View, java.util.Map, java.util.Map, com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.nz):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0Oo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.f23465OooOO0 && this.f23461OooO0o.f20523Oooo0o0) {
            return;
        }
        OooOOoo(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0o(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.f23465OooOO0) {
            zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f23461OooO0o.f20523Oooo0o0) {
            OooOOoo(view2);
        } else {
            zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0o0(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0oO(InterfaceC2263ya interfaceC2263ya) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooO0oo(zzdd zzddVar) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOO0(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final boolean OooOO0O(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOO0o(View view) {
        try {
            Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(view);
            InterfaceC1640hf interfaceC1640hf = this.f23457OooO00o;
            if (interfaceC1640hf != null) {
                interfaceC1640hf.Oooo0(oooO0OO);
                return;
            }
            C1493df c1493df = this.OooOO0o;
            if (c1493df != null) {
                Parcel parcelOooO = c1493df.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
                c1493df.o000OO0O(parcelOooO, 16);
            } else {
                C1529ef c1529ef = this.f23467OooOOO0;
                if (c1529ef != null) {
                    Parcel parcelOooO2 = c1529ef.OooO();
                    AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO);
                    c1529ef.o000OO0O(parcelOooO2, 14);
                }
            }
        } catch (RemoteException e) {
            zzo.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final JSONObject OooOOO(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOOO0(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final boolean OooOOOo() {
        return this.f23461OooO0o.f20523Oooo0o0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final JSONObject OooOOo(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOOo0(zzdh zzdhVar) {
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void OooOOoo(View view) {
        InterfaceC1640hf interfaceC1640hf = this.f23457OooO00o;
        C2322zw c2322zw = this.f23460OooO0Oo;
        C1950pu c1950pu = this.f23459OooO0OO;
        if (interfaceC1640hf != null) {
            try {
                if (!interfaceC1640hf.zzA()) {
                    interfaceC1640hf.o000O0O(new Oooo0o.OooO0OO(view));
                    c1950pu.onAdClicked();
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO000)).booleanValue()) {
                        c2322zw.Oooo000();
                        return;
                    }
                    return;
                }
            } catch (RemoteException e) {
                zzo.zzk("Failed to call handleClick", e);
                return;
            }
        }
        C1493df c1493df = this.OooOO0o;
        if (c1493df != null) {
            Parcel parcelOooOOO = c1493df.OooOOO(c1493df.OooO(), 14);
            ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
            boolean z = parcelOooOOO.readInt() != 0;
            parcelOooOOO.recycle();
            if (!z) {
                Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(view);
                Parcel parcelOooO = c1493df.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
                c1493df.o000OO0O(parcelOooO, 11);
                c1950pu.onAdClicked();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO000)).booleanValue()) {
                    c2322zw.Oooo000();
                    return;
                }
                return;
            }
        }
        C1529ef c1529ef = this.f23467OooOOO0;
        if (c1529ef != null) {
            Parcel parcelOooOOO2 = c1529ef.OooOOO(c1529ef.OooO(), 12);
            ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
            boolean z2 = parcelOooOOO2.readInt() != 0;
            parcelOooOOO2.recycle();
            if (z2) {
                return;
            }
            Oooo0o.OooO0OO oooO0OO2 = new Oooo0o.OooO0OO(view);
            Parcel parcelOooO2 = c1529ef.OooO();
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO2);
            c1529ef.o000OO0O(parcelOooO2, 9);
            c1950pu.onAdClicked();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO000)).booleanValue()) {
                c2322zw.Oooo000();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final boolean zzB() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2176vy
    public final void OooOOOO(MotionEvent motionEvent, View view) {
    }
}
