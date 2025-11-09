package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.i7 */
/* loaded from: classes2.dex */
public final class C1669i7 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final LinkedList f19969OooO00o = new LinkedList();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap f19970OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f19971OooO0OO;

    public C1669i7(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f19970OooO0O0 = linkedHashMap;
        this.f19971OooO0OO = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final C1558f7 OooO0Oo() {
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        return new C1558f7(SystemClock.elapsedRealtime(), null, null);
    }

    public final C1595g7 OooO00o() {
        C1595g7 c1595g7;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f19971OooO0OO) {
            try {
                for (C1558f7 c1558f7 : this.f19969OooO00o) {
                    long j = c1558f7.f18794OooO00o;
                    String str = c1558f7.f18795OooO0O0;
                    C1558f7 c1558f72 = c1558f7.f18796OooO0OO;
                    if (c1558f72 != null && j > 0) {
                        long j2 = j - c1558f72.f18794OooO00o;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(c1558f72.f18794OooO00o))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(c1558f72.f18794OooO00o));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(c1558f72.f18794OooO00o), new StringBuilder(str));
                            }
                        }
                    }
                }
                this.f19969OooO00o.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                        sb3.append(jCurrentTimeMillis + (jLongValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                c1595g7 = new C1595g7(0, sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1595g7;
    }

    public final void OooO0O0(String str, String str2) {
        OooOOOo.o0ooOOo o0oooooOooO0OO;
        if (TextUtils.isEmpty(str2) || (o0oooooOooO0OO = zzv.zzp().OooO0OO()) == null) {
            return;
        }
        synchronized (this.f19971OooO0OO) {
            C1521e7 c1521e7 = (C1521e7) ((HashMap) o0oooooOooO0OO.f13433OooO0Oo).get(str);
            if (c1521e7 == null) {
                c1521e7 = C1521e7.f18507OooO0O0;
            }
            LinkedHashMap linkedHashMap = this.f19970OooO0O0;
            linkedHashMap.put(str, c1521e7.OooO00o((String) linkedHashMap.get(str), str2));
        }
    }

    public final void OooO0OO(C1558f7 c1558f7, long j, String... strArr) {
        synchronized (this.f19971OooO0OO) {
            this.f19969OooO00o.add(new C1558f7(j, strArr[0], c1558f7));
        }
    }
}
