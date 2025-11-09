package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class mf0 implements Runnable {

    /* renamed from: OooOo */
    public String f21240OooOo;

    /* renamed from: OooOo0o */
    public final nf0 f21242OooOo0o;

    /* renamed from: OooOoO */
    public String f21243OooOoO;

    /* renamed from: OooOoOO */
    public C2051sk f21245OooOoOO;

    /* renamed from: OooOoo */
    public ScheduledFuture f21246OooOoo;

    /* renamed from: OooOoo0 */
    public zze f21247OooOoo0;

    /* renamed from: OooOo0O */
    public final ArrayList f21241OooOo0O = new ArrayList();

    /* renamed from: OooOooO */
    public int f21248OooOooO = 2;

    /* renamed from: OooOoO0 */
    public pf0 f21244OooOoO0 = pf0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public mf0(nf0 nf0Var) {
        this.f21242OooOo0o = nf0Var;
    }

    public final synchronized void OooO(int i) {
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            this.f21248OooOooO = i;
        }
    }

    public final synchronized void OooO00o(jf0 jf0Var) {
        try {
            if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
                ArrayList arrayList = this.f21241OooOo0O;
                jf0Var.zzj();
                arrayList.add(jf0Var);
                ScheduledFuture scheduledFuture = this.f21246OooOoo;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f21246OooOoo = AbstractC2200wl.f25324OooO0Oo.schedule(this, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0oo0)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0O0(String str) {
        boolean zMatches;
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0ooO), str);
            }
            if (zMatches) {
                this.f21240OooOo = str;
            }
        }
    }

    public final synchronized void OooO0OO(zze zzeVar) {
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            this.f21247OooOoo0 = zzeVar;
        }
    }

    public final synchronized void OooO0Oo(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.f21248OooOooO = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.f21248OooOooO = 4;
                } else if (arrayList.contains(IronSourceConstants.EVENTS_NATIVE) || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.f21248OooOooO = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.f21248OooOooO = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f21248OooOooO = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.f21248OooOooO = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0o(Bundle bundle) {
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            this.f21244OooOoO0 = zzaa.zza(bundle);
        }
    }

    public final synchronized void OooO0o0(String str) {
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            this.f21243OooOoO = str;
        }
    }

    public final synchronized void OooO0oO(C2051sk c2051sk) {
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            this.f21245OooOoOO = c2051sk;
        }
    }

    public final synchronized void OooO0oo() {
        try {
            if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f21246OooOoo;
                int i = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f21241OooOo0O;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jf0 jf0Var = (jf0) obj;
                    int i2 = this.f21248OooOooO;
                    if (i2 != 2) {
                        jf0Var.OooO0O0(i2);
                    }
                    if (!TextUtils.isEmpty(this.f21240OooOo)) {
                        jf0Var.zze(this.f21240OooOo);
                    }
                    if (!TextUtils.isEmpty(this.f21243OooOoO) && !jf0Var.zzl()) {
                        jf0Var.OooO0o(this.f21243OooOoO);
                    }
                    C2051sk c2051sk = this.f21245OooOoOO;
                    if (c2051sk != null) {
                        jf0Var.OooO0OO(c2051sk);
                    } else {
                        zze zzeVar = this.f21247OooOoo0;
                        if (zzeVar != null) {
                            jf0Var.OooO0oo(zzeVar);
                        }
                    }
                    jf0Var.OooO00o(this.f21244OooOoO0);
                    this.f21242OooOo0o.OooO0O0(jf0Var.zzm());
                }
                this.f21241OooOo0O.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        OooO0oo();
    }
}
