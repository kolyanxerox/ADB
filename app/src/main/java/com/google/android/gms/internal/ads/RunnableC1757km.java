package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.km */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1757km implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20619OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1831mm f20620OooOo0o;

    public /* synthetic */ RunnableC1757km(C1831mm c1831mm, int i) {
        this.f20619OooOo0O = i;
        this.f20620OooOo0o = c1831mm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20619OooOo0O) {
            case 0:
                this.f20620OooOo0o.OooO0OO("firstFrameRendered", new String[0]);
                break;
            case 1:
                this.f20620OooOo0o.OooO0OO("surfaceCreated", new String[0]);
                break;
            case 2:
                this.f20620OooOo0o.OooO0OO("surfaceDestroyed", new String[0]);
                break;
            default:
                C1831mm c1831mm = this.f20620OooOo0o;
                if (c1831mm.f21289OooOoo) {
                    ImageView imageView = c1831mm.f21300Oooo0o0;
                    if (imageView.getParent() != null) {
                        c1831mm.f21285OooOo0o.removeView(imageView);
                    }
                }
                AbstractC1684im abstractC1684im = c1831mm.f21290OooOoo0;
                if (abstractC1684im != null && c1831mm.f21298Oooo0OO != null) {
                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (abstractC1684im.getBitmap(c1831mm.f21298Oooo0OO) != null) {
                        c1831mm.f21299Oooo0o = true;
                    }
                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (zze.zzc()) {
                        zze.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
                    }
                    if (jElapsedRealtime2 > c1831mm.f21288OooOoOO) {
                        zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        c1831mm.f21294Oooo000 = false;
                        c1831mm.f21298Oooo0OO = null;
                        C1669i7 c1669i7 = c1831mm.f21287OooOoO0;
                        if (c1669i7 != null) {
                            c1669i7.OooO0O0("spinner_jank", Long.toString(jElapsedRealtime2));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
