package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3007ch;
import com.ironsource.C3034d9;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mr */
/* loaded from: classes2.dex */
public final class C1836mr implements InterfaceC1492de {

    /* renamed from: OooOo */
    public final PowerManager f21338OooOo;

    /* renamed from: OooOo0O */
    public final Context f21339OooOo0O;

    /* renamed from: OooOo0o */
    public final C1408b3 f21340OooOo0o;

    public C1836mr(Context context, C1408b3 c1408b3) {
        this.f21339OooOo0O = context;
        this.f21340OooOo0o = c1408b3;
        this.f21338OooOo = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1492de
    /* renamed from: OooO00o */
    public final JSONObject zzb(C1910or c1910or) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C1444c3 c1444c3 = c1910or.f23085OooO0o0;
        if (c1444c3 == null) {
            jSONObject = new JSONObject();
        } else {
            C1408b3 c1408b3 = this.f21340OooOo0o;
            if (c1408b3.f17358OooO0O0 == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", c1408b3.f17360OooO0Oo).put("activeViewJSON", c1408b3.f17358OooO0O0).put("timestamp", c1910or.f23083OooO0OO).put("adFormat", c1408b3.f17357OooO00o).put("hashCode", c1408b3.f17359OooO0OO).put("isMraid", false).put("isStopped", false).put("isPaused", c1910or.f23082OooO0O0).put("isNative", c1408b3.f17361OooO0o0).put("isScreenOn", this.f21338OooOo.isInteractive()).put("appMuted", zzv.zzs().zze()).put("appVolume", zzv.zzs().zza());
            Context context = this.f21339OooOo0O;
            jSONObjectPut.put(C3034d9.i.f8161P, zzab.zzb(context.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", c1444c3.f17661OooO0O0).put("isAttachedToWindow", c1444c3.f17660OooO00o);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect2 = c1444c3.f17662OooO0OO;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect3 = c1444c3.f17663OooO0Oo;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect4 = c1444c3.f17665OooO0o0;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("globalVisibleBoxVisible", c1444c3.f17664OooO0o);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect5 = c1444c3.f17666OooO0oO;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("localVisibleBoxVisible", c1444c3.f17667OooO0oo);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect6 = c1444c3.f17659OooO;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C3007ch.f7750k, c1910or.f23081OooO00o);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17811o000O0Oo)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c1444c3.f17669OooOO0O;
                if (list != null) {
                    for (Rect rect7 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect7.top).put("bottom", rect7.bottom).put("left", rect7.left).put("right", rect7.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c1910or.f23084OooO0Oo)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
