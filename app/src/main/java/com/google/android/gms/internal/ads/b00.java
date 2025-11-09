package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b00 {

    /* renamed from: OooO, reason: collision with root package name */
    public final j00 f17143OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f17144OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2140uz f17145OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1663i1 f17146OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final VersionInfoParcel f17147OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final C1998r4 f17148OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final zza f17149OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final cq0 f17150OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final C1414b9 f17151OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final n10 f17152OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final ScheduledExecutorService f17153OooOO0O;
    public final c10 OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final hg0 f17154OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final h20 f17155OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final s50 f17156OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final x50 f17157OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final xd0 f17158OooOOo0;

    public b00(Context context, C2140uz c2140uz, C1663i1 c1663i1, VersionInfoParcel versionInfoParcel, zza zzaVar, C1998r4 c1998r4, cq0 cq0Var, vd0 vd0Var, j00 j00Var, n10 n10Var, ScheduledExecutorService scheduledExecutorService, h20 h20Var, hg0 hg0Var, s50 s50Var, c10 c10Var, x50 x50Var, xd0 xd0Var) {
        this.f17144OooO00o = context;
        this.f17145OooO0O0 = c2140uz;
        this.f17146OooO0OO = c1663i1;
        this.f17147OooO0Oo = versionInfoParcel;
        this.f17149OooO0o0 = zzaVar;
        this.f17148OooO0o = c1998r4;
        this.f17150OooO0oO = cq0Var;
        this.f17151OooO0oo = vd0Var.f24950OooO;
        this.f17143OooO = j00Var;
        this.f17152OooOO0 = n10Var;
        this.f17153OooOO0O = scheduledExecutorService;
        this.f17155OooOOO0 = h20Var;
        this.f17154OooOOO = hg0Var;
        this.f17156OooOOOO = s50Var;
        this.OooOO0o = c10Var;
        this.f17157OooOOOo = x50Var;
        this.f17158OooOOo0 = xd0Var;
    }

    public static Integer OooO0Oo(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final zzez OooO0o0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new zzez(strOptString, strOptString2);
    }

    public final o00000oO.OooOOO OooO00o(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return yp0.f25991OooOo0o;
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return yp0.f25991OooOo0o;
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return ii0.OooooOO(new BinderC2298z8(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        final C2140uz c2140uz = this.f17145OooO0O0;
        ep0 ep0VarOoooooo = ii0.Ooooooo(ii0.Ooooooo(c2140uz.f24791OooO00o.zza(strOptString), new wk0() { // from class: com.google.android.gms.internal.ads.tz
            @Override // com.google.android.gms.internal.ads.wk0
            public final Object apply(Object obj) {
                C2140uz c2140uz2 = c2140uz;
                c2140uz2.getClass();
                byte[] bArr = ((oOOO00) obj).f22822OooO0O0;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOo0)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    c2140uz2.OooO00o(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i = options.outWidth * options.outHeight;
                    if (i > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOo)).intValue())) / 2);
                    }
                }
                return c2140uz2.OooO00o(bArr, options);
            }
        }, c2140uz.f24793OooO0OO), new wk0() { // from class: com.google.android.gms.internal.ads.yz
            @Override // com.google.android.gms.internal.ads.wk0
            public final Object apply(Object obj) {
                return new BinderC2298z8(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f17150OooO0oO);
        return jSONObject.optBoolean("require") ? ii0.ooOO(ep0VarOoooooo, new C2043sc(ep0VarOoooooo, 5), AbstractC2200wl.f25327OooO0oO) : ii0.OoooOoO(ep0VarOoooooo, Exception.class, new C2094tq(1), AbstractC2200wl.f25327OooO0oO);
    }

    public final o00000oO.OooOOO OooO0O0(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return ii0.OooooOO(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(OooO00o(jSONArray.optJSONObject(i), z));
        }
        return ii0.Ooooooo(new mp0(rm0.OooOOOO(arrayList), true), new o0O0o00O(7), this.f17150OooO0oO);
    }

    public final dp0 OooO0OO(JSONObject jSONObject, kd0 kd0Var, md0 md0Var) {
        zzs zzsVar;
        String strOptString = jSONObject.optString("base_url");
        String strOptString2 = jSONObject.optString("html");
        int i = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                zzsVar = zzs.zzc();
            }
            j00 j00Var = this.f17143OooO;
            j00Var.getClass();
            dp0 dp0VarOoOO = ii0.ooOO(yp0.f25991OooOo0o, new a00(j00Var, zzsVar, kd0Var, md0Var, strOptString, strOptString2, 1), j00Var.f20139OooO0O0);
            return ii0.ooOO(dp0VarOoOO, new C2325zz(dp0VarOoOO, 0), AbstractC2200wl.f25327OooO0oO);
        }
        i = iOptInt;
        zzsVar = new zzs(this.f17144OooO00o, new AdSize(i, iOptInt2));
        j00 j00Var2 = this.f17143OooO;
        j00Var2.getClass();
        dp0 dp0VarOoOO2 = ii0.ooOO(yp0.f25991OooOo0o, new a00(j00Var2, zzsVar, kd0Var, md0Var, strOptString, strOptString2, 1), j00Var2.f20139OooO0O0);
        return ii0.ooOO(dp0VarOoOO2, new C2325zz(dp0VarOoOO2, 0), AbstractC2200wl.f25327OooO0oO);
    }
}
