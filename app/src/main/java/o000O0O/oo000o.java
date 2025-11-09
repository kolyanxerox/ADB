package o000o0O;

/* loaded from: classes2.dex */
public final class oo000o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O00 f30945OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00 f30946OooO0O0;

    public oo000o(o0O0O00 localOverrideSettings, o0O0O00 remoteSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(remoteSettings, "remoteSettings");
        this.f30945OooO00o = localOverrideSettings;
        this.f30946OooO0O0 = remoteSettings;
    }

    public final double OooO00o() {
        Double dOooO0OO = this.f30945OooO00o.OooO0OO();
        if (dOooO0OO != null) {
            double dDoubleValue = dOooO0OO.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dOooO0OO2 = this.f30946OooO0O0.OooO0OO();
        if (dOooO0OO2 != null) {
            double dDoubleValue2 = dOooO0OO2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.OooO0Oo(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0O0(o00O0OO0.OooO0OO r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o000o0O.o00Ooo
            if (r0 == 0) goto L13
            r0 = r6
            o000o0O.o00Ooo r0 = (o000o0O.o00Ooo) r0
            int r1 = r0.f30935OooOoO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30935OooOoO0 = r1
            goto L18
        L13:
            o000o0O.o00Ooo r0 = new o000o0O.o00Ooo
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f30934OooOo0o
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f30935OooOoO0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            o00O0.o000OOo.OooOO0O(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            o000o0O.oo000o r2 = r0.f30933OooOo0O
            o00O0.o000OOo.OooOO0O(r6)
            goto L49
        L38:
            o00O0.o000OOo.OooOO0O(r6)
            r0.f30933OooOo0O = r5
            r0.f30935OooOoO0 = r4
            o000o0O.o0O0O00 r6 = r5.f30945OooO00o
            java.lang.Object r6 = r6.OooO0Oo(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            o000o0O.o0O0O00 r6 = r2.f30946OooO0O0
            r2 = 0
            r0.f30933OooOo0O = r2
            r0.f30935OooOoO0 = r3
            java.lang.Object r6 = r6.OooO0Oo(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o0O.oo000o.OooO0O0(o00O0OO0.OooO0OO):java.lang.Object");
    }
}
