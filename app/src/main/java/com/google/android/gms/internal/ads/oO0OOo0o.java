package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class oO0OOo0o implements ooo0Oo0 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final Pattern f22690OooOoO0 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final Pattern f22689OooOoO = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final StringBuilder f22692OooOo0O = new StringBuilder();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f22693OooOo0o = new ArrayList();

    /* renamed from: OooOo, reason: collision with root package name */
    public final r40 f22691OooOo = new r40();

    public static long OooO00o(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(int r29, int r30, OooOOOO.OooO0O0 r31, byte[] r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0OOo0o.OooO0OO(int, int, OooOOOO.OooO0O0, byte[]):void");
    }
}
