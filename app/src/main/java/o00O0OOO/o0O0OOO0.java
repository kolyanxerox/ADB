package o00O0ooo;

import o00O0Oo.o00O0O;

/* loaded from: classes3.dex */
public final class o0O0OOO0 implements o0OoOoOo {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo f31719OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31720OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f31721OooOo0o;

    public /* synthetic */ o0O0OOO0(o0OoOoOo o0oooooo, o00O0O o00o0o, int i) {
        this.f31720OooOo0O = i;
        this.f31719OooOo = o0oooooo;
        this.f31721OooOo0o = o00o0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @Override // o00O0ooo.o0OoOoOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(o00O0ooo.o0O000Oo r6, o00O0O0O.OooO0OO r7) {
        /*
            r5 = this;
            int r0 = r5.f31720OooOo0O
            switch(r0) {
                case 0: goto L73;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            o00O0ooo.o0O0OO0 r0 = new o00O0ooo.o0O0OO0
            java.lang.Object r1 = r5.f31721OooOo0o
            r2 = 3
            r0.<init>(r6, r1, r2)
            o00O0ooo.o0OoOoOo r6 = r5.f31719OooOo
            java.lang.Object r6 = r6.collect(r0, r7)
            o00O0O0o.OooOo00 r7 = o00O0O0o.OooOo00.f31365OooOo0O
            if (r6 != r7) goto L18
            goto L1a
        L18:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
        L1a:
            return r6
        L1b:
            boolean r0 = r7 instanceof o00O0ooo.o0O0o0
            if (r0 == 0) goto L2e
            r0 = r7
            o00O0ooo.o0O0o0 r0 = (o00O0ooo.o0O0o0) r0
            int r1 = r0.f31729OooOo0o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2e
            int r1 = r1 - r2
            r0.f31729OooOo0o = r1
            goto L33
        L2e:
            o00O0ooo.o0O0o0 r0 = new o00O0ooo.o0O0o0
            r0.<init>(r5, r7)
        L33:
            java.lang.Object r7 = r0.f31728OooOo0O
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31729OooOo0o
            r3 = 1
            if (r2 == 0) goto L4e
            if (r2 != r3) goto L46
            o00O0ooo.o0O0OO0 r6 = r0.f31730OooOoO0
            o00O0.o000OOo.OooOO0O(r7)     // Catch: o00O.OooO00o -> L44
            goto L6f
        L44:
            r7 = move-exception
            goto L6b
        L46:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4e:
            o00O0.o000OOo.OooOO0O(r7)
            o00O0ooo.o0OoOoOo r7 = r5.f31719OooOo
            o00O0ooo.o0oO0O0o r7 = (o00O0ooo.o0oO0O0o) r7
            o00O0ooo.o0O0OO0 r2 = new o00O0ooo.o0O0OO0
            java.lang.Object r4 = r5.f31721OooOo0o
            o00O0Oo.o00O0O r4 = (o00O0Oo.o00O0O) r4
            r2.<init>(r4, r6)
            r0.f31730OooOoO0 = r2     // Catch: o00O.OooO00o -> L69
            r0.f31729OooOo0o = r3     // Catch: o00O.OooO00o -> L69
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: o00O.OooO00o -> L69
            if (r6 != r1) goto L6f
            goto L71
        L69:
            r7 = move-exception
            r6 = r2
        L6b:
            java.lang.Object r0 = r7.f31166OooOo0O
            if (r0 != r6) goto L72
        L6f:
            oo00o.OooOo r1 = oo00o.OooOo.f33195OooO00o
        L71:
            return r1
        L72:
            throw r7
        L73:
            kotlin.jvm.internal.oo000o r0 = new kotlin.jvm.internal.oo000o
            r0.<init>()
            o00O.o000000O r1 = new o00O.o000000O
            java.lang.Object r2 = r5.f31721OooOo0o
            o00O0Oo.o00O0O r2 = (o00O0Oo.o00O0O) r2
            r3 = 2
            r1.<init>(r0, r6, r2, r3)
            o00O0ooo.o0OoOoOo r6 = r5.f31719OooOo
            o00O0ooo.o0O0OOO0 r6 = (o00O0ooo.o0O0OOO0) r6
            java.lang.Object r6 = r6.collect(r1, r7)
            o00O0O0o.OooOo00 r7 = o00O0O0o.OooOo00.f31365OooOo0O
            if (r6 != r7) goto L8f
            goto L91
        L8f:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.o0O0OOO0.collect(o00O0ooo.o0O000Oo, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
