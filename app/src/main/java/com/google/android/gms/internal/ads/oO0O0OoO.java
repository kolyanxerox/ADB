package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public final class oO0O0OoO {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f22647OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f22648OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f22649OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f22650OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f22651OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final oO00O0oO f22652OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f22653OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String[] f22654OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f22655OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final oO0O0OoO f22656OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final HashMap f22657OooOO0O;
    public final HashMap OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList f22658OooOOO0;

    public oO0O0OoO(String str, String str2, long j, long j2, oO00O0oO oo00o0oo, String[] strArr, String str3, String str4, oO0O0OoO oo0o0ooo) {
        this.f22648OooO00o = str;
        this.f22649OooO0O0 = str2;
        this.f22647OooO = str4;
        this.f22652OooO0o = oo00o0oo;
        this.f22654OooO0oO = strArr;
        this.f22650OooO0OO = str2 != null;
        this.f22651OooO0Oo = j;
        this.f22653OooO0o0 = j2;
        str3.getClass();
        this.f22655OooO0oo = str3;
        this.f22656OooOO0 = oo0o0ooo;
        this.f22657OooOO0O = new HashMap();
        this.OooOO0o = new HashMap();
    }

    public static oO0O0OoO OooO0O0(String str, long j, long j2, oO00O0oO oo00o0oo, String[] strArr, String str2, String str3, oO0O0OoO oo0o0ooo) {
        return new oO0O0OoO(str, null, j, j2, oo00o0oo, strArr, str2, str3, oo0o0ooo);
    }

    public static oO0O0OoO OooO0OO(String str) {
        return new oO0O0OoO(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder OooO0o(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C2279yq c2279yq = new C2279yq();
            c2279yq.f25994OooO00o = new SpannableStringBuilder();
            treeMap.put(str, c2279yq);
        }
        CharSequence charSequence = ((C2279yq) treeMap.get(str)).f25994OooO00o;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0O0OoO.OooO(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final int OooO00o() {
        ArrayList arrayList = this.f22658OooOOO0;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final oO0O0OoO OooO0Oo(int i) {
        ArrayList arrayList = this.f22658OooOOO0;
        if (arrayList != null) {
            return (oO0O0OoO) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean OooO0o0(long j) {
        long j2 = this.f22651OooO0Oo;
        long j3 = this.f22653OooO0o0;
        if (j2 == -9223372036854775807L) {
            if (j3 == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void OooO0oO(TreeSet treeSet, boolean z) {
        String str = this.f22648OooO00o;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f22647OooO != null)) {
            long j = this.f22651OooO0Oo;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f22653OooO0o0;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f22658OooOOO0 != null) {
            for (int i = 0; i < this.f22658OooOOO0.size(); i++) {
                oO0O0OoO oo0o0ooo = (oO0O0OoO) this.f22658OooOOO0.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                oo0o0ooo.OooO0oO(treeSet, z2);
            }
        }
    }

    public final void OooO0oo(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f22655OooO0oo;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (OooO0o0(j) && "div".equals(this.f22648OooO00o) && (str2 = this.f22647OooO) != null) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoOO(str, str2, arrayList);
            return;
        }
        for (int i = 0; i < OooO00o(); i++) {
            OooO0Oo(i).OooO0oo(j, str, arrayList);
        }
    }

    public final void OooOO0(long j, boolean z, String str, TreeMap treeMap) {
        TreeMap treeMap2;
        boolean z2;
        long j2;
        HashMap map = this.f22657OooOO0O;
        map.clear();
        HashMap map2 = this.OooOO0o;
        map2.clear();
        String str2 = this.f22648OooO00o;
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(str2)) {
            return;
        }
        String str3 = this.f22655OooO0oo;
        String str4 = !"".equals(str3) ? str3 : str;
        if (this.f22650OooO0OO && z) {
            SpannableStringBuilder spannableStringBuilderOooO0o = OooO0o(str4, treeMap);
            String str5 = this.f22649OooO0O0;
            str5.getClass();
            spannableStringBuilderOooO0o.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            OooO0o(str4, treeMap).append('\n');
            return;
        }
        if (OooO0o0(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C2279yq) entry.getValue()).f25994OooO00o;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < OooO00o(); i++) {
                oO0O0OoO oo0o0oooOooO0Oo = OooO0Oo(i);
                if (z || zEquals) {
                    treeMap2 = treeMap;
                    z2 = true;
                    j2 = j;
                } else {
                    j2 = j;
                    treeMap2 = treeMap;
                    z2 = false;
                }
                oo0o0oooOooO0Oo.OooOO0(j2, z2, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderOooO0o2 = OooO0o(str4, treeMap);
                int length = spannableStringBuilderOooO0o2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderOooO0o2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderOooO0o2.charAt(length) != '\n') {
                    spannableStringBuilderOooO0o2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C2279yq) entry2.getValue()).f25994OooO00o;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
