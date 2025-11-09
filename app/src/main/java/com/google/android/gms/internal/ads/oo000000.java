package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oo000000 {

    /* renamed from: OooO00o */
    public long f23015OooO00o;

    /* renamed from: OooO0O0 */
    public final String f23016OooO0O0;

    /* renamed from: OooO0OO */
    public final String f23017OooO0OO;

    /* renamed from: OooO0Oo */
    public final long f23018OooO0Oo;

    /* renamed from: OooO0o */
    public final long f23019OooO0o;

    /* renamed from: OooO0o0 */
    public final long f23020OooO0o0;

    /* renamed from: OooO0oO */
    public final long f23021OooO0oO;

    /* renamed from: OooO0oo */
    public final List f23022OooO0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public oo000000(String str, oOO0O0O ooo0o0o) {
        String str2 = ooo0o0o.f22801OooO0O0;
        long j = ooo0o0o.f22802OooO0OO;
        long j2 = ooo0o0o.f22803OooO0Oo;
        long j3 = ooo0o0o.f22805OooO0o0;
        long j4 = ooo0o0o.f22804OooO0o;
        List arrayList = ooo0o0o.f22807OooO0oo;
        if (arrayList == 0) {
            Map map = ooo0o0o.f22806OooO0oO;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new oOO0OoO0((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static oo000000 OooO00o(oo00 oo00Var) throws IOException {
        if (O0O0.OooO0Oo(oo00Var) != 538247942) {
            throw new IOException();
        }
        String strOooO0oO = O0O0.OooO0oO(oo00Var);
        String strOooO0oO2 = O0O0.OooO0oO(oo00Var);
        long jOooO0o0 = O0O0.OooO0o0(oo00Var);
        long jOooO0o02 = O0O0.OooO0o0(oo00Var);
        long jOooO0o03 = O0O0.OooO0o0(oo00Var);
        long jOooO0o04 = O0O0.OooO0o0(oo00Var);
        int iOooO0Oo = O0O0.OooO0Oo(oo00Var);
        if (iOooO0Oo < 0) {
            throw new IOException(OooO0oO.OooOo.OooO0o(iOooO0Oo, "readHeaderList size="));
        }
        List arrayList = iOooO0Oo == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iOooO0Oo; i++) {
            arrayList.add(new oOO0OoO0(O0O0.OooO0oO(oo00Var).intern(), O0O0.OooO0oO(oo00Var).intern()));
        }
        return new oo000000(strOooO0oO, strOooO0oO2, jOooO0o0, jOooO0o02, jOooO0o03, jOooO0o04, arrayList);
    }

    public oo000000(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f23016OooO0O0 = str;
        this.f23017OooO0OO = true == "".equals(str2) ? null : str2;
        this.f23018OooO0Oo = j;
        this.f23020OooO0o0 = j2;
        this.f23019OooO0o = j3;
        this.f23021OooO0oO = j4;
        this.f23022OooO0oo = list;
    }
}
