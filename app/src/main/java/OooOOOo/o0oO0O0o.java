package OoooOOO;

import Oooo00O.o000000O;
import Oooo0OO.o00oO0o;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class o0oO0O0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f14576OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14577OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f14578OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Object f14579OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Object f14580OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final Object f14581OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final Object f14582OooOoo0;

    public o0oO0O0o(o0O0O0o0 o0o0o0o0, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f14578OooOo0o = i;
        this.f14576OooOo = str;
        this.f14580OooOoO0 = obj;
        this.f14579OooOoO = obj2;
        this.f14581OooOoOO = obj3;
        Objects.requireNonNull(o0o0o0o0);
        this.f14582OooOoo0 = o0o0o0o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14577OooOo0O) {
            case 0:
                o0O0O0o0 o0o0o0o0 = (o0O0O0o0) this.f14582OooOoo0;
                o0O o0o = ((o0OO0oO0) o0o0o0o0.f14574OooOo0O).f14518OooOoO;
                o0OO0oO0.OooOO0O(o0o);
                if (!o0o.f14751OooOo0o) {
                    Log.println(6, o0o0o0o0.OooOo0(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (o0o0o0o0.f14390OooOo == 0) {
                    o00O0OO o00o0oo = ((o0OO0oO0) o0o0o0o0.f14574OooOo0O).f14519OooOoO0;
                    if (o00o0oo.f14122OooOoO == null) {
                        synchronized (o00o0oo) {
                            try {
                                if (o00o0oo.f14122OooOoO == null) {
                                    o0OO0oO0 o0oo0oo0 = (o0OO0oO0) o00o0oo.f14574OooOo0O;
                                    ApplicationInfo applicationInfo = o0oo0oo0.f14516OooOo0O.getApplicationInfo();
                                    String strOooO0o = o00oO0o.OooO0o();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        o00o0oo.f14122OooOoO = Boolean.valueOf(str != null && str.equals(strOooO0o));
                                    }
                                    if (o00o0oo.f14122OooOoO == null) {
                                        o00o0oo.f14122OooOoO = Boolean.TRUE;
                                        o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                                        o0OO0oO0.OooOOO0(o0o0o0o02);
                                        o0o0o0o02.f14393OooOoOO.OooO0O0("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (o00o0oo.f14122OooOoO.booleanValue()) {
                        o0o0o0o0.f14390OooOo = 'C';
                    } else {
                        o0o0o0o0.f14390OooOo = 'c';
                    }
                }
                if (o0o0o0o0.f14392OooOoO0 < 0) {
                    ((o0OO0oO0) o0o0o0o0.f14574OooOo0O).f14519OooOoO0.OooOOOo();
                    o0o0o0o0.f14392OooOoO0 = 133005L;
                }
                int i = this.f14578OooOo0o;
                char c = o0o0o0o0.f14390OooOo;
                long j = o0o0o0o0.f14392OooOoO0;
                String str2 = this.f14576OooOo;
                Object obj = this.f14580OooOoO0;
                Object obj2 = this.f14579OooOoO;
                Object obj3 = this.f14581OooOoOO;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strOooOo0O = o0O0O0o0.OooOo0O(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strOooOo0O.length());
                sb.append(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb.append(strOooOo0O);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                o0oOo0O0 o0ooo0o0 = o0o.f14184OooOoO;
                if (o0ooo0o0 != null) {
                    o0O o0o2 = (o0O) o0ooo0o0.f14596OooO0o0;
                    o0o2.OooOO0O();
                    if (((o0O) o0ooo0o0.f14596OooO0o0).OooOOOO().getLong((String) o0ooo0o0.f14593OooO0O0, 0L) == 0) {
                        o0ooo0o0.OooO0o0();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesOooOOOO = o0o2.OooOOOO();
                    String str3 = (String) o0ooo0o0.f14594OooO0OO;
                    long j2 = sharedPreferencesOooOOOO.getLong(str3, 0L);
                    String str4 = (String) o0ooo0o0.f14595OooO0Oo;
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = o0o2.OooOOOO().edit();
                        editorEdit.putString(str4, string);
                        editorEdit.putLong(str3, 1L);
                        editorEdit.apply();
                        return;
                    }
                    oOO00OO ooo00oo = ((o0OO0oO0) o0o2.f14574OooOo0O).f14523OooOooO;
                    o0OO0oO0.OooOO0O(ooo00oo);
                    long jNextLong = ooo00oo.Oooooo0().nextLong() & LocationRequestCompat.PASSIVE_INTERVAL;
                    long j3 = j2 + 1;
                    long j4 = LocationRequestCompat.PASSIVE_INTERVAL / j3;
                    SharedPreferences.Editor editorEdit2 = o0o2.OooOOOO().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str4, string);
                    }
                    editorEdit2.putLong(str3, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((o0O0OOO0) this.f14580OooOoO0).OooO00o(this.f14576OooOo, this.f14578OooOo0o, (IOException) this.f14579OooOoO, (byte[]) this.f14581OooOoOO, (Map) this.f14582OooOoo0);
                return;
        }
    }

    public /* synthetic */ o0oO0O0o(String str, o0O0OOO0 o0o0ooo0, int i, IOException iOException, byte[] bArr, Map map) {
        o000000O.OooO0oo(o0o0ooo0);
        this.f14580OooOoO0 = o0o0ooo0;
        this.f14578OooOo0o = i;
        this.f14579OooOoO = iOException;
        this.f14581OooOoOO = bArr;
        this.f14576OooOo = str;
        this.f14582OooOoo0 = map;
    }
}
