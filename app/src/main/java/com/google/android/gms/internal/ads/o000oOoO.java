package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.ironsource.C3912zo;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* renamed from: OooOo */
    public final Object f21731OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21732OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f21733OooOo0o;

    /* renamed from: OooOoO0 */
    public final Object f21734OooOoO0;

    public /* synthetic */ o000oOoO(Object obj, Object obj2, Object obj3, int i) {
        this.f21732OooOo0O = i;
        this.f21733OooOo0o = obj;
        this.f21731OooOo = obj2;
        this.f21734OooOoO0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj = this.f21734OooOoO0;
        Object obj2 = this.f21731OooOo;
        Object obj3 = this.f21733OooOo0o;
        switch (this.f21732OooOo0O) {
            case 0:
                o00O0O o00o0o = (o00O0O) obj3;
                o00o0o.getClass();
                int i = i80.f19994OooO00o;
                h61 h61Var = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                d61 d61VarOooOO0o = h61Var.OooOO0o();
                h61Var.OooO(d61VarOooOO0o, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new pd0(d61VarOooOO0o, (o0OoOo0) obj2, (h41) obj));
                return;
            case 1:
                oOOO00o0 oooo00o0 = (oOOO00o0) obj3;
                oooo00o0.zzw();
                OoooOOO.o0O0oo00 o0o0oo00 = (OoooOOO.o0O0oo00) obj2;
                oOOOoo00 oooooo00 = (oOOOoo00) o0o0oo00.f14471OooOoO0;
                if (oooooo00 == null) {
                    oooo00o0.OooO0O0(o0o0oo00.f14470OooOo0o);
                } else {
                    oooo00o0.zzn(oooooo00);
                }
                if (o0o0oo00.f14469OooOo0O) {
                    oooo00o0.zzm("intermediate-response");
                } else {
                    oooo00o0.OooO0OO("done");
                }
                wp0 wp0Var = (wp0) obj;
                if (wp0Var != null) {
                    wp0Var.run();
                    return;
                }
                return;
            case 2:
                C1812m3 c1812m3 = (C1812m3) obj3;
                WebView webView = (WebView) obj2;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", c1812m3);
                        return;
                    } catch (Throwable unused) {
                        c1812m3.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                AdManagerAdView adManagerAdView = (AdManagerAdView) obj3;
                if (adManagerAdView.zzb((zzby) obj2)) {
                    ((BinderC1636hb) obj).f19677OooOo0O.onAdManagerAdViewLoaded(adManagerAdView);
                    return;
                } else {
                    zzo.zzj("Could not bind.");
                    return;
                }
            case 4:
                C1831mm c1831mm = ((TextureViewSurfaceTextureListenerC1647hm) obj).f19824Oooo0OO;
                if (c1831mm != null) {
                    c1831mm.OooO0OO(C3912zo.a.f13038g, "what", (String) obj3, "extra", (String) obj2);
                    return;
                }
                return;
            case 5:
                ((ViewTreeObserverOnGlobalLayoutListenerC2166vo) obj3).OoooO0((String) obj2, (ValueCallback) obj);
                return;
            case 6:
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{(String) obj2});
                s50.OooO0OO(sQLiteDatabase, (zzu) obj);
                return;
            case 7:
                d70 d70Var = (d70) obj3;
                o00000oO.OooOOO oooOOOO00Oo0 = ii0.o00Oo0(d70Var.f18188OooO0O0.OooO0O0((rd0) obj2, (kd0) obj), r5.f20527OoooO0, TimeUnit.SECONDS, d70Var.f18192OooO0o0);
                oooOOOO00Oo0.addListener(new wp0(0, oooOOOO00Oo0, new p80(d70Var, 21)), d70Var.f18189OooO0OO);
                return;
            case 8:
                ck0 ck0Var = (ck0) obj2;
                ok0 ok0Var = (ok0) obj;
                kk0 kk0Var = (kk0) obj3;
                String str = kk0Var.f20614OooO0O0;
                try {
                    C1643hi c1643hi = kk0Var.f20613OooO00o;
                    if (c1643hi == null) {
                        throw null;
                    }
                    bk0 bk0Var = (bk0) c1643hi.f19794OooOooo;
                    if (bk0Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    kk0.OooO0O0(ck0Var.f18009OooO00o, new ik0(6, bundle));
                    kk0.OooO0O0(ck0Var.f18010OooO0O0, new ik0(7, bundle));
                    jk0 jk0Var = new jk0(kk0Var, ok0Var);
                    zj0 zj0Var = (zj0) bk0Var;
                    Parcel parcelOooO = zj0Var.OooO();
                    AbstractC2218x2.OooO0OO(parcelOooO, bundle);
                    AbstractC2218x2.OooO0o0(parcelOooO, jk0Var);
                    zj0Var.o000O0O0(parcelOooO, 2);
                    return;
                } catch (RemoteException e) {
                    kk0.f20611OooO0OO.OooO0O0(e, "dismiss overlay display from: %s", str);
                    return;
                }
            case 9:
                lk0 lk0Var = (lk0) obj2;
                ok0 ok0Var2 = (ok0) obj;
                kk0 kk0Var2 = (kk0) obj3;
                String str2 = kk0Var2.f20614OooO0O0;
                try {
                    C1643hi c1643hi2 = kk0Var2.f20613OooO00o;
                    if (c1643hi2 == null) {
                        throw null;
                    }
                    bk0 bk0Var2 = (bk0) c1643hi2.f19794OooOooo;
                    if (bk0Var2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str2);
                    bundle2.putBinder("windowToken", ((ek0) lk0Var).f18618OooO00o);
                    kk0.OooO0O0(((ek0) lk0Var).f18622OooO0o, new ik0(8, bundle2));
                    bundle2.putInt("layoutGravity", ((ek0) lk0Var).f18620OooO0OO);
                    bundle2.putFloat("layoutVerticalMargin", ((ek0) lk0Var).f18621OooO0Oo);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("windowWidthPx", ((ek0) lk0Var).f18623OooO0o0);
                    kk0.OooO0O0(null, new ik0(1, bundle2));
                    kk0.OooO0O0(null, new ik0(2, bundle2));
                    kk0.OooO0O0(((ek0) lk0Var).f18619OooO0O0, new ik0(3, bundle2));
                    kk0.OooO0O0(null, new ik0(4, bundle2));
                    bundle2.putBoolean("stableSessionToken", true);
                    jk0 jk0Var2 = new jk0(kk0Var2, ok0Var2);
                    zj0 zj0Var2 = (zj0) bk0Var2;
                    Parcel parcelOooO2 = zj0Var2.OooO();
                    parcelOooO2.writeString(str2);
                    AbstractC2218x2.OooO0OO(parcelOooO2, bundle2);
                    AbstractC2218x2.OooO0o0(parcelOooO2, jk0Var2);
                    zj0Var2.o000O0O0(parcelOooO2, 1);
                    return;
                } catch (RemoteException e2) {
                    kk0.f20611OooO0OO.OooO0O0(e2, "show overlay display from: %s", str2);
                    return;
                }
            case 10:
                j51 j51Var = (j51) obj3;
                j51Var.getClass();
                gn0 gn0VarOooO0oo = ((om0) obj2).OooO0oo();
                h61 h61Var2 = j51Var.f20189OooO0OO;
                b61 b61Var = h61Var2.f19580OooO0oO;
                b61Var.getClass();
                s20 s20Var = h61Var2.f19577OooO0Oo;
                s20Var.getClass();
                s20Var.f23977OooOo0o = rm0.OooOOOO(gn0VarOooO0oo);
                if (!gn0VarOooO0oo.isEmpty()) {
                    s20Var.f23978OooOoO = (h91) gn0VarOooO0oo.get(0);
                    h91 h91Var = (h91) obj;
                    h91Var.getClass();
                    s20Var.f23980OooOoOO = h91Var;
                }
                if (((h91) s20Var.f23979OooOoO0) == null) {
                    s20Var.f23979OooOoO0 = s20.OooOOO(b61Var, (rm0) s20Var.f23977OooOo0o, (h91) s20Var.f23978OooOoO, (C1528ee) s20Var.f23976OooOo0O);
                }
                s20Var.OooOOOo(b61Var.o00000Oo());
                return;
            case 11:
                Pair pair = (Pair) obj2;
                ((h61) ((n51) obj3).f21414OooO0O0.f19276OooOooO).OooO0Oo(((Integer) pair.first).intValue(), (h91) pair.second, (e91) obj);
                return;
            default:
                o00O0O o00o0o2 = (o00O0O) obj3;
                o00o0o2.getClass();
                int i2 = i80.f19994OooO00o;
                h61 h61Var3 = o00o0o2.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                d61 d61VarOooOO0o2 = h61Var3.OooOO0o();
                h61Var3.OooO(d61VarOooOO0o2, 1009, new hk0(d61VarOooOO0o2, (o0OoOo0) obj2, (h41) obj));
                return;
        }
    }

    public /* synthetic */ o000oOoO(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f21732OooOo0O = i;
        this.f21733OooOo0o = obj2;
        this.f21731OooOo = obj3;
        this.f21734OooOoO0 = obj;
    }

    public o000oOoO(C1849n3 c1849n3, C1665i3 c1665i3, WebView webView, boolean z) {
        this.f21732OooOo0O = 2;
        this.f21731OooOo = webView;
        this.f21734OooOoO0 = c1849n3;
        this.f21733OooOo0o = new C1812m3(this, c1665i3, webView, z);
    }
}
