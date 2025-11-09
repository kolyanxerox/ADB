package com.google.android.gms.internal.ads;

import android.util.Log;
import com.ironsource.C3824x4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class O0OO00 {
    public static long OooO00o(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || C3824x4.f12571f.equals(str)) {
                oOOo0O00.OooO0OO("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", oOOo0O00.OooO0Oo("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }

    public static oOO0O0O OooO0O0(oOOO00 oooo00) throws NumberFormatException {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long jOooO00o;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = oooo00.f22823OooO0OO;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jOooO00o2 = str != null ? OooO00o(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jOooO00o3 = str3 != null ? OooO00o(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = jCurrentTimeMillis;
            jOooO00o = OooO00o(str4);
        } else {
            j4 = jCurrentTimeMillis;
            jOooO00o = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j7 = (j3 * 1000) + j4;
            j6 = z ? j7 : (j2 * 1000) + j7;
            j5 = j7;
        } else {
            j5 = (jOooO00o2 <= j || jOooO00o3 < jOooO00o2) ? j : (jOooO00o3 - jOooO00o2) + j4;
            j6 = j5;
        }
        oOO0O0O ooo0o0o = new oOO0O0O();
        ooo0o0o.f22800OooO00o = oooo00.f22822OooO0O0;
        ooo0o0o.f22801OooO0O0 = str5;
        ooo0o0o.f22804OooO0o = j5;
        ooo0o0o.f22805OooO0o0 = j6;
        ooo0o0o.f22802OooO0OO = jOooO00o2;
        ooo0o0o.f22803OooO0Oo = jOooO00o;
        ooo0o0o.f22806OooO0oO = map;
        ooo0o0o.f22807OooO0oo = oooo00.f22824OooO0Oo;
        return ooo0o0o;
    }
}
