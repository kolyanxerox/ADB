package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.webkit.ProxyConfig;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.C3037dc;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.xd */
/* loaded from: classes2.dex */
public final class C2229xd {

    /* renamed from: OooO */
    public Object f25603OooO;

    /* renamed from: OooO00o */
    public final /* synthetic */ int f25604OooO00o;

    /* renamed from: OooO0O0 */
    public String f25605OooO0O0;

    /* renamed from: OooO0OO */
    public int f25606OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f25607OooO0Oo;

    /* renamed from: OooO0o */
    public Object f25608OooO0o;

    /* renamed from: OooO0o0 */
    public Object f25609OooO0o0;

    /* renamed from: OooO0oO */
    public final Object f25610OooO0oO;

    /* renamed from: OooO0oo */
    public Object f25611OooO0oo;

    public C2229xd(Context context, VersionInfoParcel versionInfoParcel, String str, nf0 nf0Var) {
        this.f25604OooO00o = 0;
        C2007rd c2007rd = C1602ge.f19326OooO0OO;
        this.f25607OooO0Oo = new Object();
        this.f25606OooO0OO = 1;
        this.f25605OooO0O0 = str;
        this.f25609OooO0o0 = context.getApplicationContext();
        this.f25608OooO0o = versionInfoParcel;
        this.f25610OooO0oO = nf0Var;
        this.f25611OooO0oo = c2007rd;
    }

