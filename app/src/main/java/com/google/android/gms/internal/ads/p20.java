package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import com.ironsource.C3678sv;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class p20 implements AppEventListener, InterfaceC2173vv, zza, InterfaceC2024ru, InterfaceC1399av, InterfaceC1436bv, InterfaceC1656hv, InterfaceC2135uu, hf0 {

    /* renamed from: OooOo */
    public long f23185OooOo;

    /* renamed from: OooOo0O */
    public final List f23186OooOo0O;

    /* renamed from: OooOo0o */
    public final n20 f23187OooOo0o;

    public p20(n20 n20Var, C2130up c2130up) {
        this.f23187OooOo0o = n20Var;
        this.f23186OooOo0O = Collections.singletonList(c2130up);
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO00o(ef0 ef0Var, String str, Throwable th) throws IOException {
        OoooO00(ff0.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO0o(ef0 ef0Var, String str) throws IOException {
        OoooO00(ff0.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void OooO0o0(String str) throws IOException {
        OoooO00(ff0.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void OooO0oo(BinderC1460cj binderC1460cj, String str, String str2) throws IOException {
        OoooO00(InterfaceC2024ru.class, "onRewarded", binderC1460cj, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final void OooOO0(Context context) throws IOException {
        OoooO00(InterfaceC1436bv.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final void OooOOO(Context context) throws IOException {
        OoooO00(InterfaceC1436bv.class, C3034d9.h.f8132t0, context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1436bv
    public final void Oooo000(Context context) throws IOException {
        OoooO00(InterfaceC1436bv.class, C3034d9.h.f8134u0, context);
    }

    @Override // com.google.android.gms.internal.ads.hf0
    public final void Oooo0oO(ef0 ef0Var, String str) throws IOException {
        OoooO00(ff0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) throws IOException {
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        this.f23185OooOo = SystemClock.elapsedRealtime();
        OoooO00(InterfaceC2173vv.class, "onAdRequest", new Object[0]);
    }

    public final void OoooO00(Class cls, String str, Object... objArr) throws IOException {
        String simpleName = cls.getSimpleName();
        List list = this.f23186OooOo0O;
        String strConcat = "Event-".concat(simpleName);
        n20 n20Var = this.f23187OooOo0o;
        n20Var.getClass();
        if (((Boolean) AbstractC1706j8.f20223OooO00o.OooOOO()).booleanValue()) {
            ((Oooo0OO.oo000o) n20Var.f21392OooO00o).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                zzo.zzh("unable to log", e);
            }
            zzo.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() throws IOException {
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        zze.zza("Ad Request Latency : " + (SystemClock.elapsedRealtime() - this.f23185OooOo));
        OoooO00(InterfaceC1656hv.class, C3678sv.f11953j, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(com.google.android.gms.ads.internal.client.zze zzeVar) throws IOException {
        OoooO00(InterfaceC2135uu.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() throws IOException {
        OoooO00(zza.class, C3678sv.f11949f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) throws IOException {
        OoooO00(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zza() throws IOException {
        OoooO00(InterfaceC2024ru.class, C3678sv.f11950g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzb() throws IOException {
        OoooO00(InterfaceC2024ru.class, C3678sv.f11954k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzc() throws IOException {
        OoooO00(InterfaceC2024ru.class, C3678sv.f11946c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zze() throws IOException {
        OoooO00(InterfaceC2024ru.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzf() throws IOException {
        OoooO00(InterfaceC2024ru.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() throws IOException {
        OoooO00(InterfaceC1399av.class, "onAdImpression", new Object[0]);
    }
}
