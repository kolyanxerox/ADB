package com.google.android.gms.ads.internal.overlay;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.AbstractBinderC1826mh;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C1548ey;
import com.google.android.gms.internal.ads.C1658hx;
import com.google.android.gms.internal.ads.C2148v6;
import com.google.android.gms.internal.ads.C2246xu;
import com.google.android.gms.internal.ads.InterfaceC1401ax;
import com.google.android.gms.internal.ads.InterfaceC1605gh;
import com.google.android.gms.internal.ads.InterfaceC1722jo;
import com.google.android.gms.internal.ads.e60;
import com.google.android.gms.internal.ads.f60;
import com.google.android.gms.internal.ads.g20;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.oO000O0O;
import com.google.android.gms.internal.ads.pj0;
import com.google.android.gms.internal.ads.r50;
import com.google.android.gms.internal.ads.xg0;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.ads.yg0;
import com.google.android.gms.internal.ads.z50;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzm extends AbstractBinderC1826mh implements zzag {

    /* renamed from: OoooO0 */
    public static final int f16124OoooO0 = Color.argb(0, 0, 0, 0);

    /* renamed from: OooOo */
    public InterfaceC1722jo f16125OooOo;

    /* renamed from: OooOo0O */
    public final Activity f16126OooOo0O;

    /* renamed from: OooOo0o */
    public AdOverlayInfoParcel f16127OooOo0o;

    /* renamed from: OooOoO */
    public zzu f16128OooOoO;

    /* renamed from: OooOoO0 */
    public zzi f16129OooOoO0;

    /* renamed from: OooOoo */
    public WebChromeClient.CustomViewCallback f16131OooOoo;

    /* renamed from: OooOoo0 */
    public FrameLayout f16132OooOoo0;

    /* renamed from: Oooo */
    public Toolbar f16135Oooo;

    /* renamed from: Oooo000 */
    public zzh f16137Oooo000;

    /* renamed from: Oooo0O0 */
    public zzd f16140Oooo0O0;

    /* renamed from: Oooo0OO */
    public boolean f16141Oooo0OO;

    /* renamed from: Oooo0o0 */
    public boolean f16143Oooo0o0;

    /* renamed from: OooOoOO */
    public boolean f16130OooOoOO = false;

    /* renamed from: OooOooO */
    public boolean f16133OooOooO = false;

    /* renamed from: OooOooo */
    public boolean f16134OooOooo = false;

    /* renamed from: Oooo00O */
    public boolean f16138Oooo00O = false;

    /* renamed from: OoooO00 */
    public int f16146OoooO00 = 1;

    /* renamed from: Oooo00o */
    public final Object f16139Oooo00o = new Object();

    /* renamed from: Oooo0 */
    public final View.OnClickListener f16136Oooo0 = new zzf(this);

    /* renamed from: Oooo0o */
    public boolean f16142Oooo0o = false;

    /* renamed from: Oooo0oO */
    public boolean f16144Oooo0oO = false;

    /* renamed from: Oooo0oo */
    public boolean f16145Oooo0oo = true;

    public zzm(Activity activity) {
        this.f16126OooOo0O = activity;
    }

    public static final void o000O0oo(View view, f60 f60Var) {
        if (f60Var == null || view == null) {
            return;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0ooo)).booleanValue()) {
            oO000O0O oo000o0o = f60Var.f18792OooO0O0;
            if (((xg0) oo000o0o.f22434OooOoo0) == xg0.HTML) {
                return;
            }
        }
        ((C1658hx) com.google.android.gms.ads.internal.zzv.zzB()).OooOO0(f60Var.f18791OooO00o, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.ads.internal.overlay.zzd, java.lang.Runnable] */
    public final void OooO0oO() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.f16126OooOo0O.isFinishing() || this.f16142Oooo0o) {
            return;
        }
        this.f16142Oooo0o = true;
        InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
        if (interfaceC1722jo != null) {
            interfaceC1722jo.OoooOoo(this.f16146OoooO00 - 1);
            synchronized (this.f16139Oooo00o) {
                try {
                    if (!this.f16141Oooo0OO && this.f16125OooOo.OooOo0()) {
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0Oo0)).booleanValue() && !this.f16144Oooo0oO && (adOverlayInfoParcel = this.f16127OooOo0o) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdo();
                        }
                        ?? r1 = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc();
                            }
                        };
                        this.f16140Oooo0O0 = r1;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(r1, ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17796o0000o0O)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o000O0O0(boolean r28) throws org.json.JSONException, com.google.android.gms.ads.internal.overlay.zzg {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.o000O0O0(boolean):void");
    }

    public final void o000O0o0(View view) {
        f60 f60VarO00oO0O;
        e60 e60VarOooOOOo;
        InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
        if (interfaceC1722jo == null) {
            return;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() && (e60VarOooOOOo = interfaceC1722jo.OooOOOo()) != null) {
            e60VarOooOOOo.OooO00o(view);
            return;
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0ooo)).booleanValue() || (f60VarO00oO0O = interfaceC1722jo.o00oO0O()) == null) {
            return;
        }
        if (((xg0) f60VarO00oO0O.f18792OooO0O0.f22434OooOoo0) == xg0.HTML) {
            C1658hx c1658hx = (C1658hx) com.google.android.gms.ads.internal.zzv.zzB();
            yg0 yg0Var = f60VarO00oO0O.f18791OooO00o;
            c1658hx.getClass();
            C1658hx.OooOOOo(new z50(yg0Var, view, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o000O0oO(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f16127OooOo0o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzl r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            com.google.android.gms.ads.internal.util.zzaa r3 = com.google.android.gms.ads.internal.zzv.zzr()
            android.app.Activity r4 = r5.f16126OooOo0O
            boolean r6 = r3.zzd(r4, r6)
            boolean r3 = r5.f16134OooOooo
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.f17784o0000O00
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.OooO00o(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = r2
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.v6 r6 = com.google.android.gms.internal.ads.AbstractC1448c7.f17770o0000
            com.google.android.gms.internal.ads.a7 r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.OooO00o(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f16127OooOo0o
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzl r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.view.Window r6 = r4.getWindow()
            com.google.android.gms.internal.ads.v6 r0 = com.google.android.gms.internal.ads.AbstractC1448c7.f17804o0000ooO
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.OooO00o(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7b
            if (r2 == 0) goto L78
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7d
        L78:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7d
        L7b:
            r0 = 256(0x100, float:3.59E-43)
        L7d:
            r6.setSystemUiVisibility(r0)
            return
        L81:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L99
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L98
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L98:
            return
        L99:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.o000O0oO(android.content.res.Configuration):void");
    }

    public final void zzA(int i) {
        Activity activity = this.f16126OooOo0O;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooO00)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooO0)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooO0O)).intValue()) {
                    if (i2 <= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooO0o)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oO("AdOverlay.setRequestedOrientation", th);
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.f16137Oooo000.setBackgroundColor(0);
        } else {
            this.f16137Oooo000.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.f16126OooOo0O;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f16132OooOoo0 = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f16132OooOoo0.addView(view, -1, -1);
        activity.setContentView(this.f16132OooOoo0);
        this.f16143Oooo0o0 = true;
        this.f16131OooOoo = customViewCallback;
        this.f16130OooOoOO = true;
    }

    public final void zzE() {
        synchronized (this.f16139Oooo00o) {
            try {
                this.f16141Oooo0OO = true;
                zzd zzdVar = this.f16140Oooo0O0;
                if (zzdVar != null) {
                    pj0 pj0Var = com.google.android.gms.ads.internal.util.zzs.zza;
                    pj0Var.removeCallbacks(zzdVar);
                    pj0Var.post(this.f16140Oooo0O0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.f16135Oooo;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final boolean zzH() {
        this.f16146OoooO00 = 1;
        if (this.f16125OooOo == null) {
            return true;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue() && this.f16125OooOo.canGoBack()) {
            this.f16125OooOo.goBack();
            return false;
        }
        boolean zOooo = this.f16125OooOo.Oooo();
        if (!zOooo) {
            this.f16125OooOo.OooO0o("onbackblocked", Collections.EMPTY_MAP);
        }
        return zOooo;
    }

    public final void zzb() {
        this.f16146OoooO00 = 3;
        Activity activity = this.f16126OooOo0O;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
        if (interfaceC1722jo != null) {
            interfaceC1722jo.o00oO0o(null);
        }
    }

    public final void zzc() {
        InterfaceC1722jo interfaceC1722jo;
        zzr zzrVar;
        if (this.f16144Oooo0oO) {
            return;
        }
        this.f16144Oooo0oO = true;
        InterfaceC1722jo interfaceC1722jo2 = this.f16125OooOo;
        if (interfaceC1722jo2 != null) {
            this.f16137Oooo000.removeView(interfaceC1722jo2.OooO0oO());
            zzi zziVar = this.f16129OooOoO0;
            if (zziVar != null) {
                this.f16125OooOo.o000oOoO(zziVar.zzd);
                this.f16125OooOo.o00O0O(false);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0Oo00)).booleanValue() && this.f16125OooOo.getParent() != null) {
                    ((ViewGroup) this.f16125OooOo.getParent()).removeView(this.f16125OooOo.OooO0oO());
                }
                ViewGroup viewGroup = this.f16129OooOoO0.zzc;
                View viewOooO0oO = this.f16125OooOo.OooO0oO();
                zzi zziVar2 = this.f16129OooOoO0;
                viewGroup.addView(viewOooO0oO, zziVar2.zza, zziVar2.zzb);
                this.f16129OooOoO0 = null;
            } else {
                Activity activity = this.f16126OooOo0O;
                if (activity.getApplicationContext() != null) {
                    this.f16125OooOo.o000oOoO(activity.getApplicationContext());
                }
            }
            this.f16125OooOo = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzds(this.f16146OoooO00);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f16127OooOo0o;
        if (adOverlayInfoParcel2 == null || (interfaceC1722jo = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        o000O0oo(this.f16127OooOo0o.zzd.OooO0oO(), interfaceC1722jo.o00oO0O());
    }

    public final void zzd() {
        this.f16137Oooo000.f16122OooOo0o = true;
    }

    public final void zzf(y50 y50Var) throws RemoteException, zzg {
        InterfaceC1605gh interfaceC1605gh;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
        if (adOverlayInfoParcel == null || (interfaceC1605gh = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        interfaceC1605gh.OooOOo0(new OooO0OO(y50Var));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
        if (adOverlayInfoParcel != null && this.f16130OooOoOO) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.f16132OooOoo0 != null) {
            this.f16126OooOo0O.setContentView(this.f16137Oooo000);
            this.f16143Oooo0o0 = true;
            this.f16132OooOoo0.removeAllViews();
            this.f16132OooOoo0 = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f16131OooOoo;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f16131OooOoo = null;
        }
        this.f16130OooOoOO = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzh(int i, int i2, Intent intent) {
        h20 h20Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            C2148v6 c2148v6 = AbstractC1448c7.o0o0Oo0;
            if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Callback from intent launch with requestCode: 236 and resultCode: " + i2);
                InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
                if (interfaceC1722jo == null || interfaceC1722jo.zzN() == null || (h20Var = interfaceC1722jo.zzN().f21551OoooOO0) == null || (adOverlayInfoParcel = this.f16127OooOo0o) == null || !((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                    return;
                }
                C1548ey c1548eyOooO00o = h20Var.OooO00o();
                c1548eyOooO00o.OooO0oO("action", "hilca");
                String str = adOverlayInfoParcel.zzq;
                if (str == null) {
                    str = "";
                }
                c1548eyOooO00o.OooO0oO("gqi", str);
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                c1548eyOooO00o.OooO0oO("hilr", sb.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        c1548eyOooO00o.OooO0oO("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        c1548eyOooO00o.OooO0oO("hills", stringExtra2);
                    }
                }
                ((h20) c1548eyOooO00o.f18706OooOo).f19526OooO0O0.execute(new g20(c1548eyOooO00o, 2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzi() {
        this.f16146OoooO00 = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
        this.f16146OoooO00 = 2;
        this.f16126OooOo0O.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzk(OooO0O0 oooO0O0) {
        o000O0oO((Configuration) OooO0OO.o000O0oO(oooO0O0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public void zzl(Bundle bundle) throws JSONException, zzg {
        if (!this.f16143Oooo0o0) {
            this.f16126OooOo0O.requestWindowFeature(1);
        }
        this.f16133OooOooO = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.f16126OooOo0O.getIntent());
            this.f16127OooOo0o = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f16126OooOo0O.setShowWhenLocked(true);
                } else {
                    this.f16126OooOo0O.getWindow().addFlags(524288);
                }
            }
            if (this.f16127OooOo0o.zzm.clientJarVersion > 7500000) {
                this.f16146OoooO00 = 4;
            }
            if (this.f16126OooOo0O.getIntent() != null) {
                this.f16145Oooo0oo = this.f16126OooOo0O.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.f16134OooOooo = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzk(this).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.f16134OooOooo = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this).zzb();
                }
            } else {
                this.f16134OooOooo = false;
            }
            if (bundle == null) {
                if (this.f16145Oooo0oo) {
                    C2246xu c2246xu = this.f16127OooOo0o.zzt;
                    if (c2246xu != null) {
                        synchronized (c2246xu) {
                            ScheduledFuture scheduledFuture = c2246xu.f25803OooOoO0;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                            }
                        }
                    }
                    zzr zzrVar = this.f16127OooOo0o.zzc;
                    if (zzrVar != null) {
                        zzrVar.zzdp();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f16127OooOo0o;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    InterfaceC1401ax interfaceC1401ax = this.f16127OooOo0o.zzu;
                    if (interfaceC1401ax != null) {
                        interfaceC1401ax.Oooo000();
                    }
                }
            }
            Activity activity = this.f16126OooOo0O;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f16127OooOo0o;
            zzh zzhVar = new zzh(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.afmaVersion, adOverlayInfoParcel3.zzs);
            this.f16137Oooo000 = zzhVar;
            zzhVar.setId(1000);
            com.google.android.gms.ads.internal.zzv.zzr().zzk(this.f16126OooOo0O);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f16127OooOo0o;
            int i = adOverlayInfoParcel4.zzk;
            if (i == 1) {
                o000O0O0(false);
                return;
            }
            if (i == 2) {
                this.f16129OooOoO0 = new zzi(adOverlayInfoParcel4.zzd);
                o000O0O0(false);
            } else if (i == 3) {
                o000O0O0(true);
            } else {
                if (i != 5) {
                    throw new zzg("Could not determine ad overlay type.");
                }
                o000O0O0(false);
            }
        } catch (zzg e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            this.f16146OoooO00 = 4;
            this.f16126OooOo0O.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzm() {
        InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
        if (interfaceC1722jo != null) {
            try {
                this.f16137Oooo000.removeView(interfaceC1722jo.OooO0oO());
            } catch (NullPointerException unused) {
            }
        }
        OooO0oO();
    }

    public final void zzn() {
        if (this.f16138Oooo00O) {
            this.f16138Oooo00O = false;
            this.f16125OooOo.zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzo() {
        zzr zzrVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdi();
        }
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0OoO)).booleanValue() && this.f16125OooOo != null && (!this.f16126OooOo0O.isFinishing() || this.f16129OooOoO0 == null)) {
            this.f16125OooOo.onPause();
        }
        OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f16126OooOo0O;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
            try {
                adOverlayInfoParcel.zzv.Oooooo(strArr, iArr, new OooO0OO(new r50(activity, adOverlayInfoParcel.zzk == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzr() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdE();
        }
        o000O0oO(this.f16126OooOo0O.getResources().getConfiguration());
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0OoO)).booleanValue()) {
            return;
        }
        InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
        if (interfaceC1722jo == null || interfaceC1722jo.OooOOO0()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.f16125OooOo.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f16133OooOooO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzt() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0OoO)).booleanValue()) {
            InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
            if (interfaceC1722jo == null || interfaceC1722jo.OooOOO0()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f16125OooOo.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzu() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0OoO)).booleanValue() && this.f16125OooOo != null && (!this.f16126OooOo0O.isFinishing() || this.f16129OooOoO0 == null)) {
            this.f16125OooOo.onPause();
        }
        OooO0oO();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzv() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16127OooOo0o;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdr();
    }

    public final void zzw(boolean z) throws JSONException {
        if (this.f16127OooOo0o.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0o0O)).intValue();
        boolean z2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17799o0000oO0)).booleanValue() || z;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : iIntValue;
        zztVar.zzb = true != z2 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.f16128OooOoO = new zzu(this.f16126OooOo0O, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzy(z, this.f16127OooOo0o.zzg);
        this.f16137Oooo000.addView(this.f16128OooOoO, layoutParams);
        o000O0o0(this.f16128OooOoO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1863nh
    public final void zzx() {
        this.f16143Oooo0o0 = true;
    }

    public final void zzy(boolean z, boolean z2) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17797o0000o0o)).booleanValue() && (adOverlayInfoParcel2 = this.f16127OooOo0o) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17794o0000o)).booleanValue() && (adOverlayInfoParcel = this.f16127OooOo0o) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            InterfaceC1722jo interfaceC1722jo = this.f16125OooOo;
            try {
                JSONObject jSONObjectPut = new JSONObject().put(Constants.MESSAGE, "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (interfaceC1722jo != null) {
                    interfaceC1722jo.OooO0o0("onError", jSONObjectPut);
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching error event.", e);
            }
        }
        zzu zzuVar = this.f16128OooOoO;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zzb(z3);
        }
    }

    public final void zzz() {
        this.f16137Oooo000.removeView(this.f16128OooOoO);
        zzw(true);
    }
}
