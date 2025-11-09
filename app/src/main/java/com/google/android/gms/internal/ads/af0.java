package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ScatterMapKt;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.ironsource.C3034d9;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.tika.fork.ForkServer;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class af0 {

    /* renamed from: OooO */
    public static int f17027OooO = 2;

    /* renamed from: OooO0oo */
    public static UiModeManager f17035OooO0oo;

    /* renamed from: OooO00o */
    public static final be0 f17028OooO00o = new be0(9);

    /* renamed from: OooO0O0 */
    public static final byte[] f17029OooO0O0 = {0, 0, 0, 1};

    /* renamed from: OooO0OO */
    public static final float[] f17030OooO0OO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: OooO0Oo */
    public static final Object f17031OooO0Oo = new Object();

    /* renamed from: OooO0o0 */
    public static int[] f17033OooO0o0 = new int[10];

    /* renamed from: OooO0o */
    public static final byte[] f17032OooO0o = new byte[0];

    /* renamed from: OooO0oO */
    public static final String[] f17034OooO0oO = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static oO00O0oO OooO(oO00O0oO oo00o0oo, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (oo00o0oo == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (oO00O0oO) map.get(strArr[0]);
            }
            if (length2 > 1) {
                oO00O0oO oo00o0oo2 = new oO00O0oO();
                while (i < length2) {
                    oo00o0oo2.OooO0O0((oO00O0oO) map.get(strArr[i]));
                    i++;
                }
                return oo00o0oo2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                oo00o0oo.OooO0O0((oO00O0oO) map.get(strArr[0]));
                return oo00o0oo;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    oo00o0oo.OooO0O0((oO00O0oO) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return oo00o0oo;
    }

    public static int OooO00o(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int OooO0O0(int i, r40 r40Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return r40Var.OooOo0O() + 1;
            case 7:
                return r40Var.OooOoO() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static int OooO0OO(String str) throws UnsupportedEncodingException {
        byte[] bytes;
        int i;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = length & (-4);
            if (i2 >= i) {
                break;
            }
            int i4 = ((bytes[i2] & ForkServer.ERROR) | ((bytes[i2 + 1] & ForkServer.ERROR) << 8) | ((bytes[i2 + 2] & ForkServer.ERROR) << 16) | (bytes[i2 + 3] << 24)) * ScatterMapKt.MurmurHashC1;
            int i5 = i3 ^ (((i4 >>> 17) | (i4 << 15)) * 461845907);
            i3 = (((i5 >>> 19) | (i5 << 13)) * 5) - 430675100;
            i2 += 4;
        }
        int i6 = length & 3;
        if (i6 == 1) {
            int i7 = ((bytes[i] & ForkServer.ERROR) | i) * ScatterMapKt.MurmurHashC1;
            i3 ^= ((i7 >>> 17) | (i7 << 15)) * 461845907;
        } else {
            if (i6 != 2) {
                i = i6 == 3 ? (bytes[i + 2] & ForkServer.ERROR) << 16 : 0;
            }
            i |= (bytes[i + 1] & ForkServer.ERROR) << 8;
            int i72 = ((bytes[i] & ForkServer.ERROR) | i) * ScatterMapKt.MurmurHashC1;
            i3 ^= ((i72 >>> 17) | (i72 << 15)) * 461845907;
        }
        int i8 = i3 ^ length;
        int i9 = (i8 ^ (i8 >>> 16)) * (-2048144789);
        int i10 = (i9 ^ (i9 >>> 13)) * (-1028477387);
        return i10 ^ (i10 >>> 16);
    }

    public static int OooO0Oo(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        OooooO0(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            Ooooooo(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            Ooooooo(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            Ooooooo(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    Ooooooo(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static Bundle OooO0o(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static Uri OooO0o0(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, str2, C3034d9.i.f8173b, str3, C3034d9.i.f8175c);
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static Bundle OooO0oO(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static zze OooO0oo(Throwable th) {
        if (th instanceof n60) {
            n60 n60Var = (n60) th;
            return OooOoOO(n60Var.f16906OooOo0O, n60Var.f21420OooOo0o);
        }
        if (th instanceof a40) {
            return th.getMessage() == null ? Oooo0O0(((a40) th).f16906OooOo0O, null, null) : Oooo0O0(((a40) th).f16906OooOo0O, th.getMessage(), null);
        }
        if (!(th instanceof zzba)) {
            return Oooo0O0(1, null, null);
        }
        zzba zzbaVar = (zzba) th;
        int iZza = zzbaVar.zza();
        String message = zzbaVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new zze(iZza, message, MobileAds.ERROR_DOMAIN, null, null);
    }

    public static Object OooOO0(il0 il0Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return il0Var.mo13704zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static String OooOO0O(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (OooOo0o(jSONArrayOptJSONArray2, str) && !OooOo0o(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static String OooOO0o(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static void OooOOO(long j, r40 r40Var, o000O[] o000oArr) {
        int i;
        int iOooOOo0;
        while (true) {
            if (r40Var.OooOOOO() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (r40Var.OooOOOO() == 0) {
                    i = -1;
                    break;
                }
                int iOooOo0O = r40Var.OooOo0O();
                i2 += iOooOo0O;
                if (iOooOo0O != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (r40Var.OooOOOO() == 0) {
                    i3 = -1;
                    break;
                }
                int iOooOo0O2 = r40Var.OooOo0O();
                i3 += iOooOo0O2;
                if (iOooOo0O2 != 255) {
                    break;
                }
            }
            int i4 = r40Var.f23746OooO0O0 + i3;
            if (i3 == -1 || i3 > r40Var.OooOOOO()) {
                AbstractC1641hg.OooOOo0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = r40Var.f23747OooO0OO;
            } else if (i == 4 && i3 >= 8) {
                int iOooOo0O3 = r40Var.OooOo0O();
                int iOooOoO = r40Var.OooOoO();
                if (iOooOoO == 49) {
                    iOooOOo0 = r40Var.OooOOo0();
                    iOooOoO = 49;
                } else {
                    iOooOOo0 = 0;
                }
                int iOooOo0O4 = r40Var.OooOo0O();
                if (iOooOoO == 47) {
                    r40Var.OooOO0O(1);
                    iOooOoO = 47;
                }
                boolean z = iOooOo0O3 == 181 && (iOooOoO == 49 || iOooOoO == 47) && iOooOo0O4 == 3;
                if (iOooOoO == 49) {
                    z &= iOooOOo0 == 1195456820;
                }
                if (z) {
                    OooOo0(j, r40Var, o000oArr);
                }
            }
            r40Var.OooOO0(i4);
        }
    }

    public static void OooOOO0(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void OooOOOO(Oooo0o.OooO0O0 oooO0O0, Throwable th, String str) {
        C1643hi.OooO0OO((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0)).OooO0O0(th, str, ((Double) AbstractC1965q8.f23542OooO0oO.OooOOO()).floatValue());
    }

    public static void OooOOOo(AtomicReference atomicReference, C1658hx c1658hx) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            c1658hx.mo13701zza(obj);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public static int OooOOo(r40 r40Var) {
        int iOooOOo0 = r40Var.OooOOo0();
        if (r40Var.OooOOo0() == 1684108385) {
            r40Var.OooOO0O(8);
            int i = iOooOOo0 - 16;
            if (i == 1) {
                return r40Var.OooOo0O();
            }
            if (i == 2) {
                return r40Var.OooOoO();
            }
            if (i == 3) {
                return r40Var.OooOo();
            }
            if (i == 4 && (r40Var.f23745OooO00o[r40Var.f23746OooO0O0] & 128) == 0) {
                return r40Var.OooOoO0();
            }
        }
        AbstractC1641hg.OooOOo0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static int OooOOo0(int i, byte[] bArr) {
        int i2;
        synchronized (f17031OooO0Oo) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f17033OooO0o0;
                    int length = iArr.length;
                    if (length <= i4) {
                        f17033OooO0o0 = Arrays.copyOf(iArr, length + length);
                    }
                    f17033OooO0o0[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = f17033OooO0o0[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static final Intent OooOOoo(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static boolean OooOo(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static void OooOo0(long j, r40 r40Var, o000O[] o000oArr) {
        int iOooOo0O = r40Var.OooOo0O();
        if ((iOooOo0O & 64) != 0) {
            int i = iOooOo0O & 31;
            r40Var.OooOO0O(1);
            int i2 = r40Var.f23746OooO0O0;
            for (o000O o000o : o000oArr) {
                int i3 = i * 3;
                r40Var.OooOO0(i2);
                o000o.OooO0Oo(i3, r40Var);
                OooooO0(j != -9223372036854775807L);
                o000o.OooO00o(j, 1, i3, 0, null);
            }
        }
    }

    public static zze OooOo00(Throwable th, o60 o60Var) {
        zze zzeVar;
        zze zzeVarOooO0oo = OooO0oo(th);
        int i = zzeVarOooO0oo.zza;
        if ((i == 3 || i == 0) && (zzeVar = zzeVarOooO0oo.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarOooO0oo.zzd = null;
        }
        if (o60Var != null) {
            zzeVarOooO0oo.zze = new BinderC1913ou(o60Var.f22350OooO0o0, "", o60Var, o60Var.f22348OooO0Oo, o60Var.f22347OooO0OO);
        }
        return zzeVarOooO0oo;
    }

    public static void OooOo0O(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static boolean OooOo0o(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                try {
                } catch (PatternSyntaxException e) {
                    zzv.zzp().OooO0oo("RtbAdapterMap.hasAtleastOneRegexMatch", e);
                }
                if ((((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int OooOoO(o000OOo0 o000ooo02, int i, int i2, int i3) {
        OoooO0(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        xh0.OooO0O0(xh0.OooO0O0(i4, i5), 1 << i3);
        if (o000ooo02.OooO00o() >= i) {
            int iOooO0o = o000ooo02.OooO0o(i);
            if (iOooO0o == i4) {
                if (o000ooo02.OooO00o() >= i2) {
                    int iOooO0o2 = o000ooo02.OooO0o(i2);
                    iOooO0o += iOooO0o2;
                    if (iOooO0o2 == i5) {
                        if (o000ooo02.OooO00o() >= i3) {
                            return o000ooo02.OooO0o(i3) + iOooO0o;
                        }
                    }
                }
            }
            return iOooO0o;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] OooOoO0(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.af0.OooOoO0(java.lang.String, boolean):java.lang.String[]");
    }

    public static zze OooOoOO(int i, zze zzeVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0O)).intValue() > 0) {
                return zzeVar;
            }
            i = 8;
        }
        return Oooo0O0(i, null, zzeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:262:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x03b2  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.le0 OooOoo(byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.C2051sk r32) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.af0.OooOoo(byte[], int, int, com.google.android.gms.internal.ads.sk):com.google.android.gms.internal.ads.le0");
    }

    public static o00Oo00 OooOoo0(int i, String str, r40 r40Var, boolean z, boolean z2) {
        int iOooOOo = OooOOo(r40Var);
        if (z2) {
            iOooOOo = Math.min(1, iOooOOo);
        }
        if (iOooOOo >= 0) {
            return z ? new o0O0o(str, null, rm0.OooOOo0(Integer.toString(iOooOOo))) : new o0o0Oo("und", str, Integer.toString(iOooOOo));
        }
        AbstractC1641hg.OooOOo0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(ta0.OooO0O0(i)));
        return null;
    }

    public static String OooOooO(String str, Context context, boolean z, Map map) {
        String strOooO00o;
        if ((((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17927o0OO00O)).booleanValue() && !z) || !zzv.zzo().OooO0o0(context) || TextUtils.isEmpty(str) || (strOooO00o = zzv.zzo().OooO00o(context)) == null) {
            return str;
        }
        String str2 = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17921o00oO0o);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17936oo000o)).booleanValue() && str.contains(str2)) {
            if (zzv.zzq().zzj(str)) {
                C2162vk c2162vkZzo = zzv.zzo();
                Map map2 = (Map) map.get("_ac");
                c2162vkZzo.getClass();
                c2162vkZzo.OooOO0O(context, "_ac", strOooO00o, C2162vk.OooO0o(map2));
                return Oooo0oO(context, str).replace(str2, strOooO00o);
            }
            if (!zzv.zzq().zzk(str)) {
                return str;
            }
            C2162vk c2162vkZzo2 = zzv.zzo();
            Map map3 = (Map) map.get("_ai");
            c2162vkZzo2.getClass();
            c2162vkZzo2.OooOO0O(context, "_ai", strOooO00o, C2162vk.OooO0o(map3));
            return Oooo0oO(context, str).replace(str2, strOooO00o);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17924o00ooo)).booleanValue()) {
            return str;
        }
        if (zzv.zzq().zzj(str)) {
            C2162vk c2162vkZzo3 = zzv.zzo();
            Map map4 = (Map) map.get("_ac");
            c2162vkZzo3.getClass();
            c2162vkZzo3.OooOO0O(context, "_ac", strOooO00o, C2162vk.OooO0o(map4));
            return OooO0o0(Oooo0oO(context, str), "fbs_aeid", strOooO00o).toString();
        }
        if (!zzv.zzq().zzk(str)) {
            return str;
        }
        C2162vk c2162vkZzo4 = zzv.zzo();
        Map map5 = (Map) map.get("_ai");
        c2162vkZzo4.getClass();
        c2162vkZzo4.OooOO0O(context, "_ai", strOooO00o, C2162vk.OooO0o(map5));
        return OooO0o0(Oooo0oO(context, str), "fbs_aeid", strOooO00o).toString();
    }

    public static void OooOooo(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void Oooo(o000OOo0 o000ooo02) {
        o000ooo02.OooOo0(3);
        o000ooo02.OooOo0(8);
        boolean zOooOo0o = o000ooo02.OooOo0o();
        boolean zOooOo0o2 = o000ooo02.OooOo0o();
        if (zOooOo0o) {
            o000ooo02.OooOo0(5);
        }
        if (zOooOo0o2) {
            o000ooo02.OooOo0(6);
        }
    }

    public static final ResolveInfo Oooo0(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            zzv.zzp().OooO0oo("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static boolean Oooo000(o000000 o000000Var) {
        r40 r40Var = new r40(8);
        int i = oOO00O0.OooO00o(o000000Var, r40Var).f22786OooO00o;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 4, false);
        r40Var.OooOO0(0);
        int iOooOOo0 = r40Var.OooOOo0();
        if (iOooOOo0 == 1463899717) {
            return true;
        }
        AbstractC1641hg.OooOO0("WavHeaderReader", "Unsupported form type: " + iOooOOo0);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean Oooo00O(com.google.android.gms.internal.ads.r40 r24, com.google.android.gms.internal.ads.o0000O0 r25, int r26, com.google.android.gms.internal.ads.o0000O00 r27) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.af0.Oooo00O(com.google.android.gms.internal.ads.r40, com.google.android.gms.internal.ads.o0000O0, int, com.google.android.gms.internal.ads.o0000O00):boolean");
    }

    public static boolean Oooo00o(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zze Oooo0O0(int i, String str, zze zzeVar) {
        String str2;
        int i2 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i2) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.oo0oO0)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i == 0) {
            throw null;
        }
        int i3 = 0;
        int i4 = 2;
        switch (i2) {
            case 0:
            case 11:
            case 15:
                i4 = i3;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i4 = 1;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 2:
            case 10:
            case 18:
                i4 = 3;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 3:
                i3 = 8;
                i4 = i3;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 7:
                i3 = 4;
                i4 = i3;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 12:
                if (((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.oo0oO0)).intValue() <= 0) {
                    i3 = 9;
                    i4 = i3;
                    return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                }
                i4 = 3;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 13:
                i3 = 10;
                i4 = i3;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 14:
                i3 = 11;
                i4 = i3;
                return new zze(i4, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            default:
                switch (i) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static o0O0o Oooo0OO(int i, String str, r40 r40Var) {
        int iOooOOo0 = r40Var.OooOOo0();
        if (r40Var.OooOOo0() == 1684108385 && iOooOOo0 >= 22) {
            r40Var.OooOO0O(10);
            int iOooOoO = r40Var.OooOoO();
            if (iOooOoO > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iOooOoO);
                String string = sb.toString();
                int iOooOoO2 = r40Var.OooOoO();
                if (iOooOoO2 > 0) {
                    string = string + "/" + iOooOoO2;
                }
                return new o0O0o(str, null, rm0.OooOOo0(string));
            }
        }
        AbstractC1641hg.OooOOo0("MetadataUtil", "Failed to parse index/count attribute: ".concat(ta0.OooO0O0(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C2051sk Oooo0o(byte[] r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 2182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.af0.Oooo0o(byte[], int, int):com.google.android.gms.internal.ads.sk");
    }

    public static oOO00O0 Oooo0o0(int i, o000000 o000000Var, r40 r40Var) throws C2185w6 {
        oOO00O0 ooo00o0OooO00o = oOO00O0.OooO00o(o000000Var, r40Var);
        while (true) {
            int i2 = ooo00o0OooO00o.f22786OooO00o;
            if (i2 == i) {
                return ooo00o0OooO00o;
            }
            androidx.datastore.preferences.protobuf.OooO00o.OooOo00(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = ooo00o0OooO00o.f22787OooO0O0;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C2185w6.OooO0O0("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            o000000Var.OooO((int) j2);
            ooo00o0OooO00o = oOO00O0.OooO00o(o000000Var, r40Var);
        }
    }

    public static String Oooo0oO(Context context, String str) {
        String strOooO0OO = zzv.zzo().OooO0OO(context);
        String strOooO0O0 = zzv.zzo().OooO0O0(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strOooO0OO)) {
            str = OooO0o0(str, "gmp_app_id", strOooO0OO).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strOooO0O0)) ? str : OooO0o0(str, "fbs_aiid", strOooO0O0).toString();
    }

    public static void Oooo0oo(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static ArrayList OoooO(byte[] bArr) {
        long j = ((bArr[11] & ForkServer.ERROR) << 8) | (bArr[10] & ForkServer.ERROR);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void OoooO0(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void OoooO00(o00000oO.OooOOO oooOOO, jf0 jf0Var) {
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            tp0 tp0VarOooOOo = tp0.OooOOo(oooOOO);
            p80 p80Var = new p80(jf0Var, 28);
            tp0VarOooOOo.addListener(new wp0(0, tp0VarOooOOo, p80Var), AbstractC2200wl.f25327OooO0oO);
        }
    }

    public static o0O0o OoooO0O(int i, String str, r40 r40Var) {
        int iOooOOo0 = r40Var.OooOOo0();
        if (r40Var.OooOOo0() == 1684108385) {
            r40Var.OooOO0O(8);
            return new o0O0o(str, null, rm0.OooOOo0(r40Var.OooO00o(iOooOOo0 - 16)));
        }
        AbstractC1641hg.OooOOo0("MetadataUtil", "Failed to parse text attribute: ".concat(ta0.OooO0O0(i)));
        return null;
    }

    public static void OoooOO0(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static void OoooOOO(o000OOo0 o000ooo02) {
        int iOooO0o;
        int iOooO0o2 = o000ooo02.OooO0o(2);
        if (iOooO0o2 == 0) {
            o000ooo02.OooOo0(6);
            return;
        }
        int iOooOoO = OooOoO(o000ooo02, 5, 8, 16) + 1;
        if (iOooO0o2 == 1) {
            o000ooo02.OooOo0(iOooOoO * 7);
            return;
        }
        if (iOooO0o2 == 2) {
            boolean zOooOo0o = o000ooo02.OooOo0o();
            int i = true != zOooOo0o ? 5 : 1;
            int i2 = true == zOooOo0o ? 7 : 5;
            int i3 = true == zOooOo0o ? 8 : 6;
            int i4 = 0;
            while (i4 < iOooOoO) {
                if (o000ooo02.OooOo0o()) {
                    o000ooo02.OooOo0(7);
                    iOooO0o = 0;
                } else {
                    if (o000ooo02.OooO0o(2) == 3 && o000ooo02.OooO0o(i2) * i != 0) {
                        o000ooo02.OooOo00();
                    }
                    iOooO0o = o000ooo02.OooO0o(i3) * i;
                    if (iOooO0o != 0 && iOooO0o != 180) {
                        o000ooo02.OooOo00();
                    }
                    o000ooo02.OooOo00();
                }
                if (iOooO0o != 0 && iOooO0o != 180 && o000ooo02.OooOo0o()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static void OoooOOo(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int OoooOo0(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences != null) {
            try {
                return sharedPreferences.getInt(str, 0);
            } catch (ClassCastException unused) {
            }
        }
        return 0;
    }

    public static int OoooOoO(vd0 vd0Var) {
        int iZzf = zzaa.zzf(vd0Var) - 1;
        return (iZzf == 0 || iZzf == 1) ? 7 : 23;
    }

    public static Pair OoooOoo(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        Oooooo(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i2 = -1;
        } else {
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, 65535);
            for (int i4 = 0; i4 < iMin; i4++) {
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
            i2 = -1;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.gg0 Ooooo00(byte[] r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.af0.Ooooo00(byte[], int, int):com.google.android.gms.internal.ads.gg0");
    }

    public static void Ooooo0o(Bundle bundle, String str, String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void OooooO0(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static long OooooOO(byte b, byte b2) {
        int i;
        int i2 = b & ForkServer.ERROR;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static String OooooOo(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                xh0.OooOOoo(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i2 >= length2) {
                        break;
                    }
                    int iOooO0Oo = OooO0Oo(bArr, i2, length2, zArr);
                    if (iOooO0Oo != length2) {
                        Integer numValueOf = Integer.valueOf(iOooO0Oo);
                        int length3 = objArrCopyOf.length;
                        int i4 = i3 + 1;
                        int iOooO0o = lm0.OooO0o(length3, i4);
                        if (iOooO0o > length3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
                        }
                        objArrCopyOf[i3] = numValueOf;
                        i3 = i4;
                    }
                    i2 = iOooO0Oo + 3;
                }
                gn0 gn0VarOooOOO = rm0.OooOOO(i3, objArrCopyOf);
                for (int i5 = 0; i5 < gn0VarOooOOO.f19390OooOoO0; i5++) {
                    if (((Integer) gn0VarOooOOO.get(i5)).intValue() + 3 < length) {
                        o000OOo0 o000ooo02 = new o000OOo0(bArr, ((Integer) gn0VarOooOOO.get(i5)).intValue() + 3, length);
                        o0O0ooO o0o0oooOoOO = ooOO(o000ooo02);
                        if (o0o0oooOoOO.f22022OooO00o == 33 && o0o0oooOoOO.f22023OooO0O0 == 0) {
                            o000ooo02.OooOO0O(4);
                            int iOooO0O0 = o000ooo02.OooO0O0(3);
                            o000ooo02.OooO();
                            pc0 pc0VarO00O0O = o00O0O(o000ooo02, true, iOooO0O0, null);
                            return AbstractC1914ov.OooO0OO(pc0VarO00O0O.f23312OooO00o, pc0VarO00O0O.f23313OooO0O0, pc0VarO00O0O.f23314OooO0OO, pc0VarO00O0O.f23315OooO0Oo, pc0VarO00O0O.f23317OooO0o0, pc0VarO00O0O.f23316OooO0o);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void Oooooo(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static void Oooooo0(Bundle bundle, String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }

    public static void OoooooO(o00000oO.OooOOO oooOOO, mf0 mf0Var, jf0 jf0Var, boolean z) {
        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            tp0 tp0VarOooOOo = tp0.OooOOo(oooOOO);
            com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = new com.google.android.gms.internal.measurement.o0OOO00(mf0Var, jf0Var, z);
            tp0VarOooOOo.addListener(new wp0(0, tp0VarOooOOo, o0ooo00), AbstractC2200wl.f25327OooO0oO);
        }
    }

    public static void Ooooooo(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void o000oOoO(Bundle bundle, String str, int i, boolean z) {
        if (z) {
            bundle.putInt(str, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.pc0 o00O0O(com.google.android.gms.internal.ads.o000OOo0 r18, boolean r19, int r20, com.google.android.gms.internal.ads.pc0 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.OooO0O0(r2)
            boolean r7 = r0.OooOOO()
            r8 = 5
            int r8 = r0.OooO0O0(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.OooOOO()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.OooO0O0(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.f23312OooO00o
            boolean r7 = r2.f23313OooO0O0
            int r8 = r2.f23314OooO0OO
            int r10 = r2.f23315OooO0Oo
            int[] r4 = r2.f23317OooO0o0
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.OooO0O0(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.OooOOO()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.OooOOO()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.OooOO0O(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.OooOO0O(r5)
        L79:
            com.google.android.gms.internal.ads.pc0 r11 = new com.google.android.gms.internal.ads.pc0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.af0.o00O0O(com.google.android.gms.internal.ads.o000OOo0, boolean, int, com.google.android.gms.internal.ads.pc0):com.google.android.gms.internal.ads.pc0");
    }

    public static void o00Oo0(o000OOo0 o000ooo02) {
        int iOooOOOO = o000ooo02.OooOOOO() + 1;
        o000ooo02.OooOO0O(8);
        for (int i = 0; i < iOooOOOO; i++) {
            o000ooo02.OooOOOO();
            o000ooo02.OooOOOO();
            o000ooo02.OooO();
        }
        o000ooo02.OooOO0O(20);
    }

    public static boolean o0OoOo0(byte b) {
        if (((b & 96) >> 5) != 0) {
            return true;
        }
        int i = b & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    public static o0O0ooO ooOO(o000OOo0 o000ooo02) {
        o000ooo02.OooO();
        int iOooO0O0 = o000ooo02.OooO0O0(6);
        int iOooO0O02 = o000ooo02.OooO0O0(6);
        o000ooo02.OooO0O0(3);
        return new o0O0ooO(iOooO0O0, iOooO0O02);
    }
}
