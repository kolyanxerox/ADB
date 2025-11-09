package OooooOo;

import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.C1917oy;
import com.google.android.material.bottomappbar.BottomAppBar;
import o000oo00.o000oOoO;
import o000oo00.o0ooOOo;
import o000oo00.oo000o;

/* loaded from: classes2.dex */
public final class oOOOoo00 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f15060OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15061OooOo0O = 1;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15062OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f15063OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15064OooOoO0;

    public /* synthetic */ oOOOoo00(C1917oy c1917oy, View view, boolean z, int i) {
        this.f15064OooOoO0 = c1917oy;
        this.f15063OooOoO = view;
        this.f15062OooOo0o = z;
        this.f15060OooOo = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15061OooOo0O) {
            case 0:
                int i = this.f15060OooOo;
                boolean z = this.f15062OooOo0o;
                BottomAppBar bottomAppBar = (BottomAppBar) this.f15063OooOoO;
                ((ActionMenuView) this.f15064OooOoO0).setTranslationX(bottomAppBar.OooO0oO(r3, i, z));
                break;
            case 1:
                C1917oy c1917oy = (C1917oy) this.f15064OooOoO0;
                ?? r1 = c1917oy.OooOo0;
                if (r1 != 0) {
                    c1917oy.OooOO0o.OooO0o((View) this.f15063OooOoO, r1.zzf(), c1917oy.OooOo0.zzl(), c1917oy.OooOo0.zzm(), this.f15062OooOo0o, c1917oy.OooOO0(), this.f15060OooOo);
                    break;
                } else {
                    zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                    break;
                }
            default:
                StringBuilder sb = new StringBuilder("pairing port: ");
                int i2 = this.f15060OooOo;
                sb.append(i2);
                Log.i("mdns", sb.toString());
                o000oOoO.f31097OooO0O0.f31098OooO00o.invokeMethod("onJsonReceived", "{\"pairingPort\":\"" + i2 + "\",\"ip\":\"" + ((String) this.f15064OooOoO0) + "\",\"isLocalHost\":" + this.f15062OooOo0o + "}");
                if (i2 > 0) {
                    o0ooOOo.f31103OooO00o.OooO0OO(((oo000o) this.f15063OooOoO).f31105OooOo0o);
                    break;
                }
                break;
        }
    }

    public oOOOoo00(oo000o oo000oVar, int i, String str, boolean z) {
        this.f15063OooOoO = oo000oVar;
        this.f15060OooOo = i;
        this.f15064OooOoO0 = str;
        this.f15062OooOo0o = z;
    }

    public oOOOoo00(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f15063OooOoO = bottomAppBar;
        this.f15064OooOoO0 = actionMenuView;
        this.f15060OooOo = i;
        this.f15062OooOo0o = z;
    }
}
