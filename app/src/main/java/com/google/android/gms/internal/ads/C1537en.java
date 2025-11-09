package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.C3034d9;
import com.ironsource.C3069e9;
import com.ironsource.C3353m5;
import com.ironsource.C3912zo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.en */
/* loaded from: classes2.dex */
public final class C1537en implements InterfaceC2042sb {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f18629OooOo0O;

    public static int OooO00o(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzbc.zzb();
                i = zzf.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzo.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbOooOOo0.append(i);
            sbOooOOo0.append(".");
            zze.zza(sbOooOOo0.toString());
        }
        return i;
    }

    public static void OooO0O0(C1831mm c1831mm, Map map) throws NumberFormatException {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        AbstractC1684im abstractC1684im = c1831mm.f21290OooOoo0;
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                if (abstractC1684im != null) {
                    abstractC1684im.OooO0o(i);
                }
            } catch (NumberFormatException unused) {
                zzo.zzj("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i2 = Integer.parseInt(str2);
            if (abstractC1684im != null) {
                abstractC1684im.OooOoo0(i2);
            }
        }
        if (str3 != null) {
            int i3 = Integer.parseInt(str3);
            if (abstractC1684im != null) {
                abstractC1684im.OooOoO(i3);
            }
        }
        if (str4 != null) {
            int i4 = Integer.parseInt(str4);
            if (abstractC1684im != null) {
                abstractC1684im.OooOoOO(i4);
            }
        }
        if (str5 != null) {
            int i5 = Integer.parseInt(str5);
            if (abstractC1684im == null) {
                return;
            }
            abstractC1684im.OooO0oO(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) throws NumberFormatException {
        int iMin;
        int iMin2;
        int i;
        boolean z;
        int i2;
        C1831mm c1831mm;
        AbstractC1684im abstractC1684im;
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzo.zzj("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numOooOoO0 = (interfaceC1722jo.zzo() == null || (c1831mm = (C1831mm) interfaceC1722jo.zzo().f24099OooOoO) == null || (abstractC1684im = c1831mm.f21290OooOoo0) == null) ? null : abstractC1684im.OooOoO0();
        if (numValueOf != null && numOooOoO0 != null && !numValueOf.equals(numOooOoO0) && !str.equals("load")) {
            Locale locale = Locale.US;
            zzo.zzi("Event intended for player " + numValueOf + ", but sent to player " + numOooOoO0 + " - event ignored");
            return;
        }
        Integer numValueOf2 = null;
        if (zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzo.zze("Video GMSG: " + str + StringUtils.SPACE + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get(C3034d9.h.f8086S);
            if (TextUtils.isEmpty(str2)) {
                zzo.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC1722jo.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzo.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get(C3034d9.h.f8086S);
            if (TextUtils.isEmpty(str3)) {
                zzo.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC1722jo.OooO(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzo.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzo.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put(C3912zo.a.f13038g, "missingMimeTypes");
                interfaceC1722jo.OooO0o("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, zzcj.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            interfaceC1722jo.OooO0o("onVideoEvent", map4);
            return;
        }
        C2051sk c2051skZzo = interfaceC1722jo.zzo();
        if (c2051skZzo == null) {
            zzo.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals(C3034d9.h.f8078L);
        if (zEquals || zEquals2) {
            Context context = interfaceC1722jo.getContext();
            int iOooO00o = OooO00o(context, map, "x", 0);
            int iOooO00o2 = OooO00o(context, map, "y", 0);
            int iOooO00o3 = OooO00o(context, map, OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, -1);
            C2148v6 c2148v6 = AbstractC1448c7.o00Oo0oO;
            if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                iMin = iOooO00o3 == -1 ? interfaceC1722jo.zzh() : Math.min(iOooO00o3, interfaceC1722jo.zzh());
            } else {
                if (zze.zzc()) {
                    StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("Calculate width with original width ", iOooO00o3, ", videoHost.getVideoBoundingWidth() ", interfaceC1722jo.zzh(), ", x ");
                    sbOooOo0o.append(iOooO00o);
                    sbOooOo0o.append(".");
                    zze.zza(sbOooOo0o.toString());
                }
                iMin = Math.min(iOooO00o3, interfaceC1722jo.zzh() - iOooO00o);
            }
            int iOooO00o4 = OooO00o(context, map, "h", -1);
            if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                iMin2 = iOooO00o4 == -1 ? interfaceC1722jo.zzg() : Math.min(iOooO00o4, interfaceC1722jo.zzg());
            } else {
                if (zze.zzc()) {
                    StringBuilder sbOooOo0o2 = OooO0oO.OooOo.OooOo0o("Calculate height with original height ", iOooO00o4, ", videoHost.getVideoBoundingHeight() ", interfaceC1722jo.zzg(), ", y ");
                    sbOooOo0o2.append(iOooO00o2);
                    sbOooOo0o2.append(".");
                    zze.zza(sbOooOo0o2.toString());
                }
                iMin2 = Math.min(iOooO00o4, interfaceC1722jo.zzg() - iOooO00o2);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((C1831mm) c2051skZzo.f24099OooOoO) != null) {
                Oooo00O.o000000O.OooO0Oo("The underlay may only be modified from the UI thread.");
                C1831mm c1831mm2 = (C1831mm) c2051skZzo.f24099OooOoO;
                if (c1831mm2 != null) {
                    c1831mm2.OooO00o(iOooO00o, iOooO00o2, iMin, iMin2);
                    return;
                }
                return;
            }
            C2053sm c2053sm = new C2053sm((String) map.get("flags"));
            if (((C1831mm) c2051skZzo.f24099OooOoO) == null) {
                C2129uo c2129uo = (C2129uo) c2051skZzo.f24096OooOo;
                ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = c2129uo.f24671OooOo0O;
                ze0.OooOOO0((C1669i7) viewTreeObserverOnGlobalLayoutListenerC2166vo.f25063Oooooo0.f25813OooOo, viewTreeObserverOnGlobalLayoutListenerC2166vo.f25060OooooOO, "vpr2");
                C1831mm c1831mm3 = new C1831mm((Context) c2051skZzo.f24098OooOo0o, c2129uo, i, z2, (C1669i7) c2129uo.f24671OooOo0O.f25063Oooooo0.f25813OooOo, c2053sm);
                c2051skZzo.f24099OooOoO = c1831mm3;
                ((C2129uo) c2051skZzo.f24100OooOoO0).addView(c1831mm3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((C1831mm) c2051skZzo.f24099OooOoO).OooO00o(iOooO00o, iOooO00o2, iMin, iMin2);
                c2129uo.f24671OooOo0O.f25037Oooo0.f21539Oooo00O = false;
            }
            C1831mm c1831mm4 = (C1831mm) c2051skZzo.f24099OooOoO;
            if (c1831mm4 != null) {
                OooO0O0(c1831mm4, map);
                return;
            }
            return;
        }
        BinderC2240xo binderC2240xoZzq = interfaceC1722jo.zzq();
        if (binderC2240xoZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    zzo.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f = Float.parseFloat(str6);
                    synchronized (binderC2240xoZzq.f25657OooOo0o) {
                        binderC2240xoZzq.f25664OooOooo = f;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    zzo.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (binderC2240xoZzq.f25657OooOo0o) {
                    z = binderC2240xoZzq.f25661OooOoo;
                    i2 = binderC2240xoZzq.f25658OooOoO;
                    binderC2240xoZzq.f25658OooOoO = 3;
                }
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC2203wo(binderC2240xoZzq, i2, 3, z, z));
                return;
            }
        }
        C1831mm c1831mm5 = (C1831mm) c2051skZzo.f24099OooOoO;
        if (c1831mm5 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            interfaceC1722jo.OooO0o("onVideoEvent", map5);
            return;
        }
        if (str.equals(C3069e9.f8387d)) {
            Context context2 = interfaceC1722jo.getContext();
            int iOooO00o5 = OooO00o(context2, map, "x", 0);
            float fOooO00o = OooO00o(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iOooO00o5, fOooO00o, 0);
            AbstractC1684im abstractC1684im2 = c1831mm5.f21290OooOoo0;
            if (abstractC1684im2 != null) {
                abstractC1684im2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzo.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i3 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC1684im abstractC1684im3 = c1831mm5.f21290OooOoo0;
                if (abstractC1684im3 == null) {
                    return;
                }
                abstractC1684im3.OooOo00(i3);
                return;
            } catch (NumberFormatException unused5) {
                zzo.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c1831mm5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c1831mm5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            AbstractC1684im abstractC1684im4 = c1831mm5.f21290OooOoo0;
            if (abstractC1684im4 == null) {
                return;
            }
            if (TextUtils.isEmpty(c1831mm5.f21293Oooo0)) {
                c1831mm5.OooO0OO("no_src", new String[0]);
                return;
            } else {
                abstractC1684im4.OooO0oo(c1831mm5.f21293Oooo0, c1831mm5.f21297Oooo0O0, numValueOf);
                return;
            }
        }
        if (str.equals("loadControl")) {
            OooO0O0(c1831mm5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC1684im abstractC1684im5 = c1831mm5.f21290OooOoo0;
                if (abstractC1684im5 == null) {
                    return;
                }
                C2164vm c2164vm = abstractC1684im5.f20062OooOo0o;
                c2164vm.f25001OooO0o0 = true;
                c2164vm.OooO00o();
                abstractC1684im5.zzn();
                return;
            }
            AbstractC1684im abstractC1684im6 = c1831mm5.f21290OooOoo0;
            if (abstractC1684im6 == null) {
                return;
            }
            C2164vm c2164vm2 = abstractC1684im6.f20062OooOo0o;
            c2164vm2.f25001OooO0o0 = false;
            c2164vm2.OooO00o();
            abstractC1684im6.zzn();
            return;
        }
        if (str.equals("pause")) {
            AbstractC1684im abstractC1684im7 = c1831mm5.f21290OooOoo0;
            if (abstractC1684im7 == null) {
                return;
            }
            abstractC1684im7.OooOOo();
            return;
        }
        if (str.equals("play")) {
            AbstractC1684im abstractC1684im8 = c1831mm5.f21290OooOoo0;
            if (abstractC1684im8 == null) {
                return;
            }
            abstractC1684im8.OooOOoo();
            return;
        }
        if (str.equals(C3353m5.f9472v)) {
            c1831mm5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf2 = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzo.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        strArr2[i4] = jSONArray.getString(i4);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    zzo.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf2 != null) {
                interfaceC1722jo.zzA(numValueOf2.intValue());
            }
            c1831mm5.f21293Oooo0 = str8;
            c1831mm5.f21297Oooo0O0 = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = interfaceC1722jo.getContext();
            int iOooO00o6 = OooO00o(context3, map, "dx", 0);
            int iOooO00o7 = OooO00o(context3, map, "dy", 0);
            float f2 = iOooO00o6;
            float f3 = iOooO00o7;
            AbstractC1684im abstractC1684im9 = c1831mm5.f21290OooOoo0;
            if (abstractC1684im9 != null) {
                abstractC1684im9.OooOo(f2, f3);
            }
            if (this.f18629OooOo0O) {
                return;
            }
            interfaceC1722jo.OooooOo();
            this.f18629OooOo0O = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                c1831mm5.OooOO0O();
                return;
            } else {
                zzo.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            zzo.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f4 = Float.parseFloat(str10);
            AbstractC1684im abstractC1684im10 = c1831mm5.f21290OooOoo0;
            if (abstractC1684im10 == null) {
                return;
            }
            C2164vm c2164vm3 = abstractC1684im10.f20062OooOo0o;
            c2164vm3.f25000OooO0o = f4;
            c2164vm3.OooO00o();
            abstractC1684im10.zzn();
        } catch (NumberFormatException unused8) {
            zzo.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
