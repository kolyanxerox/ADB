package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.u3 */
/* loaded from: classes2.dex */
public final class C2108u3 extends AppOpenAd {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC2256y3 f24554OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f24555OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final BinderC2182w3 f24556OooO0OO = new BinderC2182w3("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public FullScreenContentCallback f24557OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public OnPaidEventListener f24558OooO0o0;

    public C2108u3(InterfaceC2256y3 interfaceC2256y3, String str) {
        this.f24554OooO00o = interfaceC2256y3;
        this.f24555OooO0O0 = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.f24555OooO0O0;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f24557OooO0Oo;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f24558OooO0o0;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzf;
        try {
            zzdyVarZzf = this.f24554OooO00o.zzf();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            zzdyVarZzf = null;
        }
        return ResponseInfo.zzb(zzdyVarZzf);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f24557OooO0Oo = fullScreenContentCallback;
        this.f24556OooO0OO.f25176OooOo0O = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.f24554OooO00o.OooOO0(z);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f24558OooO0o0 = onPaidEventListener;
        try {
            this.f24554OooO00o.o0ooOO0(new zzfs(onPaidEventListener));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.f24554OooO00o.o00000OO(new Oooo0o.OooO0OO(activity), this.f24556OooO0OO);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
