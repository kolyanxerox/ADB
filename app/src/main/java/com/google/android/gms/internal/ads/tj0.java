package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class tj0 {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final String f24317OooO0oo = new UUID(0, 0).toString();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f24318OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f24319OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f24320OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f24321OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final C1548ey f24322OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f24323OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final sj0 f24324OooO0oO;

    public tj0(Context context, String str, String str2, String str3) {
        if (C1548ey.f18705OooOoO0 == null) {
            C1548ey.f18705OooOoO0 = new C1548ey(context, 26);
        }
        this.f24322OooO0o = C1548ey.f18705OooOoO0;
        this.f24324OooO0oO = sj0.OooO00o(context);
        this.f24318OooO00o = str;
        this.f24319OooO0O0 = str.concat("_3p");
        this.f24320OooO0OO = str2;
        this.f24321OooO0Oo = str2.concat("_3p");
        this.f24323OooO0o0 = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.o0O0O0O OooO00o(java.lang.String r17, java.lang.String r18, long r19, boolean r21) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = r0.f24319OooO0O0
            r3 = 0
            com.google.android.gms.internal.ads.ey r4 = r0.f24322OooO0o
            if (r1 == 0) goto L3f
            java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L42
            java.lang.String r5 = com.google.android.gms.internal.ads.tj0.f24317OooO0oo
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L17
            goto L42
        L17:
            java.lang.Object r5 = r4.f18706OooOo
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r5 = r5.getString(r2, r3)
            java.lang.Object r6 = r4.f18706OooOo
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r7 = "paid_3p_hash_key"
            java.lang.String r6 = r6.getString(r7, r3)
            if (r5 == 0) goto L3f
            if (r6 == 0) goto L3f
            r7 = r18
            java.lang.String r6 = r0.OooO0o0(r1, r7, r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3a
            goto L49
        L3a:
            OoooOOO.o0O0O0O r1 = r16.OooO0O0(r17, r18)
            return r1
        L3f:
            r7 = r18
            goto L49
        L42:
            OoooOOO.o0O0O0O r1 = new OoooOOO.o0O0O0O
            r2 = 7
            r1.<init>(r2)
            return r1
        L49:
            if (r1 == 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto Lb3
            java.lang.String r6 = r0.f24320OooO0OO
            java.lang.String r10 = r0.f24321OooO0Oo
            if (r5 == 0) goto L60
            r11 = r10
            goto L61
        L60:
            r11 = r6
        L61:
            java.lang.Object r12 = r4.f18706OooOo
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            r13 = -1
            long r11 = r12.getLong(r11, r13)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L70
            goto L8c
        L70:
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 >= 0) goto L81
            if (r5 == 0) goto L78
            r11 = r10
            goto L79
        L78:
            r11 = r6
        L79:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.OooOO0O(r8, r11)
            goto L8c
        L81:
            long r11 = r11 + r19
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L8c
            OoooOOO.o0O0O0O r1 = r16.OooO0O0(r17, r18)
            return r1
        L8c:
            if (r5 == 0) goto L8f
            goto L91
        L8f:
            java.lang.String r2 = r0.f24318OooO00o
        L91:
            java.lang.Object r8 = r4.f18706OooOo
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r2 = r8.getString(r2, r3)
            if (r2 != 0) goto La2
            if (r21 != 0) goto La2
            OoooOOO.o0O0O0O r1 = r16.OooO0O0(r17, r18)
            return r1
        La2:
            OoooOOO.o0O0O0O r1 = new OoooOOO.o0O0O0O
            if (r5 == 0) goto La7
            r6 = r10
        La7:
            java.lang.Object r3 = r4.f18706OooOo
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            long r3 = r3.getLong(r6, r13)
            r1.<init>(r2, r3)
            return r1
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r0.f24323OooO0o0
            java.lang.String r3 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tj0.OooO00o(java.lang.String, java.lang.String, long, boolean):OoooOOO.o0O0O0O");
    }

    public final OoooOOO.o0O0O0O OooO0O0(String str, String str2) throws IOException {
        if (str == null) {
            return OooO0OO(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f24322OooO0o.OooOO0O(string, "paid_3p_hash_key");
        return OooO0OO(OooO0o0(str, str2, string), true);
    }

    public final OoooOOO.o0O0O0O OooO0OO(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f24323OooO0o0.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z ? this.f24321OooO0Oo : this.f24320OooO0OO;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        C1548ey c1548ey = this.f24322OooO0o;
        c1548ey.OooOO0O(lValueOf, str2);
        c1548ey.OooOO0O(str, z ? this.f24319OooO0O0 : this.f24318OooO00o);
        return new OoooOOO.o0O0O0O(str, jCurrentTimeMillis);
    }

    public final void OooO0Oo(boolean z) throws IOException {
        String str = z ? this.f24321OooO0Oo : this.f24320OooO0OO;
        C1548ey c1548ey = this.f24322OooO0o;
        c1548ey.OooOO0o(str);
        c1548ey.OooOO0o(z ? this.f24319OooO0O0 : this.f24318OooO00o);
    }

    public final String OooO0o0(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(OooO0oO.OooOo.OooOoo(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24323OooO0o0);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
