package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import androidx.webkit.WebViewCompat;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class w50 extends TimerTask {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f25228OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f25229OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Timer f25230OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f25231OooOoO0;

    public w50(AlertDialog alertDialog, Timer timer, zzm zzmVar) {
        this.f25228OooOo = alertDialog;
        this.f25230OooOo0o = timer;
        this.f25231OooOoO0 = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f25229OooOo0O) {
            case 0:
                ((AlertDialog) this.f25228OooOo).dismiss();
                this.f25230OooOo0o.cancel();
                zzm zzmVar = (zzm) this.f25231OooOoO0;
                if (zzmVar != null) {
                    zzmVar.zzb();
                    break;
                }
                break;
            default:
                WebViewCompat.removeWebMessageListener(((dh0) this.f25228OooOo).f18253OooO0O0, "omidJsSessionService");
                C2129uo c2129uo = (C2129uo) ((wj0) this.f25231OooOoO0).f25318OooOo0o;
                pj0 pj0Var = zzs.zza;
                ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = c2129uo.f24671OooOo0O;
                Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC2166vo);
                pj0Var.post(new RunnableC2092to(viewTreeObserverOnGlobalLayoutListenerC2166vo, 0));
                this.f25230OooOo0o.cancel();
                break;
        }
    }

    public w50(dh0 dh0Var, wj0 wj0Var, Timer timer) {
        this.f25231OooOoO0 = wj0Var;
        this.f25230OooOo0o = timer;
        this.f25228OooOo = dh0Var;
    }
}
