package o000000;

import OooOOoo.o0000O;
import Oooo0oO.o000000;
import Oooo0oO.o000OOo;
import Oooo0oO.o0O0O00;
import Oooo0oO.oo0o0Oo;
import OoooO0O.o000O000;
import OoooO0O.o000O0o;
import OoooO0O.o000Oo0;
import OoooO0O.o00O000o;
import OoooO0O.o00oOoo;
import OoooOOO.o00Oo00;
import OoooOOO.o0O000O;
import OoooOOO.oo0o0O0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.appset.zza;
import com.google.android.gms.internal.ads.C1386ai;
import com.google.android.gms.internal.measurement.C2348oO;
import com.google.android.gms.internal.measurement.C2357x;
import com.google.android.gms.internal.measurement.oOO0000;
import com.google.android.gms.internal.measurement.oOOO00;
import com.google.android.gms.internal.measurement.oOo00o00;
import com.google.android.gms.internal.measurement.ooooO000;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class OooO implements o0000O, OooOoO.o000oOoO, com.google.android.gms.common.api.internal.OooOOOO, oo0o0Oo, o000OOo, UserMessagingPlatform.OnConsentFormLoadFailureListener, o00oOoo, oo0o0O0, o00Oo00 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f29022OooOo0O;

    /* renamed from: OooOo0o */
    public static final /* synthetic */ OooO f29004OooOo0o = new OooO(11);

    /* renamed from: OooOo */
    public static final /* synthetic */ OooO f29003OooOo = new OooO(12);

    /* renamed from: OooOoO0 */
    public static final /* synthetic */ OooO f29006OooOoO0 = new OooO(13);

    /* renamed from: OooOoO */
    public static final /* synthetic */ OooO f29005OooOoO = new OooO(14);

    /* renamed from: OooOoOO */
    public static final /* synthetic */ OooO f29007OooOoOO = new OooO(15);

    /* renamed from: OooOoo0 */
    public static final /* synthetic */ OooO f29009OooOoo0 = new OooO(16);

    /* renamed from: OooOoo */
    public static final /* synthetic */ OooO f29008OooOoo = new OooO(17);

    /* renamed from: OooOooO */
    public static final /* synthetic */ OooO f29010OooOooO = new OooO(18);

    /* renamed from: OooOooo */
    public static final /* synthetic */ OooO f29011OooOooo = new OooO(19);

    /* renamed from: Oooo000 */
    public static final /* synthetic */ OooO f29013Oooo000 = new OooO(20);

    /* renamed from: Oooo00O */
    public static final /* synthetic */ OooO f29014Oooo00O = new OooO(21);

    /* renamed from: Oooo00o */
    public static final /* synthetic */ OooO f29015Oooo00o = new OooO(22);

    /* renamed from: Oooo0 */
    public static final /* synthetic */ OooO f29012Oooo0 = new OooO(23);

    /* renamed from: Oooo0O0 */
    public static final /* synthetic */ OooO f29016Oooo0O0 = new OooO(24);

    /* renamed from: Oooo0OO */
    public static final /* synthetic */ OooO f29017Oooo0OO = new OooO(25);

    /* renamed from: Oooo0o0 */
    public static final /* synthetic */ OooO f29019Oooo0o0 = new OooO(26);

    /* renamed from: Oooo0o */
    public static final /* synthetic */ OooO f29018Oooo0o = new OooO(27);

    /* renamed from: Oooo0oO */
    public static final /* synthetic */ OooO f29020Oooo0oO = new OooO(28);

    /* renamed from: Oooo0oo */
    public static final /* synthetic */ OooO f29021Oooo0oo = new OooO(29);

    public /* synthetic */ OooO(int i) {
        this.f29022OooOo0O = i;
    }

    public static void OooO0o0(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static OooO0oO.OooOOO0 OooO0oO(Context context, String[] strArr, String str, C1386ai c1386ai) throws IOException {
        String[] strArrOooOO0O = OooOO0O(context);
        int length = strArrOooOO0O.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrOooOO0O[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str3);
                            sb.append(c);
                            sb.append(str);
                            String string = sb.toString();
                            c1386ai.OooOO0("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(2, false);
                                oooOOO0.f13280OooOo0o = zipFile;
                                oooOOO0.f13278OooOo = entry;
                                return oooOOO0;
                            }
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    public static String[] OooOO0(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : OooOO0O(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] OooOO0O(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public void OooO(float f, float f2, float f3, o0OOO0o o0ooo0o) {
        o0ooo0o.OooO0Oo(f, 0.0f);
    }

    @Override // OooOoO.o000oOoO
    public long OooO00o() {
        return SystemClock.elapsedRealtime();
    }

    @Override // Oooo0oO.o000OOo
    public o0O0O00 OooO0O0(Context context, String str, oo0o0Oo oo0o0oo) {
        int iOooO0OO;
        switch (this.f29022OooOo0O) {
            case 7:
                o0O0O00 o0o0o00 = new o0O0O00();
                int iOooO0Oo = oo0o0oo.OooO0Oo(context, str);
                o0o0o00.f13885OooO00o = iOooO0Oo;
                if (iOooO0Oo != 0) {
                    o0o0o00.f13887OooO0OO = -1;
                } else {
                    int iOooO0OO2 = oo0o0oo.OooO0OO(context, str, true);
                    o0o0o00.f13886OooO0O0 = iOooO0OO2;
                    if (iOooO0OO2 != 0) {
                        o0o0o00.f13887OooO0OO = 1;
                    }
                }
                return o0o0o00;
            default:
                o0O0O00 o0o0o002 = new o0O0O00();
                int iOooO0Oo2 = oo0o0oo.OooO0Oo(context, str);
                o0o0o002.f13885OooO00o = iOooO0Oo2;
                int i = 1;
                int i2 = 0;
                if (iOooO0Oo2 != 0) {
                    iOooO0OO = oo0o0oo.OooO0OO(context, str, false);
                    o0o0o002.f13886OooO0O0 = iOooO0OO;
                } else {
                    iOooO0OO = oo0o0oo.OooO0OO(context, str, true);
                    o0o0o002.f13886OooO0O0 = iOooO0OO;
                }
                int i3 = o0o0o002.f13885OooO00o;
                if (i3 == 0) {
                    if (iOooO0OO == 0) {
                        i = 0;
                    }
                    o0o0o002.f13887OooO0OO = i;
                    return o0o0o002;
                }
                i2 = i3;
                if (i2 >= iOooO0OO) {
                    i = -1;
                }
                o0o0o002.f13887OooO0OO = i;
                return o0o0o002;
        }
    }

    @Override // Oooo0oO.oo0o0Oo
    public int OooO0OO(Context context, String str, boolean z) {
        return o000000.OooO0Oo(context, str, z);
    }

    @Override // Oooo0oO.oo0o0Oo
    public int OooO0Oo(Context context, String str) {
        return o000000.OooO00o(context, str);
    }

    @Override // OoooOOO.oo0o0O0
    public /* synthetic */ String OooO0o(String str, String str2) {
        return null;
    }

    public boolean OooO0oo() {
        return this instanceof OooOO0;
    }

    @Override // com.google.android.gms.common.api.internal.OooOOOO
    public void accept(Object obj, Object obj2) {
        Oooo.OooOOO0 oooOOO0 = (Oooo.OooOOO0) ((Oooo.OooOO0O) obj).getService();
        zza zzaVar = new zza(null, null);
        Oooo.Oooo000 oooo000 = new Oooo.Oooo000((TaskCompletionSource) obj2);
        oooOOO0.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = Oooo.OooOO0.f13703OooO00o;
        parcelObtain.writeInt(1);
        zzaVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(oooo000);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            oooOOO0.f13706OooOo0O.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        return new OooOOo0.o00Ooo(Executors.newSingleThreadExecutor(), 0);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
    }

    @Override // OoooO0O.o00O000
    public Object zza() {
        switch (this.f29022OooOo0O) {
            case 10:
                o000O000 o000o0002 = o000O0o.f13968OooO0O0;
                o000Oo0.OooO0OO(o000o0002);
                return new o00O000o(o000o0002);
            case 11:
            default:
                List list = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l = (Long) oOO0000.o0ooOOo.OooO0O0();
                l.getClass();
                return l;
            case 12:
                return new Boolean(((Boolean) ooooO000.f26937OooO0O0.OooO0O0()).booleanValue());
            case 13:
                return new Boolean(((Boolean) oOOO00.f26862OooO00o.OooO0O0()).booleanValue());
            case 14:
                List list2 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l2 = (Long) oOO0000.f26780OooO0O0.OooO0O0();
                l2.getClass();
                return l2;
            case 15:
                List list3 = o0O000O.f14225OooO00o;
                Boolean bool = (Boolean) C2357x.f26949OooO00o.OooO0O0();
                bool.getClass();
                return bool;
            case 16:
                List list4 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return (String) oOO0000.f26784OooO0o0.OooO0O0();
            case 17:
                List list5 = o0O000O.f14225OooO00o;
                Boolean bool2 = (Boolean) oOo00o00.f26884OooO00o.OooO0O0();
                bool2.getClass();
                return bool2;
            case 18:
                List list6 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26839o00Ooo.OooO0O0()).longValue());
            case 19:
                List list7 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26843o00ooo.OooO0O0()).longValue());
            case 20:
                List list8 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return (String) oOO0000.f26845o0ooOO0.OooO0O0();
            case 21:
                List list9 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return (String) oOO0000.f26814Oooo0o.OooO0O0();
            case 22:
                List list10 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l3 = (Long) oOO0000.f26818OoooO.OooO0O0();
                l3.getClass();
                return l3;
            case 23:
                List list11 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l4 = (Long) oOO0000.f26822OoooOO0.OooO0O0();
                l4.getClass();
                return l4;
            case 24:
                List list12 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l5 = (Long) oOO0000.f26815Oooo0o0.OooO0O0();
                l5.getClass();
                return l5;
            case 25:
                List list13 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                return Integer.valueOf((int) ((Long) oOO0000.f26807Oooo.OooO0O0()).longValue());
            case 26:
                List list14 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l6 = (Long) oOO0000.f26821OoooO0O.OooO0O0();
                l6.getClass();
                return l6;
            case 27:
                List list15 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l7 = (Long) oOO0000.f26820OoooO00.OooO0O0();
                l7.getClass();
                return l7;
            case 28:
                List list16 = o0O000O.f14225OooO00o;
                C2348oO.f26661OooOo0o.get();
                Long l8 = (Long) oOO0000.f26783OooO0o.OooO0O0();
                l8.getClass();
                return l8;
        }
    }
}
