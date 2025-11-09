package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sm */
/* loaded from: classes2.dex */
public final class C2053sm {

    /* renamed from: OooO, reason: collision with root package name */
    public final boolean f24110OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f24111OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f24112OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f24113OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f24114OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f24115OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f24116OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f24117OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f24118OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final boolean f24119OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f24120OooOO0O;
    public final boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final long f24121OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final long f24122OooOOO0;

    public C2053sm(String str) throws JSONException {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f24111OooO00o = OooO00o(jSONObject, "aggressive_media_codec_release", AbstractC1448c7.o000oOoO);
        this.f24112OooO0O0 = OooO0O0(jSONObject, "byte_buffer_precache_limit", AbstractC1448c7.f17709OooO);
        this.f24113OooO0OO = OooO0O0(jSONObject, "exo_cache_buffer_size", AbstractC1448c7.f17726OooOOoo);
        this.f24114OooO0Oo = OooO0O0(jSONObject, "exo_connect_timeout_millis", AbstractC1448c7.f17715OooO0o0);
        C2148v6 c2148v6 = AbstractC1448c7.f17713OooO0Oo;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f24116OooO0o0 = OooO0O0(jSONObject, "exo_read_timeout_millis", AbstractC1448c7.f17714OooO0o);
        this.f24115OooO0o = OooO0O0(jSONObject, "load_check_interval_bytes", AbstractC1448c7.f17716OooO0oO);
        this.f24117OooO0oO = OooO0O0(jSONObject, "player_precache_limit", AbstractC1448c7.f17717OooO0oo);
        this.f24118OooO0oo = OooO0O0(jSONObject, "socket_receive_buffer_size", AbstractC1448c7.f17718OooOO0);
        this.f24110OooO = OooO00o(jSONObject, "use_cache_data_source", AbstractC1448c7.o00OooO0);
        OooO0O0(jSONObject, "min_retry_count", AbstractC1448c7.f17719OooOO0O);
        this.f24119OooOO0 = OooO00o(jSONObject, "treat_load_exception_as_non_fatal", AbstractC1448c7.f17721OooOOO0);
        this.f24120OooOO0O = OooO00o(jSONObject, "enable_multiple_video_playback", AbstractC1448c7.f17840o000o0O0);
        this.OooOO0o = OooO00o(jSONObject, "use_range_http_data_source", AbstractC1448c7.o000o0OO);
        C2148v6 c2148v62 = AbstractC1448c7.o000o0Oo;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
            }
        } else {
            jLongValue = ((Long) zzbe.zzc().OooO00o(c2148v62)).longValue();
        }
        this.f24122OooOOO0 = jLongValue;
        C2148v6 c2148v63 = AbstractC1448c7.f17842o000o0o0;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
            }
        } else {
            jLongValue2 = ((Long) zzbe.zzc().OooO00o(c2148v63)).longValue();
        }
        this.f24121OooOOO = jLongValue2;
    }

    public static final boolean OooO00o(JSONObject jSONObject, String str, C2148v6 c2148v6) {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int OooO0O0(JSONObject jSONObject, String str, C2148v6 c2148v6) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzbe.zzc().OooO00o(c2148v6)).intValue();
    }
}
