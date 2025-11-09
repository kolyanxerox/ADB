package OoooOOO;

import OooOooo.o000O0Oo;
import Oooo00O.o000000O;
import Oooo0o0.OooOO0;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.internal.measurement.o0000oo;
import com.ironsource.C3037dc;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public final class oOO00OO extends oO0Oo {

    /* renamed from: OooOooO */
    public static final String[] f14830OooOooO = {"firebase_", "google_", "ga_"};

    /* renamed from: OooOooo */
    public static final String[] f14831OooOooo = {"_err"};

    /* renamed from: OooOo */
    public SecureRandom f14832OooOo;

    /* renamed from: OooOoO */
    public int f14833OooOoO;

    /* renamed from: OooOoO0 */
    public final AtomicLong f14834OooOoO0;

    /* renamed from: OooOoOO */
    public MeasurementManagerFutures f14835OooOoOO;

    /* renamed from: OooOoo */
    public Integer f14836OooOoo;

    /* renamed from: OooOoo0 */
    public Boolean f14837OooOoo0;

    public oOO00OO(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14836OooOoo = null;
        this.f14834OooOoO0 = new AtomicLong(0L);
    }

    public static String OooOOOo(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public static void OooOoOO(oOO00O0 ooo00o0, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        Ooooo0o(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        ooo00o0.OooOO0(str, bundle, "_err");
    }

    public static long OooOoo(byte[] bArr) {
        o000000O.OooO0oo(bArr);
        int length = bArr.length;
        int i = 0;
        o000000O.OooOO0(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static MessageDigest OooOoo0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static boolean OooOooO(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean Oooo0(String str, String[] strArr) {
        o000000O.OooO0oo(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Oooo000(String str) {
        String str2 = (String) o0O000O.f14331oo000o.OooO00o(null);
        return str2.equals(ProxyConfig.MATCH_ALL_SCHEMES) || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean Oooo00o(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] Oooo0oO(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList OoooOo0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o00O0OO0 o00o0oo0 = (o00O0OO0) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", o00o0oo0.zza);
            bundle.putString(C3037dc.f8261p, o00o0oo0.zzb);
            bundle.putLong("creation_timestamp", o00o0oo0.zzd);
            bundle.putString("name", o00o0oo0.zzc.zzb);
            Object objOooO0o0 = o00o0oo0.zzc.OooO0o0();
            o000000O.OooO0oo(objOooO0o0);
            oO0000O.OooO0Oo(bundle, objOooO0o0);
            bundle.putBoolean("active", o00o0oo0.zze);
            String str = o00o0oo0.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            o00OOOOo o00ooooo = o00o0oo0.zzg;
            if (o00ooooo != null) {
                bundle.putString("timed_out_event_name", o00ooooo.zza);
                o00OOOO0 o00oooo0 = o00ooooo.zzb;
                if (o00oooo0 != null) {
                    bundle.putBundle("timed_out_event_params", o00oooo0.OooOO0O());
                }
            }
            bundle.putLong("trigger_timeout", o00o0oo0.zzh);
            o00OOOOo o00ooooo2 = o00o0oo0.zzi;
            if (o00ooooo2 != null) {
                bundle.putString("triggered_event_name", o00ooooo2.zza);
                o00OOOO0 o00oooo02 = o00ooooo2.zzb;
                if (o00oooo02 != null) {
                    bundle.putBundle("triggered_event_params", o00oooo02.OooOO0O());
                }
            }
            bundle.putLong("triggered_timestamp", o00o0oo0.zzc.zzc);
            bundle.putLong("time_to_live", o00o0oo0.zzj);
            o00OOOOo o00ooooo3 = o00o0oo0.zzk;
            if (o00ooooo3 != null) {
                bundle.putString("expired_event_name", o00ooooo3.zza);
                o00OOOO0 o00oooo03 = o00ooooo3.zzb;
                if (o00oooo03 != null) {
                    bundle.putBundle("expired_event_params", o00oooo03.OooOO0O());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean OoooOoO(Context context) {
        ActivityInfo receiverInfo;
        o000000O.OooO0oo(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void OoooOoo(oO00OOo0 oo00ooo0, Bundle bundle, boolean z) {
        if (bundle != null && oo00ooo0 != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = oo00ooo0.f14658OooO00o;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = oo00ooo0.f14659OooO0O0;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", oo00ooo0.f14660OooO0OO);
                return;
            }
            z = false;
        }
        if (bundle != null && oo00ooo0 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean Ooooo0o(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean Oooooo(String str) {
        o000000O.OooO0o0(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean oo000o(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @Override // OoooOOO.oO0Oo
    public final boolean OooOO0o() {
        return true;
    }

    public final boolean OooOOOO(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (zIsEmpty) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14394OooOoo.OooO0O0("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        o000000O.OooO0oo(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o02);
        o0o0o0o02.f14394OooOoo.OooO0OO(o0O0O0o0.OooOOoo(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final Object OooOOo(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int iMax = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (zEquals) {
            o0oo0oo0.f14519OooOoO0.getClass();
            return OooooO0(Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 256), obj, true, true);
        }
        if (Oooo00o(str)) {
            o0oo0oo0.f14519OooOoO0.getClass();
            iMax = Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 256);
        } else {
            o0oo0oo0.f14519OooOoO0.getClass();
        }
        return OooooO0(iMax, obj, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOOo0(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oOO00OO.OooOOo0(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final Bundle OooOOoo(String str, Bundle bundle, List list, boolean z) {
        int iO00o0O;
        List list2 = list;
        boolean zOooo0 = Oooo0(str, oO0000O.f14617OooO0Oo);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        oOO00OO ooo00oo = ((o0OO0oO0) o0oo0oo0.f14519OooOoO0.f14574OooOo0O).f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        int i = ooo00oo.Oooo0oo(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                iO00o0O = !z ? o00o0O(str2) : 0;
                if (iO00o0O == 0) {
                    iO00o0O = o00ooo(str2);
                }
            } else {
                iO00o0O = 0;
            }
            if (iO00o0O != 0) {
                OooOo0o(bundle2, iO00o0O, str2, iO00o0O == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iOooOOo0 = OooOOo0(str, str2, bundle.get(str2), bundle2, list2, z, zOooo0);
                if (iOooOOo0 == 17) {
                    OooOo0o(bundle2, 17, str2, Boolean.FALSE);
                } else if (iOooOOo0 != 0 && !"_ev".equals(str2)) {
                    OooOo0o(bundle2, iOooOOo0, iOooOOo0 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (Oooooo(str2) && (i2 = i2 + 1) > i) {
                    if (!o0oo0oo0.f14519OooOoO0.OooOo0(null, o0O000O.f14308o0000o0) || !z2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                        sb.append("Event can't contain more than ");
                        sb.append(i);
                        sb.append(" params");
                        String string = sb.toString();
                        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
                        o0o0o0o0.f14394OooOoo.OooO0Oo(o0o00o00.OooO00o(str), string, o0o00o00.OooO0o0(bundle));
                    }
                    Ooooo0o(5, bundle2);
                    bundle2.remove(str2);
                    z2 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final int OooOo(Object obj, String str) {
        return "_ldl".equals(str) ? o00oO0o("user property referrer", OooooOO(str), str, obj) : o00oO0o("user property", OooooOO(str), str, obj) ? 0 : 7;
    }

    public final void OooOo0(Parcelable[] parcelableArr, int i) {
        o000000O.OooO0oo(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (Oooooo(str) && !Oooo0(str, oO0000O.f14621OooO0oo) && (i2 = i2 + 1) > i) {
                    o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
                    if (!o0oo0oo0.f14519OooOoO0.OooOo0(null, o0O000O.f14308o0000o0) || !z) {
                        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        String string = sb.toString();
                        o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
                        o0o0o0o0.f14394OooOoo.OooO0Oo(o0o00o00.OooO0O0(str), string, o0o00o00.OooO0o0(bundle));
                    }
                    Ooooo0o(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void OooOo00(o0O0OO0 o0o0oo0, int i) {
        Bundle bundle = (Bundle) o0o0oo0.f14406OooO0o0;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Oooooo(str) && (i2 = i2 + 1) > i) {
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
                if (!o0oo0oo0.f14519OooOoO0.OooOo0(null, o0O000O.f14308o0000o0) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
                    o0o0o0o0.f14394OooOoo.OooO0Oo(o0o00o00.OooO00o((String) o0o0oo0.f14404OooO0OO), string, o0o00o00.OooO0o0(bundle));
                    Ooooo0o(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void OooOo0O(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                oOO00OO ooo00oo = ((o0OO0oO0) this.f14574OooOo0O).f14523OooOooO;
                o0OO0oO0.OooOO0O(ooo00oo);
                ooo00oo.OooOoO(str, bundle2.get(str), bundle);
            }
        }
    }

    public final void OooOo0o(Bundle bundle, int i, String str, Object obj) {
        if (Ooooo0o(i, bundle)) {
            ((o0OO0oO0) this.f14574OooOo0O).getClass();
            bundle.putString("_ev", OooOOOo(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void OooOoO(String str, Object obj, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14399Oooo000.OooO0Oo(o0oo0oo0.f14524OooOooo.OooO0O0(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    public final Object OooOoO0(Object obj, String str) {
        return "_ldl".equals(str) ? OooooO0(OooooOO(str), obj, true, false) : OooooO0(OooooOO(str), obj, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooOooo() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oOO00OO.OooOooo():long");
    }

    public final int Oooo() {
        if (this.f14836OooOoo == null) {
            o000O0Oo o000o0oo2 = o000O0Oo.f13671OooO0O0;
            Context context = ((o0OO0oO0) this.f14574OooOo0O).f14516OooOo0O;
            o000o0oo2.getClass();
            this.f14836OooOoo = Integer.valueOf(o000O0Oo.OooO00o(context) / 1000);
        }
        return this.f14836OooOoo.intValue();
    }

    public final boolean Oooo00O(String str) {
        OooOO0O();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (OooOO0.OooO00o(o0oo0oo0.f14516OooOo0O).f13505OooO00o.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14401Oooo00o.OooO0OO(str, "Permission not granted");
        return false;
    }

    public final boolean Oooo0O0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((o0OO0oO0) this.f14574OooOo0O).f14519OooOoO0.OooOOOO("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle Oooo0OO(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objOooOOo = OooOOo(bundle.get(str), str);
                if (objOooOOo == null) {
                    o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
                    o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14399Oooo000.OooO0OO(o0oo0oo0.f14524OooOooo.OooO0O0(str), "Param value can't be null");
                } else {
                    OooOoO(str, objOooOOo, bundle2);
                }
            }
        }
        return bundle2;
    }

    public final boolean Oooo0o(Context context, String str) {
        Signature[] signatureArr;
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoOooO0OO = OooOO0.OooO00o(context).OooO0OO(64, str);
            if (packageInfoOooO0OO == null || (signatureArr = packageInfoOooO0OO.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14393OooOoOO.OooO0OO(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final o00OOOOo Oooo0o0(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (o00Oo0(str) != 0) {
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(o0oo0oo0.f14524OooOooo.OooO0OO(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleOooOOoo = OooOOoo(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleOooOOoo = Oooo0OO(bundleOooOOoo);
        }
        o000000O.OooO0oo(bundleOooOOoo);
        return new o00OOOOo(str, new o00OOOO0(bundleOooOOoo), str2, j);
    }

    public final boolean Oooo0oo(int i) {
        Boolean bool = ((o0OO0oO0) this.f14574OooOo0O).OooOOOo().f14856OooOoO;
        if (Oooo() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final void OoooO(o0000oo o0000ooVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i);
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning int value to wrapper");
        }
    }

    public final void OoooO0(String str, o0000oo o0000ooVar) {
        Bundle bundle = new Bundle();
        bundle.putString(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str);
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning string value to wrapper");
        }
    }

    public final void OoooO00(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void OoooO0O(o0000oo o0000ooVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j);
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning long value to wrapper");
        }
    }

    public final void OoooOO0(o0000oo o0000ooVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning byte array to wrapper");
        }
    }

    public final void OoooOOO(o0000oo o0000ooVar, Bundle bundle) {
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning bundle value to wrapper");
        }
    }

    public final void OoooOOo(o0000oo o0000ooVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning bundle list to wrapper");
        }
    }

    public final String Ooooo00() {
        byte[] bArr = new byte[16];
        Oooooo0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object OooooO0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return OooOOOo(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleOooo0OO = Oooo0OO((Bundle) parcelable);
                if (!bundleOooo0OO.isEmpty()) {
                    arrayList.add(bundleOooo0OO);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int OooooOO(String str) {
        boolean zEquals = "_ldl".equals(str);
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (zEquals) {
            o0oo0oo0.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            o0oo0oo0.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            o0oo0oo0.getClass();
            return 100;
        }
        o0oo0oo0.getClass();
        return 36;
    }

    public final long OooooOo() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f14834OooOoO0;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f14834OooOoO0;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((o0OO0oO0) this.f14574OooOo0O).f14527Oooo000.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f14833OooOoO + 1;
            this.f14833OooOoO = i;
            j = jNextLong + i;
        }
        return j;
    }

    public final SecureRandom Oooooo0() {
        OooOO0O();
        if (this.f14832OooOo == null) {
            this.f14832OooOo = new SecureRandom();
        }
        return this.f14832OooOo;
    }

    public final Bundle OoooooO(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final boolean Ooooooo(String str, String str2) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (str2 == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14394OooOoo.OooO0OO(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14394OooOoo.OooO0OO(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o03);
            o0o0o0o03.f14394OooOoo.OooO0Oo(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                o0O0O0o0 o0o0o0o04 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o04);
                o0o0o0o04.f14394OooOoo.OooO0Oo(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void o000oOoO(o0000oo o0000ooVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z);
        try {
            o0000ooVar.o0000oO0(bundle);
        } catch (RemoteException e) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(e, "Error returning boolean value to wrapper");
        }
    }

    public final boolean o00O0O(int i, String str, String str2) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (str2 == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14394OooOoo.OooO0OO(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o02);
        o0o0o0o02.f14394OooOoo.OooO0o0("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int o00Oo0(String str) {
        if (!o0OoOo0(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!ooOO(NotificationCompat.CATEGORY_EVENT, oO0000O.f14614OooO00o, oO0000O.f14615OooO0O0, str)) {
            return 13;
        }
        ((o0OO0oO0) this.f14574OooOo0O).getClass();
        return !o00O0O(40, NotificationCompat.CATEGORY_EVENT, str) ? 2 : 0;
    }

    public final int o00Ooo(String str) {
        if (!o0OoOo0("user property", str)) {
            return 6;
        }
        if (!ooOO("user property", oO0000O.f14613OooO, null, str)) {
            return 15;
        }
        ((o0OO0oO0) this.f14574OooOo0O).getClass();
        return !o00O0O(24, "user property", str) ? 6 : 0;
    }

    public final int o00o0O(String str) {
        if (!Ooooooo("event param", str)) {
            return 3;
        }
        if (!ooOO("event param", null, null, str)) {
            return 14;
        }
        ((o0OO0oO0) this.f14574OooOo0O).getClass();
        return !o00O0O(40, "event param", str) ? 3 : 0;
    }

    public final void o00oO0O(String str, String str2, Bundle bundle, List list, boolean z) {
        int iO00o0O;
        o0O0O0o0 o0o0o0o0;
        String str3;
        int iOooOOo0;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        oOO00OO ooo00oo = ((o0OO0oO0) o0oo0oo0.f14519OooOoO0.f14574OooOo0O).f14523OooOooO;
        o0OO0oO0.OooOO0O(ooo00oo);
        int i = true != ooo00oo.Oooo0oo(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                iO00o0O = !z ? o00o0O(str4) : 0;
                if (iO00o0O == 0) {
                    iO00o0O = o00ooo(str4);
                }
            } else {
                iO00o0O = 0;
            }
            if (iO00o0O != 0) {
                OooOo0o(bundle, iO00o0O, str4, iO00o0O == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                boolean zOo000o = oo000o(bundle.get(str4));
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                if (zOo000o) {
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14399Oooo000.OooO0o0("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    iOooOOo0 = 22;
                    o0o0o0o0 = o0o0o0o02;
                    str3 = null;
                } else {
                    o0o0o0o0 = o0o0o0o02;
                    str3 = null;
                    iOooOOo0 = OooOOo0(str, str4, bundle.get(str4), bundle, list2, z, false);
                }
                if (iOooOOo0 != 0 && !"_ev".equals(str4)) {
                    OooOo0o(bundle, iOooOOo0, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (Oooooo(str4) && !Oooo0(str4, oO0000O.f14621OooO0oo)) {
                    i2++;
                    boolean zOooo0oo = Oooo0oo(231100000);
                    o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
                    if (zOooo0oo) {
                        o0O0O0o0 o0o0o0o03 = o0o0o0o0;
                        if (i2 > i) {
                            if (!o0oo0oo0.f14519OooOoO0.OooOo0(str3, o0O000O.f14308o0000o0) || !z2) {
                                o0OO0oO0.OooOOO0(o0o0o0o03);
                                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                                sb.append("Item can't contain more than ");
                                sb.append(i);
                                sb.append(" item-scoped custom params");
                                o0o0o0o03.f14394OooOoo.OooO0Oo(o0o00o00.OooO00o(str), sb.toString(), o0o00o00.OooO0o0(bundle));
                            }
                            Ooooo0o(28, bundle);
                            bundle.remove(str4);
                            list2 = list;
                            z2 = true;
                        }
                    } else {
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14394OooOoo.OooO0Oo(o0o00o00.OooO00o(str), "Item array not supported on client's version of Google Play Services (Android Only)", o0o00o00.OooO0o0(bundle));
                        Ooooo0o(23, bundle);
                        bundle.remove(str4);
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean o00oO0o(String str, int i, String str2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14399Oooo000.OooO0o0("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final int o00ooo(String str) {
        if (!o0OoOo0("event param", str)) {
            return 3;
        }
        if (!ooOO("event param", null, null, str)) {
            return 14;
        }
        ((o0OO0oO0) this.f14574OooOo0O).getClass();
        return !o00O0O(40, "event param", str) ? 3 : 0;
    }

    public final boolean o0OoOo0(String str, String str2) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (str2 == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14394OooOoo.OooO0OO(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14394OooOoo.OooO0OO(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o03);
                o0o0o0o03.f14394OooOoo.OooO0Oo(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                o0O0O0o0 o0o0o0o04 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o04);
                o0o0o0o04.f14394OooOoo.OooO0Oo(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean ooOO(String str, String[] strArr, String[] strArr2, String str2) {
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        if (str2 == null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14394OooOoo.OooO0OO(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f14830OooOooO;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14394OooOoo.OooO0Oo(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !Oooo0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Oooo0(str2, strArr2)) {
            return true;
        }
        o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o03);
        o0o0o0o03.f14394OooOoo.OooO0Oo(str, "Name is reserved. Type, name", str2);
        return false;
    }
}
