package oo0O;

import OooO0oO.Oooo0;
import OoooOOO.C0001o0;
import com.google.android.gms.internal.ads.li0;
import kotlin.jvm.internal.OooOo;
import o000Ooo.o00oO0o;
import o00O0.OooOOO0;
import o00OO.OooOOO;

/* loaded from: classes3.dex */
public final class OooO0O0 {

    /* renamed from: OooO0Oo */
    public static final OooO0O0 f33201OooO0Oo = new OooO0O0();

    /* renamed from: OooO00o */
    public final li0 f33202OooO00o = new li0();

    /* renamed from: OooO0O0 */
    public final C0001o0 f33203OooO0O0 = o00OOO00.OooO00o.f32330OooO00o;

    /* renamed from: OooO0OO */
    public final o00oO0o f33204OooO0OO = new o00oO0o(11);

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004b, code lost:
    
        r0.f31867OooO00o = r4.length();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO00o(o00OO0OO.OooO00o r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.OooOo.OooO0o0(r6, r0)
            com.google.android.gms.internal.ads.li0 r0 = r5.f33202OooO00o
            r0.getClass()
            o00OO.OooOo r0 = new o00OO.OooOo
            r0.<init>(r7)
            com.google.android.material.datepicker.OooO0o r1 = new com.google.android.material.datepicker.OooO0o
            o00OO.Oooo0 r2 = o00OO.Oooo0.f31880OooOo
            o00OO0o.OooO r3 = r6.OooO0Oo()
            r1.<init>(r5, r2, r0, r3)
            java.lang.Object r6 = r1.OooOO0O(r6)
            int r1 = r0.f31867OooO00o
        L20:
            r2 = -1
            r3 = 10
            java.lang.String r4 = r0.f31871OooO0o0
            if (r1 == r2) goto L4b
            int r2 = r4.length()
            if (r1 >= r2) goto L4b
            int r2 = r1 + 1
            char r1 = r4.charAt(r1)
            r4 = 32
            if (r1 == r4) goto L49
            if (r1 == r3) goto L49
            r3 = 13
            if (r1 == r3) goto L49
            r3 = 9
            if (r1 != r3) goto L42
            goto L49
        L42:
            r0.f31867OooO00o = r2
            byte r3 = o00OO.OooOOO.OooO0O0(r1)
            goto L51
        L49:
            r1 = r2
            goto L20
        L4b:
            int r1 = r4.length()
            r0.f31867OooO00o = r1
        L51:
            r1 = 10
            if (r3 != r1) goto L56
            return r6
        L56:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected EOF after parsing, but had "
            r6.<init>(r1)
            int r1 = r0.f31867OooO00o
            int r1 = r1 + (-1)
            char r7 = r7.charAt(r1)
            r6.append(r7)
            java.lang.String r7 = " instead"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 0
            r1 = 6
            o00OO.OooOo.OooOO0O(r0, r6, r7, r1)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oo0O.OooO0O0.OooO00o(o00OO0OO.OooO00o, java.lang.String):java.lang.Object");
    }

    public final String OooO0O0(o00OO0OO.OooO00o serializer, Object obj) {
        char[] cArr;
        OooOo.OooO0o0(serializer, "serializer");
        Oooo0 oooo0 = new Oooo0(12, (byte) 0);
        o00OO.OooO0O0 oooO0O0 = o00OO.OooO0O0.f31858OooO0OO;
        synchronized (oooO0O0) {
            OooOOO0 oooOOO0 = (OooOOO0) oooO0O0.f21617OooO0O0;
            cArr = null;
            char[] cArr2 = (char[]) (oooOOO0.isEmpty() ? null : oooOOO0.removeLast());
            if (cArr2 != null) {
                oooO0O0.f21616OooO00o -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        oooo0.f13283OooOo = cArr;
        try {
            OooOOO.OooO0OO(this, oooo0, serializer, obj);
            return oooo0.toString();
        } finally {
            oooo0.OooO0o();
        }
    }
}
