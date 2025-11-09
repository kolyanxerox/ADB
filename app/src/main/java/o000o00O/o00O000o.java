package o000o00o;

import o00O0ooo.o0O000Oo;

/* loaded from: classes2.dex */
public final class o00O000o implements o0O000Oo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30836OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f30837OooOo0o;

    public /* synthetic */ o00O000o(Object obj, int i) {
        this.f30836OooOo0O = i;
        this.f30837OooOo0o = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // o00O0ooo.o0O000Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
        /*
            r4 = this;
            int r0 = r4.f30836OooOo0O
            switch(r0) {
                case 0: goto L93;
                case 1: goto L49;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof o00O0ooo.o0OOooO0
            if (r0 == 0) goto L18
            r0 = r6
            o00O0ooo.o0OOooO0 r0 = (o00O0ooo.o0OOooO0) r0
            int r1 = r0.f31799OooOo0o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f31799OooOo0o = r1
            goto L1d
        L18:
            o00O0ooo.o0OOooO0 r0 = new o00O0ooo.o0OOooO0
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.f31798OooOo0O
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31799OooOo0o
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            o00O0.o000OOo.OooOO0O(r6)
            goto L46
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            o00O0.o000OOo.OooOO0O(r6)
            if (r5 == 0) goto L46
            r0.f31799OooOo0o = r3
            java.lang.Object r6 = r4.f30837OooOo0o
            o00O0ooo.o0O000Oo r6 = (o00O0ooo.o0O000Oo) r6
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L46
            goto L48
        L46:
            oo00o.OooOo r1 = oo00o.OooOo.f33195OooO00o
        L48:
            return r1
        L49:
            boolean r0 = r6 instanceof o00O0ooo.o0O00O
            if (r0 == 0) goto L5c
            r0 = r6
            o00O0ooo.o0O00O r0 = (o00O0ooo.o0O00O) r0
            int r1 = r0.f31678OooOo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L5c
            int r1 = r1 - r2
            r0.f31678OooOo = r1
            goto L61
        L5c:
            o00O0ooo.o0O00O r0 = new o00O0ooo.o0O00O
            r0.<init>(r4, r6)
        L61:
            java.lang.Object r6 = r0.f31679OooOo0O
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31678OooOo
            r3 = 1
            if (r2 == 0) goto L78
            if (r2 != r3) goto L70
            o00O0.o000OOo.OooOO0O(r6)
            goto L90
        L70:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L78:
            o00O0.o000OOo.OooOO0O(r6)
            if (r5 != 0) goto L7f
            o000O0O0.OooO0O0 r5 = o00O.OooO0OO.f31171OooO0O0
        L7f:
            r0.f31678OooOo = r3
            java.lang.Object r6 = r4.f30837OooOo0o
            o00O0oo.o00oOoo r6 = (o00O0oo.o00oOoo) r6
            o00O0oo.o0O0ooO r6 = (o00O0oo.o0O0ooO) r6
            o00O0oo.o000O000 r6 = r6.f31651OooOoO0
            java.lang.Object r5 = r6.OooOOO0(r5, r0)
            if (r5 != r1) goto L90
            goto L92
        L90:
            oo00o.OooOo r1 = oo00o.OooOo.f33195OooO00o
        L92:
            return r1
        L93:
            o000o00o.o000O0o r5 = (o000o00o.o000O0o) r5
            java.lang.Object r0 = r4.f30837OooOo0o
            o000o00o.o00O0O00 r0 = (o000o00o.o00O0O00) r0
            r0.getClass()
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.OooOo.OooO0o0(r5, r1)
            r0.f30857OooO0oo = r5
            o000o00o.o000O0 r5 = r5.f30786OooO00o
            java.lang.String r5 = r5.f30778OooO00o
            o000o00o.o00O00O r1 = o000o00o.o00O00O.f30839OooOo0O
            java.lang.Object r5 = o000o00o.o00O0O00.OooO00o(r0, r5, r1, r6)
            o00O0O0o.OooOo00 r6 = o00O0O0o.OooOo00.f31365OooOo0O
            if (r5 != r6) goto Lb2
            goto Lb4
        Lb2:
            oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o00o.o00O000o.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