    public o00OOO0.o0OoOo0 OooO00o() {
        if (this.f25605OooO0O0 == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (((String) this.f25608OooO0o) != null) {
            return new o00OOO0.o0OoOo0(this);
        }
        throw new IllegalStateException("host == null");
    }

    public void OooO0O0(o00OOO0.o0OoOo0 o0oooo0, String str) {
        char cCharAt;
        int i;
        char c;
        char c2;
        int iOooO;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        char c3;
        char cCharAt2;
        String str4 = str;
        int iOooOOo = o00OOO0O.OooO0OO.OooOOo(0, str4.length(), str4);
        int iOooOOoo = o00OOO0O.OooO0OO.OooOOoo(iOooOOo, str4.length(), str4);
        if (iOooOOoo - iOooOOo >= 2 && (((cCharAt = str4.charAt(iOooOOo)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
            int i5 = iOooOOo + 1;
            while (true) {
                if (i5 >= iOooOOoo) {
                    break;
                }
                char cCharAt3 = str4.charAt(i5);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i5++;
                } else if (cCharAt3 == ':') {
                    i = i5;
                }
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            if (str4.regionMatches(true, iOooOOo, "https:", 0, 6)) {
                this.f25605OooO0O0 = "https";
                iOooOOo += 6;
                str4 = str;
            } else {
                str4 = str;
                if (!str4.regionMatches(true, iOooOOo, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, i) + "'");
                }
                this.f25605OooO0O0 = ProxyConfig.MATCH_HTTP;
                iOooOOo += 5;
            }
        } else {
            if (o0oooo0 == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            this.f25605OooO0O0 = o0oooo0.f32293OooO00o;
        }
        int i6 = iOooOOo;
        int i7 = 0;
        while (true) {
            c = '/';
            c2 = '\\';
            if (i6 >= iOooOOoo || !((cCharAt2 = str4.charAt(i6)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i7++;
            i6++;
        }
        ArrayList arrayList = (ArrayList) this.f25610OooO0oO;
        char c4 = '?';
        char c5 = '#';
        if (i7 >= 2 || o0oooo0 == null || !o0oooo0.f32293OooO00o.equals(this.f25605OooO0O0)) {
            int i8 = iOooOOo + i7;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iOooO = o00OOO0O.OooO0OO.OooO(i8, iOooOOoo, str4, "@/\\?#");
                char cCharAt4 = iOooO != iOooOOoo ? str4.charAt(iOooO) : (char) 65535;
                if (cCharAt4 == 65535 || cCharAt4 == c5 || cCharAt4 == c || cCharAt4 == c2 || cCharAt4 == c4) {
                    break;
                }
                if (cCharAt4 != '@') {
                    str3 = str4;
                } else {
                    if (z) {
                        i4 = iOooO;
                        StringBuilder sb = new StringBuilder();
                        sb.append((String) this.f25609OooO0o0);
                        sb.append("%40");
                        str3 = str;
                        sb.append(o00OOO0.o0OoOo0.OooO00o(str3, i8, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                        this.f25609OooO0o0 = sb.toString();
                    } else {
                        int iOooOO0 = o00OOO0O.OooO0OO.OooOO0(str4, ':', i8, iOooO);
                        String strOooO00o = o00OOO0.o0OoOo0.OooO00o(str, i8, iOooOO0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z2) {
                            strOooO00o = androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder(), (String) this.f25607OooO0Oo, "%40", strOooO00o);
                        }
                        this.f25607OooO0Oo = strOooO00o;
                        if (iOooOO0 != iOooO) {
                            int i9 = iOooOO0 + 1;
                            i4 = iOooO;
                            this.f25609OooO0o0 = o00OOO0.o0OoOo0.OooO00o(str, i9, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z = true;
                        } else {
                            i4 = iOooO;
                        }
                        str3 = str;
                        z2 = true;
                    }
                    i8 = i4 + 1;
                }
                str4 = str3;
                c4 = '?';
                c5 = '#';
                c = '/';
                c2 = '\\';
            }
            str2 = str4;
            int i10 = i8;
            int i11 = i10;
            while (true) {
                if (i11 < iOooO) {
                    char cCharAt5 = str2.charAt(i11);
                    if (cCharAt5 == ':') {
                        i2 = i11;
                        break;
                    }
                    if (cCharAt5 == '[') {
                        do {
                            i11++;
                            if (i11 < iOooO) {
                            }
                        } while (str2.charAt(i11) != ']');
                    }
                    i11++;
                } else {
                    i2 = iOooO;
                    break;
                }
            }
            int i12 = i2 + 1;
            if (i12 < iOooO) {
                this.f25608OooO0o = o00OOO0O.OooO0OO.OooO0OO(o00OOO0.o0OoOo0.OooO0oO(str2, i10, i2, false));
                try {
                    i3 = Integer.parseInt(o00OOO0.o0OoOo0.OooO00o(str2, i12, iOooO, "", false, false, false, true));
                } catch (NumberFormatException unused) {
                }
                if (i3 <= 0 || i3 > 65535) {
                    i3 = -1;
                }
                this.f25606OooO0OO = i3;
                if (i3 == -1) {
                    throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i12, iOooO) + '\"');
                }
            } else {
                this.f25608OooO0o = o00OOO0O.OooO0OO.OooO0OO(o00OOO0.o0OoOo0.OooO0oO(str2, i10, i2, false));
                this.f25606OooO0OO = o00OOO0.o0OoOo0.OooO0O0(this.f25605OooO0O0);
            }
            if (((String) this.f25608OooO0o) == null) {
                throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i10, i2) + '\"');
            }
            iOooOOo = iOooO;
        } else {
            this.f25607OooO0Oo = o0oooo0.OooO0o();
            this.f25609OooO0o0 = o0oooo0.OooO0OO();
            this.f25608OooO0o = o0oooo0.f32296OooO0Oo;
            this.f25606OooO0OO = o0oooo0.f32298OooO0o0;
            arrayList.clear();
            arrayList.addAll(o0oooo0.OooO0Oo());
            if (iOooOOo == iOooOOoo || str4.charAt(iOooOOo) == '#') {
                String strOooO0o0 = o0oooo0.OooO0o0();
                this.f25611OooO0oo = strOooO0o0 != null ? o00OOO0.o0OoOo0.OooOO0(o00OOO0.o0OoOo0.OooO00o(strOooO0o0, 0, strOooO0o0.length(), HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            }
            str2 = str4;
        }
        int iOooO2 = o00OOO0O.OooO0OO.OooO(iOooOOo, iOooOOoo, str2, "?#");
        if (iOooOOo != iOooO2) {
            char cCharAt6 = str2.charAt(iOooOOo);
            if (cCharAt6 == '/' || cCharAt6 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iOooOOo++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            int i13 = iOooOOo;
            while (i13 < iOooO2) {
                int iOooO3 = o00OOO0O.OooO0OO.OooO(i13, iOooO2, str2, "/\\");
                boolean z3 = iOooO3 < iOooO2;
                String strOooO00o2 = o00OOO0.o0OoOo0.OooO00o(str2, i13, iOooO3, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, true);
                if (!strOooO00o2.equals(".") && !strOooO00o2.equalsIgnoreCase("%2e")) {
                    if (!strOooO00o2.equals("..") && !strOooO00o2.equalsIgnoreCase("%2e.") && !strOooO00o2.equalsIgnoreCase(".%2e") && !strOooO00o2.equalsIgnoreCase("%2e%2e")) {
                        if (((String) arrayList.get(arrayList.size() - 1)).isEmpty()) {
                            arrayList.set(arrayList.size() - 1, strOooO00o2);
                        } else {
                            arrayList.add(strOooO00o2);
                        }
                        if (z3) {
                            arrayList.add("");
                        }
                    } else if (!((String) arrayList.remove(arrayList.size() - 1)).isEmpty() || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                if (z3) {
                    iOooO3++;
                }
                i13 = iOooO3;
            }
        }
        if (iOooO2 >= iOooOOoo || str2.charAt(iOooO2) != '?') {
            c3 = '#';
        } else {
            c3 = '#';
            int iOooOO02 = o00OOO0O.OooO0OO.OooOO0(str2, '#', iOooO2, iOooOOoo);
            this.f25611OooO0oo = o00OOO0.o0OoOo0.OooOO0(o00OOO0.o0OoOo0.OooO00o(str2, iOooO2 + 1, iOooOO02, HttpUrl.QUERY_ENCODE_SET, true, false, true, true));
            iOooO2 = iOooOO02;
        }
        if (iOooO2 >= iOooOOoo || str2.charAt(iOooO2) != c3) {
            return;
        }
        this.f25603OooO = o00OOO0.o0OoOo0.OooO00o(str2, iOooO2 + 1, iOooOOoo, "", true, false, false, false);
    }

    public C2155vd OooO0OO() {
        zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.f25607OooO0Oo) {
            try {
                zze.zza("getEngine: Lock acquired");
                zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f25607OooO0Oo) {
                    try {
                        zze.zza("refreshIfDestroyed: Lock acquired");
                        C2192wd c2192wd = (C2192wd) this.f25603OooO;
                        if (c2192wd != null && this.f25606OooO0OO == 0) {
                            c2192wd.OooOO0O(new sj0(this, 7), new C2007rd(0));
                        }
                    } finally {
                    }
                }
                zze.zza("refreshIfDestroyed: Lock released");
                C2192wd c2192wd2 = (C2192wd) this.f25603OooO;
                if (c2192wd2 != null && ((AtomicInteger) c2192wd2.f13857OooO0O0).get() != -1) {
                    int i = this.f25606OooO0OO;
                    if (i == 0) {
                        zze.zza("getEngine (NO_UPDATE): Lock released");
                        return ((C2192wd) this.f25603OooO).OooOO0o();
                    }
                    if (i != 1) {
                        zze.zza("getEngine (UPDATING): Lock released");
                        return ((C2192wd) this.f25603OooO).OooOO0o();
                    }
                    this.f25606OooO0OO = 2;
                    OooO0Oo();
                    zze.zza("getEngine (PENDING_UPDATE): Lock released");
                    return ((C2192wd) this.f25603OooO).OooOO0o();
                }
                this.f25606OooO0OO = 2;
                this.f25603OooO = OooO0Oo();
                zze.zza("getEngine (NULL or REJECTED): Lock released");
                return ((C2192wd) this.f25603OooO).OooOO0o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2192wd OooO0Oo() {
        jf0 jf0VarOooO0oO = ze0.OooO0oO((Context) this.f25609OooO0o0, 6);
        jf0VarOooO0oO.zzi();
        C2192wd c2192wd = new C2192wd((C2007rd) this.f25611OooO0oo);
        zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC2200wl.f25325OooO0o.execute(new wp0(7, this, c2192wd));
        zze.zza("loadNewJavascriptEngine: Promise created");
        c2192wd.OooOO0O(new C2118ud(this, c2192wd, jf0VarOooO0oO), new C2118ud(this, c2192wd, jf0VarOooO0oO));
        return c2192wd;
    }

    public String toString() {
        switch (this.f25604OooO00o) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String str = this.f25605OooO0O0;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (!((String) this.f25607OooO0Oo).isEmpty() || !((String) this.f25609OooO0o0).isEmpty()) {
                    sb.append((String) this.f25607OooO0Oo);
                    if (!((String) this.f25609OooO0o0).isEmpty()) {
                        sb.append(':');
                        sb.append((String) this.f25609OooO0o0);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f25608OooO0o;
                if (str2 != null) {
                    if (str2.indexOf(58) != -1) {
                        sb.append('[');
                        sb.append((String) this.f25608OooO0o);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f25608OooO0o);
                    }
                }
                int iOooO0O0 = this.f25606OooO0OO;
                if (iOooO0O0 != -1 || this.f25605OooO0O0 != null) {
                    if (iOooO0O0 == -1) {
                        iOooO0O0 = o00OOO0.o0OoOo0.OooO0O0(this.f25605OooO0O0);
                    }
                    String str3 = this.f25605OooO0O0;
                    if (str3 == null || iOooO0O0 != o00OOO0.o0OoOo0.OooO0O0(str3)) {
                        sb.append(':');
                        sb.append(iOooO0O0);
                    }
                }
                ArrayList arrayList = (ArrayList) this.f25610OooO0oO;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i));
                }
                if (((ArrayList) this.f25611OooO0oo) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f25611OooO0oo;
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2 += 2) {
                        String str4 = (String) arrayList2.get(i2);
                        String str5 = (String) arrayList2.get(i2 + 1);
                        if (i2 > 0) {
                            sb.append('&');
                        }
                        sb.append(str4);
                        if (str5 != null) {
                            sb.append(C3037dc.f8244T);
                            sb.append(str5);
                        }
                    }
                }
                if (((String) this.f25603OooO) != null) {
                    sb.append('#');
                    sb.append((String) this.f25603OooO);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C2229xd() {
        this.f25604OooO00o = 1;
        this.f25607OooO0Oo = "";
        this.f25609OooO0o0 = "";
        this.f25606OooO0OO = -1;
        ArrayList arrayList = new ArrayList();
        this.f25610OooO0oO = arrayList;
        arrayList.add("");
    }
}
