package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class oO0OoOO0 implements ooo0Oo0 {

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final Pattern f22711OooOoo0 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f22713OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final oO0o0o f22714OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public LinkedHashMap f22716OooOoO0;

    /* renamed from: OooOoO, reason: collision with root package name */
    public float f22715OooOoO = -3.4028235E38f;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public float f22717OooOoOO = -3.4028235E38f;

    /* renamed from: OooOo, reason: collision with root package name */
    public final r40 f22712OooOo = new r40();

    public oO0OoOO0(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f22713OooOo0O = false;
            this.f22714OooOo0o = null;
            return;
        }
        this.f22713OooOo0O = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        af0.OoooO0(str.startsWith("Format:"));
        oO0o0o oo0o0oOooO00o = oO0o0o.OooO00o(str);
        oo0o0oOooO00o.getClass();
        this.f22714OooOo0o = oo0o0oOooO00o;
        OooO0Oo(new r40((byte[]) list.get(1)), charset);
    }

    public static int OooO00o(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long OooO0O0(String str) {
        Matcher matcher = f22711OooOoo0.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = i80.f19994OooO00o;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x018a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b A[Catch: RuntimeException -> 0x01a9, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x01a9, blocks: (B:68:0x016f, B:70:0x017b, B:72:0x0182, B:76:0x019b, B:74:0x018d), top: B:194:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(int r31, int r32, OooOOOO.OooO0O0 r33, byte[] r34) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0OoOO0.OooO0OO(int, int, OooOOOO.OooO0O0, byte[]):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ca A[Catch: RuntimeException -> 0x0220, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0220, blocks: (B:104:0x01f0, B:106:0x01fe, B:107:0x0204, B:114:0x0225, B:116:0x0229, B:118:0x0238, B:120:0x023c, B:122:0x024b, B:124:0x024f, B:125:0x0255, B:130:0x0272, B:132:0x0276, B:136:0x0287, B:138:0x028b, B:142:0x029c, B:144:0x02a0, B:148:0x02b1, B:150:0x02b5, B:154:0x02c6, B:156:0x02ca, B:157:0x02d0, B:165:0x02f0, B:163:0x02e1, B:128:0x025d, B:109:0x020f), top: B:185:0x01f0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(com.google.android.gms.internal.ads.r40 r40, java.nio.charset.Charset r41) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0OoOO0.OooO0Oo(com.google.android.gms.internal.ads.r40, java.nio.charset.Charset):void");
    }
}
