package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.v6 */
/* loaded from: classes2.dex */
public final class C2148v6 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f24856OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f24857OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f24858OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f24859OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f24860OooO0o0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2148v6(int i, String str, Object obj, Object obj2, int i2) {
        this(i, str, obj, obj2);
        this.f24860OooO0o0 = i2;
    }

    public static C2148v6 OooO0OO(int i, int i2, String str) {
        return new C2148v6(1, str, Integer.valueOf(i), Integer.valueOf(i2), 1);
    }

    public static C2148v6 OooO0Oo(long j, long j2, String str) {
        return new C2148v6(1, str, Long.valueOf(j), Long.valueOf(j2), 2);
    }

    public static void OooO0o0() {
        Object obj = null;
        zzbe.zza().f25527OooO0O0.add(new C2148v6(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public final Object OooO00o(JSONObject jSONObject) {
        switch (this.f24860OooO0o0) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f24857OooO0O0, ((Boolean) OooO0o()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f24857OooO0O0, ((Integer) OooO0o()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f24857OooO0O0, ((Long) OooO0o()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f24857OooO0O0, ((Float) OooO0o()).floatValue()));
            default:
                return jSONObject.optString(this.f24857OooO0O0, (String) OooO0o());
        }
    }

    public final Object OooO0O0(SharedPreferences sharedPreferences) {
        switch (this.f24860OooO0o0) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f24857OooO0O0, ((Boolean) OooO0o()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f24857OooO0O0, ((Integer) OooO0o()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f24857OooO0O0, ((Long) OooO0o()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f24857OooO0O0, ((Float) OooO0o()).floatValue()));
            default:
                return sharedPreferences.getString(this.f24857OooO0O0, (String) OooO0o());
        }
    }

    public final Object OooO0o() {
        return zzbe.zzc().f16920OooO ? this.f24859OooO0Oo : this.f24858OooO0OO;
    }

    public C2148v6(int i, String str, Object obj, Object obj2) {
        this.f24856OooO00o = i;
        this.f24857OooO0O0 = str;
        this.f24858OooO0OO = obj;
        this.f24859OooO0Oo = obj2;
        zzbe.zza().f25526OooO00o.add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2148v6(String str, String str2, String str3) {
        this(1, str, str2, str3);
        this.f24860OooO0o0 = 4;
    }
}
